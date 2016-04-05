package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Aggregate Data
 **/
@ApiModel(description = "Aggregate Data")
public class AggregateData   {
  
  @SerializedName("count")
  private Long count = null;
  
  @SerializedName("max")
  private Float max = null;
  
  @SerializedName("mean")
  private Float mean = null;
  
  @SerializedName("min")
  private Float min = null;
  
  @SerializedName("sum")
  private Float sum = null;
  
  @SerializedName("variance")
  private Float variance = null;
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Float getMax() {
    return max;
  }
  public void setMax(Float max) {
    this.max = max;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Float getMean() {
    return mean;
  }
  public void setMean(Float mean) {
    this.mean = mean;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Float getMin() {
    return min;
  }
  public void setMin(Float min) {
    this.min = min;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Float getSum() {
    return sum;
  }
  public void setSum(Float sum) {
    this.sum = sum;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Float getVariance() {
    return variance;
  }
  public void setVariance(Float variance) {
    this.variance = variance;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateData aggregateData = (AggregateData) o;
    return Objects.equals(this.count, aggregateData.count) &&
        Objects.equals(this.max, aggregateData.max) &&
        Objects.equals(this.mean, aggregateData.mean) &&
        Objects.equals(this.min, aggregateData.min) &&
        Objects.equals(this.sum, aggregateData.sum) &&
        Objects.equals(this.variance, aggregateData.variance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, max, mean, min, sum, variance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateData {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
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
