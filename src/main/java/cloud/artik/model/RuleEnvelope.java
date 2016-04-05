package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.OutputRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Rule Envelope.
 **/
@ApiModel(description = "Rule Envelope.")
public class RuleEnvelope   {
  
  @SerializedName("data")
  private OutputRule data = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public OutputRule getData() {
    return data;
  }
  public void setData(OutputRule data) {
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
    RuleEnvelope ruleEnvelope = (RuleEnvelope) o;
    return Objects.equals(this.data, ruleEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleEnvelope {\n");
    
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
