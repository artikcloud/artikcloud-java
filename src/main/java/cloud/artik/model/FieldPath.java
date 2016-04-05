package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.NonEmptyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * 
 **/
@ApiModel(description = "")
public class FieldPath   {
  
  @SerializedName("path")
  private List<NonEmptyString> path = new ArrayList<NonEmptyString>();
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<NonEmptyString> getPath() {
    return path;
  }
  public void setPath(List<NonEmptyString> path) {
    this.path = path;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldPath fieldPath = (FieldPath) o;
    return Objects.equals(this.path, fieldPath.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPath {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
