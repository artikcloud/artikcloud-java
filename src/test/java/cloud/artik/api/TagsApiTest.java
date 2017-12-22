package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.TagsEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagsApi
 */
public class TagsApiTest {

    private TagsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TagsApi.class);
    }

    
    /**
     * Get all categories
     *
     * Get all tags marked as categories
     */
    @Test
    public void getTagCategoriesTest() {
        // TagsEnvelope response = api.getTagCategories();

        // TODO: test validations
    }
    
    /**
     * Get tag suggestions
     *
     * Get tag suggestions for applications, device types that have been most used with a group of tags.
     */
    @Test
    public void getTagSuggestionsTest() {
        String entityType = null;
        String tags = null;
        String name = null;
        Integer count = null;
        // TagsEnvelope response = api.getTagSuggestions(entityType, tags, name, count);

        // TODO: test validations
    }
    
    /**
     * Get all tags of categories
     *
     * Get all tags related to the list of categories
     */
    @Test
    public void getTagsByCategoriesTest() {
        String categories = null;
        // TagsEnvelope response = api.getTagsByCategories(categories);

        // TODO: test validations
    }
    
}
