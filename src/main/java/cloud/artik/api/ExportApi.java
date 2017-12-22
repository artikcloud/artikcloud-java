package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import cloud.artik.model.ExportHistoryResponse;
import cloud.artik.model.ExportRequestInfo;
import cloud.artik.model.ExportRequestResponse;
import cloud.artik.model.ExportStatusResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ExportApi {
  /**
   * Create Export Request
   * Export normalized messages. The following input combinations are supported:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by users&lt;/td&gt;&lt;td&gt;uids&lt;/td&gt;&lt;td&gt;Search by a list of User IDs. For each user in the list, the current authenticated user must have read access over the specified user.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by devices&lt;/td&gt;&lt;td&gt;sdids&lt;/td&gt;&lt;td&gt;Search by Source Device IDs.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by device types&lt;/td&gt;&lt;td&gt;uids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device Type IDs for the given list of users.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by trial&lt;/td&gt;&lt;td&gt;trialId&lt;/td&gt;&lt;td&gt;Search by Trial ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by combination of parameters&lt;/td&gt;&lt;td&gt;uids,sdids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device IDs. Each Device ID must belong to a Source Device Type ID and a User ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;startDate,endDate,order,format,url,csvHeaders&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
   * @param exportRequestInfo ExportRequest object that is passed in the body (required)
   * @return Call&lt;ExportRequestResponse&gt;
   */
  
  @POST("messages/export")
  Call<ExportRequestResponse> exportRequest(
    @retrofit2.http.Body ExportRequestInfo exportRequestInfo
  );

  /**
   * Get Export History
   * Get the history of export requests.
   * @param trialId Filter by trialId. (optional)
   * @param count Pagination count. (optional)
   * @param offset Pagination offset. (optional)
   * @return Call&lt;ExportHistoryResponse&gt;
   */
  
  @GET("messages/export/history")
  Call<ExportHistoryResponse> getExportHistory(
    @retrofit2.http.Query("trialId") String trialId, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get Export Result
   * Retrieve result of the export query in tgz format. The tar file may contain one or more files with the results.
   * @param exportId Export ID of the export query. (required)
   * @return Call&lt;String&gt;
   */
  
  @GET("messages/export/{exportId}/result")
  Call<String> getExportResult(
    @retrofit2.http.Path("exportId") String exportId
  );

  /**
   * Check Export Status
   * Check status of the export query.
   * @param exportId Export ID of the export query. (required)
   * @return Call&lt;ExportStatusResponse&gt;
   */
  
  @GET("messages/export/{exportId}/status")
  Call<ExportStatusResponse> getExportStatus(
    @retrofit2.http.Path("exportId") String exportId
  );

}
