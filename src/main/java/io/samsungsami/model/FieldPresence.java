package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class FieldPresence  { 
  private Long startDate = null;
  
  //public enum startDateEnum {  }; 
  
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getStartDate() {
    return startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPresence {\n");
    
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
