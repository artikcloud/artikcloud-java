package io.samsungsami.api;

import io.samsungsami.client.ApiException;
import io.samsungsami.client.ApiInvoker;

import io.samsungsami.model.*;

import java.util.*;

import io.samsungsami.model.ExportRequestInfo;
import io.samsungsami.model.ExportRequestResponse;
import io.samsungsami.model.ExportHistoryResponse;
import io.samsungsami.model.ExportStatusResponse;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ExportApi {
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

  
  
  public ExportRequestResponse  exportRequest (ExportRequestInfo exportRequestInfo) throws ApiException {
    Object postBody = exportRequestInfo;

    

    // create path and map variables
    String path = "/messages/export".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (ExportRequestResponse) ApiInvoker.deserialize(response, "", ExportRequestResponse.class);
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
  
  
  public ExportHistoryResponse  getExportHistory (String trialId, Integer count, Integer offset) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages/export/history".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(trialId)))
      queryParams.put("trialId", String.valueOf(trialId));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (ExportHistoryResponse) ApiInvoker.deserialize(response, "", ExportHistoryResponse.class);
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
  
  
  public String  getExportResult (String exportId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages/export/{exportId}/result".replaceAll("\\{format\\}","json").replaceAll("\\{" + "exportId" + "\\}", apiInvoker.escapeString(exportId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  
  
  public ExportStatusResponse  getExportStatus (String exportId) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages/export/{exportId}/status".replaceAll("\\{format\\}","json").replaceAll("\\{" + "exportId" + "\\}", apiInvoker.escapeString(exportId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (ExportStatusResponse) ApiInvoker.deserialize(response, "", ExportStatusResponse.class);
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
