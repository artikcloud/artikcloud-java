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

import cloud.artik.model.PropertiesEnvelope;
import cloud.artik.model.AppProperties;
import cloud.artik.model.UserEnvelope;
import cloud.artik.model.DeviceTypesEnvelope;
import cloud.artik.model.DevicesEnvelope;
import cloud.artik.model.RulesEnvelope;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for createUserProperties */
  private Call createUserPropertiesCall(String userId, AppProperties properties, String aid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = properties;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException("Missing the required parameter 'userId' when calling createUserProperties(Async)");
    }
    
    // verify the required parameter 'properties' is set
    if (properties == null) {
       throw new ApiException("Missing the required parameter 'properties' when calling createUserProperties(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/users/{userId}/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (aid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "aid", aid));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      "application/json"
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
   * Create User Application Properties
   * Create application properties for a user
   * @param userId User Id (required)
   * @param properties Properties to be updated (required)
   * @param aid Application ID (optional)
   * @return PropertiesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public PropertiesEnvelope createUserProperties(String userId, AppProperties properties, String aid) throws ApiException {
    ApiResponse<PropertiesEnvelope> resp = createUserPropertiesWithHttpInfo(userId, properties, aid);
    return resp.getData();
  }

  /**
   * Create User Application Properties
   * Create application properties for a user
   * @param userId User Id (required)
   * @param properties Properties to be updated (required)
   * @param aid Application ID (optional)
   * @return ApiResponse<PropertiesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<PropertiesEnvelope> createUserPropertiesWithHttpInfo(String userId, AppProperties properties, String aid) throws ApiException {
    Call call = createUserPropertiesCall(userId, properties, aid, null, null);
    Type localVarReturnType = new TypeToken<PropertiesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Create User Application Properties (asynchronously)
   * Create application properties for a user
   * @param userId User Id (required)
   * @param properties Properties to be updated (required)
   * @param aid Application ID (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call createUserPropertiesAsync(String userId, AppProperties properties, String aid, final ApiCallback<PropertiesEnvelope> callback) throws ApiException {

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

    Call call = createUserPropertiesCall(userId, properties, aid, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<PropertiesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for deleteUserProperties */
  private Call deleteUserPropertiesCall(String userId, String aid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException("Missing the required parameter 'userId' when calling deleteUserProperties(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/users/{userId}/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (aid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "aid", aid));

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
    return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Delete User Application Properties
   * Deletes a user&#39;s application properties
   * @param userId User Id (required)
   * @param aid Application ID (optional)
   * @return PropertiesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public PropertiesEnvelope deleteUserProperties(String userId, String aid) throws ApiException {
    ApiResponse<PropertiesEnvelope> resp = deleteUserPropertiesWithHttpInfo(userId, aid);
    return resp.getData();
  }

  /**
   * Delete User Application Properties
   * Deletes a user&#39;s application properties
   * @param userId User Id (required)
   * @param aid Application ID (optional)
   * @return ApiResponse<PropertiesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<PropertiesEnvelope> deleteUserPropertiesWithHttpInfo(String userId, String aid) throws ApiException {
    Call call = deleteUserPropertiesCall(userId, aid, null, null);
    Type localVarReturnType = new TypeToken<PropertiesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Delete User Application Properties (asynchronously)
   * Deletes a user&#39;s application properties
   * @param userId User Id (required)
   * @param aid Application ID (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call deleteUserPropertiesAsync(String userId, String aid, final ApiCallback<PropertiesEnvelope> callback) throws ApiException {

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

    Call call = deleteUserPropertiesCall(userId, aid, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<PropertiesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getSelf */
  private Call getSelfCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/users/self".replaceAll("\\{format\\}","json");

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
    return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Get Current User Profile
   * Get&#39;s the current user&#39;s profile
   * @return UserEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public UserEnvelope getSelf() throws ApiException {
    ApiResponse<UserEnvelope> resp = getSelfWithHttpInfo();
    return resp.getData();
  }

  /**
   * Get Current User Profile
   * Get&#39;s the current user&#39;s profile
   * @return ApiResponse<UserEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<UserEnvelope> getSelfWithHttpInfo() throws ApiException {
    Call call = getSelfCall(null, null);
    Type localVarReturnType = new TypeToken<UserEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Current User Profile (asynchronously)
   * Get&#39;s the current user&#39;s profile
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getSelfAsync(final ApiCallback<UserEnvelope> callback) throws ApiException {

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

    Call call = getSelfCall(progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<UserEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getUserDeviceTypes */
  private Call getUserDeviceTypesCall(String userId, Integer offset, Integer count, Boolean includeShared, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException("Missing the required parameter 'userId' when calling getUserDeviceTypes(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/users/{userId}/devicetypes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (offset != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    if (count != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    if (includeShared != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeShared", includeShared));

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
   * Get User Device Types
   * Retrieve User&#39;s Device Types
   * @param userId User ID. (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param includeShared Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. (optional)
   * @return DeviceTypesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceTypesEnvelope getUserDeviceTypes(String userId, Integer offset, Integer count, Boolean includeShared) throws ApiException {
    ApiResponse<DeviceTypesEnvelope> resp = getUserDeviceTypesWithHttpInfo(userId, offset, count, includeShared);
    return resp.getData();
  }

  /**
   * Get User Device Types
   * Retrieve User&#39;s Device Types
   * @param userId User ID. (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param includeShared Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. (optional)
   * @return ApiResponse<DeviceTypesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceTypesEnvelope> getUserDeviceTypesWithHttpInfo(String userId, Integer offset, Integer count, Boolean includeShared) throws ApiException {
    Call call = getUserDeviceTypesCall(userId, offset, count, includeShared, null, null);
    Type localVarReturnType = new TypeToken<DeviceTypesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get User Device Types (asynchronously)
   * Retrieve User&#39;s Device Types
   * @param userId User ID. (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param includeShared Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getUserDeviceTypesAsync(String userId, Integer offset, Integer count, Boolean includeShared, final ApiCallback<DeviceTypesEnvelope> callback) throws ApiException {

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

    Call call = getUserDeviceTypesCall(userId, offset, count, includeShared, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceTypesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getUserDevices */
  private Call getUserDevicesCall(String userId, Integer offset, Integer count, Boolean includeProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException("Missing the required parameter 'userId' when calling getUserDevices(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/users/{userId}/devices".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (offset != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    if (count != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    if (includeProperties != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeProperties", includeProperties));

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
   * Get User Devices
   * Retrieve User&#39;s Devices
   * @param userId User ID (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param includeProperties Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. (optional)
   * @return DevicesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DevicesEnvelope getUserDevices(String userId, Integer offset, Integer count, Boolean includeProperties) throws ApiException {
    ApiResponse<DevicesEnvelope> resp = getUserDevicesWithHttpInfo(userId, offset, count, includeProperties);
    return resp.getData();
  }

  /**
   * Get User Devices
   * Retrieve User&#39;s Devices
   * @param userId User ID (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param includeProperties Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. (optional)
   * @return ApiResponse<DevicesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DevicesEnvelope> getUserDevicesWithHttpInfo(String userId, Integer offset, Integer count, Boolean includeProperties) throws ApiException {
    Call call = getUserDevicesCall(userId, offset, count, includeProperties, null, null);
    Type localVarReturnType = new TypeToken<DevicesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get User Devices (asynchronously)
   * Retrieve User&#39;s Devices
   * @param userId User ID (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param includeProperties Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getUserDevicesAsync(String userId, Integer offset, Integer count, Boolean includeProperties, final ApiCallback<DevicesEnvelope> callback) throws ApiException {

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

    Call call = getUserDevicesCall(userId, offset, count, includeProperties, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DevicesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getUserProperties */
  private Call getUserPropertiesCall(String userId, String aid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException("Missing the required parameter 'userId' when calling getUserProperties(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/users/{userId}/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (aid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "aid", aid));

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
   * Get User application properties
   * Get application properties of a user
   * @param userId User Id (required)
   * @param aid Application ID (optional)
   * @return PropertiesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public PropertiesEnvelope getUserProperties(String userId, String aid) throws ApiException {
    ApiResponse<PropertiesEnvelope> resp = getUserPropertiesWithHttpInfo(userId, aid);
    return resp.getData();
  }

  /**
   * Get User application properties
   * Get application properties of a user
   * @param userId User Id (required)
   * @param aid Application ID (optional)
   * @return ApiResponse<PropertiesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<PropertiesEnvelope> getUserPropertiesWithHttpInfo(String userId, String aid) throws ApiException {
    Call call = getUserPropertiesCall(userId, aid, null, null);
    Type localVarReturnType = new TypeToken<PropertiesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get User application properties (asynchronously)
   * Get application properties of a user
   * @param userId User Id (required)
   * @param aid Application ID (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getUserPropertiesAsync(String userId, String aid, final ApiCallback<PropertiesEnvelope> callback) throws ApiException {

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

    Call call = getUserPropertiesCall(userId, aid, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<PropertiesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getUserRules */
  private Call getUserRulesCall(String userId, Boolean excludeDisabled, Integer count, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException("Missing the required parameter 'userId' when calling getUserRules(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/users/{userId}/rules".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (excludeDisabled != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludeDisabled", excludeDisabled));
    if (count != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    if (offset != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

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
   * Get User Rules
   * Retrieve User&#39;s Rules
   * @param userId User ID. (required)
   * @param excludeDisabled Exclude disabled rules in the result. (optional)
   * @param count Desired count of items in the result set. (optional)
   * @param offset Offset for pagination. (optional)
   * @return RulesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public RulesEnvelope getUserRules(String userId, Boolean excludeDisabled, Integer count, Integer offset) throws ApiException {
    ApiResponse<RulesEnvelope> resp = getUserRulesWithHttpInfo(userId, excludeDisabled, count, offset);
    return resp.getData();
  }

  /**
   * Get User Rules
   * Retrieve User&#39;s Rules
   * @param userId User ID. (required)
   * @param excludeDisabled Exclude disabled rules in the result. (optional)
   * @param count Desired count of items in the result set. (optional)
   * @param offset Offset for pagination. (optional)
   * @return ApiResponse<RulesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<RulesEnvelope> getUserRulesWithHttpInfo(String userId, Boolean excludeDisabled, Integer count, Integer offset) throws ApiException {
    Call call = getUserRulesCall(userId, excludeDisabled, count, offset, null, null);
    Type localVarReturnType = new TypeToken<RulesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get User Rules (asynchronously)
   * Retrieve User&#39;s Rules
   * @param userId User ID. (required)
   * @param excludeDisabled Exclude disabled rules in the result. (optional)
   * @param count Desired count of items in the result set. (optional)
   * @param offset Offset for pagination. (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getUserRulesAsync(String userId, Boolean excludeDisabled, Integer count, Integer offset, final ApiCallback<RulesEnvelope> callback) throws ApiException {

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

    Call call = getUserRulesCall(userId, excludeDisabled, count, offset, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<RulesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for updateUserProperties */
  private Call updateUserPropertiesCall(String userId, AppProperties properties, String aid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = properties;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException("Missing the required parameter 'userId' when calling updateUserProperties(Async)");
    }
    
    // verify the required parameter 'properties' is set
    if (properties == null) {
       throw new ApiException("Missing the required parameter 'properties' when calling updateUserProperties(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/users/{userId}/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (aid != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "aid", aid));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      "application/json"
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
    return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Update User Application Properties
   * Updates application properties of a user
   * @param userId User Id (required)
   * @param properties Properties to be updated (required)
   * @param aid Application ID (optional)
   * @return PropertiesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public PropertiesEnvelope updateUserProperties(String userId, AppProperties properties, String aid) throws ApiException {
    ApiResponse<PropertiesEnvelope> resp = updateUserPropertiesWithHttpInfo(userId, properties, aid);
    return resp.getData();
  }

  /**
   * Update User Application Properties
   * Updates application properties of a user
   * @param userId User Id (required)
   * @param properties Properties to be updated (required)
   * @param aid Application ID (optional)
   * @return ApiResponse<PropertiesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<PropertiesEnvelope> updateUserPropertiesWithHttpInfo(String userId, AppProperties properties, String aid) throws ApiException {
    Call call = updateUserPropertiesCall(userId, properties, aid, null, null);
    Type localVarReturnType = new TypeToken<PropertiesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Update User Application Properties (asynchronously)
   * Updates application properties of a user
   * @param userId User Id (required)
   * @param properties Properties to be updated (required)
   * @param aid Application ID (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call updateUserPropertiesAsync(String userId, AppProperties properties, String aid, final ApiCallback<PropertiesEnvelope> callback) throws ApiException {

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

    Call call = updateUserPropertiesCall(userId, properties, aid, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<PropertiesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
