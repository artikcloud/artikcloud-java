package cloud.artik.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cloud.artik.client.ApiClient;
import cloud.artik.model.MessageAction;
import cloud.artik.model.NormalizedMessage;
import cloud.artik.model.NormalizedMessagesEnvelope;

public class MessagesApiTest {
    protected MessagesApi apiClient = null;

    protected MessagesApi api(String deviceToken) {
        try {
            ApiClient client = new ApiClient();
            client.setAccessToken(deviceToken);
            client.setDebugging(true);

            MessagesApi retVal = new MessagesApi();
            retVal.setApiClient(client);

            return retVal;
        } catch (Exception exc) {
            exc.printStackTrace();
            return null;
        }
    }

    @Before
    public void setUp() throws Exception {
        String deviceToken = "1eef3e3251e147d1ac707a57f6779c49";
        this.apiClient = api(deviceToken);
    }

    @After
    public void tearDown() throws Exception {
        this.apiClient = null;
    }

    @Test
    public void testSendMessageAction() throws Exception {
        MessageAction message = new MessageAction();
        message.setSdid("993925c3cd994bf7a51c620884be65e9");
        message.setTs(new Long(System.currentTimeMillis()));
        message.setType("message");
        message.getData().put("volume", new Integer(5));

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

        Object volume = normalized.getData().get("volume");
        assertNotNull("Volume should not be null", volume);
        assertEquals(new Double(5.0), volume);
    }

}
