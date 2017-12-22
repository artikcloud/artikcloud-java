package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.DeviceTypeEnvelope;
import cloud.artik.model.DeviceTypesEnvelope;
import cloud.artik.model.ManifestPropertiesEnvelope;
import cloud.artik.model.ManifestVersionsEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DeviceTypesApi {
  /**
   * Get Available Manifest Versions
   * Get a Device Type&#39;s available manifest versions
   * @param deviceTypeId deviceTypeId (required)
   * @return Call&lt;ManifestVersionsEnvelope&gt;
   */
  
  @GET("devicetypes/{deviceTypeId}/availablemanifestversions")
  Call<ManifestVersionsEnvelope> getAvailableManifestVersions(
    @retrofit2.http.Path("deviceTypeId") String deviceTypeId
  );

  /**
   * Get Device Type
   * Retrieves a Device Type
   * @param deviceTypeId deviceTypeId (required)
   * @return Call&lt;DeviceTypeEnvelope&gt;
   */
  
  @GET("devicetypes/{deviceTypeId}")
  Call<DeviceTypeEnvelope> getDeviceType(
    @retrofit2.http.Path("deviceTypeId") String deviceTypeId
  );

  /**
   * Get Device Types
   * Retrieves Device Types
   * @param name Device Type name (required)
   * @param offset Offset for pagination. (optional)
   * @param count Desired count of items in the result set (optional)
   * @param tags Elements tagged with the list of tags. (comma separated) (optional)
   * @return Call&lt;DeviceTypesEnvelope&gt;
   */
  
  @GET("devicetypes")
  Call<DeviceTypesEnvelope> getDeviceTypes(
    @retrofit2.http.Query("name") String name, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("tags") String tags
  );

  /**
   * Get Device Types by Application
   * Get Device Types by Application
   * @param appId Application ID. (required)
   * @param productInfo Flag to include the associated ProductInfo if present (optional)
   * @param count Desired count of items in the result set. (optional)
   * @param offset Offset for pagination. (optional)
   * @return Call&lt;DeviceTypesEnvelope&gt;
   */
  
  @GET("applications/{appId}/devicetypes")
  Call<DeviceTypesEnvelope> getDeviceTypesByApplication(
    @retrofit2.http.Path("appId") String appId, @retrofit2.http.Query("productInfo") Boolean productInfo, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get Latest Manifest Properties
   * Get a Device Type&#39;s manifest properties for the latest version.
   * @param deviceTypeId Device Type ID. (required)
   * @return Call&lt;ManifestPropertiesEnvelope&gt;
   */
  
  @GET("devicetypes/{deviceTypeId}/manifests/latest/properties")
  Call<ManifestPropertiesEnvelope> getLatestManifestProperties(
    @retrofit2.http.Path("deviceTypeId") String deviceTypeId
  );

  /**
   * Get manifest properties
   * Get a Device Type&#39;s manifest properties for a specific version.
   * @param deviceTypeId Device Type ID. (required)
   * @param version Manifest Version. (required)
   * @return Call&lt;ManifestPropertiesEnvelope&gt;
   */
  
  @GET("devicetypes/{deviceTypeId}/manifests/{version}/properties")
  Call<ManifestPropertiesEnvelope> getManifestProperties(
    @retrofit2.http.Path("deviceTypeId") String deviceTypeId, @retrofit2.http.Path("version") String version
  );

}
