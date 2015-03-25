package io.samsungsami.model;

import java.math.BigDecimal;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Aggregates  {
  
  private BigDecimal count = null;
  private BigDecimal min = null;
  private BigDecimal max = null;
  private BigDecimal mean = null;
  private BigDecimal sum = null;
  private BigDecimal variance = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("count")
  public BigDecimal getCount() {
    return count;
  }
  public void setCount(BigDecimal count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("min")
  public BigDecimal getMin() {
    return min;
  }
  public void setMin(BigDecimal min) {
    this.min = min;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mean")
  public BigDecimal getMean() {
    return mean;
  }
  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sum")
  public BigDecimal getSum() {
    return sum;
  }
  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("variance")
  public BigDecimal getVariance() {
    return variance;
  }
  public void setVariance(BigDecimal variance) {
    this.variance = variance;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aggregates {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  min: ").append(min).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("  mean: ").append(mean).append("\n");
    sb.append("  sum: ").append(sum).append("\n");
    sb.append("  variance: ").append(variance).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
