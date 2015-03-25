package io.samsungsami.model;

import java.math.BigDecimal;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class RawMessage  {
  
  private BigDecimal cts = null;
  private BigDecimal ts = null;
  private String mid = null;
  private String sdid = null;
  private String data = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cts")
  public BigDecimal getCts() {
    return cts;
  }
  public void setCts(BigDecimal cts) {
    this.cts = cts;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ts")
  public BigDecimal getTs() {
    return ts;
  }
  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mid")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sdid")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawMessage {\n");
    
    sb.append("  cts: ").append(cts).append("\n");
    sb.append("  ts: ").append(ts).append("\n");
    sb.append("  mid: ").append(mid).append("\n");
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
