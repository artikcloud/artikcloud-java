package cloud.artik.api;

import cloud.artik.client.ApiCallback;
import cloud.artik.client.ApiClient;
import cloud.artik.client.ApiException;
import cloud.artik.client.ApiResponse;
import cloud.artik.client.Configuration;
import cloud.artik.client.Pair;
import cloud.artik.client.ProgressRequestBody;
import cloud.artik.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;

import java.io.IOException;

import cloud.artik.model.NormalizedMessagesEnvelope;
import cloud.artik.model.MessageAction;
import cloud.artik.model.MessageIDEnvelope;
import cloud.artik.model.AggregatesResponse;
import cloud.artik.model.AggregatesHistogramResponse;
import cloud.artik.model.FieldPresenceEnvelope;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagesApi {
  private ApiClient apiClient;

  public MessagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for getNormalizedMessages */
  private Call getNormalizedMessagesCall(String uid, String sdid, String mid, String fieldPresence, String filter, String offset, Integer count, Long startDate, Long endDate, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/messages".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (uid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "uid", uid));
    if (sdid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "sdid", sdid));
    if (mid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "mid", mid));
    if (fieldPresence != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldPresence", fieldPresence));
    if (filter != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    if (offset != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    if (count != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    if (startDate != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    if (endDate != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    if (order != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get Normalized Messages
   * Get the messages normalized
   * @param uid User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to.
   * @param sdid Source device ID of the messages being searched.
   * @param mid The SAMI message ID being searched.
   * @param fieldPresence String representing a field from the specified device ID.
   * @param filter Filter.
   * @param offset A string that represents the starting item, should be the value of &#39;next&#39; field received in the last response. (required for pagination)
   * @param count count
   * @param startDate startDate
   * @param endDate endDate
   * @param order Desired sort order: &#39;asc&#39; or &#39;desc&#39;
   * @return NormalizedMessagesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public NormalizedMessagesEnvelope getNormalizedMessages(String uid, String sdid, String mid, String fieldPresence, String filter, String offset, Integer count, Long startDate, Long endDate, String order) throws ApiException {
    ApiResponse<NormalizedMessagesEnvelope> resp = getNormalizedMessagesWithHttpInfo(uid, sdid, mid, fieldPresence, filter, offset, count, startDate, endDate, order);
    return resp.getData();
  }

  /**
   * Get Normalized Messages
   * Get the messages normalized
   * @param uid User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to.
   * @param sdid Source device ID of the messages being searched.
   * @param mid The SAMI message ID being searched.
   * @param fieldPresence String representing a field from the specified device ID.
   * @param filter Filter.
   * @param offset A string that represents the starting item, should be the value of &#39;next&#39; field received in the last response. (required for pagination)
   * @param count count
   * @param startDate startDate
   * @param endDate endDate
   * @param order Desired sort order: &#39;asc&#39; or &#39;desc&#39;
   * @return ApiResponse<NormalizedMessagesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<NormalizedMessagesEnvelope> getNormalizedMessagesWithHttpInfo(String uid, String sdid, String mid, String fieldPresence, String filter, String offset, Integer count, Long startDate, Long endDate, String order) throws ApiException {
    Call call = getNormalizedMessagesCall(uid, sdid, mid, fieldPresence, filter, offset, count, startDate, endDate, order, null, null);
    Type localVarReturnType = new TypeToken<NormalizedMessagesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Normalized Messages (asynchronously)
   * Get the messages normalized
   * @param uid User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to.
   * @param sdid Source device ID of the messages being searched.
   * @param mid The SAMI message ID being searched.
   * @param fieldPresence String representing a field from the specified device ID.
   * @param filter Filter.
   * @param offset A string that represents the starting item, should be the value of &#39;next&#39; field received in the last response. (required for pagination)
   * @param count count
   * @param startDate startDate
   * @param endDate endDate
   * @param order Desired sort order: &#39;asc&#39; or &#39;desc&#39;
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getNormalizedMessagesAsync(String uid, String sdid, String mid, String fieldPresence, String filter, String offset, Integer count, Long startDate, Long endDate, String order, final ApiCallback<NormalizedMessagesEnvelope> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getNormalizedMessagesCall(uid, sdid, mid, fieldPresence, filter, offset, count, startDate, endDate, order, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<NormalizedMessagesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for sendMessageAction */
  private Call sendMessageActionCall(MessageAction data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'data' is set
    if (data == null) {
       throw new ApiException("Missing the required parameter 'data' when calling sendMessageAction(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/messages".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
    return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Send Message Action
   * Send a message or an Action:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Send Message&lt;/td&gt;&lt;td&gt;sdid, type=message&lt;/td&gt;&lt;td&gt;Send a message from a Source Device&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Send Action&lt;/td&gt;&lt;td&gt;ddid, type=action&lt;/td&gt;&lt;td&gt;Send an action to a Destination Device&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;data, ts, token&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   * @param data Message or Action object that is passed in the body
   * @return MessageIDEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public MessageIDEnvelope sendMessageAction(MessageAction data) throws ApiException {
    ApiResponse<MessageIDEnvelope> resp = sendMessageActionWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * Send Message Action
   * Send a message or an Action:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Send Message&lt;/td&gt;&lt;td&gt;sdid, type=message&lt;/td&gt;&lt;td&gt;Send a message from a Source Device&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Send Action&lt;/td&gt;&lt;td&gt;ddid, type=action&lt;/td&gt;&lt;td&gt;Send an action to a Destination Device&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;data, ts, token&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   * @param data Message or Action object that is passed in the body
   * @return ApiResponse<MessageIDEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<MessageIDEnvelope> sendMessageActionWithHttpInfo(MessageAction data) throws ApiException {
    Call call = sendMessageActionCall(data, null, null);
    Type localVarReturnType = new TypeToken<MessageIDEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Send Message Action (asynchronously)
   * Send a message or an Action:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Send Message&lt;/td&gt;&lt;td&gt;sdid, type=message&lt;/td&gt;&lt;td&gt;Send a message from a Source Device&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Send Action&lt;/td&gt;&lt;td&gt;ddid, type=action&lt;/td&gt;&lt;td&gt;Send an action to a Destination Device&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;data, ts, token&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   * @param data Message or Action object that is passed in the body
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call sendMessageActionAsync(MessageAction data, final ApiCallback<MessageIDEnvelope> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = sendMessageActionCall(data, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<MessageIDEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getMessageAggregates */
  private Call getMessageAggregatesCall(String sdid, String field, Long startDate, Long endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sdid' is set
    if (sdid == null) {
       throw new ApiException("Missing the required parameter 'sdid' when calling getMessageAggregates(Async)");
    }
    
    // verify the required parameter 'field' is set
    if (field == null) {
       throw new ApiException("Missing the required parameter 'field' when calling getMessageAggregates(Async)");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
       throw new ApiException("Missing the required parameter 'startDate' when calling getMessageAggregates(Async)");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
       throw new ApiException("Missing the required parameter 'endDate' when calling getMessageAggregates(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/messages/analytics/aggregates".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (sdid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "sdid", sdid));
    if (field != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));
    if (startDate != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    if (endDate != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get Normalized Message Aggregates
   * Get Aggregates on normalized messages.
   * @param sdid Source device ID of the messages being searched.
   * @param field Message field being queried for aggregates.
   * @param startDate Timestamp of earliest message (in milliseconds since epoch).
   * @param endDate Timestamp of latest message (in milliseconds since epoch).
   * @return AggregatesResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public AggregatesResponse getMessageAggregates(String sdid, String field, Long startDate, Long endDate) throws ApiException {
    ApiResponse<AggregatesResponse> resp = getMessageAggregatesWithHttpInfo(sdid, field, startDate, endDate);
    return resp.getData();
  }

  /**
   * Get Normalized Message Aggregates
   * Get Aggregates on normalized messages.
   * @param sdid Source device ID of the messages being searched.
   * @param field Message field being queried for aggregates.
   * @param startDate Timestamp of earliest message (in milliseconds since epoch).
   * @param endDate Timestamp of latest message (in milliseconds since epoch).
   * @return ApiResponse<AggregatesResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<AggregatesResponse> getMessageAggregatesWithHttpInfo(String sdid, String field, Long startDate, Long endDate) throws ApiException {
    Call call = getMessageAggregatesCall(sdid, field, startDate, endDate, null, null);
    Type localVarReturnType = new TypeToken<AggregatesResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Normalized Message Aggregates (asynchronously)
   * Get Aggregates on normalized messages.
   * @param sdid Source device ID of the messages being searched.
   * @param field Message field being queried for aggregates.
   * @param startDate Timestamp of earliest message (in milliseconds since epoch).
   * @param endDate Timestamp of latest message (in milliseconds since epoch).
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getMessageAggregatesAsync(String sdid, String field, Long startDate, Long endDate, final ApiCallback<AggregatesResponse> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getMessageAggregatesCall(sdid, field, startDate, endDate, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AggregatesResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getAggregatesHistogram */
  private Call getAggregatesHistogramCall(Long startDate, Long endDate, String sdid, String field, String interval, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
       throw new ApiException("Missing the required parameter 'startDate' when calling getAggregatesHistogram(Async)");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
       throw new ApiException("Missing the required parameter 'endDate' when calling getAggregatesHistogram(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/messages/analytics/histogram".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (startDate != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    if (endDate != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    if (sdid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "sdid", sdid));
    if (field != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));
    if (interval != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get Histogram aggregates
   * Get Histogram on normalized messages.
   * @param startDate Timestamp of earliest message (in milliseconds since epoch).
   * @param endDate Timestamp of latest message (in milliseconds since epoch).
   * @param sdid Source device ID of the messages being searched.
   * @param field Message field being queried for building histogram.
   * @param interval Interval of time for building histogram blocks. (Valid values: minute, hour, day, month, year)
   * @return AggregatesHistogramResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public AggregatesHistogramResponse getAggregatesHistogram(Long startDate, Long endDate, String sdid, String field, String interval) throws ApiException {
    ApiResponse<AggregatesHistogramResponse> resp = getAggregatesHistogramWithHttpInfo(startDate, endDate, sdid, field, interval);
    return resp.getData();
  }

  /**
   * Get Histogram aggregates
   * Get Histogram on normalized messages.
   * @param startDate Timestamp of earliest message (in milliseconds since epoch).
   * @param endDate Timestamp of latest message (in milliseconds since epoch).
   * @param sdid Source device ID of the messages being searched.
   * @param field Message field being queried for building histogram.
   * @param interval Interval of time for building histogram blocks. (Valid values: minute, hour, day, month, year)
   * @return ApiResponse<AggregatesHistogramResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<AggregatesHistogramResponse> getAggregatesHistogramWithHttpInfo(Long startDate, Long endDate, String sdid, String field, String interval) throws ApiException {
    Call call = getAggregatesHistogramCall(startDate, endDate, sdid, field, interval, null, null);
    Type localVarReturnType = new TypeToken<AggregatesHistogramResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Histogram aggregates (asynchronously)
   * Get Histogram on normalized messages.
   * @param startDate Timestamp of earliest message (in milliseconds since epoch).
   * @param endDate Timestamp of latest message (in milliseconds since epoch).
   * @param sdid Source device ID of the messages being searched.
   * @param field Message field being queried for building histogram.
   * @param interval Interval of time for building histogram blocks. (Valid values: minute, hour, day, month, year)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getAggregatesHistogramAsync(Long startDate, Long endDate, String sdid, String field, String interval, final ApiCallback<AggregatesHistogramResponse> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getAggregatesHistogramCall(startDate, endDate, sdid, field, interval, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AggregatesHistogramResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getLastNormalizedMessages */
  private Call getLastNormalizedMessagesCall(Integer count, String sdids, String fieldPresence, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/messages/last".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (count != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    if (sdids != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "sdids", sdids));
    if (fieldPresence != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldPresence", fieldPresence));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get Last Normalized Message
   * Get last messages normalized.
   * @param count Number of items to return per query.
   * @param sdids Comma separated list of source device IDs (minimum: 1).
   * @param fieldPresence String representing a field from the specified device ID.
   * @return NormalizedMessagesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public NormalizedMessagesEnvelope getLastNormalizedMessages(Integer count, String sdids, String fieldPresence) throws ApiException {
    ApiResponse<NormalizedMessagesEnvelope> resp = getLastNormalizedMessagesWithHttpInfo(count, sdids, fieldPresence);
    return resp.getData();
  }

  /**
   * Get Last Normalized Message
   * Get last messages normalized.
   * @param count Number of items to return per query.
   * @param sdids Comma separated list of source device IDs (minimum: 1).
   * @param fieldPresence String representing a field from the specified device ID.
   * @return ApiResponse<NormalizedMessagesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<NormalizedMessagesEnvelope> getLastNormalizedMessagesWithHttpInfo(Integer count, String sdids, String fieldPresence) throws ApiException {
    Call call = getLastNormalizedMessagesCall(count, sdids, fieldPresence, null, null);
    Type localVarReturnType = new TypeToken<NormalizedMessagesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Last Normalized Message (asynchronously)
   * Get last messages normalized.
   * @param count Number of items to return per query.
   * @param sdids Comma separated list of source device IDs (minimum: 1).
   * @param fieldPresence String representing a field from the specified device ID.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getLastNormalizedMessagesAsync(Integer count, String sdids, String fieldPresence, final ApiCallback<NormalizedMessagesEnvelope> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getLastNormalizedMessagesCall(count, sdids, fieldPresence, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<NormalizedMessagesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getFieldPresence */
  private Call getFieldPresenceCall(Long startDate, Long endDate, String interval, String sdid, String fieldPresence, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
       throw new ApiException("Missing the required parameter 'startDate' when calling getFieldPresence(Async)");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
       throw new ApiException("Missing the required parameter 'endDate' when calling getFieldPresence(Async)");
    }
    
    // verify the required parameter 'interval' is set
    if (interval == null) {
       throw new ApiException("Missing the required parameter 'interval' when calling getFieldPresence(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/messages/presence".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (sdid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "sdid", sdid));
    if (fieldPresence != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldPresence", fieldPresence));
    if (startDate != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    if (endDate != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    if (interval != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if(progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
      @Override
      public Response intercept(Interceptor.Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
        }
      });
    }

    String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get normalized message presence
   * Get normalized message presence.
   * @param startDate startDate
   * @param endDate endDate
   * @param interval String representing grouping interval. One of: &#39;minute&#39; (1 hour limit), &#39;hour&#39; (1 day limit), &#39;day&#39; (31 days limit), &#39;month&#39; (1 year limit), or &#39;year&#39; (10 years limit).
   * @param sdid Source device ID of the messages being searched.
   * @param fieldPresence String representing a field from the specified device ID.
   * @return FieldPresenceEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public FieldPresenceEnvelope getFieldPresence(Long startDate, Long endDate, String interval, String sdid, String fieldPresence) throws ApiException {
    ApiResponse<FieldPresenceEnvelope> resp = getFieldPresenceWithHttpInfo(startDate, endDate, interval, sdid, fieldPresence);
    return resp.getData();
  }

  /**
   * Get normalized message presence
   * Get normalized message presence.
   * @param startDate startDate
   * @param endDate endDate
   * @param interval String representing grouping interval. One of: &#39;minute&#39; (1 hour limit), &#39;hour&#39; (1 day limit), &#39;day&#39; (31 days limit), &#39;month&#39; (1 year limit), or &#39;year&#39; (10 years limit).
   * @param sdid Source device ID of the messages being searched.
   * @param fieldPresence String representing a field from the specified device ID.
   * @return ApiResponse<FieldPresenceEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<FieldPresenceEnvelope> getFieldPresenceWithHttpInfo(Long startDate, Long endDate, String interval, String sdid, String fieldPresence) throws ApiException {
    Call call = getFieldPresenceCall(startDate, endDate, interval, sdid, fieldPresence, null, null);
    Type localVarReturnType = new TypeToken<FieldPresenceEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get normalized message presence (asynchronously)
   * Get normalized message presence.
   * @param startDate startDate
   * @param endDate endDate
   * @param interval String representing grouping interval. One of: &#39;minute&#39; (1 hour limit), &#39;hour&#39; (1 day limit), &#39;day&#39; (31 days limit), &#39;month&#39; (1 year limit), or &#39;year&#39; (10 years limit).
   * @param sdid Source device ID of the messages being searched.
   * @param fieldPresence String representing a field from the specified device ID.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getFieldPresenceAsync(Long startDate, Long endDate, String interval, String sdid, String fieldPresence, final ApiCallback<FieldPresenceEnvelope> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    Call call = getFieldPresenceCall(startDate, endDate, interval, sdid, fieldPresence, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<FieldPresenceEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
