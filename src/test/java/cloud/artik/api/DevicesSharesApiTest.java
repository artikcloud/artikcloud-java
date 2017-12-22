package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.DeviceShareInfo;
import cloud.artik.model.DeviceSharing;
import cloud.artik.model.DeviceSharingEnvelope;
import cloud.artik.model.DeviceSharingId;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesSharesApi
 */
public class DevicesSharesApiTest {

    private DevicesSharesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DevicesSharesApi.class);
    }

    
    /**
     * Share a device 
     *
     * Share a device 
     */
    @Test
    public void createShareForDeviceTest() {
        String deviceId = null;
        DeviceShareInfo deviceShareInfo = null;
        // DeviceSharingId response = api.createShareForDevice(deviceId, deviceShareInfo);

        // TODO: test validations
    }
    
    /**
     * Delete specific share of the given device id
     *
     * Delete specific share of the given device id
     */
    @Test
    public void deleteSharingForDeviceTest() {
        String deviceId = null;
        String shareId = null;
        // DeviceSharingId response = api.deleteSharingForDevice(deviceId, shareId);

        // TODO: test validations
    }
    
    /**
     * List all shares for the given device id
     *
     * List all shares for the given device id
     */
    @Test
    public void getAllSharesForDeviceTest() {
        String deviceId = null;
        Integer count = null;
        Integer offset = null;
        // DeviceSharingEnvelope response = api.getAllSharesForDevice(deviceId, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get specific share of the given device id
     *
     * Get specific share of the given device id
     */
    @Test
    public void getSharingForDeviceTest() {
        String deviceId = null;
        String shareId = null;
        // DeviceSharing response = api.getSharingForDevice(deviceId, shareId);

        // TODO: test validations
    }
    
}
