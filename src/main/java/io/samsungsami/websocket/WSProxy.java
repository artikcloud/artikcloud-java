package io.samsungsami.websocket;

import io.samsungsami.client.JsonUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.channels.NotYetConnectedException;

import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class WSProxy {
    protected SamiWebSocket ws = null;
    
    public WSProxy(String url, SamiWebSocketCallback callback) throws URISyntaxException, IOException {
        ws = new SamiWebSocket(url, callback);
    }
    
    public void connect() {
        ws.connect();
    }
    
    public boolean connectBlocking() throws InterruptedException {
        return ws.connectBlocking();
    }
    
    public void close() {
        ws.close();
    }
    
    public void closeBlocking() throws InterruptedException {
        ws.closeBlocking();
    }
    
    protected void sendObject(Object object) throws JsonProcessingException, NotYetConnectedException {
        String message = JsonUtil.getJsonMapper().writeValueAsString(object);
        ws.send(message);
    }
}
