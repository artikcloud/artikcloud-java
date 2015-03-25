package io.samsungsami.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class DeviceType  {
  
  private Boolean approved = null;
  private String id = null;
  private String issuerDn = null;
  private Integer latestVersion = null;
  private String name = null;
  private Boolean published = null;
  private Boolean rsp = null;
  private String uid = null;
  private String uniqueName = null;
  private String vid = null;

  
  /**
   * Approval status.
   **/
  @ApiModelProperty(required = false, value = "Approval status.")
  @JsonProperty("approved")
  public Boolean getApproved() {
    return approved;
  }
  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  
  /**
   * Device Type ID.
   **/
  @ApiModelProperty(required = false, value = "Device Type ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Issuer Distinguished Name
   **/
  @ApiModelProperty(required = false, value = "Issuer Distinguished Name")
  @JsonProperty("issuerDn")
  public String getIssuerDn() {
    return issuerDn;
  }
  public void setIssuerDn(String issuerDn) {
    this.issuerDn = issuerDn;
  }

  
  /**
   * Latest Manifest version.
   **/
  @ApiModelProperty(required = false, value = "Latest Manifest version.")
  @JsonProperty("latestVersion")
  public Integer getLatestVersion() {
    return latestVersion;
  }
  public void setLatestVersion(Integer latestVersion) {
    this.latestVersion = latestVersion;
  }

  
  /**
   * Name.
   **/
  @ApiModelProperty(required = false, value = "Name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Published status.
   **/
  @ApiModelProperty(required = false, value = "Published status.")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * Require Secure Protocol.
   **/
  @ApiModelProperty(required = false, value = "Require Secure Protocol.")
  @JsonProperty("rsp")
  public Boolean getRsp() {
    return rsp;
  }
  public void setRsp(Boolean rsp) {
    this.rsp = rsp;
  }

  
  /**
   * User ID.
   **/
  @ApiModelProperty(required = false, value = "User ID.")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   * Unique Name.
   **/
  @ApiModelProperty(required = false, value = "Unique Name.")
  @JsonProperty("uniqueName")
  public String getUniqueName() {
    return uniqueName;
  }
  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }

  
  /**
   * Vendor ID.
   **/
  @ApiModelProperty(required = false, value = "Vendor ID.")
  @JsonProperty("vid")
  public String getVid() {
    return vid;
  }
  public void setVid(String vid) {
    this.vid = vid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceType {\n");
    
    sb.append("  approved: ").append(approved).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  issuerDn: ").append(issuerDn).append("\n");
    sb.append("  latestVersion: ").append(latestVersion).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  published: ").append(published).append("\n");
    sb.append("  rsp: ").append(rsp).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  uniqueName: ").append(uniqueName).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
