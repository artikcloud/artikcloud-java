package cloud.artik.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * 
 **/
@ApiModel(description = "")
public class UnregisterDeviceResponse   {
  
  @SerializedName("certificateInfo")
  private String certificateInfo = null;
  
  @SerializedName("certificateSignature")
  private String certificateSignature = null;
  
  @SerializedName("createdOn")
  private Long createdOn = null;
  
  @SerializedName("dtid")
  private String dtid = null;
  
  @SerializedName("eid")
  private String eid = null;
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("manifestVersion")
  private Long manifestVersion = null;
  
  @SerializedName("manifestVersionPolicy")
  private String manifestVersionPolicy = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("needProviderAuth")
  private Boolean needProviderAuth = null;
  
  @SerializedName("uid")
  private String uid = null;
  

  
  /**
   * Device certificate information.
   **/
  @ApiModelProperty(value = "Device certificate information.")
  public String getCertificateInfo() {
    return certificateInfo;
  }
  public void setCertificateInfo(String certificateInfo) {
    this.certificateInfo = certificateInfo;
  }

  
  /**
   * Certificate's signature.
   **/
  @ApiModelProperty(value = "Certificate's signature.")
  public String getCertificateSignature() {
    return certificateSignature;
  }
  public void setCertificateSignature(String certificateSignature) {
    this.certificateSignature = certificateSignature;
  }

  
  /**
   * Device created on date.
   **/
  @ApiModelProperty(value = "Device created on date.")
  public Long getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   * Device type id.
   **/
  @ApiModelProperty(value = "Device type id.")
  public String getDtid() {
    return dtid;
  }
  public void setDtid(String dtid) {
    this.dtid = dtid;
  }

  
  /**
   * External ID of the device.
   **/
  @ApiModelProperty(value = "External ID of the device.")
  public String getEid() {
    return eid;
  }
  public void setEid(String eid) {
    this.eid = eid;
  }

  
  /**
   * Device id.
   **/
  @ApiModelProperty(value = "Device id.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Device manifest version.
   **/
  @ApiModelProperty(value = "Device manifest version.")
  public Long getManifestVersion() {
    return manifestVersion;
  }
  public void setManifestVersion(Long manifestVersion) {
    this.manifestVersion = manifestVersion;
  }

  
  /**
   * Device manifest version policy.
   **/
  @ApiModelProperty(value = "Device manifest version policy.")
  public String getManifestVersionPolicy() {
    return manifestVersionPolicy;
  }
  public void setManifestVersionPolicy(String manifestVersionPolicy) {
    this.manifestVersionPolicy = manifestVersionPolicy;
  }

  
  /**
   * Device name.
   **/
  @ApiModelProperty(value = "Device name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Device need provider auth.
   **/
  @ApiModelProperty(value = "Device need provider auth.")
  public Boolean getNeedProviderAuth() {
    return needProviderAuth;
  }
  public void setNeedProviderAuth(Boolean needProviderAuth) {
    this.needProviderAuth = needProviderAuth;
  }

  
  /**
   * User id.
   **/
  @ApiModelProperty(value = "User id.")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnregisterDeviceResponse unregisterDeviceResponse = (UnregisterDeviceResponse) o;
    return Objects.equals(this.certificateInfo, unregisterDeviceResponse.certificateInfo) &&
        Objects.equals(this.certificateSignature, unregisterDeviceResponse.certificateSignature) &&
        Objects.equals(this.createdOn, unregisterDeviceResponse.createdOn) &&
        Objects.equals(this.dtid, unregisterDeviceResponse.dtid) &&
        Objects.equals(this.eid, unregisterDeviceResponse.eid) &&
        Objects.equals(this.id, unregisterDeviceResponse.id) &&
        Objects.equals(this.manifestVersion, unregisterDeviceResponse.manifestVersion) &&
        Objects.equals(this.manifestVersionPolicy, unregisterDeviceResponse.manifestVersionPolicy) &&
        Objects.equals(this.name, unregisterDeviceResponse.name) &&
        Objects.equals(this.needProviderAuth, unregisterDeviceResponse.needProviderAuth) &&
        Objects.equals(this.uid, unregisterDeviceResponse.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateInfo, certificateSignature, createdOn, dtid, eid, id, manifestVersion, manifestVersionPolicy, name, needProviderAuth, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnregisterDeviceResponse {\n");
    
    sb.append("    certificateInfo: ").append(toIndentedString(certificateInfo)).append("\n");
    sb.append("    certificateSignature: ").append(toIndentedString(certificateSignature)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dtid: ").append(toIndentedString(dtid)).append("\n");
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
    sb.append("    manifestVersionPolicy: ").append(toIndentedString(manifestVersionPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needProviderAuth: ").append(toIndentedString(needProviderAuth)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
