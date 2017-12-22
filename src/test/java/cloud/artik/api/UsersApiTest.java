package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.AppProperties;
import cloud.artik.model.DeviceSharingEnvelope;
import cloud.artik.model.DeviceTypesEnvelope;
import cloud.artik.model.DevicesEnvelope;
import cloud.artik.model.PropertiesEnvelope;
import cloud.artik.model.RulesEnvelope;
import cloud.artik.model.UserEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    
    /**
     * Create User Application Properties
     *
     * Create application properties for a user
     */
    @Test
    public void createUserPropertiesTest() {
        String userId = null;
        AppProperties properties = null;
        String aid = null;
        // PropertiesEnvelope response = api.createUserProperties(userId, properties, aid);

        // TODO: test validations
    }
    
    /**
     * Delete User Application Properties
     *
     * Deletes a user&#39;s application properties
     */
    @Test
    public void deleteUserPropertiesTest() {
        String userId = null;
        String aid = null;
        // PropertiesEnvelope response = api.deleteUserProperties(userId, aid);

        // TODO: test validations
    }
    
    /**
     * Get Current User Profile
     *
     * Get&#39;s the current user&#39;s profile
     */
    @Test
    public void getSelfTest() {
        // UserEnvelope response = api.getSelf();

        // TODO: test validations
    }
    
    /**
     * Get User Device Types
     *
     * Retrieve User&#39;s Device Types
     */
    @Test
    public void getUserDeviceTypesTest() {
        String userId = null;
        Integer offset = null;
        Integer count = null;
        Boolean includeShared = null;
        // DeviceTypesEnvelope response = api.getUserDeviceTypes(userId, offset, count, includeShared);

        // TODO: test validations
    }
    
    /**
     * Get User Devices
     *
     * Retrieve User&#39;s Devices
     */
    @Test
    public void getUserDevicesTest() {
        String userId = null;
        Integer offset = null;
        Integer count = null;
        Boolean includeProperties = null;
        String owner = null;
        Boolean includeShareInfo = null;
        String dtid = null;
        // DevicesEnvelope response = api.getUserDevices(userId, offset, count, includeProperties, owner, includeShareInfo, dtid);

        // TODO: test validations
    }
    
    /**
     * Get User application properties
     *
     * Get application properties of a user
     */
    @Test
    public void getUserPropertiesTest() {
        String userId = null;
        String aid = null;
        // PropertiesEnvelope response = api.getUserProperties(userId, aid);

        // TODO: test validations
    }
    
    /**
     * Get User Rules
     *
     * Retrieve User&#39;s Rules
     */
    @Test
    public void getUserRulesTest() {
        String userId = null;
        Boolean excludeDisabled = null;
        Integer count = null;
        Integer offset = null;
        String owner = null;
        // RulesEnvelope response = api.getUserRules(userId, excludeDisabled, count, offset, owner);

        // TODO: test validations
    }
    
    /**
     * Get User shares
     *
     * Get User shares
     */
    @Test
    public void listAllSharesForUserTest() {
        String userId = null;
        String filter = null;
        Integer count = null;
        Integer offset = null;
        // DeviceSharingEnvelope response = api.listAllSharesForUser(userId, filter, count, offset);

        // TODO: test validations
    }
    
    /**
     * Update User Application Properties
     *
     * Updates application properties of a user
     */
    @Test
    public void updateUserPropertiesTest() {
        String userId = null;
        AppProperties properties = null;
        String aid = null;
        // PropertiesEnvelope response = api.updateUserProperties(userId, properties, aid);

        // TODO: test validations
    }
    
}
