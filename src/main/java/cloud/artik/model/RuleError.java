package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.FieldPath;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Rule Error.
 **/
@ApiModel(description = "Rule Error.")
public class RuleError   {
  
  @SerializedName("errorCode")
  private Integer errorCode = null;
  
  @SerializedName("fieldPath")
  private FieldPath fieldPath = null;
  
  @SerializedName("messageArgs")
  private List<String> messageArgs = new ArrayList<String>();
  
  @SerializedName("messageKey")
  private String messageKey = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public FieldPath getFieldPath() {
    return fieldPath;
  }
  public void setFieldPath(FieldPath fieldPath) {
    this.fieldPath = fieldPath;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getMessageArgs() {
    return messageArgs;
  }
  public void setMessageArgs(List<String> messageArgs) {
    this.messageArgs = messageArgs;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessageKey() {
    return messageKey;
  }
  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleError ruleError = (RuleError) o;
    return Objects.equals(this.errorCode, ruleError.errorCode) &&
        Objects.equals(this.fieldPath, ruleError.fieldPath) &&
        Objects.equals(this.messageArgs, ruleError.messageArgs) &&
        Objects.equals(this.messageKey, ruleError.messageKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, fieldPath, messageArgs, messageKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleError {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    messageArgs: ").append(toIndentedString(messageArgs)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
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
