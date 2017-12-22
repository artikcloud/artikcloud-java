package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.AppProperties;
import cloud.artik.model.DeviceSharingEnvelope;
import cloud.artik.model.DeviceTypesEnvelope;
import cloud.artik.model.DevicesEnvelope;
import cloud.artik.model.PropertiesEnvelope;
import cloud.artik.model.RulesEnvelope;
import cloud.artik.model.UserEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersApi {
  /**
   * Create User Application Properties
   * Create application properties for a user
   * @param userId User Id (required)
   * @param properties Properties to be updated (required)
   * @param aid Application ID (optional)
   * @return Call&lt;PropertiesEnvelope&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("users/{userId}/properties")
  Call<PropertiesEnvelope> createUserProperties(
    @retrofit2.http.Path("userId") String userId, @retrofit2.http.Body AppProperties properties, @retrofit2.http.Query("aid") String aid
  );

  /**
   * Delete User Application Properties
   * Deletes a user&#39;s application properties
   * @param userId User Id (required)
   * @param aid Application ID (optional)
   * @return Call&lt;PropertiesEnvelope&gt;
   */
  
  @DELETE("users/{userId}/properties")
  Call<PropertiesEnvelope> deleteUserProperties(
    @retrofit2.http.Path("userId") String userId, @retrofit2.http.Query("aid") String aid
  );

  /**
   * Get Current User Profile
   * Get&#39;s the current user&#39;s profile
   * @return Call&lt;UserEnvelope&gt;
   */
  
  @GET("users/self")
  Call<UserEnvelope> getSelf();
    

  /**
   * Get User Device Types
   * Retrieve User&#39;s Device Types
   * @param userId User ID. (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param includeShared Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. (optional)
   * @return Call&lt;DeviceTypesEnvelope&gt;
   */
  
  @GET("users/{userId}/devicetypes")
  Call<DeviceTypesEnvelope> getUserDeviceTypes(
    @retrofit2.http.Path("userId") String userId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("includeShared") Boolean includeShared
  );

  /**
   * Get User Devices
   * Retrieve User&#39;s Devices
   * @param userId User ID (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param includeProperties Optional. Boolean (true/false) - If false, only return the user&#39;s device types. If true, also return device types shared by other users. (optional)
   * @param owner Return owned and/or shared devices. Default to ALL. (optional)
   * @param includeShareInfo Include share info (optional)
   * @param dtid Return only devices of this device type. If empty, assumes all device types allowed by the authorization. (optional)
   * @return Call&lt;DevicesEnvelope&gt;
   */
  
  @GET("users/{userId}/devices")
  Call<DevicesEnvelope> getUserDevices(
    @retrofit2.http.Path("userId") String userId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("includeProperties") Boolean includeProperties, @retrofit2.http.Query("owner") String owner, @retrofit2.http.Query("includeShareInfo") Boolean includeShareInfo, @retrofit2.http.Query("dtid") String dtid
  );

  /**
   * Get User application properties
   * Get application properties of a user
   * @param userId User Id (required)
   * @param aid Application ID (optional)
   * @return Call&lt;PropertiesEnvelope&gt;
   */
  
  @GET("users/{userId}/properties")
  Call<PropertiesEnvelope> getUserProperties(
    @retrofit2.http.Path("userId") String userId, @retrofit2.http.Query("aid") String aid
  );

  /**
   * Get User Rules
   * Retrieve User&#39;s Rules
   * @param userId User ID. (required)
   * @param excludeDisabled Exclude disabled rules in the result. (optional)
   * @param count Desired count of items in the result set. (optional)
   * @param offset Offset for pagination. (optional)
   * @param owner Rule owner (optional)
   * @return Call&lt;RulesEnvelope&gt;
   */
  
  @GET("users/{userId}/rules")
  Call<RulesEnvelope> getUserRules(
    @retrofit2.http.Path("userId") String userId, @retrofit2.http.Query("excludeDisabled") Boolean excludeDisabled, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("owner") String owner
  );

  /**
   * Get User shares
   * Get User shares
   * @param userId User ID. (required)
   * @param filter filter (required)
   * @param count Desired count of items in the result set. (optional)
   * @param offset Offset for pagination. (optional)
   * @return Call&lt;DeviceSharingEnvelope&gt;
   */
  
  @GET("users/{userId}/shares")
  Call<DeviceSharingEnvelope> listAllSharesForUser(
    @retrofit2.http.Path("userId") String userId, @retrofit2.http.Query("filter") String filter, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Update User Application Properties
   * Updates application properties of a user
   * @param userId User Id (required)
   * @param properties Properties to be updated (required)
   * @param aid Application ID (optional)
   * @return Call&lt;PropertiesEnvelope&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @PUT("users/{userId}/properties")
  Call<PropertiesEnvelope> updateUserProperties(
    @retrofit2.http.Path("userId") String userId, @retrofit2.http.Body AppProperties properties, @retrofit2.http.Query("aid") String aid
  );

}
