package cloud.artik.websocket;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import cloud.artik.model.ActionIn;
import cloud.artik.model.MessageIn;
import cloud.artik.model.RegisterMessage;
import okhttp3.OkHttpClient;

public class DeviceChannelWebSocket extends WebSocketProxy {
    
    public DeviceChannelWebSocket(boolean ack, ArtikCloudWebSocketCallback callback) throws URISyntaxException,
            IOException {
        this(ack, new OkHttpClient().newBuilder().readTimeout(35, TimeUnit.SECONDS).build(), callback);
    }

    public DeviceChannelWebSocket(boolean ack, OkHttpClient client,
            ArtikCloudWebSocketCallback callback) throws URISyntaxException,
            IOException {
        super("/websocket?ack=" + ack, client, callback);
    }

    public void sendMessage(MessageIn message) throws IOException {
        super.sendObject(message);
    }

    public void sendAction(ActionIn action) throws IOException {
        super.sendObject(action);
    }

    public void registerChannel(RegisterMessage register) throws IOException {
        super.sendObject(register);
    }

    // Future

    /*
     * public void unregisterChannel(String cid) {
     * 
     * }
     * 
     * public void listChannels(String cid) {
     * 
     * }
     * 
     * public void acknowledgeAction() { }
     */

}
