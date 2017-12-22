package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.CertificateEnvelope;
import cloud.artik.model.DeviceTypeUpdateInput;
import cloud.artik.model.RejectedCSVRowsEnvelope;
import cloud.artik.model.UploadIdEnvelope;
import cloud.artik.model.UploadStatusEnvelope;
import cloud.artik.model.WhitelistEnvelope;
import cloud.artik.model.WhitelistResultEnvelope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WhitelistingApi
 */
public class WhitelistingApiTest {

    private WhitelistingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WhitelistingApi.class);
    }

    
    /**
     * Delete a vdid from the devicetype whitelist.
     *
     * Delete a vdid from the devicetype whitelist.
     */
    @Test
    public void deleteVdidTest() {
        String dtid = null;
        String vdid = null;
        // WhitelistEnvelope response = api.deleteVdid(dtid, vdid);

        // TODO: test validations
    }
    
    /**
     * Delete a whitelist certificate associated with a devicetype.
     *
     * Delete a whitelist certificate associated with a devicetype.
     */
    @Test
    public void deleteWhitelistCertificateTest() {
        String dtid = null;
        String cid = null;
        // WhitelistEnvelope response = api.deleteWhitelistCertificate(dtid, cid);

        // TODO: test validations
    }
    
    /**
     * Enable or disble whitelist feature of a device type
     *
     * Enable or disble whitelist feature of a device type
     */
    @Test
    public void enableWhitelistTest() {
        String dtid = null;
        DeviceTypeUpdateInput deviceTypeUpdateInfo = null;
        // WhitelistEnvelope response = api.enableWhitelist(dtid, deviceTypeUpdateInfo);

        // TODO: test validations
    }
    
    /**
     * Get the list of rejected rows for an uploaded CSV file.
     *
     * Get the list of rejected rows for an uploaded CSV file.
     */
    @Test
    public void getRejectedRowListTest() {
        String dtid = null;
        String uploadId = null;
        Integer count = null;
        Integer offset = null;
        // RejectedCSVRowsEnvelope response = api.getRejectedRowList(dtid, uploadId, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get the status of a uploaded CSV file.
     *
     * Get the status of a uploaded CSV file.
     */
    @Test
    public void getUploadStatusTest() {
        String dtid = null;
        String uploadId = null;
        // UploadStatusEnvelope response = api.getUploadStatus(dtid, uploadId);

        // TODO: test validations
    }
    
    /**
     * Get whitelisted vdids of a device type.
     *
     * Get whitelisted vdids of a device type.
     */
    @Test
    public void getWhitelistTest() {
        String dtid = null;
        Integer count = null;
        Integer offset = null;
        // WhitelistResultEnvelope response = api.getWhitelist(dtid, count, offset);

        // TODO: test validations
    }
    
    /**
     * Get whitelist certificate of device type.
     *
     * Get whitelist certificate of device type.
     */
    @Test
    public void getWhitelistCertificateTest() {
        String dtid = null;
        // CertificateEnvelope response = api.getWhitelistCertificate(dtid);

        // TODO: test validations
    }
    
    /**
     * Get the status of whitelist feature (enabled/disabled) of a device type.
     *
     * Get the status of whitelist feature (enabled/disabled) of a device type.
     */
    @Test
    public void getWhitelistStatusTest() {
        String dtid = null;
        // WhitelistEnvelope response = api.getWhitelistStatus(dtid);

        // TODO: test validations
    }
    
    /**
     * Upload a CSV file related to the Device Type.
     *
     * Upload a CSV file related to the Device Type.
     */
    @Test
    public void uploadCSVTest() {
        String dtid = null;
        byte[] file = null;
        // UploadIdEnvelope response = api.uploadCSV(dtid, file);

        // TODO: test validations
    }
    
}
