package cloud.artik.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cloud.artik.model.MessageAction;
import cloud.artik.model.NormalizedMessage;
import cloud.artik.model.NormalizedMessagesEnvelope;
import cloud.artik.model.SnapshotResponses;

public class MessagesApiTest extends ArtikCloudApiTest {
    protected MessagesApi apiClient = null;

    @Before
    public void setUp() throws Exception {
        this.apiClient = (MessagesApi) super.api(MessagesApi.class, "device1.token");
    }

    @After
    public void tearDown() throws Exception {
        this.apiClient = null;
    }

    @Test
    public void testSendMessageAction() throws Exception {
        MessageAction message = new MessageAction();
        message.setSdid(this.getProperty("device1.id"));
        message.setTs(new Long(System.currentTimeMillis()));
        message.setType("message");
        message.getData().put("steps", new Integer(500));

        String messageId = this.apiClient.sendMessageAction(message).getData()
                .getMid();
        assertNotNull("Message ID should not be null", messageId);

        // Wait 2 seconds for the message to be normalized. 2 seconds just to be
        // safe, usually much faster.
        Thread.sleep(2000);

        NormalizedMessagesEnvelope envelope = this.apiClient
                .getNormalizedMessages(null, null, messageId, null, null, null,
                        null, null, null, null);
        assertEquals(new Long(1), envelope.getSize());

        NormalizedMessage normalized = envelope.getData().get(0);
        assertEquals(messageId, normalized.getMid());

        Object steps = normalized.getData().get("steps");
        assertNotNull("Volume should not be null", steps);
        assertEquals(new Double(500.0), steps);
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void testGetMessageSnapshots() throws Exception {
        String sdids = this.getProperty("device1.id");
        
        SnapshotResponses env = this.apiClient.getMessageSnapshots(sdids, false);
        
        assertEquals("SDIDs must match", sdids, env.getSdids()); 
        
        assertEquals("SDID must match", sdids, env.getData().get(0).getSdid());
        
        Map<String, Object> stepsInfo = (Map<String, Object>) env.getData().get(0).getData().get("steps");
        
        assertEquals("Steps must be 500", 500.0, stepsInfo.get("value"));       
    }

}
