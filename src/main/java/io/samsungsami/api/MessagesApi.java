package io.samsungsami.api;

import io.samsungsami.client.ApiException;
import io.samsungsami.client.ApiInvoker;

import io.samsungsami.model.*;

import java.util.*;

import io.samsungsami.model.RawMessagesEnvelope;
import io.samsungsami.model.FieldPresenceEnvelope;
import io.samsungsami.model.ExportEnvelope;
import io.samsungsami.model.AggregatesEnvelope;
import io.samsungsami.model.NormalizedMessagesEnvelope;
import io.samsungsami.model.Message;
import io.samsungsami.model.MessageIDEnvelope;
import io.samsungsami.model.ExportStatusEnvelope;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class MessagesApi {
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

  
  
  public NormalizedMessagesEnvelope  getNormalizedMessages (String uid, String sdid, String mid, String fieldPresence, String filter, String offset, Integer count, Long startDate, Long endDate, String order) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(uid)))
      queryParams.put("uid", String.valueOf(uid));
    if(!"null".equals(String.valueOf(sdid)))
      queryParams.put("sdid", String.valueOf(sdid));
    if(!"null".equals(String.valueOf(mid)))
      queryParams.put("mid", String.valueOf(mid));
    if(!"null".equals(String.valueOf(fieldPresence)))
      queryParams.put("fieldPresence", String.valueOf(fieldPresence));
    if(!"null".equals(String.valueOf(filter)))
      queryParams.put("filter", String.valueOf(filter));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(startDate)))
      queryParams.put("startDate", String.valueOf(startDate));
    if(!"null".equals(String.valueOf(endDate)))
      queryParams.put("endDate", String.valueOf(endDate));
    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (NormalizedMessagesEnvelope) ApiInvoker.deserialize(response, "", NormalizedMessagesEnvelope.class);
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
  
  
  public MessageIDEnvelope  postMessage (Message message) throws ApiException {
    Object postBody = message;

    

    // create path and map variables
    String path = "/messages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (MessageIDEnvelope) ApiInvoker.deserialize(response, "", MessageIDEnvelope.class);
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
  
  
  public AggregatesEnvelope  getMessageAggregates (String sdid, String field, Long startDate, Long endDate) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages/analytics/aggregates".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(sdid)))
      queryParams.put("sdid", String.valueOf(sdid));
    if(!"null".equals(String.valueOf(field)))
      queryParams.put("field", String.valueOf(field));
    if(!"null".equals(String.valueOf(startDate)))
      queryParams.put("startDate", String.valueOf(startDate));
    if(!"null".equals(String.valueOf(endDate)))
      queryParams.put("endDate", String.valueOf(endDate));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (AggregatesEnvelope) ApiInvoker.deserialize(response, "", AggregatesEnvelope.class);
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
  
  
  public ExportEnvelope  exportNormalizedMessages (String uid, String sdid, Long startDate, Long endDate, String order, String format) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages/export".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(uid)))
      queryParams.put("uid", String.valueOf(uid));
    if(!"null".equals(String.valueOf(sdid)))
      queryParams.put("sdid", String.valueOf(sdid));
    if(!"null".equals(String.valueOf(startDate)))
      queryParams.put("startDate", String.valueOf(startDate));
    if(!"null".equals(String.valueOf(endDate)))
      queryParams.put("endDate", String.valueOf(endDate));
    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    if(!"null".equals(String.valueOf(format)))
      queryParams.put("format", String.valueOf(format));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (ExportEnvelope) ApiInvoker.deserialize(response, "", ExportEnvelope.class);
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
  
  
  public ExportStatusEnvelope  checkExportStatus (String exportId) throws ApiException {
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
        return (ExportStatusEnvelope) ApiInvoker.deserialize(response, "", ExportStatusEnvelope.class);
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
  
  
  public NormalizedMessagesEnvelope  getLastNormalizedMessages (Integer count, String sdids, String field) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages/last".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(sdids)))
      queryParams.put("sdids", String.valueOf(sdids));
    if(!"null".equals(String.valueOf(field)))
      queryParams.put("field", String.valueOf(field));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (NormalizedMessagesEnvelope) ApiInvoker.deserialize(response, "", NormalizedMessagesEnvelope.class);
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
  
  
  public FieldPresenceEnvelope  getFieldPresence (String sdid, String fieldPresence, Long startDate, Long endDate, String interval) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages/presence".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(sdid)))
      queryParams.put("sdid", String.valueOf(sdid));
    if(!"null".equals(String.valueOf(fieldPresence)))
      queryParams.put("fieldPresence", String.valueOf(fieldPresence));
    if(!"null".equals(String.valueOf(startDate)))
      queryParams.put("startDate", String.valueOf(startDate));
    if(!"null".equals(String.valueOf(endDate)))
      queryParams.put("endDate", String.valueOf(endDate));
    if(!"null".equals(String.valueOf(interval)))
      queryParams.put("interval", String.valueOf(interval));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (FieldPresenceEnvelope) ApiInvoker.deserialize(response, "", FieldPresenceEnvelope.class);
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
  
  
  public RawMessagesEnvelope  getRawMessages (String sdid, String offset, Integer count, Long startDate, Long endDate, String order) throws ApiException {
    Object postBody = null;

    

    // create path and map variables
    String path = "/messages/raw".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(sdid)))
      queryParams.put("sdid", String.valueOf(sdid));
    if(!"null".equals(String.valueOf(offset)))
      queryParams.put("offset", String.valueOf(offset));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(startDate)))
      queryParams.put("startDate", String.valueOf(startDate));
    if(!"null".equals(String.valueOf(endDate)))
      queryParams.put("endDate", String.valueOf(endDate));
    if(!"null".equals(String.valueOf(order)))
      queryParams.put("order", String.valueOf(order));
    

    

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (RawMessagesEnvelope) ApiInvoker.deserialize(response, "", RawMessagesEnvelope.class);
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
