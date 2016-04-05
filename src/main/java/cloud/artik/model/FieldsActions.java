package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;




/**
 * Fields and Actions
 **/
@ApiModel(description = "Fields and Actions")
public class FieldsActions   {
  
  @SerializedName("fields")
  private Map<String, Object> fields = new HashMap<String, Object>();
  
  @SerializedName("actions")
  private Map<String, Object> actions = new HashMap<String, Object>();
  

  
  /**
   * Message Fields
   **/
  @ApiModelProperty(value = "Message Fields")
  public Map<String, Object> getFields() {
    return fields;
  }
  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  
  /**
   * Actions
   **/
  @ApiModelProperty(value = "Actions")
  public Map<String, Object> getActions() {
    return actions;
  }
  public void setActions(Map<String, Object> actions) {
    this.actions = actions;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsActions fieldsActions = (FieldsActions) o;
    return Objects.equals(this.fields, fieldsActions.fields) &&
        Objects.equals(this.actions, fieldsActions.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsActions {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
