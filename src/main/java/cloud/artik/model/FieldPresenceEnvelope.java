package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.FieldPresence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Field Presence Envelope
 **/
@ApiModel(description = "Field Presence Envelope")
public class FieldPresenceEnvelope   {
  
  @SerializedName("sdid")
  private String sdid = null;
  
  @SerializedName("fieldPresence")
  private String fieldPresence = null;
  
  @SerializedName("startDate")
  private Long startDate = null;
  
  @SerializedName("endDate")
  private Long endDate = null;
  
  @SerializedName("interval")
  private String interval = null;
  
  @SerializedName("size")
  private Long size = null;
  
  @SerializedName("data")
  private List<FieldPresence> data = new ArrayList<FieldPresence>();
  

  
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
  public String getFieldPresence() {
    return fieldPresence;
  }
  public void setFieldPresence(String fieldPresence) {
    this.fieldPresence = fieldPresence;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getEndDate() {
    return endDate;
  }
  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
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
  public List<FieldPresence> getData() {
    return data;
  }
  public void setData(List<FieldPresence> data) {
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
    FieldPresenceEnvelope fieldPresenceEnvelope = (FieldPresenceEnvelope) o;
    return Objects.equals(this.sdid, fieldPresenceEnvelope.sdid) &&
        Objects.equals(this.fieldPresence, fieldPresenceEnvelope.fieldPresence) &&
        Objects.equals(this.startDate, fieldPresenceEnvelope.startDate) &&
        Objects.equals(this.endDate, fieldPresenceEnvelope.endDate) &&
        Objects.equals(this.interval, fieldPresenceEnvelope.interval) &&
        Objects.equals(this.size, fieldPresenceEnvelope.size) &&
        Objects.equals(this.data, fieldPresenceEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdid, fieldPresence, startDate, endDate, interval, size, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPresenceEnvelope {\n");
    
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    fieldPresence: ").append(toIndentedString(fieldPresence)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
