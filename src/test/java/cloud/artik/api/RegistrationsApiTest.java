package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.DeviceRegConfirmUserRequest;
import cloud.artik.model.DeviceRegConfirmUserResponseEnvelope;
import cloud.artik.model.DeviceRegStatusResponseEnvelope;
import cloud.artik.model.UnregisterDeviceResponseEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegistrationsApi
 */
public class RegistrationsApiTest {

    private RegistrationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RegistrationsApi.class);
    }

    
    /**
     * Confirm User
     *
     * This call updates the registration request issued earlier by associating it with an authenticated user and captures all additional information required to add a new device.
     */
    @Test
    public void confirmUserTest() {
        DeviceRegConfirmUserRequest registrationInfo = null;
        // DeviceRegConfirmUserResponseEnvelope response = api.confirmUser(registrationInfo);

        // TODO: test validations
    }
    
    /**
     * Get Request Status For User
     *
     * This call checks the status of the request so users can poll and know when registration is complete.
     */
    @Test
    public void getRequestStatusForUserTest() {
        String requestId = null;
        // DeviceRegStatusResponseEnvelope response = api.getRequestStatusForUser(requestId);

        // TODO: test validations
    }
    
    /**
     * Unregister Device
     *
     * This call clears any associations from the secure device registration.
     */
    @Test
    public void unregisterDeviceTest() {
        String deviceId = null;
        // UnregisterDeviceResponseEnvelope response = api.unregisterDevice(deviceId);

        // TODO: test validations
    }
    
}
