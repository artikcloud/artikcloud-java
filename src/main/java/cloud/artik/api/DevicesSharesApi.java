package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.DeviceShareInfo;
import cloud.artik.model.DeviceSharingDataResponseBody;
import cloud.artik.model.DeviceSharingEnvelope;
import cloud.artik.model.DeviceSharingIdResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DevicesSharesApi {
  /**
   * Share a device 
   * Share a device 
   * @param deviceId Device ID. (required)
   * @param deviceShareInfo Device object that needs to be added (required)
   * @return Call&lt;DeviceSharingIdResponseBody&gt;
   */
  
  @POST("devices/{deviceId}/shares")
  Call<DeviceSharingIdResponseBody> createShareForDevice(
    @retrofit2.http.Path("deviceId") String deviceId, @retrofit2.http.Body DeviceShareInfo deviceShareInfo
  );

  /**
   * Delete specific share of the given device id
   * Delete specific share of the given device id
   * @param deviceId Device ID. (required)
   * @param shareId Share ID. (required)
   * @return Call&lt;DeviceSharingIdResponseBody&gt;
   */
  
  @DELETE("devices/{deviceId}/shares/{shareId}")
  Call<DeviceSharingIdResponseBody> deleteSharingForDevice(
    @retrofit2.http.Path("deviceId") String deviceId, @retrofit2.http.Path("shareId") String shareId
  );

  /**
   * List all shares for the given device id
   * List all shares for the given device id
   * @param deviceId Device ID. (required)
   * @param count Desired count of items in the result set. (optional)
   * @param offset Offset for pagination. (optional)
   * @return Call&lt;DeviceSharingEnvelope&gt;
   */
  
  @GET("devices/{deviceId}/shares")
  Call<DeviceSharingEnvelope> getAllSharesForDevice(
    @retrofit2.http.Path("deviceId") String deviceId, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get specific share of the given device id
   * Get specific share of the given device id
   * @param deviceId Device ID. (required)
   * @param shareId Share ID. (required)
   * @return Call&lt;DeviceSharingDataResponseBody&gt;
   */
  
  @GET("devices/{deviceId}/shares/{shareId}")
  Call<DeviceSharingDataResponseBody> getSharingForDevice(
    @retrofit2.http.Path("deviceId") String deviceId, @retrofit2.http.Path("shareId") String shareId
  );

}
