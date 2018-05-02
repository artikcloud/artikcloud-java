package cloud.artik.api;

import cloud.artik.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DevicesManagementApi {
  /**
   * Create a new task for one or more devices
   * Create a new task for one or more devices
   * @param taskPayload Task object to be created (required)
   * @return Call&lt;TaskEnvelope&gt;
   */
  
  @POST("devicemgmt/tasks")
  Call<TaskEnvelope> createTasks(
    @retrofit2.http.Body TaskRequest taskPayload
  );

  /**
   * Deletes a device&#39;s properties.
   * Deletes a device&#39;s properties.
   * @param did Device ID. (required)
   * @return Call&lt;MetadataEnvelope&gt;
   */
  
  @DELETE("devicemgmt/devices/{did}/serverproperties")
  Call<MetadataEnvelope> deleteServerProperties(
    @retrofit2.http.Path("did") String did
  );

  /**
   * Returns the list of tasks for a particular device id with optional status filter.
   * Returns the list of tasks for a particular device id with optional status filter.
   * @param did Device ID. (required)
   * @param count Max results count. (optional)
   * @param offset Result starting offset. (optional)
   * @param status Status filter. Comma-separated statuses. (optional)
   * @param order Sort results by a field. Valid fields: createdOn. (optional)
   * @param sort Sort order. Valid values: asc or desc. (optional)
   * @return Call&lt;TaskByDidListEnvelope&gt;
   */
  
  @GET("devicemgmt/devices/{did}/tasks")
  Call<TaskByDidListEnvelope> getAllByDid(
    @retrofit2.http.Path("did") String did, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("order") String order, @retrofit2.http.Query("sort") String sort
  );

  /**
   * Returns the list of  pending tasks for a particular device id.
   * Returns the list of all pending tasks (where acceptanceStatus is equal to WAITING ) for a particular device id.
   * @return Call&lt;PendingTasksList&gt;
   */
  
  @GET("devicemgmt/devices/{did}/pendingtasks")
  Call<PendingTasksList> getAllPendingTasksByDid();
    

  /**
   * Read a device type device management information.
   * Read a device type device management information.
   * @param dtid Device type ID. (required)
   * @return Call&lt;DeviceTypesInfoEnvelope&gt;
   */
  
  @GET("devicemgmt/devicetypes/{dtid}")
  Call<DeviceTypesInfoEnvelope> getDeviceTypesInfo(
    @retrofit2.http.Path("dtid") String dtid
  );

  /**
   * Get a device type&#39;s device management manifest properties
   * Get a device type&#39;s device management manifest properties
   * @param dtid Device Type ID. (required)
   * @return Call&lt;MetadataPropertiesEnvelope&gt;
   */
  
  @GET("devicemgmt/devicetypes/{dtid}/manifest/properties")
  Call<MetadataPropertiesEnvelope> getManifestProperties(
    @retrofit2.http.Path("dtid") String dtid
  );

  /**
   * Read a device&#39;s properties.
   * Read a device&#39;s properties.
   * @param did Device ID. (required)
   * @param includeTimestamp Include timestamp. (optional)
   * @return Call&lt;MetadataEnvelope&gt;
   */
  
  @GET("devicemgmt/devices/{did}/properties")
  Call<MetadataEnvelope> getProperties(
    @retrofit2.http.Path("did") String did, @retrofit2.http.Query("includeTimestamp") Boolean includeTimestamp
  );

  /**
   * Returns the details and status of a task id and the individual statuses of each device id in the list.
   * Returns the details and status of a task id and the individual statuses of each device id in the list.
   * @param tid Task ID. (required)
   * @param count Max results count. (optional)
   * @param offset Result starting offset. (optional)
   * @param status Status filter. Comma-separated statuses. (optional)
   * @param dids Devices filter. Comma-separated device IDs. (optional)
   * @return Call&lt;TaskStatusesEnvelope&gt;
   */
  
  @GET("devicemgmt/tasks/{tid}/statuses")
  Call<TaskStatusesEnvelope> getStatuses(
    @retrofit2.http.Path("tid") String tid, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("dids") String dids
  );

  /**
   * Returns the history of the status changes for a specific task id, or for a specific device id in that task.
   * Returns the history of the status changes for a specific task id, or for a specific device id in that task.
   * @param tid Task ID. (required)
   * @param did Device ID. Optional. (optional)
   * @return Call&lt;TaskStatusesHistoryEnvelope&gt;
   */
  
  @GET("devicemgmt/tasks/{tid}/statuses/history")
  Call<TaskStatusesHistoryEnvelope> getStatusesHistory(
    @retrofit2.http.Path("tid") String tid, @retrofit2.http.Query("did") String did
  );

  /**
   * Returns the details and global status of a specific task id.
   * Returns the details and global status of a specific task id.
   * @param tid Task ID. (required)
   * @return Call&lt;TaskEnvelope&gt;
   */
  
  @GET("devicemgmt/tasks/{tid}")
  Call<TaskEnvelope> getTaskByID(
    @retrofit2.http.Path("tid") String tid
  );

  /**
   * Returns the all the tasks for a device type.
   * Returns the all the tasks for a device type.
   * @param dtid Device Type ID. (required)
   * @param count Max results count. (optional)
   * @param offset Result starting offset. (optional)
   * @param status Status filter. Comma-separated statuses. (optional)
   * @param order Sort results by a field. Valid fields: createdOn. (optional)
   * @param sort Sort order. Valid values: asc or desc. (optional)
   * @return Call&lt;TaskListEnvelope&gt;
   */
  
  @GET("devicemgmt/tasks")
  Call<TaskListEnvelope> getTasks(
    @retrofit2.http.Query("dtid") String dtid, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("order") String order, @retrofit2.http.Query("sort") String sort
  );

  /**
   * Notify/Inform about task acceptance status
   * User notify/informs to ARTIKCloud about task acceptance status
   * @param tid Task ID. (required)
   * @param did Device ID. (required)
   * @param notifyAboutAcceptanceStatus Notify about task acceptance status (required)
   * @return Call&lt;AcceptanceStatusResponse&gt;
   */
  
  @POST("devicemgmt/tasks/{tid}/devices/{did}/acceptance")
  Call<AcceptanceStatusResponse> notifyAboutAcceptance(
    @retrofit2.http.Path("tid") String tid, @retrofit2.http.Path("did") String did, @retrofit2.http.Body AcceptanceStatusResponse notifyAboutAcceptanceStatus
  );

  /**
   * Query device properties across devices.
   * Query device properties across devices.
   * @param dtid Device Type ID. (required)
   * @param count Max results count. (optional)
   * @param offset Result starting offset. (optional)
   * @param filter Query filter. Comma-separated key&#x3D;value pairs (optional)
   * @param includeTimestamp Include timestamp. (optional)
   * @return Call&lt;MetadataQueryEnvelope&gt;
   */
  
  @GET("devicemgmt/devices/properties")
  Call<MetadataQueryEnvelope> queryProperties(
    @retrofit2.http.Query("dtid") String dtid, @retrofit2.http.Query("count") Integer count, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("filter") String filter, @retrofit2.http.Query("includeTimestamp") Boolean includeTimestamp
  );

  /**
   * Updates a device type information
   * Updates a device type information
   * @param dtid Device type ID. (required)
   * @param deviceTypeInfo Device type info object to be set (required)
   * @return Call&lt;DeviceTypesInfoEnvelope&gt;
   */
  
  @PUT("devicemgmt/devicetypes/{dtid}")
  Call<DeviceTypesInfoEnvelope> updateDeviceTypesInfo(
    @retrofit2.http.Path("dtid") String dtid, @retrofit2.http.Body DeviceTypesInfo deviceTypeInfo
  );

  /**
   * Updates a device&#39;s server properties.
   * Updates a device&#39;s server properties.
   * @param did Device ID. (required)
   * @param deviceProperties Device properties object to be set (required)
   * @return Call&lt;MetadataEnvelope&gt;
   */
  
  @POST("devicemgmt/devices/{did}/serverproperties")
  Call<MetadataEnvelope> updateServerProperties(
    @retrofit2.http.Path("did") String did, @retrofit2.http.Body Object deviceProperties
  );

  /**
   * Updates a task for all devices - For now just allows changing the state to cancelled.
   * Updates a task for all devices - For now just allows changing the state to cancelled.
   * @param tid Task ID. (required)
   * @param taskUpdateRequest Task update request (required)
   * @return Call&lt;TaskUpdateResponse&gt;
   */
  
  @PUT("devicemgmt/tasks/{tid}")
  Call<TaskUpdateResponse> updateTask(
    @retrofit2.http.Path("tid") String tid, @retrofit2.http.Body TaskUpdateRequest taskUpdateRequest
  );

  /**
   * Updates a task for a specific device - For now just allows changing the state to cancelled.
   * Updates a task for a specific device - For now just allows changing the state to cancelled.
   * @param tid Task ID. (required)
   * @param did Device ID. (required)
   * @param deviceTaskUpdateRequest Device task update request (required)
   * @return Call&lt;DeviceTaskUpdateResponse&gt;
   */
  
  @PUT("devicemgmt/tasks/{tid}/devices/{did}")
  Call<DeviceTaskUpdateResponse> updateTaskForDevice(
    @retrofit2.http.Path("tid") String tid, @retrofit2.http.Path("did") String did, @retrofit2.http.Body DeviceTaskUpdateRequest deviceTaskUpdateRequest
  );

}
