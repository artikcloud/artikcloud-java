package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.NotifMessagesResponse;
import cloud.artik.model.SubscriptionEnvelope;
import cloud.artik.model.SubscriptionInfo;
import cloud.artik.model.SubscriptionsEnvelope;
import cloud.artik.model.ValidationCallbackInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsApi
 */
public class SubscriptionsApiTest {

    private SubscriptionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SubscriptionsApi.class);
    }

    
    /**
     * Create Subscription
     *
     * Create Subscription
     */
    @Test
    public void createSubscriptionTest() {
        SubscriptionInfo subscriptionInfo = null;
        // SubscriptionEnvelope response = api.createSubscription(subscriptionInfo);

        // TODO: test validations
    }
    
    /**
     * Delete Subscription
     *
     * Delete Subscription
     */
    @Test
    public void deleteSubscriptionTest() {
        String subId = null;
        // SubscriptionEnvelope response = api.deleteSubscription(subId);

        // TODO: test validations
    }
    
    /**
     * Get All Subscriptions
     *
     * Get All Subscriptions
     */
    @Test
    public void getAllSubscriptionsTest() {
        String uid = null;
        Integer offset = null;
        Integer count = null;
        // SubscriptionsEnvelope response = api.getAllSubscriptions(uid, offset, count);

        // TODO: test validations
    }
    
    /**
     * Get Messages
     *
     * Get Messages
     */
    @Test
    public void getMessagesTest() {
        String notifId = null;
        Integer offset = null;
        Integer count = null;
        String order = null;
        // NotifMessagesResponse response = api.getMessages(notifId, offset, count, order);

        // TODO: test validations
    }
    
    /**
     * Get Subscription
     *
     * Get Subscription
     */
    @Test
    public void getSubscriptionTest() {
        String subId = null;
        // SubscriptionEnvelope response = api.getSubscription(subId);

        // TODO: test validations
    }
    
    /**
     * Validate Subscription
     *
     * Validate Subscription
     */
    @Test
    public void validateSubscriptionTest() {
        String subId = null;
        ValidationCallbackInfo validationCallbackRequest = null;
        // SubscriptionEnvelope response = api.validateSubscription(subId, validationCallbackRequest);

        // TODO: test validations
    }
    
}
