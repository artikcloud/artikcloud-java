package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.AppProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * User Application Properties Envelope
 **/
@ApiModel(description = "User Application Properties Envelope")
public class PropertiesEnvelope   {
  
  @SerializedName("data")
  private AppProperties data = null;
  

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public AppProperties getData() {
    return data;
  }
  public void setData(AppProperties data) {
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
    PropertiesEnvelope propertiesEnvelope = (PropertiesEnvelope) o;
    return Objects.equals(this.data, propertiesEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesEnvelope {\n");
    
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
