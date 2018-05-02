package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.SceneCreationInfo;
import cloud.artik.model.SceneEnvelope;
import cloud.artik.model.ScenesEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ScenesApi {
  /**
   * Create a new scene
   * Create a new scene
   * @param body Body (required)
   * @return Call&lt;SceneEnvelope&gt;
   */
  
  @POST("scenes")
  Call<SceneEnvelope> createScene(
    @retrofit2.http.Body SceneCreationInfo body
  );

  /**
   * Get a scene
   * Get a scene
   * @param sceneId Scene id (required)
   * @return Call&lt;SceneEnvelope&gt;
   */
  
  @GET("scenes/{sceneId}")
  Call<SceneEnvelope> getScene(
    @retrofit2.http.Path("sceneId") String sceneId
  );

  /**
   * Get all user scenes
   * Get all user scenes
   * @param count count (optional)
   * @param offset offset (optional)
   * @return Call&lt;ScenesEnvelope&gt;
   */
  
  @GET("scenes")
  Call<ScenesEnvelope> getScenes(
    @retrofit2.http.Query("count") String count, @retrofit2.http.Query("offset") String offset
  );

  /**
   * Delete a scene
   * Delete a scene
   * @param sceneId Scene id (required)
   * @return Call&lt;SceneEnvelope&gt;
   */
  
  @DELETE("scenes/{sceneId}")
  Call<SceneEnvelope> scenesSceneIdDelete(
    @retrofit2.http.Path("sceneId") String sceneId
  );

  /**
   * Trigger a scene
   * Trigger a scene
   * @param sceneId Scene id (required)
   * @param body Body (required)
   * @return Call&lt;SceneEnvelope&gt;
   */
  
  @POST("scenes/{sceneId}")
  Call<SceneEnvelope> triggerScene(
    @retrofit2.http.Path("sceneId") String sceneId, @retrofit2.http.Body Object body
  );

  /**
   * Update a scene
   * Update a scene
   * @param sceneId Scene id (required)
   * @param body Body (required)
   * @return Call&lt;SceneEnvelope&gt;
   */
  
  @PUT("scenes/{sceneId}")
  Call<SceneEnvelope> updateScene(
    @retrofit2.http.Path("sceneId") String sceneId, @retrofit2.http.Body SceneCreationInfo body
  );

}
