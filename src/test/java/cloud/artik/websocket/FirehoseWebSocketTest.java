package cloud.artik.websocket;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cloud.artik.config.Config;
import cloud.artik.model.Acknowledgement;
import cloud.artik.model.ActionOut;
import cloud.artik.model.MessageOut;
import cloud.artik.model.WebSocketError;

public class FirehoseWebSocketTest {
    // Device of "Demo Fire Sensor"
    private String deviceId     = null;
    private String deviceToken  = null;
    
    // The maximum time to wait
    final int maxWaitingTimeInMs = 5000;
    private CountDownLatch lock = null;
    
    private ArtikCloudWebSocketCallback callback = new ArtikCloudWebSocketCallback() {
        @Override
        public void onOpen(int code, String message) {
//            System.out.println("< Connected!");
            lock.countDown();
        }
        
        @Override
        public void onPing(long ts) {
//            System.out.println("< Received Ping: " + ts);
            
        }
        
        @Override
        public void onMessage(MessageOut message) {
//            System.out.println("< Received message: " + message);
//            System.out.println("< message.getData(): " + message.getData());
        }
        
        @Override
        public void onError(WebSocketError error) {
            System.out.println("< Error: " + error);
            lock.countDown();
        }
        
        @Override
        public void onClose(int arg0, String arg1, boolean arg2) {
//            System.out.println("< Connection Closed.");
            lock.countDown();
        }
        
        @Override
        public void onAction(ActionOut actionOut) {
//           System.out.println("< Received Action: " + actionOut);
            
        }
        
        @Override
        public void onAck(Acknowledgement acknowledgement) {
//            System.out.println("< Received Ack: " + acknowledgement);
        }
    };

    @Before
    public void setUp() throws Exception {
        deviceId = Config.fireSensorDeviceId;
        assertNotNull(deviceId);
        assertFalse(deviceId.isEmpty());
        
        deviceToken = Config.fireSensorDeviceToken;
        assertNotNull(deviceToken);
        assertFalse(deviceToken.isEmpty());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void connectionTest() {
        // comma delimited string of `device ID` of interest
        String sdid =  deviceId;
                
        // Here, to simplify testing, we are using `device token` associated with above device ID
        // In real world scenario, the `user token` and `application token` is recommended.
        String accessToken = deviceToken;
        
        // parameters below not used in this test and set to null
        // used when monitoring by device type
        String sdtids = null;    //comma delimited string of `device type ID` of interest
        String sdids = null;     
        // user ID associated with the access token.
        String uid = null;         

        // sets the parameters and callback function for the WebSocket connection
        FirehoseWebSocket ws = null;
        
        try {
            ws = new FirehoseWebSocket(accessToken, sdid, sdids, sdtids, uid, callback);
            // fire the request to make WebSocket connection
            ws.connect();
            lock = new CountDownLatch(1);
            lock.await(maxWaitingTimeInMs, TimeUnit.MILLISECONDS);
            assertTrue(ws.getConnectionStatus() == ConnectionStatus.CONNECTED);
            
            //now close connection
            ws.close();
            lock = new CountDownLatch(1);
            lock.await(maxWaitingTimeInMs, TimeUnit.MILLISECONDS);
            assertTrue((ws.getConnectionStatus() == ConnectionStatus.CLOSING)
                 ||(ws.getConnectionStatus() == ConnectionStatus.CLOSED));
        } catch (URISyntaxException|IOException|InterruptedException e) {
            e.printStackTrace();
            fail();
        } 
    }

}
