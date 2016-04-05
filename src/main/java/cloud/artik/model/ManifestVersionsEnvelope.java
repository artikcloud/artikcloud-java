package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.ManifestVersions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Manifest Versions Envelope
 **/
@ApiModel(description = "Manifest Versions Envelope")
public class ManifestVersionsEnvelope   {
  
  @SerializedName("data")
  private ManifestVersions data = null;
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ManifestVersions getData() {
    return data;
  }
  public void setData(ManifestVersions data) {
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
    ManifestVersionsEnvelope manifestVersionsEnvelope = (ManifestVersionsEnvelope) o;
    return Objects.equals(this.data, manifestVersionsEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestVersionsEnvelope {\n");
    
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
