package io.samsungsami.api;

import io.samsungsami.client.ApiException;
import io.samsungsami.client.ApiInvoker;

import io.samsungsami.model.*;

import java.util.*;

import io.samsungsami.model.DeviceTokenEnvelope;
import io.samsungsami.model.Device;
import io.samsungsami.model.DeviceEnvelope;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DevicesApi {
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

  
  
  public DeviceEnvelope  addDevice (Device device) throws ApiException {
    Object postBody = device;

    

    // create path and map variables
    String path = "/devices".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceEnvelope) ApiInvoker.deserialize(response, "", DeviceEnvelope.class);
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
  
  
  public DeviceEnvelope  getDevice (String deviceId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devices/{deviceId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceId" + "\\}", apiInvoker.escapeString(deviceId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceEnvelope) ApiInvoker.deserialize(response, "", DeviceEnvelope.class);
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
  
  
  public DeviceEnvelope  updateDevice (String deviceId, Device device) throws ApiException {
    Object postBody = device;

    

    // create path and map variables
    String path = "/devices/{deviceId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceId" + "\\}", apiInvoker.escapeString(deviceId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceEnvelope) ApiInvoker.deserialize(response, "", DeviceEnvelope.class);
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
  
  
  public DeviceEnvelope  deleteDevice (String deviceId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devices/{deviceId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceId" + "\\}", apiInvoker.escapeString(deviceId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceEnvelope) ApiInvoker.deserialize(response, "", DeviceEnvelope.class);
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
  
  
  public DeviceTokenEnvelope  getDeviceToken (String deviceId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devices/{deviceId}/tokens".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceId" + "\\}", apiInvoker.escapeString(deviceId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceTokenEnvelope) ApiInvoker.deserialize(response, "", DeviceTokenEnvelope.class);
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
  
  
  public DeviceTokenEnvelope  updateDeviceToken (String deviceId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devices/{deviceId}/tokens".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceId" + "\\}", apiInvoker.escapeString(deviceId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceTokenEnvelope) ApiInvoker.deserialize(response, "", DeviceTokenEnvelope.class);
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
  
  
  public DeviceTokenEnvelope  deleteDeviceToken (String deviceId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/devices/{deviceId}/tokens".replaceAll("\\{format\\}","json").replaceAll("\\{" + "deviceId" + "\\}", apiInvoker.escapeString(deviceId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DeviceTokenEnvelope) ApiInvoker.deserialize(response, "", DeviceTokenEnvelope.class);
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
