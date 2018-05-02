package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.CreateModelBody;
import cloud.artik.model.GetModelsResponseBody;
import cloud.artik.model.ModelResponseBody;
import cloud.artik.model.PredictBody;
import cloud.artik.model.PredictResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MlApi {
  /**
   * Create model
   * Create model
   * @param body Body (optional)
   * @return Call&lt;ModelResponseBody&gt;
   */
  
  @POST("ml/models")
  Call<ModelResponseBody> createModel(
    @retrofit2.http.Body CreateModelBody body
  );

  /**
   * Delete model
   * Delete model
   * @param modelId modelId (required)
   * @return Call&lt;ModelResponseBody&gt;
   */
  
  @DELETE("ml/models/{modelId}")
  Call<ModelResponseBody> deleteModel(
    @retrofit2.http.Path("modelId") String modelId
  );

  /**
   * Get model
   * Get model
   * @param modelId modelId (required)
   * @return Call&lt;ModelResponseBody&gt;
   */
  
  @GET("ml/models/{modelId}")
  Call<ModelResponseBody> getModel(
    @retrofit2.http.Path("modelId") String modelId
  );

  /**
   * Get models
   * Get models
   * @param uid uid (optional)
   * @param count count (optional)
   * @param offset offset (optional)
   * @return Call&lt;GetModelsResponseBody&gt;
   */
  
  @GET("ml/models")
  Call<GetModelsResponseBody> getModels(
    @retrofit2.http.Query("uid") String uid, @retrofit2.http.Query("count") String count, @retrofit2.http.Query("offset") String offset
  );

  /**
   * Predict
   * Predict
   * @param modelId modelId (required)
   * @param body Body (optional)
   * @return Call&lt;PredictResponseBody&gt;
   */
  
  @POST("ml/models/{modelId}/predict")
  Call<PredictResponseBody> predict(
    @retrofit2.http.Path("modelId") String modelId, @retrofit2.http.Body PredictBody body
  );

}
