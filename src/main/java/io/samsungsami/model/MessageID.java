package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class MessageID  { 
  private String mid = null;
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageID {\n");
    
    sb.append("  mid: ").append(mid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
