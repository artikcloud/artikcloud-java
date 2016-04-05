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

import cloud.artik.model.Device;
import cloud.artik.model.DeviceEnvelope;
import cloud.artik.model.DeviceTokenEnvelope;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevicesApi {
  private ApiClient apiClient;

  public DevicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevicesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for addDevice */
  private Call addDeviceCall(Device device, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = device;
    
    // verify the required parameter 'device' is set
    if (device == null) {
       throw new ApiException("Missing the required parameter 'device' when calling addDevice(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devices".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
   * Add Device
   * Create a device
   * @param device Device to be added to the user
   * @return DeviceEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceEnvelope addDevice(Device device) throws ApiException {
    ApiResponse<DeviceEnvelope> resp = addDeviceWithHttpInfo(device);
    return resp.getData();
  }

  /**
   * Add Device
   * Create a device
   * @param device Device to be added to the user
   * @return ApiResponse<DeviceEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceEnvelope> addDeviceWithHttpInfo(Device device) throws ApiException {
    Call call = addDeviceCall(device, null, null);
    Type localVarReturnType = new TypeToken<DeviceEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Add Device (asynchronously)
   * Create a device
   * @param device Device to be added to the user
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call addDeviceAsync(Device device, final ApiCallback<DeviceEnvelope> callback) throws ApiException {

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

    Call call = addDeviceCall(device, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getDevice */
  private Call getDeviceCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException("Missing the required parameter 'deviceId' when calling getDevice(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devices/{deviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

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
   * Get Device
   * Retrieves a device
   * @param deviceId deviceId
   * @return DeviceEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceEnvelope getDevice(String deviceId) throws ApiException {
    ApiResponse<DeviceEnvelope> resp = getDeviceWithHttpInfo(deviceId);
    return resp.getData();
  }

  /**
   * Get Device
   * Retrieves a device
   * @param deviceId deviceId
   * @return ApiResponse<DeviceEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceEnvelope> getDeviceWithHttpInfo(String deviceId) throws ApiException {
    Call call = getDeviceCall(deviceId, null, null);
    Type localVarReturnType = new TypeToken<DeviceEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Device (asynchronously)
   * Retrieves a device
   * @param deviceId deviceId
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getDeviceAsync(String deviceId, final ApiCallback<DeviceEnvelope> callback) throws ApiException {

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

    Call call = getDeviceCall(deviceId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for updateDevice */
  private Call updateDeviceCall(String deviceId, Device device, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = device;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException("Missing the required parameter 'deviceId' when calling updateDevice(Async)");
    }
    
    // verify the required parameter 'device' is set
    if (device == null) {
       throw new ApiException("Missing the required parameter 'device' when calling updateDevice(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devices/{deviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
   * Update Device
   * Updates a device
   * @param deviceId deviceId
   * @param device Device to be updated
   * @return DeviceEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceEnvelope updateDevice(String deviceId, Device device) throws ApiException {
    ApiResponse<DeviceEnvelope> resp = updateDeviceWithHttpInfo(deviceId, device);
    return resp.getData();
  }

  /**
   * Update Device
   * Updates a device
   * @param deviceId deviceId
   * @param device Device to be updated
   * @return ApiResponse<DeviceEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceEnvelope> updateDeviceWithHttpInfo(String deviceId, Device device) throws ApiException {
    Call call = updateDeviceCall(deviceId, device, null, null);
    Type localVarReturnType = new TypeToken<DeviceEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Update Device (asynchronously)
   * Updates a device
   * @param deviceId deviceId
   * @param device Device to be updated
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call updateDeviceAsync(String deviceId, Device device, final ApiCallback<DeviceEnvelope> callback) throws ApiException {

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

    Call call = updateDeviceCall(deviceId, device, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for deleteDevice */
  private Call deleteDeviceCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException("Missing the required parameter 'deviceId' when calling deleteDevice(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devices/{deviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

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
    return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Delete Device
   * Deletes a device
   * @param deviceId deviceId
   * @return DeviceEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceEnvelope deleteDevice(String deviceId) throws ApiException {
    ApiResponse<DeviceEnvelope> resp = deleteDeviceWithHttpInfo(deviceId);
    return resp.getData();
  }

  /**
   * Delete Device
   * Deletes a device
   * @param deviceId deviceId
   * @return ApiResponse<DeviceEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceEnvelope> deleteDeviceWithHttpInfo(String deviceId) throws ApiException {
    Call call = deleteDeviceCall(deviceId, null, null);
    Type localVarReturnType = new TypeToken<DeviceEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Delete Device (asynchronously)
   * Deletes a device
   * @param deviceId deviceId
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call deleteDeviceAsync(String deviceId, final ApiCallback<DeviceEnvelope> callback) throws ApiException {

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

    Call call = deleteDeviceCall(deviceId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getDeviceToken */
  private Call getDeviceTokenCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException("Missing the required parameter 'deviceId' when calling getDeviceToken(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devices/{deviceId}/tokens".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

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
   * Get Device Token
   * Retrieves a device&#39;s token
   * @param deviceId deviceId
   * @return DeviceTokenEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceTokenEnvelope getDeviceToken(String deviceId) throws ApiException {
    ApiResponse<DeviceTokenEnvelope> resp = getDeviceTokenWithHttpInfo(deviceId);
    return resp.getData();
  }

  /**
   * Get Device Token
   * Retrieves a device&#39;s token
   * @param deviceId deviceId
   * @return ApiResponse<DeviceTokenEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceTokenEnvelope> getDeviceTokenWithHttpInfo(String deviceId) throws ApiException {
    Call call = getDeviceTokenCall(deviceId, null, null);
    Type localVarReturnType = new TypeToken<DeviceTokenEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Device Token (asynchronously)
   * Retrieves a device&#39;s token
   * @param deviceId deviceId
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getDeviceTokenAsync(String deviceId, final ApiCallback<DeviceTokenEnvelope> callback) throws ApiException {

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

    Call call = getDeviceTokenCall(deviceId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceTokenEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for updateDeviceToken */
  private Call updateDeviceTokenCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException("Missing the required parameter 'deviceId' when calling updateDeviceToken(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devices/{deviceId}/tokens".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
   * Update Device Token
   * Updates a device&#39;s token
   * @param deviceId deviceId
   * @return DeviceTokenEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceTokenEnvelope updateDeviceToken(String deviceId) throws ApiException {
    ApiResponse<DeviceTokenEnvelope> resp = updateDeviceTokenWithHttpInfo(deviceId);
    return resp.getData();
  }

  /**
   * Update Device Token
   * Updates a device&#39;s token
   * @param deviceId deviceId
   * @return ApiResponse<DeviceTokenEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceTokenEnvelope> updateDeviceTokenWithHttpInfo(String deviceId) throws ApiException {
    Call call = updateDeviceTokenCall(deviceId, null, null);
    Type localVarReturnType = new TypeToken<DeviceTokenEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Update Device Token (asynchronously)
   * Updates a device&#39;s token
   * @param deviceId deviceId
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call updateDeviceTokenAsync(String deviceId, final ApiCallback<DeviceTokenEnvelope> callback) throws ApiException {

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

    Call call = updateDeviceTokenCall(deviceId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceTokenEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for deleteDeviceToken */
  private Call deleteDeviceTokenCall(String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException("Missing the required parameter 'deviceId' when calling deleteDeviceToken(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devices/{deviceId}/tokens".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

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
    return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Delete Device Token
   * Deletes a device&#39;s token
   * @param deviceId deviceId
   * @return DeviceTokenEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceTokenEnvelope deleteDeviceToken(String deviceId) throws ApiException {
    ApiResponse<DeviceTokenEnvelope> resp = deleteDeviceTokenWithHttpInfo(deviceId);
    return resp.getData();
  }

  /**
   * Delete Device Token
   * Deletes a device&#39;s token
   * @param deviceId deviceId
   * @return ApiResponse<DeviceTokenEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceTokenEnvelope> deleteDeviceTokenWithHttpInfo(String deviceId) throws ApiException {
    Call call = deleteDeviceTokenCall(deviceId, null, null);
    Type localVarReturnType = new TypeToken<DeviceTokenEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Delete Device Token (asynchronously)
   * Deletes a device&#39;s token
   * @param deviceId deviceId
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call deleteDeviceTokenAsync(String deviceId, final ApiCallback<DeviceTokenEnvelope> callback) throws ApiException {

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

    Call call = deleteDeviceTokenCall(deviceId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceTokenEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
