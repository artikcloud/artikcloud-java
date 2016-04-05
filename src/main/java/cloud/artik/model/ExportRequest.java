package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Export Request.
 **/
@ApiModel(description = "Export Request.")
public class ExportRequest   {
  
  @SerializedName("endDate")
  private Long endDate = null;
  
  @SerializedName("format")
  private String format = null;
  
  @SerializedName("order")
  private String order = null;
  
  @SerializedName("sdids")
  private String sdids = null;
  
  @SerializedName("sdtids")
  private String sdtids = null;
  
  @SerializedName("startDate")
  private Long startDate = null;
  
  @SerializedName("trialId")
  private String trialId = null;
  
  @SerializedName("uids")
  private String uids = null;
  

  
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
  public String getSdids() {
    return sdids;
  }
  public void setSdids(String sdids) {
    this.sdids = sdids;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSdtids() {
    return sdtids;
  }
  public void setSdtids(String sdtids) {
    this.sdtids = sdtids;
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
  public String getTrialId() {
    return trialId;
  }
  public void setTrialId(String trialId) {
    this.trialId = trialId;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportRequest exportRequest = (ExportRequest) o;
    return Objects.equals(this.endDate, exportRequest.endDate) &&
        Objects.equals(this.format, exportRequest.format) &&
        Objects.equals(this.order, exportRequest.order) &&
        Objects.equals(this.sdids, exportRequest.sdids) &&
        Objects.equals(this.sdtids, exportRequest.sdtids) &&
        Objects.equals(this.startDate, exportRequest.startDate) &&
        Objects.equals(this.trialId, exportRequest.trialId) &&
        Objects.equals(this.uids, exportRequest.uids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, format, order, sdids, sdtids, startDate, trialId, uids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportRequest {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sdids: ").append(toIndentedString(sdids)).append("\n");
    sb.append("    sdtids: ").append(toIndentedString(sdtids)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    trialId: ").append(toIndentedString(trialId)).append("\n");
    sb.append("    uids: ").append(toIndentedString(uids)).append("\n");
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
