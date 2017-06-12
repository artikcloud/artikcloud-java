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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class TaskStatusCounts {
  @SerializedName("numFailed")
  private Integer numFailed = null;

  @SerializedName("numCancelled")
  private Integer numCancelled = null;

  @SerializedName("totalDevices")
  private Integer totalDevices = null;

  @SerializedName("numCompleted")
  private Integer numCompleted = null;

  @SerializedName("numSucceeded")
  private Integer numSucceeded = null;

  public TaskStatusCounts numFailed(Integer numFailed) {
    this.numFailed = numFailed;
    return this;
  }

   /**
   * Number failed
   * @return numFailed
  **/
  @ApiModelProperty(example = "null", value = "Number failed")
  public Integer getNumFailed() {
    return numFailed;
  }

  public void setNumFailed(Integer numFailed) {
    this.numFailed = numFailed;
  }

  public TaskStatusCounts numCancelled(Integer numCancelled) {
    this.numCancelled = numCancelled;
    return this;
  }

   /**
   * Number cancelled
   * @return numCancelled
  **/
  @ApiModelProperty(example = "null", value = "Number cancelled")
  public Integer getNumCancelled() {
    return numCancelled;
  }

  public void setNumCancelled(Integer numCancelled) {
    this.numCancelled = numCancelled;
  }

  public TaskStatusCounts totalDevices(Integer totalDevices) {
    this.totalDevices = totalDevices;
    return this;
  }

   /**
   * Total devices
   * @return totalDevices
  **/
  @ApiModelProperty(example = "null", value = "Total devices")
  public Integer getTotalDevices() {
    return totalDevices;
  }

  public void setTotalDevices(Integer totalDevices) {
    this.totalDevices = totalDevices;
  }

  public TaskStatusCounts numCompleted(Integer numCompleted) {
    this.numCompleted = numCompleted;
    return this;
  }

   /**
   * Number completed
   * @return numCompleted
  **/
  @ApiModelProperty(example = "null", value = "Number completed")
  public Integer getNumCompleted() {
    return numCompleted;
  }

  public void setNumCompleted(Integer numCompleted) {
    this.numCompleted = numCompleted;
  }

  public TaskStatusCounts numSucceeded(Integer numSucceeded) {
    this.numSucceeded = numSucceeded;
    return this;
  }

   /**
   * Number succeeded
   * @return numSucceeded
  **/
  @ApiModelProperty(example = "null", value = "Number succeeded")
  public Integer getNumSucceeded() {
    return numSucceeded;
  }

  public void setNumSucceeded(Integer numSucceeded) {
    this.numSucceeded = numSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskStatusCounts taskStatusCounts = (TaskStatusCounts) o;
    return Objects.equals(this.numFailed, taskStatusCounts.numFailed) &&
        Objects.equals(this.numCancelled, taskStatusCounts.numCancelled) &&
        Objects.equals(this.totalDevices, taskStatusCounts.totalDevices) &&
        Objects.equals(this.numCompleted, taskStatusCounts.numCompleted) &&
        Objects.equals(this.numSucceeded, taskStatusCounts.numSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numFailed, numCancelled, totalDevices, numCompleted, numSucceeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatusCounts {\n");
    
    sb.append("    numFailed: ").append(toIndentedString(numFailed)).append("\n");
    sb.append("    numCancelled: ").append(toIndentedString(numCancelled)).append("\n");
    sb.append("    totalDevices: ").append(toIndentedString(totalDevices)).append("\n");
    sb.append("    numCompleted: ").append(toIndentedString(numCompleted)).append("\n");
    sb.append("    numSucceeded: ").append(toIndentedString(numSucceeded)).append("\n");
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

