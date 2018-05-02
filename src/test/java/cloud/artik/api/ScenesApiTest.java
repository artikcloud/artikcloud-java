package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.SceneCreationInfo;
import cloud.artik.model.SceneEnvelope;
import cloud.artik.model.ScenesEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScenesApi
 */
public class ScenesApiTest {

    private ScenesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScenesApi.class);
    }

    
    /**
     * Create a new scene
     *
     * Create a new scene
     */
    @Test
    public void createSceneTest() {
        SceneCreationInfo body = null;
        // SceneEnvelope response = api.createScene(body);

        // TODO: test validations
    }
    
    /**
     * Get a scene
     *
     * Get a scene
     */
    @Test
    public void getSceneTest() {
        String sceneId = null;
        // SceneEnvelope response = api.getScene(sceneId);

        // TODO: test validations
    }
    
    /**
     * Get all user scenes
     *
     * Get all user scenes
     */
    @Test
    public void getScenesTest() {
        String count = null;
        String offset = null;
        // ScenesEnvelope response = api.getScenes(count, offset);

        // TODO: test validations
    }
    
    /**
     * Delete a scene
     *
     * Delete a scene
     */
    @Test
    public void scenesSceneIdDeleteTest() {
        String sceneId = null;
        // SceneEnvelope response = api.scenesSceneIdDelete(sceneId);

        // TODO: test validations
    }
    
    /**
     * Trigger a scene
     *
     * Trigger a scene
     */
    @Test
    public void triggerSceneTest() {
        String sceneId = null;
        Object body = null;
        // SceneEnvelope response = api.triggerScene(sceneId, body);

        // TODO: test validations
    }
    
    /**
     * Update a scene
     *
     * Update a scene
     */
    @Test
    public void updateSceneTest() {
        String sceneId = null;
        SceneCreationInfo body = null;
        // SceneEnvelope response = api.updateScene(sceneId, body);

        // TODO: test validations
    }
    
}
