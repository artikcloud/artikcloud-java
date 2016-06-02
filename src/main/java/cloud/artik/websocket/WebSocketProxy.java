package cloud.artik.websocket;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import okio.Buffer;
import okio.BufferedSource;
import cloud.artik.model.AckEnvelope;
import cloud.artik.model.ActionOut;
import cloud.artik.model.ErrorEnvelope;
import cloud.artik.model.MessageOut;
import cloud.artik.model.WebSocketError;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.ws.WebSocket;
import com.squareup.okhttp.ws.WebSocketCall;
import com.squareup.okhttp.ws.WebSocketListener;

public class WebSocketProxy implements WebSocketListener {
    protected Request request = null;

    protected WebSocket webSocket = null;
    protected ArtikCloudWebSocketCallback callback = null;
    protected OkHttpClient client = null;
    
    protected final JSON json = new JSON();

    protected final ScheduledExecutorService scheduler = Executors
            .newScheduledThreadPool(1);
    protected ConnectionStatus status = ConnectionStatus.CLOSED;

    protected CountDownLatch openSignal = null;
    protected CountDownLatch closeSignal = null;

    protected static String host = "wss://api.artik.cloud/v1.1";

    public WebSocketProxy(String url, OkHttpClient client,
            ArtikCloudWebSocketCallback callback) {
        this.request = new Request.Builder().url(host + url).build();
        this.client = client;
        this.client.setReadTimeout(35, TimeUnit.SECONDS);
        this.callback = callback;
    }

    public static void setHost(String host) {
        WebSocketProxy.host = host;
    }

    public ConnectionStatus getConnectionStatus() {
        return status;
    }

    @Override
    public final void onOpen(WebSocket webSocket, Response response) {
        this.status = ConnectionStatus.CONNECTED;
        this.webSocket = webSocket;

        if (openSignal != null) {
            openSignal.countDown();
        }
        this.callback.onOpen(response.code(), response.message());
    }

    @Override
    public final void onClose(int code, String reason) {
        if (closeSignal != null) {
            closeSignal.countDown();
        }
        this.status = ConnectionStatus.CLOSED;
        this.callback.onClose(code, reason, true);
    }

    @Override
    public final void onFailure(IOException exc, Response response) {
        if (closeSignal != null) {
            closeSignal.countDown();
        }
        this.status = ConnectionStatus.CLOSED;

        WebSocketError error = new WebSocketError();
        if (response != null) {
            error.setCode(response.code());
            error.setMessage(response.message());
        } else {
            error.setCode(-1); // Read Timeout
            if (exc.getCause() != null) {
                error.setMessage(exc.getCause().getMessage());
            } else {
                error.setMessage(exc.getMessage());    
            }
        }
        
        this.callback.onError(error);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final void onMessage(ResponseBody response)
            throws IOException {

        BufferedSource source = response.source();
        try {
            MediaType contentType = response.contentType();
            //System.out.println(contentType);
            String message = source.readString(contentType.charset());
            //String message = source.readString(Charset.defaultCharset());

            Map<String, Object> jsonMap = (Map<String, Object>) json.getGson()
                    .fromJson(message, Map.class);
            if (jsonMap.containsKey("error")) {
                // Check if it is a rate limit
                // Have to treat it differently.
                ErrorEnvelope artikError = json.getGson().fromJson(message,
                        ErrorEnvelope.class);
                this.callback.onError(artikError.getError());
            } else if (jsonMap.containsKey("type")) {
                String type = (String) jsonMap.get("type");

                if ("ping".equalsIgnoreCase(type)) {
                    // Ping
                    long ts = ((Double) jsonMap.get("ts")).longValue();
                    this.callback.onPing(ts);
                } else if ("message".equalsIgnoreCase(type)) {
                    // Message
                    MessageOut artikMessage = json.getGson().fromJson(message,
                            MessageOut.class);
                    this.callback.onMessage(artikMessage);
                } else if ("action".equalsIgnoreCase(type)) {
                    // Action
                    ActionOut artikAction = json.getGson().fromJson(message,
                            ActionOut.class);
                    this.callback.onAction(artikAction);
                }
            } else if (jsonMap.containsKey("data")
                    && jsonMap.containsKey("mid")) {
                // Message, in this case we don't have a way to check the type,
                // although we could assume it's a message since it's the
                // default
                MessageOut artikMessage = json.getGson().fromJson(message,
                        MessageOut.class);
                this.callback.onMessage(artikMessage);
            } else if (jsonMap.containsKey("data")
                    && ((Map<String, Object>) jsonMap.get("data"))
                            .containsKey("mid")
                    || ((Map<String, Object>) jsonMap.get("data"))
                            .containsKey("code")) {
                // Register/Action Ack
                AckEnvelope ackEnv = json.getGson().fromJson(message,
                        AckEnvelope.class);
                this.callback.onAck(ackEnv.getData());
            } else {
                // Message Ack?
                System.err.println("Un handled message: " + json);
            }
        } catch (Exception exc) {
            // Couldn't parse JSON. Shouldnt happen!
            System.err.println(exc.getMessage());
        } finally {
            source.close();
        }
    }

    @Override
    public final void onPong(Buffer arg0) {
        // TODO Pong

    }

    public final void connect() throws IOException {
        if (this.status != ConnectionStatus.CONNECTING) {
            this.status = ConnectionStatus.CONNECTING;
            WebSocketCall ws = WebSocketCall.create(this.client, this.request);
            ws.enqueue(this);
        }
    }

    public final void connectBlocking() throws IOException,
            InterruptedException {
        if (openSignal == null) {
            openSignal = new CountDownLatch(1);
        }
        this.connect();

        openSignal.await();
        openSignal = null;
    }

    public final void close() throws IOException {
        if (this.status != ConnectionStatus.CLOSING) {
            this.status = ConnectionStatus.CLOSING;

            this.webSocket.close(2000, "OK");
        }
    }

    public final void closeBlocking() throws IOException, InterruptedException {
        if (closeSignal == null) {
            closeSignal = new CountDownLatch(1);
        }
        this.close();
        closeSignal.await();

        this.client.getDispatcher().getExecutorService().shutdownNow();
        this.client.getDispatcher().getExecutorService()
                .awaitTermination(100, TimeUnit.MILLISECONDS);

        closeSignal = null;
    }

    protected void sendObject(Object object) throws IOException {
        if (!client.getDispatcher().getExecutorService().isShutdown()) {
            RequestBody request = RequestBody.create(WebSocket.TEXT, this.json.getGson().toJson(object));

            webSocket.sendMessage(request);
        }
    }
}
