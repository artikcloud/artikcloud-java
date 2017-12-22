package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.DeviceStatus;
import cloud.artik.model.DeviceStatusBatch;
import cloud.artik.model.DeviceStatusPut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DevicesStatusApi {
  /**
   * Get Device Status
   * Get Device Status
   * @param deviceId Device ID. (required)
   * @param includeSnapshot Include device snapshot into the response (optional)
   * @param includeSnapshotTimestamp Include device snapshot timestamp into the response (optional)
   * @return Call&lt;DeviceStatus&gt;
   */
  
  @GET("devices/{deviceId}/status")
  Call<DeviceStatus> getDeviceStatus(
    @retrofit2.http.Path("deviceId") String deviceId, @retrofit2.http.Query("includeSnapshot") Boolean includeSnapshot, @retrofit2.http.Query("includeSnapshotTimestamp") Boolean includeSnapshotTimestamp
  );

  /**
   * Get Devices Status
   * Get Devices Status
   * @param dids List of device ids (comma-separated) for which the statuses are requested. (required)
   * @param includeSnapshot Include device snapshot into the response (optional)
   * @param includeSnapshotTimestamp Include device snapshot timestamp into the response (optional)
   * @return Call&lt;DeviceStatusBatch&gt;
   */
  
  @GET("devices/status")
  Call<DeviceStatusBatch> getDevicesStatus(
    @retrofit2.http.Query("dids") String dids, @retrofit2.http.Query("includeSnapshot") Boolean includeSnapshot, @retrofit2.http.Query("includeSnapshotTimestamp") Boolean includeSnapshotTimestamp
  );

  /**
   * Update Device Status
   * Update Device Status
   * @param deviceId Device ID. (required)
   * @param body Body (optional)
   * @return Call&lt;DeviceStatus&gt;
   */
  
  @PUT("devices/{deviceId}/status")
  Call<DeviceStatus> putDeviceStatus(
    @retrofit2.http.Path("deviceId") String deviceId, @retrofit2.http.Body DeviceStatusPut body
  );

}
