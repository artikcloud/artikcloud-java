/*
 * ARTIK Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.DeviceTypePricingList;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class DeviceTypePricingTiersEnvelope {
  @SerializedName("data")
  private DeviceTypePricingList data = null;

  public DeviceTypePricingTiersEnvelope data(DeviceTypePricingList data) {
    this.data = data;
    return this;
  }

   /**
   * Data envelope
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "Data envelope")
  public DeviceTypePricingList getData() {
    return data;
  }

  public void setData(DeviceTypePricingList data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTypePricingTiersEnvelope deviceTypePricingTiersEnvelope = (DeviceTypePricingTiersEnvelope) o;
    return Objects.equals(this.data, deviceTypePricingTiersEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypePricingTiersEnvelope {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

