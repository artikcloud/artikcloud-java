/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


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

import java.io.IOException;


import cloud.artik.model.DeviceStatus;
import cloud.artik.model.DeviceStatusBatch;
import cloud.artik.model.DeviceStatusPut;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevicestatusApi {
    private ApiClient apiClient;

    public DevicestatusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DevicestatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getDeviceStatus */
    private com.squareup.okhttp.Call getDeviceStatusCall(String deviceId, Boolean includeSnapshot, Boolean includeSnapshotTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/devices/{deviceId}/status".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (includeSnapshot != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSnapshot", includeSnapshot));
        if (includeSnapshotTimestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSnapshotTimestamp", includeSnapshotTimestamp));

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
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDeviceStatusValidateBeforeCall(String deviceId, Boolean includeSnapshot, Boolean includeSnapshotTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling getDeviceStatus(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getDeviceStatusCall(deviceId, includeSnapshot, includeSnapshotTimestamp, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Device Status
     * Get Device Status
     * @param deviceId Device ID. (required)
     * @param includeSnapshot Include device snapshot into the response (optional)
     * @param includeSnapshotTimestamp Include device snapshot timestamp into the response (optional)
     * @return DeviceStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceStatus getDeviceStatus(String deviceId, Boolean includeSnapshot, Boolean includeSnapshotTimestamp) throws ApiException {
        ApiResponse<DeviceStatus> resp = getDeviceStatusWithHttpInfo(deviceId, includeSnapshot, includeSnapshotTimestamp);
        return resp.getData();
    }

    /**
     * Get Device Status
     * Get Device Status
     * @param deviceId Device ID. (required)
     * @param includeSnapshot Include device snapshot into the response (optional)
     * @param includeSnapshotTimestamp Include device snapshot timestamp into the response (optional)
     * @return ApiResponse&lt;DeviceStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceStatus> getDeviceStatusWithHttpInfo(String deviceId, Boolean includeSnapshot, Boolean includeSnapshotTimestamp) throws ApiException {
        com.squareup.okhttp.Call call = getDeviceStatusValidateBeforeCall(deviceId, includeSnapshot, includeSnapshotTimestamp, null, null);
        Type localVarReturnType = new TypeToken<DeviceStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Device Status (asynchronously)
     * Get Device Status
     * @param deviceId Device ID. (required)
     * @param includeSnapshot Include device snapshot into the response (optional)
     * @param includeSnapshotTimestamp Include device snapshot timestamp into the response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDeviceStatusAsync(String deviceId, Boolean includeSnapshot, Boolean includeSnapshotTimestamp, final ApiCallback<DeviceStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDeviceStatusValidateBeforeCall(deviceId, includeSnapshot, includeSnapshotTimestamp, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDevicesStatus */
    private com.squareup.okhttp.Call getDevicesStatusCall(String dids, Boolean includeSnapshot, Boolean includeSnapshotTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/devices/status".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (dids != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "dids", dids));
        if (includeSnapshot != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSnapshot", includeSnapshot));
        if (includeSnapshotTimestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSnapshotTimestamp", includeSnapshotTimestamp));

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
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDevicesStatusValidateBeforeCall(String dids, Boolean includeSnapshot, Boolean includeSnapshotTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dids' is set
        if (dids == null) {
            throw new ApiException("Missing the required parameter 'dids' when calling getDevicesStatus(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getDevicesStatusCall(dids, includeSnapshot, includeSnapshotTimestamp, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Devices Status
     * Get Devices Status
     * @param dids List of device ids (comma-separated) for which the statuses are requested. (required)
     * @param includeSnapshot Include device snapshot into the response (optional)
     * @param includeSnapshotTimestamp Include device snapshot timestamp into the response (optional)
     * @return DeviceStatusBatch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceStatusBatch getDevicesStatus(String dids, Boolean includeSnapshot, Boolean includeSnapshotTimestamp) throws ApiException {
        ApiResponse<DeviceStatusBatch> resp = getDevicesStatusWithHttpInfo(dids, includeSnapshot, includeSnapshotTimestamp);
        return resp.getData();
    }

    /**
     * Get Devices Status
     * Get Devices Status
     * @param dids List of device ids (comma-separated) for which the statuses are requested. (required)
     * @param includeSnapshot Include device snapshot into the response (optional)
     * @param includeSnapshotTimestamp Include device snapshot timestamp into the response (optional)
     * @return ApiResponse&lt;DeviceStatusBatch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceStatusBatch> getDevicesStatusWithHttpInfo(String dids, Boolean includeSnapshot, Boolean includeSnapshotTimestamp) throws ApiException {
        com.squareup.okhttp.Call call = getDevicesStatusValidateBeforeCall(dids, includeSnapshot, includeSnapshotTimestamp, null, null);
        Type localVarReturnType = new TypeToken<DeviceStatusBatch>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Devices Status (asynchronously)
     * Get Devices Status
     * @param dids List of device ids (comma-separated) for which the statuses are requested. (required)
     * @param includeSnapshot Include device snapshot into the response (optional)
     * @param includeSnapshotTimestamp Include device snapshot timestamp into the response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDevicesStatusAsync(String dids, Boolean includeSnapshot, Boolean includeSnapshotTimestamp, final ApiCallback<DeviceStatusBatch> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDevicesStatusValidateBeforeCall(dids, includeSnapshot, includeSnapshotTimestamp, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceStatusBatch>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for putDeviceStatus */
    private com.squareup.okhttp.Call putDeviceStatusCall(String deviceId, DeviceStatusPut body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/devices/{deviceId}/status".replaceAll("\\{format\\}","json")
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
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "artikcloud_oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putDeviceStatusValidateBeforeCall(String deviceId, DeviceStatusPut body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling putDeviceStatus(Async)");
        }
        
        
        com.squareup.okhttp.Call call = putDeviceStatusCall(deviceId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Device Status
     * Update Device Status
     * @param deviceId Device ID. (required)
     * @param body Body (optional)
     * @return DeviceStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceStatus putDeviceStatus(String deviceId, DeviceStatusPut body) throws ApiException {
        ApiResponse<DeviceStatus> resp = putDeviceStatusWithHttpInfo(deviceId, body);
        return resp.getData();
    }

    /**
     * Update Device Status
     * Update Device Status
     * @param deviceId Device ID. (required)
     * @param body Body (optional)
     * @return ApiResponse&lt;DeviceStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceStatus> putDeviceStatusWithHttpInfo(String deviceId, DeviceStatusPut body) throws ApiException {
        com.squareup.okhttp.Call call = putDeviceStatusValidateBeforeCall(deviceId, body, null, null);
        Type localVarReturnType = new TypeToken<DeviceStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Device Status (asynchronously)
     * Update Device Status
     * @param deviceId Device ID. (required)
     * @param body Body (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putDeviceStatusAsync(String deviceId, DeviceStatusPut body, final ApiCallback<DeviceStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putDeviceStatusValidateBeforeCall(deviceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
