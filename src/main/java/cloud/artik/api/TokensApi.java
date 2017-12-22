package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.CheckTokenResponse;
import cloud.artik.model.RefreshTokenResponse;
import cloud.artik.model.TokenInfoSuccessResponse;
import cloud.artik.model.TokenRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TokensApi {
  /**
   * Check Token
   * (Deprecated) Check Token. See tokenInfo
   * @param tokenInfo Token object to be checked (required)
   * @return Call&lt;CheckTokenResponse&gt;
   */
  
  @POST("accounts/checkToken")
  Call<CheckTokenResponse> checkToken(
    @retrofit2.http.Body TokenRequest tokenInfo
  );

  /**
   * Refresh Token
   * Refresh Token
   * @param grantType Grant Type. (required)
   * @param refreshToken Refresh Token. (required)
   * @return Call&lt;RefreshTokenResponse&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("accounts/token")
  Call<RefreshTokenResponse> refreshToken(
    @retrofit2.http.Field("grant_type") String grantType, @retrofit2.http.Field("refresh_token") String refreshToken
  );

  /**
   * Token Info
   * Returns the Token Information
   * @return Call&lt;TokenInfoSuccessResponse&gt;
   */
  
  @GET("accounts/tokenInfo")
  Call<TokenInfoSuccessResponse> tokenInfo();
    

}
