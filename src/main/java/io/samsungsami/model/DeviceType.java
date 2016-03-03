package io.samsungsami.model;

import java.math.BigDecimal;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class DeviceType  { 
  private String id = null;
  private String uid = null;
  private String name = null;
  private Boolean published = null;
  private Boolean approved = null;
  private BigDecimal latestVersion = null;
  private Boolean hasCloudConnector = null;
  private Boolean rsp = null;
  
  //public enum latestVersionEnum {  }; 
  
  private String uniqueName = null;
  
  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
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
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getApproved() {
    return approved;
  }
  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public BigDecimal getLatestVersion() {
    return latestVersion;
  }
  public void setLatestVersion(BigDecimal latestVersion) {
    this.latestVersion = latestVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUniqueName() {
    return uniqueName;
  }
  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHasCloudConnector() {
    return hasCloudConnector;
  }
  public void setHasCloudConnector(Boolean hasCloudConnector) {
    this.hasCloudConnector = hasCloudConnector;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getRsp() {
    return rsp;
  }
  public void setRsp(Boolean rsp) {
    this.rsp = rsp;
  }


  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceType {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  published: ").append(published).append("\n");
    sb.append("  approved: ").append(approved).append("\n");
    sb.append("  latestVersion: ").append(latestVersion).append("\n");
    sb.append("  uniqueName: ").append(uniqueName).append("\n");
    sb.append("  hasCloudConnector: ").append(hasCloudConnector).append("\n");
    sb.append("  rsp: ").append(rsp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
