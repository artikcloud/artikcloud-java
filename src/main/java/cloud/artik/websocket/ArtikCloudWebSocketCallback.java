package cloud.artik.websocket;

import cloud.artik.model.Acknowledgement;
import cloud.artik.model.ActionOut;
import cloud.artik.model.MessageOut;
import cloud.artik.model.WebSocketError;

public interface ArtikCloudWebSocketCallback {

    public void onOpen(int httpStatus, String httpStatusMessage);

    public void onMessage(MessageOut message);
    
    public void onAction(ActionOut action);
    
    public void onAck(Acknowledgement ack);

    public void onClose(int code, String reason, boolean remote);

    public void onError(WebSocketError error);
    
    public void onPing(long timestamp);
}
