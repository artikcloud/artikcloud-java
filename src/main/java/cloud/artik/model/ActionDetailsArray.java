package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.ActionDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Contains the array of Action Details
 **/
@ApiModel(description = "Contains the array of Action Details")
public class ActionDetailsArray   {
  
  @SerializedName("actions")
  private List<ActionDetails> actions = new ArrayList<ActionDetails>();
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<ActionDetails> getActions() {
    return actions;
  }
  public void setActions(List<ActionDetails> actions) {
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
    ActionDetailsArray actionDetailsArray = (ActionDetailsArray) o;
    return Objects.equals(this.actions, actionDetailsArray.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionDetailsArray {\n");
    
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
