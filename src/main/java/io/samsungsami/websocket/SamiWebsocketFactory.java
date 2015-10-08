package io.samsungsami.websocket;

import java.io.IOException;
import java.net.URISyntaxException;

public class SamiWebsocketFactory {

    public FirehoseWebSocket createFirehose(String accessToken, String sdids, String sdtids, String uid, SamiWebSocketCallback callback) throws URISyntaxException, IOException {
        return new FirehoseWebSocket(accessToken, sdids, sdtids, uid, callback);
    }
    
    public DeviceChannelWebSocket createDeviceChannel(boolean ack, SamiWebSocketCallback callback) throws URISyntaxException, IOException {
        return new DeviceChannelWebSocket(ack, callback);
    }

}
