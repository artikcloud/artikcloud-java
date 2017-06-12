package cloud.artik.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cloud.artik.client.ApiException;
import cloud.artik.model.AppProperties;
import cloud.artik.model.DeviceTypesEnvelope;
import cloud.artik.model.DevicesEnvelope;
import cloud.artik.model.PropertiesEnvelope;
import cloud.artik.model.RulesEnvelope;
import cloud.artik.model.User;
import cloud.artik.model.UserEnvelope;

public class UsersApiTest extends ArtikCloudApiTest {
    protected UsersApi apiClient = null;
    protected String userId = null;
    
    @Before
    public void setUp() throws Exception {
        this.apiClient = (UsersApi) super.api(UsersApi.class, "user1.token");

        userId = this.apiClient.getSelf().getData().getId();
    }

    @After
    public void tearDown() throws Exception {
        this.apiClient = null;
    }

    @Test
    public void testGetSelf() throws Exception {
        UserEnvelope userEnvelope = this.apiClient.getSelf();
        assertNotNull(userEnvelope);

        User user = userEnvelope.getData();
        assertNotNull(user);

        assertEquals(this.getProperty("user1.email"),user.getEmail());
        assertEquals(this.getProperty("user1.id"), user.getId());
        assertEquals(this.getProperty("user1.name"), user.getName());
        assertEquals(this.getProperty("user1.fullname"), user.getFullName());
        assertEquals(this.getProperty("user1.createdon"), user.getCreatedOn().toString());
        assertNotNull(user.getModifiedOn());
    }

    @Test
    public void testGetUserDevices() throws Exception {
        DevicesEnvelope userDevicesEnvelope = this.apiClient.getUserDevices(
                this.userId, null, null, null, null, null);

        assertNotNull(userDevicesEnvelope);

        assertNotNull(userDevicesEnvelope.getData().getDevices());
    }

    @Test
    public void testGetUserDeviceTypes() throws Exception {
        DeviceTypesEnvelope deviceTypesEnvelope = this.apiClient
                .getUserDeviceTypes(userId, null, null, null);

        assertNotNull(deviceTypesEnvelope);

        assertNotNull(deviceTypesEnvelope.getData().getDeviceTypes());
    }

    @Test
    public void testUserProperties() throws Exception {
        String aid = this.getProperty("user1.aid");
        PropertiesEnvelope userProperties = null;
        try {
            // Retrieve
            userProperties = this.apiClient.getUserProperties(userId, aid);
        } catch (ApiException apiException) {
            if (apiException.getCode() == 404) {
                // Create
                AppProperties appProperties = new AppProperties();
                appProperties.setProperties("abc=def");
                userProperties = this.apiClient.createUserProperties(userId,
                        appProperties, aid);
            } else {
                fail("Non-404 Error returned by API");
            }
        }

        assertNotNull(userProperties);

        // Update
        AppProperties appProperties2 = new AppProperties();
        appProperties2.setProperties("mno=pqr");
        PropertiesEnvelope userProperties2 = this.apiClient
                .updateUserProperties(userId, appProperties2, aid);
        assertNotNull(userProperties2);
        assertEquals("Properties must be the same", "mno=pqr", userProperties2
                .getData().getProperties());

        // Delete
        PropertiesEnvelope userProperties3 = this.apiClient
                .deleteUserProperties(userId, aid);
        assertNotNull(userProperties3);
        assertEquals(userProperties2, userProperties3);
    }
    
    @Test
    public void testGetUserRules() throws Exception {
        RulesEnvelope rulesEnvelope = this.apiClient.getUserRules(userId, false, null, null);

        assertNotNull(rulesEnvelope);

        //assertNotNull(rulesEnvelope.getData());        
    }
}
