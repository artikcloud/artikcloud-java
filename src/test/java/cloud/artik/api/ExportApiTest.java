package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.ExportHistoryResponse;
import cloud.artik.model.ExportRequestInfo;
import cloud.artik.model.ExportRequestResponse;
import cloud.artik.model.ExportStatusResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExportApi
 */
public class ExportApiTest {

    private ExportApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExportApi.class);
    }

    
    /**
     * Create Export Request
     *
     * Export normalized messages. The following input combinations are supported:&lt;br/&gt;&lt;table&gt;&lt;tr&gt;&lt;th&gt;Combination&lt;/th&gt;&lt;th&gt;Parameters&lt;/th&gt;&lt;th&gt;Description&lt;/th&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by users&lt;/td&gt;&lt;td&gt;uids&lt;/td&gt;&lt;td&gt;Search by a list of User IDs. For each user in the list, the current authenticated user must have read access over the specified user.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by devices&lt;/td&gt;&lt;td&gt;sdids&lt;/td&gt;&lt;td&gt;Search by Source Device IDs.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by device types&lt;/td&gt;&lt;td&gt;uids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device Type IDs for the given list of users.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by trial&lt;/td&gt;&lt;td&gt;trialId&lt;/td&gt;&lt;td&gt;Search by Trial ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Get by combination of parameters&lt;/td&gt;&lt;td&gt;uids,sdids,sdtids&lt;/td&gt;&lt;td&gt;Search by list of Source Device IDs. Each Device ID must belong to a Source Device Type ID and a User ID.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;Common&lt;/td&gt;&lt;td&gt;startDate,endDate,order,format,url,csvHeaders&lt;/td&gt;&lt;td&gt;Parameters that can be used with the above combinations.&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;
     */
    @Test
    public void exportRequestTest() {
        ExportRequestInfo exportRequestInfo = null;
        // ExportRequestResponse response = api.exportRequest(exportRequestInfo);

        // TODO: test validations
    }
    
    /**
     * Get Export History
     *
     * Get the history of export requests.
     */
    @Test
    public void getExportHistoryTest() {
        String trialId = null;
        Integer count = null;
        Integer offset = null;
        // ExportHistoryResponse response = api.getExportHistory(trialId, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get Export Result
     *
     * Retrieve result of the export query in tgz format. The tar file may contain one or more files with the results.
     */
    @Test
    public void getExportResultTest() {
        String exportId = null;
        // String response = api.getExportResult(exportId);

        // TODO: test validations
    }
    
    /**
     * Check Export Status
     *
     * Check status of the export query.
     */
    @Test
    public void getExportStatusTest() {
        String exportId = null;
        // ExportStatusResponse response = api.getExportStatus(exportId);

        // TODO: test validations
    }
    
}
