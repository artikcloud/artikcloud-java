package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.DeviceRegConfirmUserRequest;
import cloud.artik.model.DeviceRegConfirmUserResponseEnvelope;
import cloud.artik.model.DeviceRegStatusResponseEnvelope;
import cloud.artik.model.UnregisterDeviceResponseEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RegistrationsApi {
  /**
   * Confirm User
   * This call updates the registration request issued earlier by associating it with an authenticated user and captures all additional information required to add a new device.
   * @param registrationInfo Device Registration information. (required)
   * @return Call&lt;DeviceRegConfirmUserResponseEnvelope&gt;
   */
  
  @PUT("devices/registrations/pin")
  Call<DeviceRegConfirmUserResponseEnvelope> confirmUser(
    @retrofit2.http.Body DeviceRegConfirmUserRequest registrationInfo
  );

  /**
   * Get Request Status For User
   * This call checks the status of the request so users can poll and know when registration is complete.
   * @param requestId Request ID. (required)
   * @return Call&lt;DeviceRegStatusResponseEnvelope&gt;
   */
  
  @GET("devices/registrations/{requestId}/status")
  Call<DeviceRegStatusResponseEnvelope> getRequestStatusForUser(
    @retrofit2.http.Path("requestId") String requestId
  );

  /**
   * Unregister Device
   * This call clears any associations from the secure device registration.
   * @param deviceId Device ID. (required)
   * @return Call&lt;UnregisterDeviceResponseEnvelope&gt;
   */
  
  @DELETE("devices/{deviceId}/registrations")
  Call<UnregisterDeviceResponseEnvelope> unregisterDevice(
    @retrofit2.http.Path("deviceId") String deviceId
  );

}
