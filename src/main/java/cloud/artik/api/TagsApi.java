package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.TagsEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TagsApi {
  /**
   * Get all categories
   * Get all tags marked as categories
   * @return Call&lt;TagsEnvelope&gt;
   */
  
  @GET("tags/categories")
  Call<TagsEnvelope> getTagCategories();
    

  /**
   * Get tag suggestions
   * Get tag suggestions for applications, device types that have been most used with a group of tags.
   * @param entityType Entity type name. (optional)
   * @param tags Comma separated list of tags. (optional)
   * @param name Name of tags used for type ahead. (optional)
   * @param count Number of results to return. Max 10. (optional)
   * @return Call&lt;TagsEnvelope&gt;
   */
  
  @GET("tags/suggestions")
  Call<TagsEnvelope> getTagSuggestions(
    @retrofit2.http.Query("entity_type") String entityType, @retrofit2.http.Query("tags") String tags, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("count") Integer count
  );

  /**
   * Get all tags of categories
   * Get all tags related to the list of categories
   * @param categories Comma separated list of categories. (optional)
   * @return Call&lt;TagsEnvelope&gt;
   */
  
  @GET("tags")
  Call<TagsEnvelope> getTagsByCategories(
    @retrofit2.http.Query("categories") String categories
  );

}
