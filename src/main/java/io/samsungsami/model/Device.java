package io.samsungsami.model;

import java.util.Map;
import java.math.BigDecimal;
import java.util.*;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class Device  { 
  private String id = null;
  private String uid = null;
  private String dtid = null;
  private String name = null;
  private BigDecimal manifestVersion = null;
  
  //public enum manifestVersionEnum {  }; 
  
  private String manifestVersionPolicy = null;
  private Boolean needProviderAuth = null;
  private Map<String, Object> properties = new HashMap<String, Object>() ;
  private Map<String, Object> providerCredentials = new HashMap<String, Object>() ;
  
  
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
  public String getDtid() {
    return dtid;
  }
  public void setDtid(String dtid) {
    this.dtid = dtid;
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
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getManifestVersion() {
    return manifestVersion;
  }
  public void setManifestVersion(BigDecimal manifestVersion) {
    this.manifestVersion = manifestVersion;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getManifestVersionPolicy() {
    return manifestVersionPolicy;
  }
  public void setManifestVersionPolicy(String manifestVersionPolicy) {
    this.manifestVersionPolicy = manifestVersionPolicy;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getNeedProviderAuth() {
    return needProviderAuth;
  }
  public void setNeedProviderAuth(Boolean needProviderAuth) {
    this.needProviderAuth = needProviderAuth;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
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
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  uid: ").append(uid).append("\n");
    sb.append("  dtid: ").append(dtid).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  manifestVersion: ").append(manifestVersion).append("\n");
    sb.append("  manifestVersionPolicy: ").append(manifestVersionPolicy).append("\n");
    sb.append("  needProviderAuth: ").append(needProviderAuth).append("\n");
    sb.append("  properties: ").append(properties).append("\n");
    sb.append("  providerCredentials: ").append(providerCredentials).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
