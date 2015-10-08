package io.samsungsami.websocket;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * 
 **/
@ApiModel(description = "SAMI Message OUT")
public class MessageOut  extends MessageIn {
  
  private String mid = null; 
  private String uid = null;
  private String sdtid = null;
  private BigDecimal cts = null;
  private Integer mv = null;

  
  /**
   * Message ID.
   **/
  @ApiModelProperty(required = false, value = "Message ID.")
  @JsonProperty("mid")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
  }  
  
  /**
   * User ID.
   **/
  @ApiModelProperty(required = false, value = "User ID.")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }
  
  /**
   * Source Device Type ID.
   **/
  @ApiModelProperty(required = false, value = "Source Device Type ID.")
  @JsonProperty("sdtid")
  public String getSdtid() {
    return sdtid;
  }
  public void setSdtid(String sdtid) {
    this.sdtid = sdtid;
  }  
  
  /**
   * Created Timestamp .
   **/
  @ApiModelProperty(required = false, value = "Created Timestamp (past, present or future). ")
  @JsonProperty("cts")
  public BigDecimal getCts() {
    return cts;
  }
  public void setCts(BigDecimal cts) {
    this.cts = cts;
  }  
  
  /**
   * Manifest Version.
   **/
  @ApiModelProperty(required = false, value = "Manifest version.")
  @JsonProperty("mv")
  public Integer getMv() {
    return mv;
  }
  public void setMv(Integer mv) {
    this.mv = mv;
  }  
  
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageOut {\n");
    
    sb.append("  mid:   ").append(mid).append("\n");
    sb.append("  uid:   ").append(uid).append("\n");
    sb.append("  ddid:  ").append(super.getDdid()).append("\n");
    sb.append("  sdid:  ").append(super.getSdid()).append("\n");
    sb.append("  sdtid: ").append(sdtid).append("\n");
    sb.append("  mv:    ").append(mv).append("\n");
    sb.append("  data:  ").append(super.getData()).append("\n");
    sb.append("  ts:    ").append(super.getTs()).append("\n");    
    sb.append("  cts:   ").append(cts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
