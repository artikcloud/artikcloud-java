package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class AppProperties  { 
  private String uid = null;
  private String aid = null;
  private String properties = null;
  
  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getAid() {
    return aid;
  }
  public void setAid(String aid) {
    this.aid = aid;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getProperties() {
    return properties;
  }
  public void setProperties(String properties) {
    this.properties = properties;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppProperties {\n");
    
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  aid: ").append(aid).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
