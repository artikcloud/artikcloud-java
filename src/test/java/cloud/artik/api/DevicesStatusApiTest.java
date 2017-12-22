package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.DeviceStatus;
import cloud.artik.model.DeviceStatusBatch;
import cloud.artik.model.DeviceStatusPut;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesStatusApi
 */
public class DevicesStatusApiTest {

    private DevicesStatusApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DevicesStatusApi.class);
    }

    
    /**
     * Get Device Status
     *
     * Get Device Status
     */
    @Test
    public void getDeviceStatusTest() {
        String deviceId = null;
        Boolean includeSnapshot = null;
        Boolean includeSnapshotTimestamp = null;
        // DeviceStatus response = api.getDeviceStatus(deviceId, includeSnapshot, includeSnapshotTimestamp);

        // TODO: test validations
    }
    
    /**
     * Get Devices Status
     *
     * Get Devices Status
     */
    @Test
    public void getDevicesStatusTest() {
        String dids = null;
        Boolean includeSnapshot = null;
        Boolean includeSnapshotTimestamp = null;
        // DeviceStatusBatch response = api.getDevicesStatus(dids, includeSnapshot, includeSnapshotTimestamp);

        // TODO: test validations
    }
    
    /**
     * Update Device Status
     *
     * Update Device Status
     */
    @Test
    public void putDeviceStatusTest() {
        String deviceId = null;
        DeviceStatusPut body = null;
        // DeviceStatus response = api.putDeviceStatus(deviceId, body);

        // TODO: test validations
    }
    
}
