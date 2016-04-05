package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;




/**
 * Class to update an existing Rule.
 **/
@ApiModel(description = "Class to update an existing Rule.")
public class RuleUpdateInfo   {
  
  @SerializedName("description")
  private String description = null;
  
  @SerializedName("enabled")
  private Boolean enabled = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("rule")
  private Map<String, Object> rule = new HashMap<String, Object>();
  

  
  /**
   * Description
   **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Is Enabled
   **/
  @ApiModelProperty(value = "Is Enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Rule
   **/
  @ApiModelProperty(value = "Rule")
  public Map<String, Object> getRule() {
    return rule;
  }
  public void setRule(Map<String, Object> rule) {
    this.rule = rule;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleUpdateInfo ruleUpdateInfo = (RuleUpdateInfo) o;
    return Objects.equals(this.description, ruleUpdateInfo.description) &&
        Objects.equals(this.enabled, ruleUpdateInfo.enabled) &&
        Objects.equals(this.name, ruleUpdateInfo.name) &&
        Objects.equals(this.rule, ruleUpdateInfo.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, name, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleUpdateInfo {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
