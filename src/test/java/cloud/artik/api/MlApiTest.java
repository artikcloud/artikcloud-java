package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.CreateModelBody;
import cloud.artik.model.GetModelsResponseBody;
import cloud.artik.model.ModelResponseBody;
import cloud.artik.model.PredictBody;
import cloud.artik.model.PredictResponseBody;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MlApi
 */
public class MlApiTest {

    private MlApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MlApi.class);
    }

    
    /**
     * Create model
     *
     * Create model
     */
    @Test
    public void createModelTest() {
        CreateModelBody body = null;
        // ModelResponseBody response = api.createModel(body);

        // TODO: test validations
    }
    
    /**
     * Delete model
     *
     * Delete model
     */
    @Test
    public void deleteModelTest() {
        String modelId = null;
        // ModelResponseBody response = api.deleteModel(modelId);

        // TODO: test validations
    }
    
    /**
     * Get model
     *
     * Get model
     */
    @Test
    public void getModelTest() {
        String modelId = null;
        // ModelResponseBody response = api.getModel(modelId);

        // TODO: test validations
    }
    
    /**
     * Get models
     *
     * Get models
     */
    @Test
    public void getModelsTest() {
        String uid = null;
        String count = null;
        String offset = null;
        // GetModelsResponseBody response = api.getModels(uid, count, offset);

        // TODO: test validations
    }
    
    /**
     * Predict
     *
     * Predict
     */
    @Test
    public void predictTest() {
        String modelId = null;
        PredictBody body = null;
        // PredictResponseBody response = api.predict(modelId, body);

        // TODO: test validations
    }
    
}
