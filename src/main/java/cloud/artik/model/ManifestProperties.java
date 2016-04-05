package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.FieldsActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Manifest Properties
 **/
@ApiModel(description = "Manifest Properties")
public class ManifestProperties   {
  
  @SerializedName("properties")
  private FieldsActions properties = null;
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldsActions getProperties() {
    return properties;
  }
  public void setProperties(FieldsActions properties) {
    this.properties = properties;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestProperties manifestProperties = (ManifestProperties) o;
    return Objects.equals(this.properties, manifestProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestProperties {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
