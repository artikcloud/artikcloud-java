package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.Device;
import cloud.artik.model.DeviceEnvelope;
import cloud.artik.model.DeviceTokenEnvelope;
import cloud.artik.model.PresenceEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
public class DevicesApiTest {

    private DevicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DevicesApi.class);
    }

    
    /**
     * Add Device
     *
     * Create a device
     */
    @Test
    public void addDeviceTest() {
        Device device = null;
        // DeviceEnvelope response = api.addDevice(device);

        // TODO: test validations
    }
    
    /**
     * Delete Device
     *
     * Deletes a device
     */
    @Test
    public void deleteDeviceTest() {
        String deviceId = null;
        // DeviceEnvelope response = api.deleteDevice(deviceId);

        // TODO: test validations
    }
    
    /**
     * Delete Device Token
     *
     * Deletes a device&#39;s token
     */
    @Test
    public void deleteDeviceTokenTest() {
        String deviceId = null;
        // DeviceTokenEnvelope response = api.deleteDeviceToken(deviceId);

        // TODO: test validations
    }
    
    /**
     * Get Device
     *
     * Retrieves a device
     */
    @Test
    public void getDeviceTest() {
        String deviceId = null;
        // DeviceEnvelope response = api.getDevice(deviceId);

        // TODO: test validations
    }
    
    /**
     * Get device presence information
     *
     * Return the presence status of the given device along with the time it was last seen
     */
    @Test
    public void getDevicePresenceTest() {
        String deviceId = null;
        // PresenceEnvelope response = api.getDevicePresence(deviceId);

        // TODO: test validations
    }
    
    /**
     * Get Device Token
     *
     * Retrieves a device&#39;s token
     */
    @Test
    public void getDeviceTokenTest() {
        String deviceId = null;
        // DeviceTokenEnvelope response = api.getDeviceToken(deviceId);

        // TODO: test validations
    }
    
    /**
     * Update Device
     *
     * Updates a device
     */
    @Test
    public void updateDeviceTest() {
        String deviceId = null;
        Device device = null;
        // DeviceEnvelope response = api.updateDevice(deviceId, device);

        // TODO: test validations
    }
    
    /**
     * Update Device Token
     *
     * Updates a device&#39;s token
     */
    @Test
    public void updateDeviceTokenTest() {
        String deviceId = null;
        // DeviceTokenEnvelope response = api.updateDeviceToken(deviceId);

        // TODO: test validations
    }
    
}
