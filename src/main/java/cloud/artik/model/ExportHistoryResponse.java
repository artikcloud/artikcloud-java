package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.ExportDataArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Export History Response.
 **/
@ApiModel(description = "Export History Response.")
public class ExportHistoryResponse   {
  
  @SerializedName("count")
  private Long count = null;
  
  @SerializedName("data")
  private ExportDataArray data = null;
  
  @SerializedName("offset")
  private Long offset = null;
  
  @SerializedName("total")
  private Long total = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public ExportDataArray getData() {
    return data;
  }
  public void setData(ExportDataArray data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getOffset() {
    return offset;
  }
  public void setOffset(Long offset) {
    this.offset = offset;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportHistoryResponse exportHistoryResponse = (ExportHistoryResponse) o;
    return Objects.equals(this.count, exportHistoryResponse.count) &&
        Objects.equals(this.data, exportHistoryResponse.data) &&
        Objects.equals(this.offset, exportHistoryResponse.offset) &&
        Objects.equals(this.total, exportHistoryResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, offset, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportHistoryResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
