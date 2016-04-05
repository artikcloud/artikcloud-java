package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.DeviceTypeArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * DeviceTypes Envelope
 **/
@ApiModel(description = "DeviceTypes Envelope")
public class DeviceTypesEnvelope   {
  
  @SerializedName("total")
  private Integer total = null;
  
  @SerializedName("count")
  private Integer count = null;
  
  @SerializedName("offset")
  private Integer offset = null;
  
  @SerializedName("data")
  private DeviceTypeArray data = null;
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public DeviceTypeArray getData() {
    return data;
  }
  public void setData(DeviceTypeArray data) {
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
    DeviceTypesEnvelope deviceTypesEnvelope = (DeviceTypesEnvelope) o;
    return Objects.equals(this.total, deviceTypesEnvelope.total) &&
        Objects.equals(this.count, deviceTypesEnvelope.count) &&
        Objects.equals(this.offset, deviceTypesEnvelope.offset) &&
        Objects.equals(this.data, deviceTypesEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, count, offset, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypesEnvelope {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
