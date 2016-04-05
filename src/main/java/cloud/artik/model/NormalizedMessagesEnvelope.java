package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.NormalizedMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Normalized Messages Envelope
 **/
@ApiModel(description = "Normalized Messages Envelope")
public class NormalizedMessagesEnvelope   {
  
  @SerializedName("sdids")
  private String sdids = null;
  
  @SerializedName("sdid")
  private String sdid = null;
  
  @SerializedName("uid")
  private String uid = null;
  
  @SerializedName("startDate")
  private Long startDate = null;
  
  @SerializedName("endDate")
  private Long endDate = null;
  
  @SerializedName("order")
  private String order = null;
  
  @SerializedName("next")
  private String next = null;
  
  @SerializedName("count")
  private Long count = null;
  
  @SerializedName("size")
  private Long size = null;
  
  @SerializedName("data")
  private List<NormalizedMessage> data = new ArrayList<NormalizedMessage>();
  

  
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
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
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
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
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
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<NormalizedMessage> getData() {
    return data;
  }
  public void setData(List<NormalizedMessage> data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizedMessagesEnvelope normalizedMessagesEnvelope = (NormalizedMessagesEnvelope) o;
    return Objects.equals(this.sdids, normalizedMessagesEnvelope.sdids) &&
        Objects.equals(this.sdid, normalizedMessagesEnvelope.sdid) &&
        Objects.equals(this.uid, normalizedMessagesEnvelope.uid) &&
        Objects.equals(this.startDate, normalizedMessagesEnvelope.startDate) &&
        Objects.equals(this.endDate, normalizedMessagesEnvelope.endDate) &&
        Objects.equals(this.order, normalizedMessagesEnvelope.order) &&
        Objects.equals(this.next, normalizedMessagesEnvelope.next) &&
        Objects.equals(this.count, normalizedMessagesEnvelope.count) &&
        Objects.equals(this.size, normalizedMessagesEnvelope.size) &&
        Objects.equals(this.data, normalizedMessagesEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdids, sdid, uid, startDate, endDate, order, next, count, size, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedMessagesEnvelope {\n");
    
    sb.append("    sdids: ").append(toIndentedString(sdids)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
