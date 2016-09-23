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
        String deviceId = getProperty("device3.id");
        String userId = getProperty("user1.id");
        String accessToken = getProperty("user1.token");

        final CountDownLatch registerLatch = new CountDownLatch(1);
        final CountDownLatch messageLatch = new CountDownLatch(1);
        EventFeedWebSocket eventWS = new EventFeedWebSocket(accessToken, null, null, null, null, new ArtikCloudWebSocketCallback() {

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
                        messageLatch.countDown();
                    }
                });

        eventWS.connectBlocking();

        messageLatch.await(100, TimeUnit.SECONDS);

        eventWS.closeBlocking();
    }
}
