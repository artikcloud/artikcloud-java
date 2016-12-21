package cloud.artik.websocket;

import cloud.artik.model.EventFeedData;

/**
 * Created by jniosi on 11/30/16.
 */
public interface EventFeedWebSocketCallback {

    public void onEvent(EventFeedData event);
}
