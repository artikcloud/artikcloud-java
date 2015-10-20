package io.samsungsami.websocket;

import io.samsungsami.client.JsonUtil;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import com.fasterxml.jackson.databind.JsonNode;

public class SamiWebSocket extends WebSocketClient {
    public final static int ACTIVITY_TIMEOUT_SECONDS = 40;
    
    protected SamiWebSocketCallback callback = null;
    protected final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    protected ConnectionStatusTimer cst = null;
    protected ConnectionStatus status = ConnectionStatus.CLOSED;
    
    public SamiWebSocket(String url, SamiWebSocketCallback callback) throws URISyntaxException, IOException  {
        super(new URI("wss://api.samsungsami.io/v1.1" + url));
        SSLSocketFactory factory = null;
        try {
            SSLContext sslContext = SSLContext.getInstance( "TLS" );
            sslContext.init( null, null, null ); 
            factory = sslContext.getSocketFactory(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setSocket(factory.createSocket());
        
        // Fix for Android
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            
            @Override
            public boolean verify(String arg0, SSLSession arg1) {
                return true;
            }
        });

        
        this.callback = callback;
    }
    
    public ConnectionStatus getConnectionStatus() {
        return status;
    }
    
    @Override
    public void connect() {
        if (isSafeToConnect()) {
           this.status = ConnectionStatus.CONNECTING;
           super.connect();  
        }
    }
    
    @Override
    public boolean connectBlocking() throws InterruptedException {
        if (isSafeToConnect()) {
           this.status = ConnectionStatus.CONNECTING;
           return super.connectBlocking();
        }
        return super.isOpen();
    }
    
    @Override
    public void close() {
        this.status = ConnectionStatus.CLOSING;
        super.close();
    }
    
    @Override
    public void closeBlocking() throws InterruptedException {
        this.status = ConnectionStatus.CLOSING;
        super.closeBlocking();
    }
    
    
    @Override
    public void onOpen(ServerHandshake handshakedata) {
        this.status = ConnectionStatus.CONNECTED;
        this.callback.onOpen(handshakedata.getHttpStatus(), handshakedata.getHttpStatusMessage());
        cst = new ConnectionStatusTimer(ACTIVITY_TIMEOUT_SECONDS);
    }

    @Override
    public void onMessage(String message) {
        cst.onMessage();
        try {
            // Parse to Json
            JsonNode json = JsonUtil.getJsonMapper().readTree(message);
            if (json.has("error")) {
                // Check if it is a rate limit
                // Have to treat it differently.
                ErrorWrapper samiError = JsonUtil.getJsonMapper().readValue(message, ErrorWrapper.class);
                this.callback.onError(samiError.getError());
            } else if (json.has("type")) {
                String type = json.get("type").asText();
                
                if ("ping".equalsIgnoreCase(type)) {
                    // Ping
                    int ts = json.get("ts").asInt();
                    // Update the activity timer
                } else if ("message".equalsIgnoreCase(type)) {
                    // Message
                    MessageOut samiMessage = JsonUtil.getJsonMapper().readValue(message, MessageOut.class);
                    this.callback.onMessage(samiMessage);                    
                } else if ("action".equalsIgnoreCase(type)) {
                    // Action
                    ActionOut samiAction = JsonUtil.getJsonMapper().readValue(message, ActionOut.class);
                    this.callback.onAction(samiAction);                    
                }
            } else if (json.has("data") && json.has("mid")) {
                // Message, in this case we don't have a way to check the type, although we could assume it's a message since it's the default
                MessageOut samiMessage = JsonUtil.getJsonMapper().readValue(message, MessageOut.class);
                this.callback.onMessage(samiMessage); 
            } else if (json.has("data") && (json.get("data").has("mid") || json.get("data").has("code"))) {
                // Register/Action Ack
                AckEnvelope ackEnv = JsonUtil.getJsonMapper().readValue(message, AckEnvelope.class);
                this.callback.onAck(ackEnv.getData());
            } else {
                // Message Ack?
                System.err.println("Un handled message: " + json);
            }
        } catch (Exception exc) {
            // Couldn't parse JSON. Shouldnt happen!
            System.err.println(exc.getMessage());
            
        }
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        this.status = ConnectionStatus.CLOSED;
        this.callback.onClose(code, reason, remote);
    }

    @Override
    public void onError(Exception ex) {
        Error error = new Error();
        error.setCode(500);
        error.setMessage(ex.getMessage());
        this.callback.onError(error);
    }
    
    private boolean isSafeToConnect() {
        if (super.isConnecting() || super.isOpen()) {
        	return false;
        }
        return true;
    }
    
    private class ConnectionStatusTimer {
        private final int timeout;
        private Future<?> timer;

        ConnectionStatusTimer(int timeout) {
            this.timeout = timeout;
        }
        
        public synchronized void onMessage() {
            if (timer != null) {
                timer.cancel(false);
            }
            timer = scheduler.schedule(new Runnable() {
                
                @Override
                public void run() {
                    System.err.println("Timed out with no activity...closing");
                    close();
                }
            }, timeout, TimeUnit.SECONDS);
        }
        
    }

}

