package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.CertificateEnvelope;
import cloud.artik.model.DeviceTypeUpdateInput;
import cloud.artik.model.RejectedCSVRowsEnvelope;
import cloud.artik.model.UploadIdEnvelope;
import cloud.artik.model.UploadStatusEnvelope;
import cloud.artik.model.WhitelistEnvelope;
import cloud.artik.model.WhitelistResultEnvelope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface WhitelistingApi {
  /**
   * Delete a vdid from the devicetype whitelist.
   * Delete a vdid from the devicetype whitelist.
   * @param dtid Device Type ID. (required)
   * @param vdid Vendor Device ID. (required)
   * @return Call&lt;WhitelistEnvelope&gt;
   */
  
  @DELETE("devicetypes/{dtid}/whitelist/{vdid}")
  Call<WhitelistEnvelope> deleteVdid(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Path("vdid") String vdid
  );

  /**
   * Delete a whitelist certificate associated with a devicetype.
   * Delete a whitelist certificate associated with a devicetype.
   * @param dtid Device Type ID. (required)
   * @param cid Certificate ID. (required)
   * @return Call&lt;WhitelistEnvelope&gt;
   */
  
  @DELETE("devicetypes/{dtid}/whitelist/certificates/{cid}")
  Call<WhitelistEnvelope> deleteWhitelistCertificate(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Path("cid") String cid
  );

  /**
   * Enable or disble whitelist feature of a device type
   * Enable or disble whitelist feature of a device type
   * @param dtid Device Type ID. (required)
   * @param deviceTypeUpdateInfo Device type update input. (required)
   * @return Call&lt;WhitelistEnvelope&gt;
   */
  
  @Headers({
  	"Content-Type:application/json" 
  })
  @PUT("devicetypes/:dtid/whitelist/enable")
  Call<WhitelistEnvelope> enableWhitelist(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Body DeviceTypeUpdateInput deviceTypeUpdateInfo
  );

  /**
   * Get the list of rejected rows for an uploaded CSV file.
   * Get the list of rejected rows for an uploaded CSV file.
   * @param dtid Device type id related to the uploaded CSV file. (required)
   * @param uploadId Upload id related to the uploaded CSV file. (required)
   * @param count Max results count. (optional)
   * @param offset Result starting offset. (optional)
   * @return Call&lt;RejectedCSVRowsEnvelope&gt;
   */
  
  @GET("devicetypes/{dtid}/whitelist/{uploadId}/rejectedRows")
  Call<RejectedCSVRowsEnvelope> getRejectedRowList(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Path("uploadId") String uploadId, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get the status of a uploaded CSV file.
   * Get the status of a uploaded CSV file.
   * @param dtid Device type id related to the uploaded CSV file. (required)
   * @param uploadId Upload id related to the uploaded CSV file. (required)
   * @return Call&lt;UploadStatusEnvelope&gt;
   */
  
  @GET("devicetypes/{dtid}/whitelist/{uploadId}/status")
  Call<UploadStatusEnvelope> getUploadStatus(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Path("uploadId") String uploadId
  );

  /**
   * Get whitelisted vdids of a device type.
   * Get whitelisted vdids of a device type.
   * @param dtid Device Type ID. (required)
   * @param count Max results count. (optional)
   * @param offset Result starting offset. (optional)
   * @return Call&lt;WhitelistResultEnvelope&gt;
   */
  
  @GET("devicetypes/{dtid}/whitelist")
  Call<WhitelistResultEnvelope> getWhitelist(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get whitelist certificate of device type.
   * Get whitelist certificate of device type.
   * @param dtid Device Type ID. (required)
   * @return Call&lt;CertificateEnvelope&gt;
   */
  
  @GET("devicetypes/{dtid}/whitelist/certificates")
  Call<CertificateEnvelope> getWhitelistCertificate(
    @retrofit2.http.Path("dtid") String dtid
  );

  /**
   * Get the status of whitelist feature (enabled/disabled) of a device type.
   * Get the status of whitelist feature (enabled/disabled) of a device type.
   * @param dtid Device Type ID. (required)
   * @return Call&lt;WhitelistEnvelope&gt;
   */
  
  @GET("devicetypes/{dtid}/whitelist/status")
  Call<WhitelistEnvelope> getWhitelistStatus(
    @retrofit2.http.Path("dtid") String dtid
  );

  /**
   * Upload a CSV file related to the Device Type.
   * Upload a CSV file related to the Device Type.
   * @param dtid Device Type ID. (required)
   * @param file Device Type ID. (required)
   * @return Call&lt;UploadIdEnvelope&gt;
   */
  
  @POST("devicetypes/{dtid}/whitelist")
  Call<UploadIdEnvelope> uploadCSV(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Body byte[] file
  );

}
