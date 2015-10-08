package io.samsungsami.websocket;

public interface SamiWebSocketCallback {

    public void onOpen(short httpStatus, String httpStatusMessage);

    public void onMessage(MessageOut message);
    
    public void onAction(ActionOut action);
    
    public void onAck(Acknowledgement ack);

    public void onClose(int code, String reason, boolean remote);

    public void onError(Error error);
}
