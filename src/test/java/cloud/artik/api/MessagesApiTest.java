package cloud.artik.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cloud.artik.model.Action;
import cloud.artik.model.ActionArray;
import cloud.artik.model.Actions;
import cloud.artik.model.Message;
import cloud.artik.model.NormalizedAction;
import cloud.artik.model.NormalizedActionsEnvelope;
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
    public void testSendMessage() throws Exception {
        Message message = new Message();
        message.setSdid(this.getProperty("device1.id"));
        message.setTs(new Long(System.currentTimeMillis()));
        message.getData().put("steps", new Integer(500));

        String messageId = this.apiClient.sendMessage(message).getData()
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
    
    @Test
    public void testSendActions() throws Exception {
        String ddid = this.getProperty("device4.id");
        MessagesApi newApi = (MessagesApi) super.api(MessagesApi.class, "user1.token");
        
        Action action = new Action();
        action.setName("setVolume");
        action.getParameters().put("volume", 5);
        
        ActionArray actionArray = new ActionArray();
        actionArray.getActions().add(action);
        
        Actions actions = new Actions();
        actions.setDdid(ddid);
        actions.setTs(new Long(System.currentTimeMillis()));
        actions.setData(actionArray);
        
        String mid = newApi.sendActions(actions).getData().getMid();
        
        // Wait 2 seconds for the message to be normalized. 2 seconds just to be
        // safe, usually much faster.
        Thread.sleep(2000);
        
        NormalizedActionsEnvelope envelope = newApi.getNormalizedActions(null, null, mid, null, null, null, null, null);
        assertEquals(new Long(1), envelope.getSize());

        NormalizedAction normalized = envelope.getData().get(0);
        Action actionRx = normalized.getData().getActions().get(0);
        
        assertEquals("setVolume", actionRx.getName());

        Object volume = actionRx.getParameters().get("volume");
        assertNotNull("Volume should not be null", volume);
        assertEquals(new Double(5.0), volume);
    }
    
    

}
