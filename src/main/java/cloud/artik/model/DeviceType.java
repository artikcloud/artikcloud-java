package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.Tag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Device Type Information
 **/
@ApiModel(description = "Device Type Information")
public class DeviceType   {
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("uniqueName")
  private String uniqueName = null;
  
  @SerializedName("latestVersion")
  private Integer latestVersion = null;
  
  @SerializedName("lastUpdated")
  private Long lastUpdated = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("description")
  private String description = null;
  
  @SerializedName("uid")
  private String uid = null;
  
  @SerializedName("oid")
  private String oid = null;
  
  @SerializedName("hasCloudConnector")
  private Boolean hasCloudConnector = null;
  
  @SerializedName("approved")
  private Boolean approved = null;
  
  @SerializedName("published")
  private Boolean published = null;
  
  @SerializedName("protected")
  private Boolean _protected = null;
  
  @SerializedName("inStore")
  private Boolean inStore = null;
  
  @SerializedName("ownedByCurrentUser")
  private Boolean ownedByCurrentUser = null;
  
  @SerializedName("tags")
  private List<Tag> tags = new ArrayList<Tag>();
  
  @SerializedName("rsp")
  private Boolean rsp = null;
  
  @SerializedName("issuerDn")
  private String issuerDn = null;
  
  @SerializedName("vid")
  private String vid = null;
  

  
  /**
   * Device Type ID.
   **/
  @ApiModelProperty(value = "Device Type ID.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Unique Name.
   **/
  @ApiModelProperty(value = "Unique Name.")
  public String getUniqueName() {
    return uniqueName;
  }
  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }

  
  /**
   * Latest Manifest version.
   **/
  @ApiModelProperty(value = "Latest Manifest version.")
  public Integer getLatestVersion() {
    return latestVersion;
  }
  public void setLatestVersion(Integer latestVersion) {
    this.latestVersion = latestVersion;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Long lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  
  /**
   * Name.
   **/
  @ApiModelProperty(value = "Name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Description.
   **/
  @ApiModelProperty(value = "Description.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * User ID.
   **/
  @ApiModelProperty(value = "User ID.")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  
  /**
   * Organization ID.
   **/
  @ApiModelProperty(value = "Organization ID.")
  public String getOid() {
    return oid;
  }
  public void setOid(String oid) {
    this.oid = oid;
  }

  
  /**
   * Uses Cloud Connectors SDK
   **/
  @ApiModelProperty(value = "Uses Cloud Connectors SDK")
  public Boolean getHasCloudConnector() {
    return hasCloudConnector;
  }
  public void setHasCloudConnector(Boolean hasCloudConnector) {
    this.hasCloudConnector = hasCloudConnector;
  }

  
  /**
   * Approval status.
   **/
  @ApiModelProperty(value = "Approval status.")
  public Boolean getApproved() {
    return approved;
  }
  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  
  /**
   * Published status.
   **/
  @ApiModelProperty(value = "Published status.")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * Protected status.
   **/
  @ApiModelProperty(value = "Protected status.")
  public Boolean getProtected() {
    return _protected;
  }
  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }

  
  /**
   * In Store.
   **/
  @ApiModelProperty(value = "In Store.")
  public Boolean getInStore() {
    return inStore;
  }
  public void setInStore(Boolean inStore) {
    this.inStore = inStore;
  }

  
  /**
   * Does the current user own a device of this device type
   **/
  @ApiModelProperty(value = "Does the current user own a device of this device type")
  public Boolean getOwnedByCurrentUser() {
    return ownedByCurrentUser;
  }
  public void setOwnedByCurrentUser(Boolean ownedByCurrentUser) {
    this.ownedByCurrentUser = ownedByCurrentUser;
  }

  
  /**
   * Tags
   **/
  @ApiModelProperty(value = "Tags")
  public List<Tag> getTags() {
    return tags;
  }
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  
  /**
   * Require Secure Device Registration (SDR) Protocol.
   **/
  @ApiModelProperty(value = "Require Secure Device Registration (SDR) Protocol.")
  public Boolean getRsp() {
    return rsp;
  }
  public void setRsp(Boolean rsp) {
    this.rsp = rsp;
  }

  
  /**
   * Issuer Distinguished Name (Used in SDR)
   **/
  @ApiModelProperty(value = "Issuer Distinguished Name (Used in SDR)")
  public String getIssuerDn() {
    return issuerDn;
  }
  public void setIssuerDn(String issuerDn) {
    this.issuerDn = issuerDn;
  }

  
  /**
   * Vendor ID. (Used in SDR)
   **/
  @ApiModelProperty(value = "Vendor ID. (Used in SDR)")
  public String getVid() {
    return vid;
  }
  public void setVid(String vid) {
    this.vid = vid;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceType deviceType = (DeviceType) o;
    return Objects.equals(this.id, deviceType.id) &&
        Objects.equals(this.uniqueName, deviceType.uniqueName) &&
        Objects.equals(this.latestVersion, deviceType.latestVersion) &&
        Objects.equals(this.lastUpdated, deviceType.lastUpdated) &&
        Objects.equals(this.name, deviceType.name) &&
        Objects.equals(this.description, deviceType.description) &&
        Objects.equals(this.uid, deviceType.uid) &&
        Objects.equals(this.oid, deviceType.oid) &&
        Objects.equals(this.hasCloudConnector, deviceType.hasCloudConnector) &&
        Objects.equals(this.approved, deviceType.approved) &&
        Objects.equals(this.published, deviceType.published) &&
        Objects.equals(this._protected, deviceType._protected) &&
        Objects.equals(this.inStore, deviceType.inStore) &&
        Objects.equals(this.ownedByCurrentUser, deviceType.ownedByCurrentUser) &&
        Objects.equals(this.tags, deviceType.tags) &&
        Objects.equals(this.rsp, deviceType.rsp) &&
        Objects.equals(this.issuerDn, deviceType.issuerDn) &&
        Objects.equals(this.vid, deviceType.vid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uniqueName, latestVersion, lastUpdated, name, description, uid, oid, hasCloudConnector, approved, published, _protected, inStore, ownedByCurrentUser, tags, rsp, issuerDn, vid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    hasCloudConnector: ").append(toIndentedString(hasCloudConnector)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    inStore: ").append(toIndentedString(inStore)).append("\n");
    sb.append("    ownedByCurrentUser: ").append(toIndentedString(ownedByCurrentUser)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    rsp: ").append(toIndentedString(rsp)).append("\n");
    sb.append("    issuerDn: ").append(toIndentedString(issuerDn)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
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
