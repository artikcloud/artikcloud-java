package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.OutputRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Rules Envelope.
 **/
@ApiModel(description = "Rules Envelope.")
public class RulesEnvelope   {
  
  @SerializedName("count")
  private Integer count = null;
  
  @SerializedName("data")
  private List<OutputRule> data = new ArrayList<OutputRule>();
  
  @SerializedName("offset")
  private Integer offset = null;
  
  @SerializedName("total")
  private Integer total = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<OutputRule> getData() {
    return data;
  }
  public void setData(List<OutputRule> data) {
    this.data = data;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
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
    RulesEnvelope rulesEnvelope = (RulesEnvelope) o;
    return Objects.equals(this.count, rulesEnvelope.count) &&
        Objects.equals(this.data, rulesEnvelope.data) &&
        Objects.equals(this.offset, rulesEnvelope.offset) &&
        Objects.equals(this.total, rulesEnvelope.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, offset, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesEnvelope {\n");
    
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
