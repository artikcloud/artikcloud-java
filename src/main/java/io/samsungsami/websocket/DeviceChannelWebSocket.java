package io.samsungsami.websocket;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.channels.NotYetConnectedException;

import com.fasterxml.jackson.core.JsonProcessingException;


public class DeviceChannelWebSocket extends WSProxy {

    public DeviceChannelWebSocket(boolean ack, SamiWebSocketCallback callback) throws URISyntaxException, IOException {
        super("/websocket?ack=" + ack, callback);
        
    }
    
    public void sendMessage(MessageIn message) throws JsonProcessingException, NotYetConnectedException {
        super.sendObject(message);
    }
    
    public void sendAction(ActionIn action) throws JsonProcessingException, NotYetConnectedException {
        super.sendObject(action);
    }
    
    public void registerChannel(RegisterMessage register) throws JsonProcessingException, NotYetConnectedException {
        super.sendObject(register);
    }
    
    // Future
    
    /*
    public void unregisterChannel(String cid) {
        
    }
    
    public void listChannels(String cid) {
        
    }
    
    public void acknowledgeAction() {
    }
    */

}
