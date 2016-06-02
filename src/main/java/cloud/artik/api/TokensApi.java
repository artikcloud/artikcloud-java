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

import cloud.artik.model.TokenRequest;
import cloud.artik.model.CheckTokenResponse;
import cloud.artik.model.RefreshTokenResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokensApi {
  private ApiClient apiClient;

  public TokensApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TokensApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for checkToken */
  private Call checkTokenCall(TokenRequest tokenInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = tokenInfo;
    
    // verify the required parameter 'tokenInfo' is set
    if (tokenInfo == null) {
       throw new ApiException("Missing the required parameter 'tokenInfo' when calling checkToken(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/checkToken".replaceAll("\\{format\\}","json");

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
   * Check Token
   * Check Token
   * @param tokenInfo Token object to be checked (required)
   * @return CheckTokenResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public CheckTokenResponse checkToken(TokenRequest tokenInfo) throws ApiException {
    ApiResponse<CheckTokenResponse> resp = checkTokenWithHttpInfo(tokenInfo);
    return resp.getData();
  }

  /**
   * Check Token
   * Check Token
   * @param tokenInfo Token object to be checked (required)
   * @return ApiResponse<CheckTokenResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<CheckTokenResponse> checkTokenWithHttpInfo(TokenRequest tokenInfo) throws ApiException {
    Call call = checkTokenCall(tokenInfo, null, null);
    Type localVarReturnType = new TypeToken<CheckTokenResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Check Token (asynchronously)
   * Check Token
   * @param tokenInfo Token object to be checked (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call checkTokenAsync(TokenRequest tokenInfo, final ApiCallback<CheckTokenResponse> callback) throws ApiException {

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

    Call call = checkTokenCall(tokenInfo, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<CheckTokenResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for refreshToken */
  private Call refreshTokenCall(String grantType, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'grantType' is set
    if (grantType == null) {
       throw new ApiException("Missing the required parameter 'grantType' when calling refreshToken(Async)");
    }
    
    // verify the required parameter 'refreshToken' is set
    if (refreshToken == null) {
       throw new ApiException("Missing the required parameter 'refreshToken' when calling refreshToken(Async)");
    }
    

    // create path and map variables
    String localVarPath = "/token".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (grantType != null)
      localVarFormParams.put("grant_type", grantType);
    if (refreshToken != null)
      localVarFormParams.put("refresh_token", refreshToken);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
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
   * Refresh Token
   * Refresh Token
   * @param grantType Grant Type. (required)
   * @param refreshToken Refresh Token. (required)
   * @return RefreshTokenResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public RefreshTokenResponse refreshToken(String grantType, String refreshToken) throws ApiException {
    ApiResponse<RefreshTokenResponse> resp = refreshTokenWithHttpInfo(grantType, refreshToken);
    return resp.getData();
  }

  /**
   * Refresh Token
   * Refresh Token
   * @param grantType Grant Type. (required)
   * @param refreshToken Refresh Token. (required)
   * @return ApiResponse<RefreshTokenResponse>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<RefreshTokenResponse> refreshTokenWithHttpInfo(String grantType, String refreshToken) throws ApiException {
    Call call = refreshTokenCall(grantType, refreshToken, null, null);
    Type localVarReturnType = new TypeToken<RefreshTokenResponse>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Refresh Token (asynchronously)
   * Refresh Token
   * @param grantType Grant Type. (required)
   * @param refreshToken Refresh Token. (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call refreshTokenAsync(String grantType, String refreshToken, final ApiCallback<RefreshTokenResponse> callback) throws ApiException {

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

    Call call = refreshTokenCall(grantType, refreshToken, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<RefreshTokenResponse>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
