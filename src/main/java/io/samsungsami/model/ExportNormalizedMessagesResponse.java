package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ExportNormalizedMessagesResponse  {
  
  private Boolean csvHeaders = null;
  private Long endDate = null;
  private String exportId = null;
  private String format = null;
  private String order = null;
  private String sdid = null;
  private String sdids = null;
  private Long startDate = null;
  private String stdids = null;
  private String trialId = null;
  private String uid = null;
  private String uids = null;
  private String url = null;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("csvHeaders")
  public Boolean getCsvHeaders() {
    return csvHeaders;
  }
  public void setCsvHeaders(Boolean csvHeaders) {
    this.csvHeaders = csvHeaders;
  }

  
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
  @JsonProperty("exportId")
  public String getExportId() {
    return exportId;
  }
  public void setExportId(String exportId) {
    this.exportId = exportId;
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
  @JsonProperty("sdid")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
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
  @JsonProperty("stdids")
  public String getStdids() {
    return stdids;
  }
  public void setStdids(String stdids) {
    this.stdids = stdids;
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
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
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

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportNormalizedMessagesResponse {\n");
    
    sb.append("  csvHeaders: ").append(csvHeaders).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  exportId: ").append(exportId).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  sdid: ").append(sdid).append("\n");
    sb.append("  sdids: ").append(sdids).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  stdids: ").append(stdids).append("\n");
    sb.append("  trialId: ").append(trialId).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  uids: ").append(uids).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
