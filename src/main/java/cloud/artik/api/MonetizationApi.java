package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.DevicePricingTierEnvelope;
import cloud.artik.model.DevicePricingTierRequest;
import cloud.artik.model.DevicePricingTiersEnvelope;
import cloud.artik.model.DeviceTypePricingTier;
import cloud.artik.model.DeviceTypePricingTiersEnvelope;
import cloud.artik.model.UpgradePathEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MonetizationApi {
  /**
   * Define devicetype&#39;s pricing tiers.
   * Define devicetype&#39;s pricing tiers.
   * @param dtid DeviceType ID (required)
   * @param pricingTierInfo Pricing tier info (required)
   * @return Call&lt;DeviceTypePricingTier&gt;
   */
  
  @POST("pricing/devicetypes/{dtid}/pricingtiers")
  Call<DeviceTypePricingTier> createPricingTiers(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Body DeviceTypePricingTier pricingTierInfo
  );

  /**
   * Get a device&#39;s pricing tiers
   * Get a device&#39;s pricing tiers
   * @param did Device ID (required)
   * @param active Filter by active (optional)
   * @return Call&lt;DevicePricingTiersEnvelope&gt;
   */
  
  @GET("pricing/devices/{did}/pricingtiers")
  Call<DevicePricingTiersEnvelope> getPricingTiers(
    @retrofit2.http.Path("did") String did, @retrofit2.http.Query("active") Boolean active
  );

  /**
   * Get devicetype&#39;s pricing tiers.
   * Get devicetype&#39;s pricing tiers.
   * @param dtid DeviceType ID (required)
   * @param version Version (required)
   * @return Call&lt;DeviceTypePricingTiersEnvelope&gt;
   */
  
  @GET("pricing/devicetypes/{dtid}/pricingtiers")
  Call<DeviceTypePricingTiersEnvelope> getThePricingTiers(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Path("version") Integer version
  );

  /**
   * Get upgrade path
   * Get upgrade path
   * @param did Device ID (required)
   * @param action Action to perform (required)
   * @return Call&lt;UpgradePathEnvelope&gt;
   */
  
  @GET("pricing/devices/{did}/revenueshare/upgradepath")
  Call<UpgradePathEnvelope> getUpgradePath(
    @retrofit2.http.Path("did") String did, @retrofit2.http.Path("action") String action
  );

  /**
   * Set a device&#39;s pricing tier
   * Set a device&#39;s pricing tier
   * @param did Device ID (required)
   * @param pricingTier Pricing tier (required)
   * @return Call&lt;DevicePricingTierEnvelope&gt;
   */
  
  @PUT("pricing/devices/{did}/pricingtiers")
  Call<DevicePricingTierEnvelope> setPricingTier(
    @retrofit2.http.Path("did") String did, @retrofit2.http.Body DevicePricingTierRequest pricingTier
  );

}
