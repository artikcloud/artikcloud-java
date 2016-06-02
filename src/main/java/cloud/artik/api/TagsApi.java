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

import cloud.artik.model.TagsEnvelope;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagsApi {
  private ApiClient apiClient;

  public TagsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TagsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for getTagCategories */
  private Call getTagCategoriesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/tags/categories".replaceAll("\\{format\\}","json");

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
   * Get all categories
   * Get all tags marked as categories
   * @return TagsEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public TagsEnvelope getTagCategories() throws ApiException {
    ApiResponse<TagsEnvelope> resp = getTagCategoriesWithHttpInfo();
    return resp.getData();
  }

  /**
   * Get all categories
   * Get all tags marked as categories
   * @return ApiResponse<TagsEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<TagsEnvelope> getTagCategoriesWithHttpInfo() throws ApiException {
    Call call = getTagCategoriesCall(null, null);
    Type localVarReturnType = new TypeToken<TagsEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get all categories (asynchronously)
   * Get all tags marked as categories
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getTagCategoriesAsync(final ApiCallback<TagsEnvelope> callback) throws ApiException {

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

    Call call = getTagCategoriesCall(progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<TagsEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getTagSuggestions */
  private Call getTagSuggestionsCall(String entityType, String tags, String name, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/tags/suggestions".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (entityType != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "entity_type", entityType));
    if (tags != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
    if (name != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    if (count != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));

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
   * Get tag suggestions
   * Get tag suggestions for applications, device types that have been most used with a group of tags.
   * @param entityType Entity type name. (optional)
   * @param tags Comma separated list of tags. (optional)
   * @param name Name of tags used for type ahead. (optional)
   * @param count Number of results to return. Max 10. (optional)
   * @return TagsEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public TagsEnvelope getTagSuggestions(String entityType, String tags, String name, Integer count) throws ApiException {
    ApiResponse<TagsEnvelope> resp = getTagSuggestionsWithHttpInfo(entityType, tags, name, count);
    return resp.getData();
  }

  /**
   * Get tag suggestions
   * Get tag suggestions for applications, device types that have been most used with a group of tags.
   * @param entityType Entity type name. (optional)
   * @param tags Comma separated list of tags. (optional)
   * @param name Name of tags used for type ahead. (optional)
   * @param count Number of results to return. Max 10. (optional)
   * @return ApiResponse<TagsEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<TagsEnvelope> getTagSuggestionsWithHttpInfo(String entityType, String tags, String name, Integer count) throws ApiException {
    Call call = getTagSuggestionsCall(entityType, tags, name, count, null, null);
    Type localVarReturnType = new TypeToken<TagsEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get tag suggestions (asynchronously)
   * Get tag suggestions for applications, device types that have been most used with a group of tags.
   * @param entityType Entity type name. (optional)
   * @param tags Comma separated list of tags. (optional)
   * @param name Name of tags used for type ahead. (optional)
   * @param count Number of results to return. Max 10. (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getTagSuggestionsAsync(String entityType, String tags, String name, Integer count, final ApiCallback<TagsEnvelope> callback) throws ApiException {

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

    Call call = getTagSuggestionsCall(entityType, tags, name, count, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<TagsEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
  /* Build call for getTagsByCategories */
  private Call getTagsByCategoriesCall(String categories, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
    Object localVarPostBody = null;
    

    // create path and map variables
    String localVarPath = "/tags".replaceAll("\\{format\\}","json");

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    if (categories != null)
      localVarQueryParams.addAll(apiClient.parameterToPairs("", "categories", categories));

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
   * Get all tags of categories
   * Get all tags related to the list of categories
   * @param categories Comma separated list of categories. (optional)
   * @return TagsEnvelope
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public TagsEnvelope getTagsByCategories(String categories) throws ApiException {
    ApiResponse<TagsEnvelope> resp = getTagsByCategoriesWithHttpInfo(categories);
    return resp.getData();
  }

  /**
   * Get all tags of categories
   * Get all tags related to the list of categories
   * @param categories Comma separated list of categories. (optional)
   * @return ApiResponse<TagsEnvelope>
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
   */
  public ApiResponse<TagsEnvelope> getTagsByCategoriesWithHttpInfo(String categories) throws ApiException {
    Call call = getTagsByCategoriesCall(categories, null, null);
    Type localVarReturnType = new TypeToken<TagsEnvelope>(){}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * Get all tags of categories (asynchronously)
   * Get all tags related to the list of categories
   * @param categories Comma separated list of categories. (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public Call getTagsByCategoriesAsync(String categories, final ApiCallback<TagsEnvelope> callback) throws ApiException {

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

    Call call = getTagsByCategoriesCall(categories, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<TagsEnvelope>(){}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
  
}
