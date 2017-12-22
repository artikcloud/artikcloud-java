package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.Actions;
import cloud.artik.model.AggregatesHistogramResponse;
import cloud.artik.model.AggregatesResponse;
import cloud.artik.model.FieldPresenceEnvelope;
import cloud.artik.model.Message;
import cloud.artik.model.MessageIDEnvelope;
import cloud.artik.model.NormalizedActionsEnvelope;
import cloud.artik.model.NormalizedMessagesEnvelope;
import cloud.artik.model.SnapshotResponses;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
public class MessagesApiTest {

    private MessagesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MessagesApi.class);
    }

    
    /**
     * Get Normalized Message Histogram
     *
     * Get Histogram on normalized messages.
     */
    @Test
    public void getAggregatesHistogramTest() {
        Long startDate = null;
        Long endDate = null;
        String sdid = null;
        String field = null;
        String interval = null;
        // AggregatesHistogramResponse response = api.getAggregatesHistogram(startDate, endDate, sdid, field, interval);

        // TODO: test validations
    }
    
    /**
     * Get normalized message presence
     *
     * Get normalized message presence.
     */
    @Test
    public void getFieldPresenceTest() {
        Long startDate = null;
        Long endDate = null;
        String interval = null;
        String sdid = null;
        String fieldPresence = null;
        // FieldPresenceEnvelope response = api.getFieldPresence(startDate, endDate, interval, sdid, fieldPresence);

        // TODO: test validations
    }
    
    /**
     * Get Last Normalized Message
     *
     * Get last messages normalized.
     */
    @Test
    public void getLastNormalizedMessagesTest() {
        Integer count = null;
        String sdids = null;
        String fieldPresence = null;
        // NormalizedMessagesEnvelope response = api.getLastNormalizedMessages(count, sdids, fieldPresence);

        // TODO: test validations
    }
    
    /**
     * Get Normalized Message Aggregates
     *
     * Get Aggregates on normalized messages.
     */
    @Test
    public void getMessageAggregatesTest() {
        String sdid = null;
        String field = null;
        Long startDate = null;
        Long endDate = null;
        // AggregatesResponse response = api.getMessageAggregates(sdid, field, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * Get Message Snapshots
     *
     * Get message snapshots.
     */
    @Test
    public void getMessageSnapshotsTest() {
        String sdids = null;
        Boolean includeTimestamp = null;
        // SnapshotResponses response = api.getMessageSnapshots(sdids, includeTimestamp);

        // TODO: test validations
    }
    
    /**
     * Get Normalized Actions
     *
     * Get the actions normalized
     */
    @Test
    public void getNormalizedActionsTest() {
        String uid = null;
        String ddid = null;
        String mid = null;
        String offset = null;
        Integer count = null;
        Long startDate = null;
        Long endDate = null;
        String order = null;
        // NormalizedActionsEnvelope response = api.getNormalizedActions(uid, ddid, mid, offset, count, startDate, endDate, order);

        // TODO: test validations
    }
    
    /**
     * Get Normalized Messages
     *
     * Get the messages normalized
     */
    @Test
    public void getNormalizedMessagesTest() {
        String uid = null;
        String sdid = null;
        String mid = null;
        String fieldPresence = null;
        String filter = null;
        String offset = null;
        Integer count = null;
        Long startDate = null;
        Long endDate = null;
        String order = null;
        // NormalizedMessagesEnvelope response = api.getNormalizedMessages(uid, sdid, mid, fieldPresence, filter, offset, count, startDate, endDate, order);

        // TODO: test validations
    }
    
    /**
     * Send Actions
     *
     * Send Actions
     */
    @Test
    public void sendActionsTest() {
        Actions data = null;
        // MessageIDEnvelope response = api.sendActions(data);

        // TODO: test validations
    }
    
    /**
     * Send Message
     *
     * Send a message
     */
    @Test
    public void sendMessageTest() {
        Message data = null;
        // MessageIDEnvelope response = api.sendMessage(data);

        // TODO: test validations
    }
    
}
