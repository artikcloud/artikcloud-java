package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.DeviceTypeEnvelope;
import cloud.artik.model.DeviceTypesEnvelope;
import cloud.artik.model.ManifestPropertiesEnvelope;
import cloud.artik.model.ManifestVersionsEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceTypesApi
 */
public class DeviceTypesApiTest {

    private DeviceTypesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DeviceTypesApi.class);
    }

    
    /**
     * Get Available Manifest Versions
     *
     * Get a Device Type&#39;s available manifest versions
     */
    @Test
    public void getAvailableManifestVersionsTest() {
        String deviceTypeId = null;
        // ManifestVersionsEnvelope response = api.getAvailableManifestVersions(deviceTypeId);

        // TODO: test validations
    }
    
    /**
     * Get Device Type
     *
     * Retrieves a Device Type
     */
    @Test
    public void getDeviceTypeTest() {
        String deviceTypeId = null;
        // DeviceTypeEnvelope response = api.getDeviceType(deviceTypeId);

        // TODO: test validations
    }
    
    /**
     * Get Device Types
     *
     * Retrieves Device Types
     */
    @Test
    public void getDeviceTypesTest() {
        String name = null;
        Integer offset = null;
        Integer count = null;
        String tags = null;
        // DeviceTypesEnvelope response = api.getDeviceTypes(name, offset, count, tags);

        // TODO: test validations
    }
    
    /**
     * Get Device Types by Application
     *
     * Get Device Types by Application
     */
    @Test
    public void getDeviceTypesByApplicationTest() {
        String appId = null;
        Boolean productInfo = null;
        Integer count = null;
        Integer offset = null;
        // DeviceTypesEnvelope response = api.getDeviceTypesByApplication(appId, productInfo, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get Latest Manifest Properties
     *
     * Get a Device Type&#39;s manifest properties for the latest version.
     */
    @Test
    public void getLatestManifestPropertiesTest() {
        String deviceTypeId = null;
        // ManifestPropertiesEnvelope response = api.getLatestManifestProperties(deviceTypeId);

        // TODO: test validations
    }
    
    /**
     * Get manifest properties
     *
     * Get a Device Type&#39;s manifest properties for a specific version.
     */
    @Test
    public void getManifestPropertiesTest() {
        String deviceTypeId = null;
        String version = null;
        // ManifestPropertiesEnvelope response = api.getManifestProperties(deviceTypeId, version);

        // TODO: test validations
    }
    
}
