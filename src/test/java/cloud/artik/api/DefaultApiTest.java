package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.ScenesEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DefaultApi.class);
    }

    
    /**
     * Get all user scenes
     *
     * Get all user scenes
     */
    @Test
    public void getUserScenesTest() {
        String uid = null;
        String count = null;
        String offset = null;
        // ScenesEnvelope response = api.getUserScenes(uid, count, offset);

        // TODO: test validations
    }
    
}
