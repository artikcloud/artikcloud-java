package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;




/**
 * Device information.
 **/
@ApiModel(description = "Device information.")
public class Device   {
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("uid")
  private String uid = null;
  
  @SerializedName("dtid")
  private String dtid = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("manifestVersion")
  private Integer manifestVersion = null;
  
  @SerializedName("manifestVersionPolicy")
  private String manifestVersionPolicy = null;
  
  @SerializedName("needProviderAuth")
  private Boolean needProviderAuth = null;
  
  @SerializedName("properties")
  private Map<String, Object> properties = new HashMap<String, Object>();
  
  @SerializedName("createdOn")
  private Long createdOn = null;
  
  @SerializedName("connected")
  private Boolean connected = null;
  
  @SerializedName("certificateInfo")
  private String certificateInfo = null;
  
  @SerializedName("certificateSignature")
  private String certificateSignature = null;
  
  @SerializedName("eid")
  private String eid = null;
  
  @SerializedName("providerCredentials")
  private Map<String, Object> providerCredentials = new HashMap<String, Object>();
  

  
  /**
   * Device ID
   **/
  @ApiModelProperty(value = "Device ID")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * User ID
   **/
  @ApiModelProperty(value = "User ID")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   * Device Type ID
   **/
  @ApiModelProperty(value = "Device Type ID")
  public String getDtid() {
    return dtid;
  }
  public void setDtid(String dtid) {
    this.dtid = dtid;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Manifest Version
   **/
  @ApiModelProperty(value = "Manifest Version")
  public Integer getManifestVersion() {
    return manifestVersion;
  }
  public void setManifestVersion(Integer manifestVersion) {
    this.manifestVersion = manifestVersion;
  }

  
  /**
   * Manifest Version Policy (LATEST, DEVICE)
   **/
  @ApiModelProperty(value = "Manifest Version Policy (LATEST, DEVICE)")
  public String getManifestVersionPolicy() {
    return manifestVersionPolicy;
  }
  public void setManifestVersionPolicy(String manifestVersionPolicy) {
    this.manifestVersionPolicy = manifestVersionPolicy;
  }

  
  /**
   * Needs Provider Authentication
   **/
  @ApiModelProperty(value = "Needs Provider Authentication")
  public Boolean getNeedProviderAuth() {
    return needProviderAuth;
  }
  public void setNeedProviderAuth(Boolean needProviderAuth) {
    this.needProviderAuth = needProviderAuth;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  
  /**
   * Created On (milliseconds since epoch)
   **/
  @ApiModelProperty(value = "Created On (milliseconds since epoch)")
  public Long getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   * Is Connected
   **/
  @ApiModelProperty(value = "Is Connected")
  public Boolean getConnected() {
    return connected;
  }
  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  
  /**
   * Certificate Info (if any)
   **/
  @ApiModelProperty(value = "Certificate Info (if any)")
  public String getCertificateInfo() {
    return certificateInfo;
  }
  public void setCertificateInfo(String certificateInfo) {
    this.certificateInfo = certificateInfo;
  }

  
  /**
   * Certificate Signature (if any)
   **/
  @ApiModelProperty(value = "Certificate Signature (if any)")
  public String getCertificateSignature() {
    return certificateSignature;
  }
  public void setCertificateSignature(String certificateSignature) {
    this.certificateSignature = certificateSignature;
  }

  
  /**
   * External ID (if any)
   **/
  @ApiModelProperty(value = "External ID (if any)")
  public String getEid() {
    return eid;
  }
  public void setEid(String eid) {
    this.eid = eid;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getProviderCredentials() {
    return providerCredentials;
  }
  public void setProviderCredentials(Map<String, Object> providerCredentials) {
    this.providerCredentials = providerCredentials;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.id, device.id) &&
        Objects.equals(this.uid, device.uid) &&
        Objects.equals(this.dtid, device.dtid) &&
        Objects.equals(this.name, device.name) &&
        Objects.equals(this.manifestVersion, device.manifestVersion) &&
        Objects.equals(this.manifestVersionPolicy, device.manifestVersionPolicy) &&
        Objects.equals(this.needProviderAuth, device.needProviderAuth) &&
        Objects.equals(this.properties, device.properties) &&
        Objects.equals(this.createdOn, device.createdOn) &&
        Objects.equals(this.connected, device.connected) &&
        Objects.equals(this.certificateInfo, device.certificateInfo) &&
        Objects.equals(this.certificateSignature, device.certificateSignature) &&
        Objects.equals(this.eid, device.eid) &&
        Objects.equals(this.providerCredentials, device.providerCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uid, dtid, name, manifestVersion, manifestVersionPolicy, needProviderAuth, properties, createdOn, connected, certificateInfo, certificateSignature, eid, providerCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    dtid: ").append(toIndentedString(dtid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
    sb.append("    manifestVersionPolicy: ").append(toIndentedString(manifestVersionPolicy)).append("\n");
    sb.append("    needProviderAuth: ").append(toIndentedString(needProviderAuth)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    certificateInfo: ").append(toIndentedString(certificateInfo)).append("\n");
    sb.append("    certificateSignature: ").append(toIndentedString(certificateSignature)).append("\n");
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
    sb.append("    providerCredentials: ").append(toIndentedString(providerCredentials)).append("\n");
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
