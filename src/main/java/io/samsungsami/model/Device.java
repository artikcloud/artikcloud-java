package io.samsungsami.model;

import java.util.Map;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class Device  {
  
  private String certificateInfo = null;
  private String certificateSignature = null;
  private Long createdOn = null;
  private String dtid = null;
  private String eid = null;
  private String id = null;
  private Long manifestVersion = null;
  private String manifestVersionPolicy = null;
  private String name = null;
  private Boolean needProviderAuth = null;
  private String uid = null;
  private Map<String, Object> properties = new HashMap<String, Object>() ;
  private Map<String, Object> providerCredentials = new HashMap<String, Object>() ;

  
  /**
   * Certificate Info (if any)
   **/
  @ApiModelProperty(required = false, value = "Certificate Info (if any)")
  @JsonProperty("certificateInfo")
  public String getCertificateInfo() {
    return certificateInfo;
  }
  public void setCertificateInfo(String certificateInfo) {
    this.certificateInfo = certificateInfo;
  }

  
  /**
   * Certificate Signature (if any)
   **/
  @ApiModelProperty(required = false, value = "Certificate Signature (if any)")
  @JsonProperty("certificateSignature")
  public String getCertificateSignature() {
    return certificateSignature;
  }
  public void setCertificateSignature(String certificateSignature) {
    this.certificateSignature = certificateSignature;
  }

  
  /**
   * Created On (milliseconds since epoch)
   **/
  @ApiModelProperty(required = false, value = "Created On (milliseconds since epoch)")
  @JsonProperty("createdOn")
  public Long getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   * Device Type ID
   **/
  @ApiModelProperty(required = false, value = "Device Type ID")
  @JsonProperty("dtid")
  public String getDtid() {
    return dtid;
  }
  public void setDtid(String dtid) {
    this.dtid = dtid;
  }

  
  /**
   * External ID (if any)
   **/
  @ApiModelProperty(required = false, value = "External ID (if any)")
  @JsonProperty("eid")
  public String getEid() {
    return eid;
  }
  public void setEid(String eid) {
    this.eid = eid;
  }

  
  /**
   * Device ID
   **/
  @ApiModelProperty(required = false, value = "Device ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Manifest Version
   **/
  @ApiModelProperty(required = false, value = "Manifest Version")
  @JsonProperty("manifestVersion")
  public Long getManifestVersion() {
    return manifestVersion;
  }
  public void setManifestVersion(Long manifestVersion) {
    this.manifestVersion = manifestVersion;
  }

  
  /**
   * Manifest Version Policy (LATEST, DEVICE)
   **/
  @ApiModelProperty(required = false, value = "Manifest Version Policy (LATEST, DEVICE)")
  @JsonProperty("manifestVersionPolicy")
  public String getManifestVersionPolicy() {
    return manifestVersionPolicy;
  }
  public void setManifestVersionPolicy(String manifestVersionPolicy) {
    this.manifestVersionPolicy = manifestVersionPolicy;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(required = false, value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Needs Provider Authentication
   **/
  @ApiModelProperty(required = false, value = "Needs Provider Authentication")
  @JsonProperty("needProviderAuth")
  public Boolean getNeedProviderAuth() {
    return needProviderAuth;
  }
  public void setNeedProviderAuth(Boolean needProviderAuth) {
    this.needProviderAuth = needProviderAuth;
  }

  
  /**
   * User ID
   **/
  @ApiModelProperty(required = false, value = "User ID")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  @JsonProperty("providerCredentials")
  public Map<String, Object> getProviderCredentials() {
    return providerCredentials;
  }
  public void setProviderCredentials(Map<String, Object> providerCredentials) {
    this.providerCredentials = providerCredentials;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("  certificateInfo: ").append(certificateInfo).append("\n");
    sb.append("  certificateSignature: ").append(certificateSignature).append("\n");
    sb.append("  createdOn: ").append(createdOn).append("\n");
    sb.append("  dtid: ").append(dtid).append("\n");
    sb.append("  eid: ").append(eid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  manifestVersion: ").append(manifestVersion).append("\n");
    sb.append("  manifestVersionPolicy: ").append(manifestVersionPolicy).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  needProviderAuth: ").append(needProviderAuth).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("  providerCredentials: ").append(providerCredentials).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
