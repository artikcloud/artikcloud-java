package io.samsungsami.model;

import java.util.Map;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class SendMessageActionInfo  {
  
  private Map<String, Object> data = new HashMap<String, Object>() ;
  private String ddid = null;
  private String sdid = null;
  private Long ts = null;
  private String type = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("data")
  public Map<String, Object> getData() {
    return data;
  }
  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  
  /**
   * Destination Device ID.
   **/
  @ApiModelProperty(required = false, value = "Destination Device ID.")
  @JsonProperty("ddid")
  public String getDdid() {
    return ddid;
  }
  public void setDdid(String ddid) {
    this.ddid = ddid;
  }

  
  /**
   * Source Device ID.
   **/
  @ApiModelProperty(required = false, value = "Source Device ID.")
  @JsonProperty("sdid")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   * Timestamp (past, present or future). Defaults to current time if not provided.
   **/
  @ApiModelProperty(required = false, value = "Timestamp (past, present or future). Defaults to current time if not provided.")
  @JsonProperty("ts")
  public Long getTs() {
    return ts;
  }
  public void setTs(Long ts) {
    this.ts = ts;
  }

  
  /**
   * Type.
   **/
  @ApiModelProperty(required = false, value = "Type.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageActionInfo {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  ddid: ").append(ddid).append("\n");
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  ts: ").append(ts).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
