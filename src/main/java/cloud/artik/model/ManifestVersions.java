package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Manifest Versions
 **/
@ApiModel(description = "Manifest Versions")
public class ManifestVersions   {
  
  @SerializedName("versions")
  private List<String> versions = new ArrayList<String>();
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getVersions() {
    return versions;
  }
  public void setVersions(List<String> versions) {
    this.versions = versions;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestVersions manifestVersions = (ManifestVersions) o;
    return Objects.equals(this.versions, manifestVersions.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestVersions {\n");
    
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
