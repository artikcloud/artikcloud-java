package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.RuleCreationInfo;
import cloud.artik.model.RuleEnvelope;
import cloud.artik.model.RuleUpdateInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RulesApi
 */
public class RulesApiTest {

    private RulesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RulesApi.class);
    }

    
    /**
     * Create Rule
     *
     * Create a new Rule
     */
    @Test
    public void createRuleTest() {
        RuleCreationInfo ruleInfo = null;
        String userId = null;
        // RuleEnvelope response = api.createRule(ruleInfo, userId);

        // TODO: test validations
    }
    
    /**
     * Delete Rule
     *
     * Delete a Rule
     */
    @Test
    public void deleteRuleTest() {
        String ruleId = null;
        // RuleEnvelope response = api.deleteRule(ruleId);

        // TODO: test validations
    }
    
    /**
     * Get Rule
     *
     * Get a rule using the Rule ID
     */
    @Test
    public void getRuleTest() {
        String ruleId = null;
        // RuleEnvelope response = api.getRule(ruleId);

        // TODO: test validations
    }
    
    /**
     * Update Rule
     *
     * Update an existing Rule
     */
    @Test
    public void updateRuleTest() {
        String ruleId = null;
        RuleUpdateInfo ruleInfo = null;
        // RuleEnvelope response = api.updateRule(ruleId, ruleInfo);

        // TODO: test validations
    }
    
}
