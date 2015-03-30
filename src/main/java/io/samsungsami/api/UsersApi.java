package io.samsungsami.api;

import io.samsungsami.client.ApiException;
import io.samsungsami.client.ApiInvoker;

import io.samsungsami.model.*;

import java.util.*;

import io.samsungsami.model.DeviceTypesEnvelope;
import io.samsungsami.model.UserEnvelope;
import io.samsungsami.model.PropertiesEnvelope;
import io.samsungsami.model.AppProperties;
import io.samsungsami.model.DevicesEnvelope;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class UsersApi {
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

  
  
  public UserEnvelope  self () throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/users/self".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (UserEnvelope) ApiInvoker.deserialize(response, "", UserEnvelope.class);
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
  
  
  public DevicesEnvelope  getUserDevices (Integer offset, Integer count, Boolean includeProperties, String userId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/users/{userId}/devices".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(includeProperties)))
      queryParams.put("includeProperties", String.valueOf(includeProperties));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (DevicesEnvelope) ApiInvoker.deserialize(response, "", DevicesEnvelope.class);
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
  
  
  public DeviceTypesEnvelope  getUserDeviceTypes (Integer offset, Integer count, Boolean includeShared, String userId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/users/{userId}/devicetypes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(includeShared)))
      queryParams.put("includeShared", String.valueOf(includeShared));
    

    

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
  
  
  public PropertiesEnvelope  getUserProperties (String userId, String aid) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/users/{userId}/properties".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(aid)))
      queryParams.put("aid", String.valueOf(aid));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (PropertiesEnvelope) ApiInvoker.deserialize(response, "", PropertiesEnvelope.class);
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
  
  
  public PropertiesEnvelope  updateUserProperties (String userId, String aid, AppProperties properties) throws ApiException {
    Object postBody = properties;

    

    // create path and map variables
    String path = "/users/{userId}/properties".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(aid)))
      queryParams.put("aid", String.valueOf(aid));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (PropertiesEnvelope) ApiInvoker.deserialize(response, "", PropertiesEnvelope.class);
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
  
  
  public PropertiesEnvelope  createUserProperties (String userId, String aid, AppProperties properties) throws ApiException {
    Object postBody = properties;

    

    // create path and map variables
    String path = "/users/{userId}/properties".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(aid)))
      queryParams.put("aid", String.valueOf(aid));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (PropertiesEnvelope) ApiInvoker.deserialize(response, "", PropertiesEnvelope.class);
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
  
  
  public PropertiesEnvelope  deleteUserProperties (String userId, String aid) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/users/{userId}/properties".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(aid)))
      queryParams.put("aid", String.valueOf(aid));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (PropertiesEnvelope) ApiInvoker.deserialize(response, "", PropertiesEnvelope.class);
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
