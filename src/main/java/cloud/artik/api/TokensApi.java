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


import cloud.artik.model.CheckTokenResponse;
import cloud.artik.model.RefreshTokenResponse;
import cloud.artik.model.TokenInfoSuccessResponse;
import cloud.artik.model.TokenRequest;

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
    private com.squareup.okhttp.Call checkTokenCall(TokenRequest tokenInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = tokenInfo;
        
        // create path and map variables
        String localVarPath = "/accounts/checkToken".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call checkTokenValidateBeforeCall(TokenRequest tokenInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tokenInfo' is set
        if (tokenInfo == null) {
            throw new ApiException("Missing the required parameter 'tokenInfo' when calling checkToken(Async)");
        }
        
        
        com.squareup.okhttp.Call call = checkTokenCall(tokenInfo, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Check Token
     * (Deprecated) Check Token. See tokenInfo
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
     * (Deprecated) Check Token. See tokenInfo
     * @param tokenInfo Token object to be checked (required)
     * @return ApiResponse&lt;CheckTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CheckTokenResponse> checkTokenWithHttpInfo(TokenRequest tokenInfo) throws ApiException {
        com.squareup.okhttp.Call call = checkTokenValidateBeforeCall(tokenInfo, null, null);
        Type localVarReturnType = new TypeToken<CheckTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check Token (asynchronously)
     * (Deprecated) Check Token. See tokenInfo
     * @param tokenInfo Token object to be checked (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkTokenAsync(TokenRequest tokenInfo, final ApiCallback<CheckTokenResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = checkTokenValidateBeforeCall(tokenInfo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CheckTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for refreshToken */
    private com.squareup.okhttp.Call refreshTokenCall(String grantType, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/token".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call refreshTokenValidateBeforeCall(String grantType, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling refreshToken(Async)");
        }
        
        // verify the required parameter 'refreshToken' is set
        if (refreshToken == null) {
            throw new ApiException("Missing the required parameter 'refreshToken' when calling refreshToken(Async)");
        }
        
        
        com.squareup.okhttp.Call call = refreshTokenCall(grantType, refreshToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
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
     * @return ApiResponse&lt;RefreshTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RefreshTokenResponse> refreshTokenWithHttpInfo(String grantType, String refreshToken) throws ApiException {
        com.squareup.okhttp.Call call = refreshTokenValidateBeforeCall(grantType, refreshToken, null, null);
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
    public com.squareup.okhttp.Call refreshTokenAsync(String grantType, String refreshToken, final ApiCallback<RefreshTokenResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = refreshTokenValidateBeforeCall(grantType, refreshToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RefreshTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for tokenInfo */
    private com.squareup.okhttp.Call tokenInfoCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/tokenInfo".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tokenInfoValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = tokenInfoCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Token Info
     * Returns the Token Information
     * @return TokenInfoSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TokenInfoSuccessResponse tokenInfo() throws ApiException {
        ApiResponse<TokenInfoSuccessResponse> resp = tokenInfoWithHttpInfo();
        return resp.getData();
    }

    /**
     * Token Info
     * Returns the Token Information
     * @return ApiResponse&lt;TokenInfoSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TokenInfoSuccessResponse> tokenInfoWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = tokenInfoValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<TokenInfoSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Token Info (asynchronously)
     * Returns the Token Information
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tokenInfoAsync(final ApiCallback<TokenInfoSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tokenInfoValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TokenInfoSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
