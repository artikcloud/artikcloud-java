package io.samsungsami.model;

import java.util.Map;
import java.math.BigDecimal;
import java.util.*;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class Message  { 
  private String sdid = null;
  private String ddid = null;
  private BigDecimal ts = null;
  
  //public enum tsEnum {  }; 
  
  private String token = null;
  private Map<String, Object> data = new HashMap<String, Object>() ;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDdid() {
    return ddid;
  }
  public void setDdid(String ddid) {
    this.ddid = ddid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public BigDecimal getTs() {
    return ts;
  }
  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, Object> getData() {
    return data;
  }
  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  ddid: ").append(ddid).append("\n");
    sb.append("  ts: ").append(ts).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
