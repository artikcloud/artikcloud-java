package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.RuleError;
import cloud.artik.model.RuleWarningOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;




/**
 * Rule information.
 **/
@ApiModel(description = "Rule information.")
public class OutputRule   {
  
  @SerializedName("aid")
  private String aid = null;
  
  @SerializedName("createdOn")
  private Long createdOn = null;
  
  @SerializedName("description")
  private String description = null;
  
  @SerializedName("enabled")
  private Boolean enabled = null;
  
  @SerializedName("error")
  private RuleError error = null;
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("index")
  private Integer index = null;
  
  @SerializedName("invalidatedOn")
  private Long invalidatedOn = null;
  
  @SerializedName("languageVersion")
  private Integer languageVersion = null;
  
  @SerializedName("modifiedOn")
  private Long modifiedOn = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("rule")
  private Map<String, Object> rule = new HashMap<String, Object>();
  
  @SerializedName("uid")
  private String uid = null;
  
  @SerializedName("warning")
  private RuleWarningOutput warning = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getAid() {
    return aid;
  }
  public void setAid(String aid) {
    this.aid = aid;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public RuleError getError() {
    return error;
  }
  public void setError(RuleError error) {
    this.error = error;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getInvalidatedOn() {
    return invalidatedOn;
  }
  public void setInvalidatedOn(Long invalidatedOn) {
    this.invalidatedOn = invalidatedOn;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLanguageVersion() {
    return languageVersion;
  }
  public void setLanguageVersion(Integer languageVersion) {
    this.languageVersion = languageVersion;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getModifiedOn() {
    return modifiedOn;
  }
  public void setModifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getRule() {
    return rule;
  }
  public void setRule(Map<String, Object> rule) {
    this.rule = rule;
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
  public RuleWarningOutput getWarning() {
    return warning;
  }
  public void setWarning(RuleWarningOutput warning) {
    this.warning = warning;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputRule outputRule = (OutputRule) o;
    return Objects.equals(this.aid, outputRule.aid) &&
        Objects.equals(this.createdOn, outputRule.createdOn) &&
        Objects.equals(this.description, outputRule.description) &&
        Objects.equals(this.enabled, outputRule.enabled) &&
        Objects.equals(this.error, outputRule.error) &&
        Objects.equals(this.id, outputRule.id) &&
        Objects.equals(this.index, outputRule.index) &&
        Objects.equals(this.invalidatedOn, outputRule.invalidatedOn) &&
        Objects.equals(this.languageVersion, outputRule.languageVersion) &&
        Objects.equals(this.modifiedOn, outputRule.modifiedOn) &&
        Objects.equals(this.name, outputRule.name) &&
        Objects.equals(this.rule, outputRule.rule) &&
        Objects.equals(this.uid, outputRule.uid) &&
        Objects.equals(this.warning, outputRule.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, createdOn, description, enabled, error, id, index, invalidatedOn, languageVersion, modifiedOn, name, rule, uid, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputRule {\n");
    
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    invalidatedOn: ").append(toIndentedString(invalidatedOn)).append("\n");
    sb.append("    languageVersion: ").append(toIndentedString(languageVersion)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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
