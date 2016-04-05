package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Export Normalized Messages Response.
 **/
@ApiModel(description = "Export Normalized Messages Response.")
public class ExportNormalizedMessagesResponse   {
  
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
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCsvHeaders() {
    return csvHeaders;
  }
  public void setCsvHeaders(Boolean csvHeaders) {
    this.csvHeaders = csvHeaders;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getExportId() {
    return exportId;
  }
  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSdids() {
    return sdids;
  }
  public void setSdids(String sdids) {
    this.sdids = sdids;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getStdids() {
    return stdids;
  }
  public void setStdids(String stdids) {
    this.stdids = stdids;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrialId() {
    return trialId;
  }
  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUids() {
    return uids;
  }
  public void setUids(String uids) {
    this.uids = uids;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
