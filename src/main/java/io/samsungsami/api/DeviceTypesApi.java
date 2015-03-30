package io.samsungsami.api;

import io.samsungsami.client.ApiException;
import io.samsungsami.client.ApiInvoker;

import io.samsungsami.model.*;

import java.util.*;

import io.samsungsami.model.DeviceTypesEnvelope;
import io.samsungsami.model.ManifestVersionsEnvelope;
import io.samsungsami.model.DeviceTypeEnvelope;
import io.samsungsami.model.ManifestPropertiesEnvelope;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DeviceTypesApi {
  String basePath = "https://api.samsungsami.io/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  
  public DeviceTypesEnvelope  getDeviceTypes (String name, Integer offset, Integer count) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devicetypes".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceTypesEnvelope) ApiInvoker.deserialize(response, "", DeviceTypesEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public DeviceTypeEnvelope  getDeviceType (String deviceTypeId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devicetypes/{deviceTypeId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceTypeId" + "\\}", apiInvoker.escapeString(deviceTypeId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceTypeEnvelope) ApiInvoker.deserialize(response, "", DeviceTypeEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public ManifestVersionsEnvelope  getAvailableManifestVersions (String deviceTypeId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devicetypes/{deviceTypeId}/availablemanifestversions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceTypeId" + "\\}", apiInvoker.escapeString(deviceTypeId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (ManifestVersionsEnvelope) ApiInvoker.deserialize(response, "", ManifestVersionsEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public ManifestPropertiesEnvelope  getLatestManifestProperties (String deviceTypeId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devicetypes/{deviceTypeId}/manifests/latest/properties".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceTypeId" + "\\}", apiInvoker.escapeString(deviceTypeId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (ManifestPropertiesEnvelope) ApiInvoker.deserialize(response, "", ManifestPropertiesEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
  
  public ManifestPropertiesEnvelope  getManifestProperties (String deviceTypeId, String version) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devicetypes/{deviceTypeId}/manifests/{version}/properties".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceTypeId" + "\\}", apiInvoker.escapeString(deviceTypeId.toString())).replaceAll("\\{" + "version" + "\\}", apiInvoker.escapeString(version.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (ManifestPropertiesEnvelope) ApiInvoker.deserialize(response, "", ManifestPropertiesEnvelope.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return  null;
      }
      else {
        throw ex;
      }
    }
  }
  
}
