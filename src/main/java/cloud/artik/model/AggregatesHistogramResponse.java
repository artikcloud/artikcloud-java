package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.AggregatesHistogramData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Aggregates Histogram Response
 **/
@ApiModel(description = "Aggregates Histogram Response")
public class AggregatesHistogramResponse   {
  
  @SerializedName("data")
  private List<AggregatesHistogramData> data = new ArrayList<AggregatesHistogramData>();
  
  @SerializedName("endDate")
  private Long endDate = null;
  
  @SerializedName("field")
  private String field = null;
  
  @SerializedName("interval")
  private String interval = null;
  
  @SerializedName("sdid")
  private String sdid = null;
  
  @SerializedName("size")
  private Long size = null;
  
  @SerializedName("startDate")
  private Long startDate = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<AggregatesHistogramData> getData() {
    return data;
  }
  public void setData(List<AggregatesHistogramData> data) {
    this.data = data;
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
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
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
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatesHistogramResponse aggregatesHistogramResponse = (AggregatesHistogramResponse) o;
    return Objects.equals(this.data, aggregatesHistogramResponse.data) &&
        Objects.equals(this.endDate, aggregatesHistogramResponse.endDate) &&
        Objects.equals(this.field, aggregatesHistogramResponse.field) &&
        Objects.equals(this.interval, aggregatesHistogramResponse.interval) &&
        Objects.equals(this.sdid, aggregatesHistogramResponse.sdid) &&
        Objects.equals(this.size, aggregatesHistogramResponse.size) &&
        Objects.equals(this.startDate, aggregatesHistogramResponse.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, endDate, field, interval, sdid, size, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatesHistogramResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
