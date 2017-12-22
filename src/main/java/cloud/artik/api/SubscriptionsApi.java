package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.NotifMessagesResponse;
import cloud.artik.model.SubscriptionEnvelope;
import cloud.artik.model.SubscriptionInfo;
import cloud.artik.model.SubscriptionsEnvelope;
import cloud.artik.model.ValidationCallbackInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SubscriptionsApi {
  /**
   * Create Subscription
   * Create Subscription
   * @param subscriptionInfo Subscription details (required)
   * @return Call&lt;SubscriptionEnvelope&gt;
   */
  
  @POST("subscriptions")
  Call<SubscriptionEnvelope> createSubscription(
    @retrofit2.http.Body SubscriptionInfo subscriptionInfo
  );

  /**
   * Delete Subscription
   * Delete Subscription
   * @param subId Subscription ID. (required)
   * @return Call&lt;SubscriptionEnvelope&gt;
   */
  
  @DELETE("subscriptions/{subId}")
  Call<SubscriptionEnvelope> deleteSubscription(
    @retrofit2.http.Path("subId") String subId
  );

  /**
   * Get All Subscriptions
   * Get All Subscriptions
   * @param uid User ID (optional)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set. (optional)
   * @return Call&lt;SubscriptionsEnvelope&gt;
   */
  
  @GET("subscriptions")
  Call<SubscriptionsEnvelope> getAllSubscriptions(
    @retrofit2.http.Query("uid") String uid, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("count") Integer count
  );

  /**
   * Get Messages
   * Get Messages
   * @param notifId Notification ID. (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set. (optional)
   * @param order Sort order of results by ts. Either &#39;asc&#39; or &#39;desc&#39;. (optional)
   * @return Call&lt;NotifMessagesResponse&gt;
   */
  
  @GET("notifications/{notifId}/messages")
  Call<NotifMessagesResponse> getMessages(
    @retrofit2.http.Path("notifId") String notifId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("order") String order
  );

  /**
   * Get Subscription
   * Get Subscription
   * @param subId Subscription ID. (required)
   * @return Call&lt;SubscriptionEnvelope&gt;
   */
  
  @GET("subscriptions/{subId}")
  Call<SubscriptionEnvelope> getSubscription(
    @retrofit2.http.Path("subId") String subId
  );

  /**
   * Validate Subscription
   * Validate Subscription
   * @param subId Subscription ID. (required)
   * @param validationCallbackRequest Subscription validation callback request (required)
   * @return Call&lt;SubscriptionEnvelope&gt;
   */
  
  @POST("subscriptions/{subId}/validate")
  Call<SubscriptionEnvelope> validateSubscription(
    @retrofit2.http.Path("subId") String subId, @retrofit2.http.Body ValidationCallbackInfo validationCallbackRequest
  );

}
