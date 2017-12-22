package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.Device;
import cloud.artik.model.DeviceEnvelope;
import cloud.artik.model.DeviceTokenEnvelope;
import cloud.artik.model.PresenceEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DevicesApi {
  /**
   * Add Device
   * Create a device
   * @param device Device to be added to the user (required)
   * @return Call&lt;DeviceEnvelope&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @POST("devices")
  Call<DeviceEnvelope> addDevice(
    @retrofit2.http.Body Device device
  );

  /**
   * Delete Device
   * Deletes a device
   * @param deviceId deviceId (required)
   * @return Call&lt;DeviceEnvelope&gt;
   */
  
  @DELETE("devices/{deviceId}")
  Call<DeviceEnvelope> deleteDevice(
    @retrofit2.http.Path("deviceId") String deviceId
  );

  /**
   * Delete Device Token
   * Deletes a device&#39;s token
   * @param deviceId deviceId (required)
   * @return Call&lt;DeviceTokenEnvelope&gt;
   */
  
  @DELETE("devices/{deviceId}/tokens")
  Call<DeviceTokenEnvelope> deleteDeviceToken(
    @retrofit2.http.Path("deviceId") String deviceId
  );

  /**
   * Get Device
   * Retrieves a device
   * @param deviceId deviceId (required)
   * @return Call&lt;DeviceEnvelope&gt;
   */
  
  @GET("devices/{deviceId}")
  Call<DeviceEnvelope> getDevice(
    @retrofit2.http.Path("deviceId") String deviceId
  );

  /**
   * Get device presence information
   * Return the presence status of the given device along with the time it was last seen
   * @param deviceId Device ID. (required)
   * @return Call&lt;PresenceEnvelope&gt;
   */
  
  @GET("devices/{deviceId}/presence")
  Call<PresenceEnvelope> getDevicePresence(
    @retrofit2.http.Path("deviceId") String deviceId
  );

  /**
   * Get Device Token
   * Retrieves a device&#39;s token
   * @param deviceId deviceId (required)
   * @return Call&lt;DeviceTokenEnvelope&gt;
   */
  
  @GET("devices/{deviceId}/tokens")
  Call<DeviceTokenEnvelope> getDeviceToken(
    @retrofit2.http.Path("deviceId") String deviceId
  );

  /**
   * Update Device
   * Updates a device
   * @param deviceId deviceId (required)
   * @param device Device to be updated (required)
   * @return Call&lt;DeviceEnvelope&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @PUT("devices/{deviceId}")
  Call<DeviceEnvelope> updateDevice(
    @retrofit2.http.Path("deviceId") String deviceId, @retrofit2.http.Body Device device
  );

  /**
   * Update Device Token
   * Updates a device&#39;s token
   * @param deviceId deviceId (required)
   * @return Call&lt;DeviceTokenEnvelope&gt;
   */
  
  @Headers({
  	"Content-Type:text/plain" 
  })
  @PUT("devices/{deviceId}/tokens")
  Call<DeviceTokenEnvelope> updateDeviceToken(
    @retrofit2.http.Path("deviceId") String deviceId
  );

}
