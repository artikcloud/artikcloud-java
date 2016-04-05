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

import cloud.artik.model.DeviceTypesEnvelope;
import cloud.artik.model.DeviceTypeEnvelope;
import cloud.artik.model.ManifestVersionsEnvelope;
import cloud.artik.model.ManifestPropertiesEnvelope;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceTypesApi {
  private ApiClient apiClient;

  public DeviceTypesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DeviceTypesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for getDeviceTypes */
  private Call getDeviceTypesCall(String name, Integer offset, Integer count, String tags, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
       throw new ApiException("Missing the required parameter 'name' when calling getDeviceTypes(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devicetypes".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (name != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    if (offset != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    if (count != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    if (tags != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));

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
   * Get Device Types
   * Retrieves Device Types
   * @param name Device Type name
   * @param offset Offset for pagination.
   * @param count Desired count of items in the result set
   * @param tags Elements tagged with the list of tags. (comma separated)
   * @return DeviceTypesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceTypesEnvelope getDeviceTypes(String name, Integer offset, Integer count, String tags) throws ApiException {
    ApiResponse<DeviceTypesEnvelope> resp = getDeviceTypesWithHttpInfo(name, offset, count, tags);
    return resp.getData();
  }

  /**
   * Get Device Types
   * Retrieves Device Types
   * @param name Device Type name
   * @param offset Offset for pagination.
   * @param count Desired count of items in the result set
   * @param tags Elements tagged with the list of tags. (comma separated)
   * @return ApiResponse<DeviceTypesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceTypesEnvelope> getDeviceTypesWithHttpInfo(String name, Integer offset, Integer count, String tags) throws ApiException {
    Call call = getDeviceTypesCall(name, offset, count, tags, null, null);
    Type localVarReturnType = new TypeToken<DeviceTypesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Device Types (asynchronously)
   * Retrieves Device Types
   * @param name Device Type name
   * @param offset Offset for pagination.
   * @param count Desired count of items in the result set
   * @param tags Elements tagged with the list of tags. (comma separated)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getDeviceTypesAsync(String name, Integer offset, Integer count, String tags, final ApiCallback<DeviceTypesEnvelope> callback) throws ApiException {

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

    Call call = getDeviceTypesCall(name, offset, count, tags, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceTypesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getDeviceType */
  private Call getDeviceTypeCall(String deviceTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceTypeId' is set
    if (deviceTypeId == null) {
       throw new ApiException("Missing the required parameter 'deviceTypeId' when calling getDeviceType(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devicetypes/{deviceTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceTypeId" + "\\}", apiClient.escapeString(deviceTypeId.toString()));

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
   * Get Device Type
   * Retrieves a Device Type
   * @param deviceTypeId deviceTypeId
   * @return DeviceTypeEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public DeviceTypeEnvelope getDeviceType(String deviceTypeId) throws ApiException {
    ApiResponse<DeviceTypeEnvelope> resp = getDeviceTypeWithHttpInfo(deviceTypeId);
    return resp.getData();
  }

  /**
   * Get Device Type
   * Retrieves a Device Type
   * @param deviceTypeId deviceTypeId
   * @return ApiResponse<DeviceTypeEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<DeviceTypeEnvelope> getDeviceTypeWithHttpInfo(String deviceTypeId) throws ApiException {
    Call call = getDeviceTypeCall(deviceTypeId, null, null);
    Type localVarReturnType = new TypeToken<DeviceTypeEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Device Type (asynchronously)
   * Retrieves a Device Type
   * @param deviceTypeId deviceTypeId
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getDeviceTypeAsync(String deviceTypeId, final ApiCallback<DeviceTypeEnvelope> callback) throws ApiException {

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

    Call call = getDeviceTypeCall(deviceTypeId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<DeviceTypeEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getAvailableManifestVersions */
  private Call getAvailableManifestVersionsCall(String deviceTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceTypeId' is set
    if (deviceTypeId == null) {
       throw new ApiException("Missing the required parameter 'deviceTypeId' when calling getAvailableManifestVersions(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devicetypes/{deviceTypeId}/availablemanifestversions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceTypeId" + "\\}", apiClient.escapeString(deviceTypeId.toString()));

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
   * Get Available Manifest Versions
   * Get a Device Type&#39;s available manifest versions
   * @param deviceTypeId deviceTypeId
   * @return ManifestVersionsEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ManifestVersionsEnvelope getAvailableManifestVersions(String deviceTypeId) throws ApiException {
    ApiResponse<ManifestVersionsEnvelope> resp = getAvailableManifestVersionsWithHttpInfo(deviceTypeId);
    return resp.getData();
  }

  /**
   * Get Available Manifest Versions
   * Get a Device Type&#39;s available manifest versions
   * @param deviceTypeId deviceTypeId
   * @return ApiResponse<ManifestVersionsEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ManifestVersionsEnvelope> getAvailableManifestVersionsWithHttpInfo(String deviceTypeId) throws ApiException {
    Call call = getAvailableManifestVersionsCall(deviceTypeId, null, null);
    Type localVarReturnType = new TypeToken<ManifestVersionsEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Available Manifest Versions (asynchronously)
   * Get a Device Type&#39;s available manifest versions
   * @param deviceTypeId deviceTypeId
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getAvailableManifestVersionsAsync(String deviceTypeId, final ApiCallback<ManifestVersionsEnvelope> callback) throws ApiException {

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

    Call call = getAvailableManifestVersionsCall(deviceTypeId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ManifestVersionsEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getLatestManifestProperties */
  private Call getLatestManifestPropertiesCall(String deviceTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceTypeId' is set
    if (deviceTypeId == null) {
       throw new ApiException("Missing the required parameter 'deviceTypeId' when calling getLatestManifestProperties(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devicetypes/{deviceTypeId}/manifests/latest/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceTypeId" + "\\}", apiClient.escapeString(deviceTypeId.toString()));

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
   * Get Latest Manifest Properties
   * Get a Device Type&#39;s manifest properties for the latest version.
   * @param deviceTypeId Device Type ID.
   * @return ManifestPropertiesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ManifestPropertiesEnvelope getLatestManifestProperties(String deviceTypeId) throws ApiException {
    ApiResponse<ManifestPropertiesEnvelope> resp = getLatestManifestPropertiesWithHttpInfo(deviceTypeId);
    return resp.getData();
  }

  /**
   * Get Latest Manifest Properties
   * Get a Device Type&#39;s manifest properties for the latest version.
   * @param deviceTypeId Device Type ID.
   * @return ApiResponse<ManifestPropertiesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ManifestPropertiesEnvelope> getLatestManifestPropertiesWithHttpInfo(String deviceTypeId) throws ApiException {
    Call call = getLatestManifestPropertiesCall(deviceTypeId, null, null);
    Type localVarReturnType = new TypeToken<ManifestPropertiesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Latest Manifest Properties (asynchronously)
   * Get a Device Type&#39;s manifest properties for the latest version.
   * @param deviceTypeId Device Type ID.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getLatestManifestPropertiesAsync(String deviceTypeId, final ApiCallback<ManifestPropertiesEnvelope> callback) throws ApiException {

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

    Call call = getLatestManifestPropertiesCall(deviceTypeId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ManifestPropertiesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getManifestProperties */
  private Call getManifestPropertiesCall(String deviceTypeId, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'deviceTypeId' is set
    if (deviceTypeId == null) {
       throw new ApiException("Missing the required parameter 'deviceTypeId' when calling getManifestProperties(Async)");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
       throw new ApiException("Missing the required parameter 'version' when calling getManifestProperties(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/devicetypes/{deviceTypeId}/manifests/{version}/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceTypeId" + "\\}", apiClient.escapeString(deviceTypeId.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

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
   * Get manifest properties
   * Get a Device Type&#39;s manifest properties for a specific version.
   * @param deviceTypeId Device Type ID.
   * @param version Manifest Version.
   * @return ManifestPropertiesEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ManifestPropertiesEnvelope getManifestProperties(String deviceTypeId, String version) throws ApiException {
    ApiResponse<ManifestPropertiesEnvelope> resp = getManifestPropertiesWithHttpInfo(deviceTypeId, version);
    return resp.getData();
  }

  /**
   * Get manifest properties
   * Get a Device Type&#39;s manifest properties for a specific version.
   * @param deviceTypeId Device Type ID.
   * @param version Manifest Version.
   * @return ApiResponse<ManifestPropertiesEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ManifestPropertiesEnvelope> getManifestPropertiesWithHttpInfo(String deviceTypeId, String version) throws ApiException {
    Call call = getManifestPropertiesCall(deviceTypeId, version, null, null);
    Type localVarReturnType = new TypeToken<ManifestPropertiesEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get manifest properties (asynchronously)
   * Get a Device Type&#39;s manifest properties for a specific version.
   * @param deviceTypeId Device Type ID.
   * @param version Manifest Version.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getManifestPropertiesAsync(String deviceTypeId, String version, final ApiCallback<ManifestPropertiesEnvelope> callback) throws ApiException {

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

    Call call = getManifestPropertiesCall(deviceTypeId, version, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ManifestPropertiesEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
