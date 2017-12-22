package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.DevicePricingTierEnvelope;
import cloud.artik.model.DevicePricingTierRequest;
import cloud.artik.model.DevicePricingTiersEnvelope;
import cloud.artik.model.DeviceTypePricingTier;
import cloud.artik.model.DeviceTypePricingTiersEnvelope;
import cloud.artik.model.UpgradePathEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MonetizationApi
 */
public class MonetizationApiTest {

    private MonetizationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MonetizationApi.class);
    }

    
    /**
     * Define devicetype&#39;s pricing tiers.
     *
     * Define devicetype&#39;s pricing tiers.
     */
    @Test
    public void createPricingTiersTest() {
        String dtid = null;
        DeviceTypePricingTier pricingTierInfo = null;
        // DeviceTypePricingTier response = api.createPricingTiers(dtid, pricingTierInfo);

        // TODO: test validations
    }
    
    /**
     * Get a device&#39;s pricing tiers
     *
     * Get a device&#39;s pricing tiers
     */
    @Test
    public void getPricingTiersTest() {
        String did = null;
        Boolean active = null;
        // DevicePricingTiersEnvelope response = api.getPricingTiers(did, active);

        // TODO: test validations
    }
    
    /**
     * Get devicetype&#39;s pricing tiers.
     *
     * Get devicetype&#39;s pricing tiers.
     */
    @Test
    public void getThePricingTiersTest() {
        String dtid = null;
        Integer version = null;
        // DeviceTypePricingTiersEnvelope response = api.getThePricingTiers(dtid, version);

        // TODO: test validations
    }
    
    /**
     * Get upgrade path
     *
     * Get upgrade path
     */
    @Test
    public void getUpgradePathTest() {
        String did = null;
        String action = null;
        // UpgradePathEnvelope response = api.getUpgradePath(did, action);

        // TODO: test validations
    }
    
    /**
     * Set a device&#39;s pricing tier
     *
     * Set a device&#39;s pricing tier
     */
    @Test
    public void setPricingTierTest() {
        String did = null;
        DevicePricingTierRequest pricingTier = null;
        // DevicePricingTierEnvelope response = api.setPricingTier(did, pricingTier);

        // TODO: test validations
    }
    
}
