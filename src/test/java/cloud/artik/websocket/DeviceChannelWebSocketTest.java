package cloud.artik.websocket;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cloud.artik.model.Acknowledgement;
import cloud.artik.model.ActionOut;
import cloud.artik.model.MessageIn;
import cloud.artik.model.MessageOut;
import cloud.artik.model.RegisterMessage;
import cloud.artik.model.WebSocketError;

import com.squareup.okhttp.OkHttpClient;

public class DeviceChannelWebSocketTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSendMessage() throws Exception {
        String accessToken = "f9f75bd0b0fc46a9a604703909f4331d";
        String deviceId = "16f54be9b9ce4c69be14a6c8ff33ea8d";
        String userId = "04ddbd35d57d4d7b8f07f219c44457b2";
        
        OkHttpClient client = new OkHttpClient();
        client.setRetryOnConnectionFailure(true);

        final CountDownLatch registerLatch = new CountDownLatch(1);
        final CountDownLatch messageLatch = new CountDownLatch(1);
        DeviceChannelWebSocket ws = new DeviceChannelWebSocket(true, client,
                new ArtikCloudWebSocketCallback() {

                    @Override
                    public void onAck(Acknowledgement ack) {
                        System.out.println("onAck: " + ack);
                        if (ack.getCid().equalsIgnoreCase("first")) {
                            registerLatch.countDown();
                        } else if (ack.getCid().equalsIgnoreCase("second")) {
                            messageLatch.countDown();
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
                });

        ws.connectBlocking();

        RegisterMessage msg = new RegisterMessage();
        msg.setAuthorization("bearer " + accessToken);
        msg.setSdid(deviceId);
        msg.setCid("first");

        ws.registerChannel(msg);
        assertEquals(Boolean.TRUE,
                new Boolean(registerLatch.await(10, TimeUnit.SECONDS)));

        MessageIn message = new MessageIn();
        message.setSdid(deviceId);
        message.setTs(new Long(System.currentTimeMillis()));
        message.getData().put("steps", new Integer(500));
        message.setCid("second");

        ws.sendMessage(message);
        assertEquals(Boolean.TRUE,
                new Boolean(messageLatch.await(10, TimeUnit.SECONDS)));

        ws.closeBlocking();
    }

}
