package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.AcceptanceStatusResponse;
import cloud.artik.model.DeviceTaskUpdateRequest;
import cloud.artik.model.DeviceTaskUpdateResponse;
import cloud.artik.model.DeviceTypesInfo;
import cloud.artik.model.DeviceTypesInfoEnvelope;
import cloud.artik.model.MetadataEnvelope;
import cloud.artik.model.MetadataPropertiesEnvelope;
import cloud.artik.model.MetadataQueryEnvelope;
import cloud.artik.model.PendingTasksList;
import cloud.artik.model.TaskByDidListEnvelope;
import cloud.artik.model.TaskEnvelope;
import cloud.artik.model.TaskListEnvelope;
import cloud.artik.model.TaskRequest;
import cloud.artik.model.TaskStatusesEnvelope;
import cloud.artik.model.TaskStatusesHistoryEnvelope;
import cloud.artik.model.TaskUpdateRequest;
import cloud.artik.model.TaskUpdateResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesManagementApi
 */
public class DevicesManagementApiTest {

    private DevicesManagementApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DevicesManagementApi.class);
    }

    
    /**
     * Create a new task for one or more devices
     *
     * Create a new task for one or more devices
     */
    @Test
    public void createTasksTest() {
        TaskRequest taskPayload = null;
        // TaskEnvelope response = api.createTasks(taskPayload);

        // TODO: test validations
    }
    
    /**
     * Deletes a device&#39;s properties.
     *
     * Deletes a device&#39;s properties.
     */
    @Test
    public void deleteServerPropertiesTest() {
        String did = null;
        // MetadataEnvelope response = api.deleteServerProperties(did);

        // TODO: test validations
    }
    
    /**
     * Returns the list of tasks for a particular device id with optional status filter.
     *
     * Returns the list of tasks for a particular device id with optional status filter.
     */
    @Test
    public void getAllByDidTest() {
        String did = null;
        Integer count = null;
        Integer offset = null;
        String status = null;
        String order = null;
        String sort = null;
        // TaskByDidListEnvelope response = api.getAllByDid(did, count, offset, status, order, sort);

        // TODO: test validations
    }
    
    /**
     * Returns the list of  pending tasks for a particular device id.
     *
     * Returns the list of all pending tasks (where acceptanceStatus is equal to WAITING ) for a particular device id.
     */
    @Test
    public void getAllPendingTasksByDidTest() {
        // PendingTasksList response = api.getAllPendingTasksByDid();

        // TODO: test validations
    }
    
    /**
     * Read a device type device management information.
     *
     * Read a device type device management information.
     */
    @Test
    public void getDeviceTypesInfoTest() {
        String dtid = null;
        // DeviceTypesInfoEnvelope response = api.getDeviceTypesInfo(dtid);

        // TODO: test validations
    }
    
    /**
     * Get a device type&#39;s device management manifest properties
     *
     * Get a device type&#39;s device management manifest properties
     */
    @Test
    public void getManifestPropertiesTest() {
        String dtid = null;
        // MetadataPropertiesEnvelope response = api.getManifestProperties(dtid);

        // TODO: test validations
    }
    
    /**
     * Read a device&#39;s properties.
     *
     * Read a device&#39;s properties.
     */
    @Test
    public void getPropertiesTest() {
        String did = null;
        Boolean includeTimestamp = null;
        // MetadataEnvelope response = api.getProperties(did, includeTimestamp);

        // TODO: test validations
    }
    
    /**
     * Returns the details and status of a task id and the individual statuses of each device id in the list.
     *
     * Returns the details and status of a task id and the individual statuses of each device id in the list.
     */
    @Test
    public void getStatusesTest() {
        String tid = null;
        Integer count = null;
        Integer offset = null;
        String status = null;
        String dids = null;
        // TaskStatusesEnvelope response = api.getStatuses(tid, count, offset, status, dids);

        // TODO: test validations
    }
    
    /**
     * Returns the history of the status changes for a specific task id, or for a specific device id in that task.
     *
     * Returns the history of the status changes for a specific task id, or for a specific device id in that task.
     */
    @Test
    public void getStatusesHistoryTest() {
        String tid = null;
        String did = null;
        // TaskStatusesHistoryEnvelope response = api.getStatusesHistory(tid, did);

        // TODO: test validations
    }
    
    /**
     * Returns the details and global status of a specific task id.
     *
     * Returns the details and global status of a specific task id.
     */
    @Test
    public void getTaskByIDTest() {
        String tid = null;
        // TaskEnvelope response = api.getTaskByID(tid);

        // TODO: test validations
    }
    
    /**
     * Returns the all the tasks for a device type.
     *
     * Returns the all the tasks for a device type.
     */
    @Test
    public void getTasksTest() {
        String dtid = null;
        Integer count = null;
        Integer offset = null;
        String status = null;
        String order = null;
        String sort = null;
        // TaskListEnvelope response = api.getTasks(dtid, count, offset, status, order, sort);

        // TODO: test validations
    }
    
    /**
     * Notify/Inform about task acceptance status
     *
     * User notify/informs to ARTIKCloud about task acceptance status
     */
    @Test
    public void notifyAboutAcceptanceTest() {
        String tid = null;
        String did = null;
        AcceptanceStatusResponse notifyAboutAcceptanceStatus = null;
        // AcceptanceStatusResponse response = api.notifyAboutAcceptance(tid, did, notifyAboutAcceptanceStatus);

        // TODO: test validations
    }
    
    /**
     * Query device properties across devices.
     *
     * Query device properties across devices.
     */
    @Test
    public void queryPropertiesTest() {
        String dtid = null;
        Integer count = null;
        Integer offset = null;
        String filter = null;
        Boolean includeTimestamp = null;
        // MetadataQueryEnvelope response = api.queryProperties(dtid, count, offset, filter, includeTimestamp);

        // TODO: test validations
    }
    
    /**
     * Updates a device type information
     *
     * Updates a device type information
     */
    @Test
    public void updateDeviceTypesInfoTest() {
        String dtid = null;
        DeviceTypesInfo deviceTypeInfo = null;
        // DeviceTypesInfoEnvelope response = api.updateDeviceTypesInfo(dtid, deviceTypeInfo);

        // TODO: test validations
    }
    
    /**
     * Updates a device&#39;s server properties.
     *
     * Updates a device&#39;s server properties.
     */
    @Test
    public void updateServerPropertiesTest() {
        String did = null;
        Object deviceProperties = null;
        // MetadataEnvelope response = api.updateServerProperties(did, deviceProperties);

        // TODO: test validations
    }
    
    /**
     * Updates a task for all devices - For now just allows changing the state to cancelled.
     *
     * Updates a task for all devices - For now just allows changing the state to cancelled.
     */
    @Test
    public void updateTaskTest() {
        String tid = null;
        TaskUpdateRequest taskUpdateRequest = null;
        // TaskUpdateResponse response = api.updateTask(tid, taskUpdateRequest);

        // TODO: test validations
    }
    
    /**
     * Updates a task for a specific device - For now just allows changing the state to cancelled.
     *
     * Updates a task for a specific device - For now just allows changing the state to cancelled.
     */
    @Test
    public void updateTaskForDeviceTest() {
        String tid = null;
        String did = null;
        DeviceTaskUpdateRequest deviceTaskUpdateRequest = null;
        // DeviceTaskUpdateResponse response = api.updateTaskForDevice(tid, did, deviceTaskUpdateRequest);

        // TODO: test validations
    }
    
}
