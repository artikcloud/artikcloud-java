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

import cloud.artik.model.RuleEnvelope;
import cloud.artik.model.RuleCreationInfo;
import cloud.artik.model.RuleUpdateInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RulesApi {
  private ApiClient apiClient;

  public RulesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RulesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for createRule */
  private Call createRuleCall(RuleCreationInfo ruleInfo, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = ruleInfo;
    
    // verify the required parameter 'ruleInfo' is set
    if (ruleInfo == null) {
       throw new ApiException("Missing the required parameter 'ruleInfo' when calling createRule(Async)");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException("Missing the required parameter 'userId' when calling createRule(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/rules".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (userId != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

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
   * Create Rule
   * Create a new Rule
   * @param ruleInfo Rule object that needs to be added
   * @param userId User ID
   * @return RuleEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public RuleEnvelope createRule(RuleCreationInfo ruleInfo, String userId) throws ApiException {
    ApiResponse<RuleEnvelope> resp = createRuleWithHttpInfo(ruleInfo, userId);
    return resp.getData();
  }

  /**
   * Create Rule
   * Create a new Rule
   * @param ruleInfo Rule object that needs to be added
   * @param userId User ID
   * @return ApiResponse<RuleEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<RuleEnvelope> createRuleWithHttpInfo(RuleCreationInfo ruleInfo, String userId) throws ApiException {
    Call call = createRuleCall(ruleInfo, userId, null, null);
    Type localVarReturnType = new TypeToken<RuleEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Create Rule (asynchronously)
   * Create a new Rule
   * @param ruleInfo Rule object that needs to be added
   * @param userId User ID
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call createRuleAsync(RuleCreationInfo ruleInfo, String userId, final ApiCallback<RuleEnvelope> callback) throws ApiException {

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

    Call call = createRuleCall(ruleInfo, userId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<RuleEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getRule */
  private Call getRuleCall(String ruleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
       throw new ApiException("Missing the required parameter 'ruleId' when calling getRule(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", apiClient.escapeString(ruleId.toString()));

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
   * Get Rule
   * Get a rule using the Rule ID
   * @param ruleId Rule ID.
   * @return RuleEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public RuleEnvelope getRule(String ruleId) throws ApiException {
    ApiResponse<RuleEnvelope> resp = getRuleWithHttpInfo(ruleId);
    return resp.getData();
  }

  /**
   * Get Rule
   * Get a rule using the Rule ID
   * @param ruleId Rule ID.
   * @return ApiResponse<RuleEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<RuleEnvelope> getRuleWithHttpInfo(String ruleId) throws ApiException {
    Call call = getRuleCall(ruleId, null, null);
    Type localVarReturnType = new TypeToken<RuleEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get Rule (asynchronously)
   * Get a rule using the Rule ID
   * @param ruleId Rule ID.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getRuleAsync(String ruleId, final ApiCallback<RuleEnvelope> callback) throws ApiException {

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

    Call call = getRuleCall(ruleId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<RuleEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for updateRule */
  private Call updateRuleCall(String ruleId, RuleUpdateInfo ruleInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = ruleInfo;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
       throw new ApiException("Missing the required parameter 'ruleId' when calling updateRule(Async)");
    }
    
    // verify the required parameter 'ruleInfo' is set
    if (ruleInfo == null) {
       throw new ApiException("Missing the required parameter 'ruleInfo' when calling updateRule(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", apiClient.escapeString(ruleId.toString()));

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
    return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
  }

  /**
   * Update Rule
   * Update an existing Rule
   * @param ruleId Rule ID.
   * @param ruleInfo Rule object that needs to be updated
   * @return RuleEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public RuleEnvelope updateRule(String ruleId, RuleUpdateInfo ruleInfo) throws ApiException {
    ApiResponse<RuleEnvelope> resp = updateRuleWithHttpInfo(ruleId, ruleInfo);
    return resp.getData();
  }

  /**
   * Update Rule
   * Update an existing Rule
   * @param ruleId Rule ID.
   * @param ruleInfo Rule object that needs to be updated
   * @return ApiResponse<RuleEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<RuleEnvelope> updateRuleWithHttpInfo(String ruleId, RuleUpdateInfo ruleInfo) throws ApiException {
    Call call = updateRuleCall(ruleId, ruleInfo, null, null);
    Type localVarReturnType = new TypeToken<RuleEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Update Rule (asynchronously)
   * Update an existing Rule
   * @param ruleId Rule ID.
   * @param ruleInfo Rule object that needs to be updated
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call updateRuleAsync(String ruleId, RuleUpdateInfo ruleInfo, final ApiCallback<RuleEnvelope> callback) throws ApiException {

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

    Call call = updateRuleCall(ruleId, ruleInfo, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<RuleEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for deleteRule */
  private Call deleteRuleCall(String ruleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
       throw new ApiException("Missing the required parameter 'ruleId' when calling deleteRule(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/rules/{ruleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleId" + "\\}", apiClient.escapeString(ruleId.toString()));

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
   * Delete Rule
   * Delete a Rule
   * @param ruleId Rule ID.
   * @return RuleEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public RuleEnvelope deleteRule(String ruleId) throws ApiException {
    ApiResponse<RuleEnvelope> resp = deleteRuleWithHttpInfo(ruleId);
    return resp.getData();
  }

  /**
   * Delete Rule
   * Delete a Rule
   * @param ruleId Rule ID.
   * @return ApiResponse<RuleEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<RuleEnvelope> deleteRuleWithHttpInfo(String ruleId) throws ApiException {
    Call call = deleteRuleCall(ruleId, null, null);
    Type localVarReturnType = new TypeToken<RuleEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Delete Rule (asynchronously)
   * Delete a Rule
   * @param ruleId Rule ID.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call deleteRuleAsync(String ruleId, final ApiCallback<RuleEnvelope> callback) throws ApiException {

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

    Call call = deleteRuleCall(ruleId, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<RuleEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
