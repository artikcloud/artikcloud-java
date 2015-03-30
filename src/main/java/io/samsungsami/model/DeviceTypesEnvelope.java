package io.samsungsami.model;

import io.samsungsami.model.DeviceTypeArray;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class DeviceTypesEnvelope  { 
  private Integer total = null;
  
  //public enum totalEnum {  }; 
  
  private Integer count = null;
  
  //public enum countEnum {  }; 
  
  private Integer offset = null;
  
  //public enum offsetEnum {  }; 
  
  private DeviceTypeArray data = null;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public DeviceTypeArray getData() {
    return data;
  }
  public void setData(DeviceTypeArray data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypesEnvelope {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
