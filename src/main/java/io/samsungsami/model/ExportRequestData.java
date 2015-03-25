package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ExportRequestData  {
  
  private Boolean csvHeaders = null;
  private Long endDate = null;
  private String exportId = null;
  private String format = null;
  private String order = null;
  private String sdids = null;
  private String sdtids = null;
  private Long startDate = null;
  private String trialId = null;
  private String uids = null;
  private String url = null;

  
  /**
   * Add header to csv format
   **/
  @ApiModelProperty(required = false, value = "Add header to csv format")
  @JsonProperty("csvHeaders")
  public Boolean getCsvHeaders() {
    return csvHeaders;
  }
  public void setCsvHeaders(Boolean csvHeaders) {
    this.csvHeaders = csvHeaders;
  }

  
  /**
   * Timestamp of latest message (in milliseconds since epoch).
   **/
  @ApiModelProperty(required = false, value = "Timestamp of latest message (in milliseconds since epoch).")
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   * Returned Export ID that should be used to check status and get the export result.
   **/
  @ApiModelProperty(required = false, value = "Returned Export ID that should be used to check status and get the export result.")
  @JsonProperty("exportId")
  public String getExportId() {
    return exportId;
  }
  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  
  /**
   * Format of the export.
   **/
  @ApiModelProperty(required = false, value = "Format of the export.")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   * Ascending or descending sort order.
   **/
  @ApiModelProperty(required = false, value = "Ascending or descending sort order.")
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   * Source Device IDs being searched for messages (Comma-separated for multiple Device IDs).
   **/
  @ApiModelProperty(required = false, value = "Source Device IDs being searched for messages (Comma-separated for multiple Device IDs).")
  @JsonProperty("sdids")
  public String getSdids() {
    return sdids;
  }
  public void setSdids(String sdids) {
    this.sdids = sdids;
  }

  
  /**
   * Source Device Type IDs being searched for messages (Comma-separated for multiple Device Type IDs).
   **/
  @ApiModelProperty(required = false, value = "Source Device Type IDs being searched for messages (Comma-separated for multiple Device Type IDs).")
  @JsonProperty("sdtids")
  public String getSdtids() {
    return sdtids;
  }
  public void setSdtids(String sdtids) {
    this.sdtids = sdtids;
  }

  
  /**
   * Timestamp of earliest message (in milliseconds since epoch).
   **/
  @ApiModelProperty(required = false, value = "Timestamp of earliest message (in milliseconds since epoch).")
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Trial ID being searched for messages.
   **/
  @ApiModelProperty(required = false, value = "Trial ID being searched for messages.")
  @JsonProperty("trialId")
  public String getTrialId() {
    return trialId;
  }
  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  
  /**
   * Owner's user IDs being searched for messages (Comma-separated for multiple User IDs).
   **/
  @ApiModelProperty(required = false, value = "Owner's user IDs being searched for messages (Comma-separated for multiple User IDs).")
  @JsonProperty("uids")
  public String getUids() {
    return uids;
  }
  public void setUids(String uids) {
    this.uids = uids;
  }

  
  /**
   * URL added to successful email message.
   **/
  @ApiModelProperty(required = false, value = "URL added to successful email message.")
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
    sb.append("class ExportRequestData {\n");
    
    sb.append("  csvHeaders: ").append(csvHeaders).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  exportId: ").append(exportId).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  sdids: ").append(sdids).append("\n");
    sb.append("  sdtids: ").append(sdtids).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  trialId: ").append(trialId).append("\n");
    sb.append("  uids: ").append(uids).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
