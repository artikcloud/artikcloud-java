/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.api;

import cloud.artik.client.ApiException;
import cloud.artik.model.DeviceShareInfo;
import cloud.artik.model.DeviceSharing;
import cloud.artik.model.DeviceSharingEnvelope;
import cloud.artik.model.DeviceSharingId;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesSharesApi
 */
@Ignore
public class DevicesSharesApiTest {

    private final DevicesSharesApi api = new DevicesSharesApi();

    
    /**
     * Share a device 
     *
     * Share a device 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createShareForDeviceTest() throws ApiException {
        String deviceId = null;
        DeviceShareInfo deviceShareInfo = null;
        DeviceSharingId response = api.createShareForDevice(deviceId, deviceShareInfo);

        // TODO: test validations
    }
    
    /**
     * Delete specific share of the given device id
     *
     * Delete specific share of the given device id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSharingForDeviceTest() throws ApiException {
        String deviceId = null;
        String shareId = null;
        DeviceSharingId response = api.deleteSharingForDevice(deviceId, shareId);

        // TODO: test validations
    }
    
    /**
     * List all shares for the given device id
     *
     * List all shares for the given device id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSharesForDeviceTest() throws ApiException {
        String deviceId = null;
        Integer count = null;
        Integer offset = null;
        DeviceSharingEnvelope response = api.getAllSharesForDevice(deviceId, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get specific share of the given device id
     *
     * Get specific share of the given device id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSharingForDeviceTest() throws ApiException {
        String deviceId = null;
        String shareId = null;
        DeviceSharing response = api.getSharingForDevice(deviceId, shareId);

        // TODO: test validations
    }
    
}
