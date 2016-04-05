package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.OutputRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Holds an array of Rules.
 **/
@ApiModel(description = "Holds an array of Rules.")
public class RuleArray   {
  
  @SerializedName("rules")
  private List<OutputRule> rules = new ArrayList<OutputRule>();
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<OutputRule> getRules() {
    return rules;
  }
  public void setRules(List<OutputRule> rules) {
    this.rules = rules;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleArray ruleArray = (RuleArray) o;
    return Objects.equals(this.rules, ruleArray.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleArray {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
