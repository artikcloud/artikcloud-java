/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Export Normalized Messages Response.
 */
@ApiModel(description = "Export Normalized Messages Response.")

public class ExportNormalizedMessagesResponse {
  @SerializedName("csvHeaders")
  private Boolean csvHeaders = null;

  @SerializedName("endDate")
  private Long endDate = null;

  @SerializedName("exportId")
  private String exportId = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("order")
  private String order = null;

  @SerializedName("sdid")
  private String sdid = null;

  @SerializedName("sdids")
  private String sdids = null;

  @SerializedName("startDate")
  private Long startDate = null;

  @SerializedName("stdids")
  private String stdids = null;

  @SerializedName("trialId")
  private String trialId = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("uids")
  private String uids = null;

  @SerializedName("url")
  private String url = null;

  public ExportNormalizedMessagesResponse csvHeaders(Boolean csvHeaders) {
    this.csvHeaders = csvHeaders;
    return this;
  }

   /**
   * Get csvHeaders
   * @return csvHeaders
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCsvHeaders() {
    return csvHeaders;
  }

  public void setCsvHeaders(Boolean csvHeaders) {
    this.csvHeaders = csvHeaders;
  }

  public ExportNormalizedMessagesResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public ExportNormalizedMessagesResponse exportId(String exportId) {
    this.exportId = exportId;
    return this;
  }

   /**
   * Get exportId
   * @return exportId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExportId() {
    return exportId;
  }

  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  public ExportNormalizedMessagesResponse format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ExportNormalizedMessagesResponse order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public ExportNormalizedMessagesResponse sdid(String sdid) {
    this.sdid = sdid;
    return this;
  }

   /**
   * Get sdid
   * @return sdid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSdid() {
    return sdid;
  }

  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  public ExportNormalizedMessagesResponse sdids(String sdids) {
    this.sdids = sdids;
    return this;
  }

   /**
   * Get sdids
   * @return sdids
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSdids() {
    return sdids;
  }

  public void setSdids(String sdids) {
    this.sdids = sdids;
  }

  public ExportNormalizedMessagesResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public ExportNormalizedMessagesResponse stdids(String stdids) {
    this.stdids = stdids;
    return this;
  }

   /**
   * Get stdids
   * @return stdids
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStdids() {
    return stdids;
  }

  public void setStdids(String stdids) {
    this.stdids = stdids;
  }

  public ExportNormalizedMessagesResponse trialId(String trialId) {
    this.trialId = trialId;
    return this;
  }

   /**
   * Get trialId
   * @return trialId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTrialId() {
    return trialId;
  }

  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  public ExportNormalizedMessagesResponse uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public ExportNormalizedMessagesResponse uids(String uids) {
    this.uids = uids;
    return this;
  }

   /**
   * Get uids
   * @return uids
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUids() {
    return uids;
  }

  public void setUids(String uids) {
    this.uids = uids;
  }

  public ExportNormalizedMessagesResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportNormalizedMessagesResponse exportNormalizedMessagesResponse = (ExportNormalizedMessagesResponse) o;
    return Objects.equals(this.csvHeaders, exportNormalizedMessagesResponse.csvHeaders) &&
        Objects.equals(this.endDate, exportNormalizedMessagesResponse.endDate) &&
        Objects.equals(this.exportId, exportNormalizedMessagesResponse.exportId) &&
        Objects.equals(this.format, exportNormalizedMessagesResponse.format) &&
        Objects.equals(this.order, exportNormalizedMessagesResponse.order) &&
        Objects.equals(this.sdid, exportNormalizedMessagesResponse.sdid) &&
        Objects.equals(this.sdids, exportNormalizedMessagesResponse.sdids) &&
        Objects.equals(this.startDate, exportNormalizedMessagesResponse.startDate) &&
        Objects.equals(this.stdids, exportNormalizedMessagesResponse.stdids) &&
        Objects.equals(this.trialId, exportNormalizedMessagesResponse.trialId) &&
        Objects.equals(this.uid, exportNormalizedMessagesResponse.uid) &&
        Objects.equals(this.uids, exportNormalizedMessagesResponse.uids) &&
        Objects.equals(this.url, exportNormalizedMessagesResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csvHeaders, endDate, exportId, format, order, sdid, sdids, startDate, stdids, trialId, uid, uids, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportNormalizedMessagesResponse {\n");
    
    sb.append("    csvHeaders: ").append(toIndentedString(csvHeaders)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    sdids: ").append(toIndentedString(sdids)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    stdids: ").append(toIndentedString(stdids)).append("\n");
    sb.append("    trialId: ").append(toIndentedString(trialId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    uids: ").append(toIndentedString(uids)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

