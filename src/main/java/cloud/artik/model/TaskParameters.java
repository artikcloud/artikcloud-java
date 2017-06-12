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
import cloud.artik.model.UpdateParameters;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class TaskParameters {
  @SerializedName("expiresAfter")
  private Integer expiresAfter = null;

  @SerializedName("scheduledOn")
  private Long scheduledOn = null;

  @SerializedName("update")
  private UpdateParameters update = null;

  @SerializedName("value")
  private String value = null;

  public TaskParameters expiresAfter(Integer expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

   /**
   * Expire time in seconds
   * @return expiresAfter
  **/
  @ApiModelProperty(example = "null", value = "Expire time in seconds")
  public Integer getExpiresAfter() {
    return expiresAfter;
  }

  public void setExpiresAfter(Integer expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public TaskParameters scheduledOn(Long scheduledOn) {
    this.scheduledOn = scheduledOn;
    return this;
  }

   /**
   * Future scheduled time
   * @return scheduledOn
  **/
  @ApiModelProperty(example = "null", value = "Future scheduled time")
  public Long getScheduledOn() {
    return scheduledOn;
  }

  public void setScheduledOn(Long scheduledOn) {
    this.scheduledOn = scheduledOn;
  }

  public TaskParameters update(UpdateParameters update) {
    this.update = update;
    return this;
  }

   /**
   * Update parameters
   * @return update
  **/
  @ApiModelProperty(example = "null", value = "Update parameters")
  public UpdateParameters getUpdate() {
    return update;
  }

  public void setUpdate(UpdateParameters update) {
    this.update = update;
  }

  public TaskParameters value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value to write
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "Value to write")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskParameters taskParameters = (TaskParameters) o;
    return Objects.equals(this.expiresAfter, taskParameters.expiresAfter) &&
        Objects.equals(this.scheduledOn, taskParameters.scheduledOn) &&
        Objects.equals(this.update, taskParameters.update) &&
        Objects.equals(this.value, taskParameters.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAfter, scheduledOn, update, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskParameters {\n");
    
    sb.append("    expiresAfter: ").append(toIndentedString(expiresAfter)).append("\n");
    sb.append("    scheduledOn: ").append(toIndentedString(scheduledOn)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

