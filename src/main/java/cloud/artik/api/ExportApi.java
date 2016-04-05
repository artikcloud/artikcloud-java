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

import cloud.artik.model.ExportRequestInfo;
import cloud.artik.model.ExportRequestResponse;
import cloud.artik.model.ExportHistoryResponse;
import cloud.artik.model.ExportStatusResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportApi {
  private ApiClient apiClient;

  public ExportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExportApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for exportRequest */
  private Call exportRequestCall(ExportRequestInfo exportRequestInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = exportRequestInfo;
    
    // verify the required parameter 'exportRequestInfo' is set
    if (exportRequestInfo == null) {
       throw new ApiException("Missing the required parameter 'exportRequestInfo' when calling exportRequest(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/messages/export".replaceAll("\\{format\\}","json");

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
   * Create Export Request
   * Export normalized messages. The following input combinations are supported:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by users&lt;/td&gt;&lt;td&gt;uids&lt;/td&gt;&lt;td&gt;Search by a list of User IDs. For each user in the list, the current authenticated user must have read access over the specified user.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by devices&lt;/td&gt;&lt;td&gt;sdids&lt;/td&gt;&lt;td&gt;Search by Source Device IDs.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by device types&lt;/td&gt;&lt;td&gt;uids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device Type IDs for the given list of users.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by trial&lt;/td&gt;&lt;td&gt;trialId&lt;/td&gt;&lt;td&gt;Search by Trial ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by combination of parameters&lt;/td&gt;&lt;td&gt;uids,sdids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device IDs. Each Device ID must belong to a Source Device Type ID and a User ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;startDate,endDate,order,format,url,csvHeaders&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   * @param exportRequestInfo ExportRequest object that is passed in the body
   * @return ExportRequestResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ExportRequestResponse exportRequest(ExportRequestInfo exportRequestInfo) throws ApiException {
    ApiResponse<ExportRequestResponse> resp = exportRequestWithHttpInfo(exportRequestInfo);
    return resp.getData();
  }

  /**
   * Create Export Request
   * Export normalized messages. The following input combinations are supported:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by users&lt;/td&gt;&lt;td&gt;uids&lt;/td&gt;&lt;td&gt;Search by a list of User IDs. For each user in the list, the current authenticated user must have read access over the specified user.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by devices&lt;/td&gt;&lt;td&gt;sdids&lt;/td&gt;&lt;td&gt;Search by Source Device IDs.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by device types&lt;/td&gt;&lt;td&gt;uids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device Type IDs for the given list of users.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by trial&lt;/td&gt;&lt;td&gt;trialId&lt;/td&gt;&lt;td&gt;Search by Trial ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by combination of parameters&lt;/td&gt;&lt;td&gt;uids,sdids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device IDs. Each Device ID must belong to a Source Device Type ID and a User ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;startDate,endDate,order,format,url,csvHeaders&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   * @param exportRequestInfo ExportRequest object that is passed in the body
   * @return ApiResponse<ExportRequestResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ExportRequestResponse> exportRequestWithHttpInfo(ExportRequestInfo exportRequestInfo) throws ApiException {
    Call call = exportRequestCall(exportRequestInfo, null, null);
    Type localVarReturnType = new TypeToken<ExportRequestResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Create Export Request (asynchronously)
   * Export normalized messages. The following input combinations are supported:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by users&lt;/td&gt;&lt;td&gt;uids&lt;/td&gt;&lt;td&gt;Search by a list of User IDs. For each user in the list, the current authenticated user must have read access over the specified user.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by devices&lt;/td&gt;&lt;td&gt;sdids&lt;/td&gt;&lt;td&gt;Search by Source Device IDs.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by device types&lt;/td&gt;&lt;td&gt;uids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device Type IDs for the given list of users.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by trial&lt;/td&gt;&lt;td&gt;trialId&lt;/td&gt;&lt;td&gt;Search by Trial ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by combination of parameters&lt;/td&gt;&lt;td&gt;uids,sdids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device IDs. Each Device ID must belong to a Source Device Type ID and a User ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;startDate,endDate,order,format,url,csvHeaders&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   * @param exportRequestInfo ExportRequest object that is passed in the body
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call exportRequestAsync(ExportRequestInfo exportRequestInfo, final ApiCallback<ExportRequestResponse> callback) throws ApiException {

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

    Call call = exportRequestCall(exportRequestInfo, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ExportRequestResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getExportHistory */
  private Call getExportHistoryCall(String trialId, Integer count, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/messages/export/history".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (trialId != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "trialId", trialId));
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
   * Get Export History
   * Get the history of export requests.
   * @param trialId Filter by trialId.
   * @param count Pagination count.
   * @param offset Pagination offset.
   * @return ExportHistoryResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ExportHistoryResponse getExportHistory(String trialId, Integer count, Integer offset) throws ApiException {
    ApiResponse<ExportHistoryResponse> resp = getExportHistoryWithHttpInfo(trialId, count, offset);
    return resp.getData();
  }

  /**
   * Get Export History
   * Get the history of export requests.
   * @param trialId Filter by trialId.
   * @param count Pagination count.
   * @param offset Pagination offset.
   * @return ApiResponse<ExportHistoryResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ExportHistoryResponse> getExportHistoryWithHttpInfo(String trialId, Integer count, Integer offset) throws ApiException {
    Call call = getExportHistoryCall(trialId, count, offset, null, null);
    Type localVarReturnType = new TypeToken<ExportHistoryResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Export History (asynchronously)
   * Get the history of export requests.
   * @param trialId Filter by trialId.
   * @param count Pagination count.
   * @param offset Pagination offset.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getExportHistoryAsync(String trialId, Integer count, Integer offset, final ApiCallback<ExportHistoryResponse> callback) throws ApiException {

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

    Call call = getExportHistoryCall(trialId, count, offset, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ExportHistoryResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getExportResult */
  private Call getExportResultCall(String exportId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exportId' is set
    if (exportId == null) {
       throw new ApiException("Missing the required parameter 'exportId' when calling getExportResult(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/messages/export/{exportId}/result".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "exportId" + "\\}", apiClient.escapeString(exportId.toString()));

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
   * Get Export Result
   * Retrieve result of the export query in tgz format. The tar file may contain one or more files with the results.
   * @param exportId Export ID of the export query.
   * @return String
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public String getExportResult(String exportId) throws ApiException {
    ApiResponse<String> resp = getExportResultWithHttpInfo(exportId);
    return resp.getData();
  }

  /**
   * Get Export Result
   * Retrieve result of the export query in tgz format. The tar file may contain one or more files with the results.
   * @param exportId Export ID of the export query.
   * @return ApiResponse<String>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<String> getExportResultWithHttpInfo(String exportId) throws ApiException {
    Call call = getExportResultCall(exportId, null, null);
    Type localVarReturnType = new TypeToken<String>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Export Result (asynchronously)
   * Retrieve result of the export query in tgz format. The tar file may contain one or more files with the results.
   * @param exportId Export ID of the export query.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getExportResultAsync(String exportId, final ApiCallback<String> callback) throws ApiException {

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

    Call call = getExportResultCall(exportId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<String>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getExportStatus */
  private Call getExportStatusCall(String exportId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'exportId' is set
    if (exportId == null) {
       throw new ApiException("Missing the required parameter 'exportId' when calling getExportStatus(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/messages/export/{exportId}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "exportId" + "\\}", apiClient.escapeString(exportId.toString()));

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
   * Check Export Status
   * Check status of the export query.
   * @param exportId Export ID of the export query.
   * @return ExportStatusResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ExportStatusResponse getExportStatus(String exportId) throws ApiException {
    ApiResponse<ExportStatusResponse> resp = getExportStatusWithHttpInfo(exportId);
    return resp.getData();
  }

  /**
   * Check Export Status
   * Check status of the export query.
   * @param exportId Export ID of the export query.
   * @return ApiResponse<ExportStatusResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<ExportStatusResponse> getExportStatusWithHttpInfo(String exportId) throws ApiException {
    Call call = getExportStatusCall(exportId, null, null);
    Type localVarReturnType = new TypeToken<ExportStatusResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Check Export Status (asynchronously)
   * Check status of the export query.
   * @param exportId Export ID of the export query.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getExportStatusAsync(String exportId, final ApiCallback<ExportStatusResponse> callback) throws ApiException {

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

    Call call = getExportStatusCall(exportId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<ExportStatusResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
