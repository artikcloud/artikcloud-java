package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ExportRequest  {
  
  private Long endDate = null;
  private String format = null;
  private String order = null;
  private String sdids = null;
  private String sdtids = null;
  private Long startDate = null;
  private String trialId = null;
  private String uids = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("sdids")
  public String getSdids() {
    return sdids;
  }
  public void setSdids(String sdids) {
    this.sdids = sdids;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("sdtids")
  public String getSdtids() {
    return sdtids;
  }
  public void setSdtids(String sdtids) {
    this.sdtids = sdtids;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("trialId")
  public String getTrialId() {
    return trialId;
  }
  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("uids")
  public String getUids() {
    return uids;
  }
  public void setUids(String uids) {
    this.uids = uids;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportRequest {\n");
    
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  sdids: ").append(sdids).append("\n");
    sb.append("  sdtids: ").append(sdtids).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  trialId: ").append(trialId).append("\n");
    sb.append("  uids: ").append(uids).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
