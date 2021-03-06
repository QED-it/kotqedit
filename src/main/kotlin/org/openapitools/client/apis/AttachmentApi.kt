/**
* QEDIT - Asset Transfers
* This SDK provides a programmatic way for interacting with QEDIT's _Asset Transfer_ API. The specification definition file is publicly available [in this repository](https://github.com/QED-it/asset_transfers_dev_guide/). 
*
* OpenAPI spec version: 1.8.0
* Contact: dev@qed-it.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import org.openapitools.client.models.AddToGroupRequest
import org.openapitools.client.models.AddToGroupResponse
import org.openapitools.client.models.CreateGroupRequest
import org.openapitools.client.models.CreateGroupResponse
import org.openapitools.client.models.DownloadAttachmentRequest
import org.openapitools.client.models.DownloadAttachmentResponse
import org.openapitools.client.models.ErrorResponse
import org.openapitools.client.models.GetGroupsRequest
import org.openapitools.client.models.GetGroupsResponse
import org.openapitools.client.models.LeaveGroupRequest
import org.openapitools.client.models.LeaveGroupResponse
import org.openapitools.client.models.ListAttachmentsRequest
import org.openapitools.client.models.ListAttachmentsResponse
import org.openapitools.client.models.UploadAttachmentRequest
import org.openapitools.client.models.UploadAttachmentResponse

import org.openapitools.client.infrastructure.*

class AttachmentApi(basePath: kotlin.String = "https://localhost") : ApiClient(basePath) {

    /**
    * Add a new member to a group
    * Shares with another Wallet the credentials required to either write or both read and write to a Group another Wallet. The Group will be automatically added to any Nodes that have the recipient Wallet stored within them, including Nodes that have viewing-only access to said Wallet.
    * @param addToGroupRequest  
    * @return AddToGroupResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun attachmentAddToGroupPost(addToGroupRequest: AddToGroupRequest) : AddToGroupResponse {
        val localVariableBody: kotlin.Any? = addToGroupRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/attachment/add_to_group",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<AddToGroupResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AddToGroupResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Create a new group
    * Groups are cryptographically-secure permission-sets which allow their members to either write or read/write to the Group (there&#39;s no read-only permission). When creating a new Group, a new secret is created which can be used to encrypt Attachments. Attachments can be stored (in encrypted form) in Groups, and Group permissions can be shared with other Wallets.
    * @param createGroupRequest  
    * @return CreateGroupResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun attachmentCreateGroupPost(createGroupRequest: CreateGroupRequest) : CreateGroupResponse {
        val localVariableBody: kotlin.Any? = createGroupRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/attachment/create_group",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<CreateGroupResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as CreateGroupResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Download an Attachment
    * Downloads and decrypts an Attachment given an Attachment ID, and assuming it exists and a Wallet with proper credentials for the relevant Group is used
    * @param downloadAttachmentRequest  
    * @return AttachmentBody
    */
    @Suppress("UNCHECKED_CAST")
    fun attachmentDownloadPost(downloadAttachmentRequest: DownloadAttachmentRequest) : AttachmentBody {
        val localVariableBody: kotlin.Any? = downloadAttachmentRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/attachment/download",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<AttachmentBody>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AttachmentBody
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * List the Groups the Wallet has access to
    * Returns the full list of Groups the Wallet has credentials for (both write-only and read/write).
    * @param getGroupsRequest  
    * @return GetGroupsResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun attachmentGetGroupsPost(getGroupsRequest: GetGroupsRequest) : GetGroupsResponse {
        val localVariableBody: kotlin.Any? = getGroupsRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/attachment/get_groups",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<GetGroupsResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetGroupsResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Removes an owned Wallet from a Group
    * Deletes any credentials and messages that relate to the given Group and are owned by the given Wallet. Does not affect other Wallets in the same Node. Only owners of Wallets can remove their own Wallets from any given Group.
    * @param leaveGroupRequest  
    * @return LeaveGroupResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun attachmentLeaveGroupPost(leaveGroupRequest: LeaveGroupRequest) : LeaveGroupResponse {
        val localVariableBody: kotlin.Any? = leaveGroupRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/attachment/leave_group",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LeaveGroupResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LeaveGroupResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Lists available Attachments
    * Lists the Attachments available for download for a given Wallet, and filtered by further arguments. Note that Attachments must be filtered by exactly one of th e optional filters (transaction hashes or asset IDs).
    * @param listAttachmentsRequest  
    * @return ListAttachmentsResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun attachmentListPost(listAttachmentsRequest: ListAttachmentsRequest) : ListAttachmentsResponse {
        val localVariableBody: kotlin.Any? = listAttachmentsRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/attachment/list",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ListAttachmentsResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ListAttachmentsResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Upload an Attachment and share it with a Group
    * Encrypts and uploads an Attachment so that it becomes shared with a given Group. Returns a globally-unique identifier for the Attachment to be used in subsequent API calls.
    * @param uploadAttachmentRequest  
    * @return UploadAttachmentResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun attachmentUploadPost(uploadAttachmentRequest: UploadAttachmentRequest) : UploadAttachmentResponse {
        val localVariableBody: kotlin.Any? = uploadAttachmentRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/attachment/upload",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<UploadAttachmentResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UploadAttachmentResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
