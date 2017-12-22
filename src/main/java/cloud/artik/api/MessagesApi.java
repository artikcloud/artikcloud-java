package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.Actions;
import cloud.artik.model.AggregatesHistogramResponse;
import cloud.artik.model.AggregatesResponse;
import cloud.artik.model.FieldPresenceEnvelope;
import cloud.artik.model.Message;
import cloud.artik.model.MessageIDEnvelope;
import cloud.artik.model.NormalizedActionsEnvelope;
import cloud.artik.model.NormalizedMessagesEnvelope;
import cloud.artik.model.SnapshotResponses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MessagesApi {
  /**
   * Get Normalized Message Histogram
   * Get Histogram on normalized messages.
   * @param startDate Timestamp of earliest message (in milliseconds since epoch). (required)
   * @param endDate Timestamp of latest message (in milliseconds since epoch). (required)
   * @param sdid Source device ID of the messages being searched. (optional)
   * @param field Message field being queried for building histogram. (optional)
   * @param interval Interval of time for building histogram blocks. (Valid values: minute, hour, day, month, year) (optional)
   * @return Call&lt;AggregatesHistogramResponse&gt;
   */
  
  @GET("messages/analytics/histogram")
  Call<AggregatesHistogramResponse> getAggregatesHistogram(
    @retrofit2.http.Query("startDate") Long startDate, @retrofit2.http.Query("endDate") Long endDate, @retrofit2.http.Query("sdid") String sdid, @retrofit2.http.Query("field") String field, @retrofit2.http.Query("interval") String interval
  );

  /**
   * Get normalized message presence
   * Get normalized message presence.
   * @param startDate startDate (required)
   * @param endDate endDate (required)
   * @param interval String representing grouping interval. One of: &#39;minute&#39; (1 hour limit), &#39;hour&#39; (1 day limit), &#39;day&#39; (31 days limit), &#39;month&#39; (1 year limit), or &#39;year&#39; (10 years limit). (required)
   * @param sdid Source device ID of the messages being searched. (optional)
   * @param fieldPresence String representing a field from the specified device ID. (optional)
   * @return Call&lt;FieldPresenceEnvelope&gt;
   */
  
  @GET("messages/presence")
  Call<FieldPresenceEnvelope> getFieldPresence(
    @retrofit2.http.Query("startDate") Long startDate, @retrofit2.http.Query("endDate") Long endDate, @retrofit2.http.Query("interval") String interval, @retrofit2.http.Query("sdid") String sdid, @retrofit2.http.Query("fieldPresence") String fieldPresence
  );

  /**
   * Get Last Normalized Message
   * Get last messages normalized.
   * @param count Number of items to return per query. (optional)
   * @param sdids Comma separated list of source device IDs (minimum: 1). (optional)
   * @param fieldPresence String representing a field from the specified device ID. (optional)
   * @return Call&lt;NormalizedMessagesEnvelope&gt;
   */
  
  @GET("messages/last")
  Call<NormalizedMessagesEnvelope> getLastNormalizedMessages(
    @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("sdids") String sdids, @retrofit2.http.Query("fieldPresence") String fieldPresence
  );

  /**
   * Get Normalized Message Aggregates
   * Get Aggregates on normalized messages.
   * @param sdid Source device ID of the messages being searched. (required)
   * @param field Message field being queried for aggregates. (required)
   * @param startDate Timestamp of earliest message (in milliseconds since epoch). (required)
   * @param endDate Timestamp of latest message (in milliseconds since epoch). (required)
   * @return Call&lt;AggregatesResponse&gt;
   */
  
  @GET("messages/analytics/aggregates")
  Call<AggregatesResponse> getMessageAggregates(
    @retrofit2.http.Query("sdid") String sdid, @retrofit2.http.Query("field") String field, @retrofit2.http.Query("startDate") Long startDate, @retrofit2.http.Query("endDate") Long endDate
  );

  /**
   * Get Message Snapshots
   * Get message snapshots.
   * @param sdids Device IDs for which the snapshots are requested. Max 100 device ids per call. (required)
   * @param includeTimestamp Indicates whether to return timestamps of the last update for each field. (optional)
   * @return Call&lt;SnapshotResponses&gt;
   */
  
  @GET("messages/snapshots")
  Call<SnapshotResponses> getMessageSnapshots(
    @retrofit2.http.Query("sdids") String sdids, @retrofit2.http.Query("includeTimestamp") Boolean includeTimestamp
  );

  /**
   * Get Normalized Actions
   * Get the actions normalized
   * @param uid User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to. (optional)
   * @param ddid Destination device ID of the actions being searched. (optional)
   * @param mid The message ID being searched. (optional)
   * @param offset A string that represents the starting item, should be the value of &#39;next&#39; field received in the last response. (required for pagination) (optional)
   * @param count count (optional)
   * @param startDate startDate (optional)
   * @param endDate endDate (optional)
   * @param order Desired sort order: &#39;asc&#39; or &#39;desc&#39; (optional)
   * @return Call&lt;NormalizedActionsEnvelope&gt;
   */
  
  @GET("actions")
  Call<NormalizedActionsEnvelope> getNormalizedActions(
    @retrofit2.http.Query("uid") String uid, @retrofit2.http.Query("ddid") String ddid, @retrofit2.http.Query("mid") String mid, @retrofit2.http.Query("offset") String offset, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("startDate") Long startDate, @retrofit2.http.Query("endDate") Long endDate, @retrofit2.http.Query("order") String order
  );

  /**
   * Get Normalized Messages
   * Get the messages normalized
   * @param uid User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to. (optional)
   * @param sdid Source device ID of the messages being searched. (optional)
   * @param mid The message ID being searched. (optional)
   * @param fieldPresence String representing a field from the specified device ID. (optional)
   * @param filter Filter. (optional)
   * @param offset A string that represents the starting item, should be the value of &#39;next&#39; field received in the last response. (required for pagination) (optional)
   * @param count count (optional)
   * @param startDate startDate (optional)
   * @param endDate endDate (optional)
   * @param order Desired sort order: &#39;asc&#39; or &#39;desc&#39; (optional)
   * @return Call&lt;NormalizedMessagesEnvelope&gt;
   */
  
  @GET("messages")
  Call<NormalizedMessagesEnvelope> getNormalizedMessages(
    @retrofit2.http.Query("uid") String uid, @retrofit2.http.Query("sdid") String sdid, @retrofit2.http.Query("mid") String mid, @retrofit2.http.Query("fieldPresence") String fieldPresence, @retrofit2.http.Query("filter") String filter, @retrofit2.http.Query("offset") String offset, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("startDate") Long startDate, @retrofit2.http.Query("endDate") Long endDate, @retrofit2.http.Query("order") String order
  );

  /**
   * Send Actions
   * Send Actions
   * @param data Actions that are passed in the body (required)
   * @return Call&lt;MessageIDEnvelope&gt;
   */
  
  @POST("actions")
  Call<MessageIDEnvelope> sendActions(
    @retrofit2.http.Body Actions data
  );

  /**
   * Send Message
   * Send a message
   * @param data Message object that is passed in the body (required)
   * @return Call&lt;MessageIDEnvelope&gt;
   */
  
  @POST("messages")
  Call<MessageIDEnvelope> sendMessage(
    @retrofit2.http.Body Message data
  );

}
