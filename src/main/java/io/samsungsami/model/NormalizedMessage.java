package io.samsungsami.model;

import java.util.Map;
import java.math.BigDecimal;
import java.util.*;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class NormalizedMessage  { 
  private BigDecimal cts = null;
  
  //public enum ctsEnum {  }; 
  
  private BigDecimal ts = null;
  
  //public enum tsEnum {  }; 
  
  private String mid = null;
  private String sdid = null;
  private String sdtid = null;
  private String uid = null;
  private BigDecimal mv = null;
  
  //public enum mvEnum {  }; 
  
  private Map<String, Object> data = new HashMap<String, Object>() ;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getCts() {
    return cts;
  }
  public void setCts(BigDecimal cts) {
    this.cts = cts;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTs() {
    return ts;
  }
  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
  }

  
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
  @ApiModelProperty(required = true, value = "")
  public String getSdtid() {
    return sdtid;
  }
  public void setSdtid(String sdtid) {
    this.sdtid = sdtid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMv() {
    return mv;
  }
  public void setMv(BigDecimal mv) {
    this.mv = mv;
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
    sb.append("class NormalizedMessage {\n");
    
    sb.append("  cts: ").append(cts).append("\n");
    sb.append("  ts: ").append(ts).append("\n");
    sb.append("  mid: ").append(mid).append("\n");
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  sdtid: ").append(sdtid).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  mv: ").append(mv).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
