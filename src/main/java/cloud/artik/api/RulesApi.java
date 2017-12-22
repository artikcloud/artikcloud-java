package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.RuleCreationInfo;
import cloud.artik.model.RuleEnvelope;
import cloud.artik.model.RuleUpdateInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RulesApi {
  /**
   * Create Rule
   * Create a new Rule
   * @param ruleInfo Rule object that needs to be added (required)
   * @param userId User ID (required)
   * @return Call&lt;RuleEnvelope&gt;
   */
  
  @POST("rules")
  Call<RuleEnvelope> createRule(
    @retrofit2.http.Body RuleCreationInfo ruleInfo, @retrofit2.http.Query("userId") String userId
  );

  /**
   * Delete Rule
   * Delete a Rule
   * @param ruleId Rule ID. (required)
   * @return Call&lt;RuleEnvelope&gt;
   */
  
  @DELETE("rules/{ruleId}")
  Call<RuleEnvelope> deleteRule(
    @retrofit2.http.Path("ruleId") String ruleId
  );

  /**
   * Get Rule
   * Get a rule using the Rule ID
   * @param ruleId Rule ID. (required)
   * @return Call&lt;RuleEnvelope&gt;
   */
  
  @GET("rules/{ruleId}")
  Call<RuleEnvelope> getRule(
    @retrofit2.http.Path("ruleId") String ruleId
  );

  /**
   * Update Rule
   * Update an existing Rule
   * @param ruleId Rule ID. (required)
   * @param ruleInfo Rule object that needs to be updated (required)
   * @return Call&lt;RuleEnvelope&gt;
   */
  
  @PUT("rules/{ruleId}")
  Call<RuleEnvelope> updateRule(
    @retrofit2.http.Path("ruleId") String ruleId, @retrofit2.http.Body RuleUpdateInfo ruleInfo
  );

}
