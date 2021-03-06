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
import cloud.artik.model.TaskStatuses;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class TaskStatusesEnvelope {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("data")
  private TaskStatuses data = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("count")
  private Integer count = null;

  public TaskStatusesEnvelope total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "Total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public TaskStatusesEnvelope data(TaskStatuses data) {
    this.data = data;
    return this;
  }

   /**
   * Task statuses
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "Task statuses")
  public TaskStatuses getData() {
    return data;
  }

  public void setData(TaskStatuses data) {
    this.data = data;
  }

  public TaskStatusesEnvelope offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Offset
   * @return offset
  **/
  @ApiModelProperty(example = "null", value = "Offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public TaskStatusesEnvelope count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "Count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskStatusesEnvelope taskStatusesEnvelope = (TaskStatusesEnvelope) o;
    return Objects.equals(this.total, taskStatusesEnvelope.total) &&
        Objects.equals(this.data, taskStatusesEnvelope.data) &&
        Objects.equals(this.offset, taskStatusesEnvelope.offset) &&
        Objects.equals(this.count, taskStatusesEnvelope.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, data, offset, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatusesEnvelope {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

