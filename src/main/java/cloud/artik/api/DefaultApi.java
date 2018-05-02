package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.ScenesEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DefaultApi {
  /**
   * Get all user scenes
   * Get all user scenes
   * @param uid User id (required)
   * @param count count (optional)
   * @param offset offset (optional)
   * @return Call&lt;ScenesEnvelope&gt;
   */
  
  @GET("users/{uid}/scenes")
  Call<ScenesEnvelope> getUserScenes(
    @retrofit2.http.Path("uid") String uid, @retrofit2.http.Query("count") String count, @retrofit2.http.Query("offset") String offset
  );

}
