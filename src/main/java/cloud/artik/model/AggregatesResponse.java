package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.AggregateData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Aggregates Response
 **/
@ApiModel(description = "Aggregates Response")
public class AggregatesResponse   {
  
  @SerializedName("data")
  private List<AggregateData> data = new ArrayList<AggregateData>();
  
  @SerializedName("endDate")
  private Long endDate = null;
  
  @SerializedName("field")
  private String field = null;
  
  @SerializedName("sdid")
  private String sdid = null;
  
  @SerializedName("size")
  private Integer size = null;
  
  @SerializedName("startDate")
  private Long startDate = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<AggregateData> getData() {
    return data;
  }
  public void setData(List<AggregateData> data) {
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
  public String getSdid() {
    return sdid;
  }
  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
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
    AggregatesResponse aggregatesResponse = (AggregatesResponse) o;
    return Objects.equals(this.data, aggregatesResponse.data) &&
        Objects.equals(this.endDate, aggregatesResponse.endDate) &&
        Objects.equals(this.field, aggregatesResponse.field) &&
        Objects.equals(this.sdid, aggregatesResponse.sdid) &&
        Objects.equals(this.size, aggregatesResponse.size) &&
        Objects.equals(this.startDate, aggregatesResponse.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, endDate, field, sdid, size, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatesResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
