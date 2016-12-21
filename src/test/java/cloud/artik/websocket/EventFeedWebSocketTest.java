package cloud.artik.websocket;

import cloud.artik.api.ArtikCloudApiTest;
import cloud.artik.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by jniosi on 9/22/16.
 */
public class EventFeedWebSocketTest extends ArtikCloudApiTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSendEvent() throws Exception {
        String accessToken = getProperty("user1.token");

        final CountDownLatch registerLatch = new CountDownLatch(1);
        final CountDownLatch eventLatch = new CountDownLatch(1);

        EventFeedWebSocketCallback callback = new EventFeedCallback(registerLatch, eventLatch);

        EventFeedWebSocket eventWS = new EventFeedWebSocket(accessToken, null, null, null, null, (ArtikCloudWebSocketCallback)callback, callback);

        eventWS.connectBlocking();

        eventLatch.await(100, TimeUnit.SECONDS);

        eventWS.closeBlocking();
    }

    public class EventFeedCallback implements EventFeedWebSocketCallback, ArtikCloudWebSocketCallback {

        private CountDownLatch registerLatch;
        private CountDownLatch eventLatch;

        public EventFeedCallback(CountDownLatch registerLatch, CountDownLatch eventLatch) {
            this.registerLatch = registerLatch;
            this.eventLatch = eventLatch;
        }

        @Override
        public void onAck(Acknowledgement ack) {
            System.out.println("onAck: " + ack);
            if (ack.getCid().equalsIgnoreCase("first")) {
                registerLatch.countDown();
            }
        }

        @Override
        public void onAction(ActionOut action) {
            System.out.println("onAction: " + action);
        }

        @Override
        public void onClose(int code, String reason, boolean remote) {
            System.out.printf("onClose: %d %s %s\n", code, reason,
                    remote);
        }

        @Override
        public void onError(WebSocketError error) {
            System.err.println("onError: " + error);
        }

        @Override
        public void onMessage(MessageOut message) {
            System.out.println("onMessage: " + message);
        }

        @Override
        public void onOpen(int httpStatus, String httpStatusMessage) {
            System.out.printf("onOpen: %d %s\n", httpStatus,
                    httpStatusMessage);
        }

        @Override
        public void onPing(long timestamp) {
            System.out.println("onPing: " + timestamp);
        }

        @Override
        public void onEvent(EventFeedData eventFeedData) {
            System.out.println("onEvent: " + eventFeedData);
            eventLatch.countDown();
        }
    }

}
