# AttachmentApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentAddToGroupPost**](AttachmentApi.md#attachmentAddToGroupPost) | **POST** /attachment/add_to_group | Add a new member to a group
[**attachmentCreateGroupPost**](AttachmentApi.md#attachmentCreateGroupPost) | **POST** /attachment/create_group | Create a new group
[**attachmentDownloadPost**](AttachmentApi.md#attachmentDownloadPost) | **POST** /attachment/download | Download an Attachment
[**attachmentGetGroupsPost**](AttachmentApi.md#attachmentGetGroupsPost) | **POST** /attachment/get_groups | List the Groups the Wallet has access to
[**attachmentLeaveGroupPost**](AttachmentApi.md#attachmentLeaveGroupPost) | **POST** /attachment/leave_group | Removes an owned Wallet from a Group
[**attachmentListPost**](AttachmentApi.md#attachmentListPost) | **POST** /attachment/list | Lists available Attachments
[**attachmentUploadPost**](AttachmentApi.md#attachmentUploadPost) | **POST** /attachment/upload | Upload an Attachment and share it with a Group


<a name="attachmentAddToGroupPost"></a>
# **attachmentAddToGroupPost**
> AddToGroupResponse attachmentAddToGroupPost(addToGroupRequest)

Add a new member to a group

Shares with another Wallet the credentials required to either write or both read and write to a Group another Wallet. The Group will be automatically added to any Nodes that have the recipient Wallet stored within them, including Nodes that have viewing-only access to said Wallet.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AttachmentApi()
val addToGroupRequest : AddToGroupRequest =  // AddToGroupRequest | 
try {
    val result : AddToGroupResponse = apiInstance.attachmentAddToGroupPost(addToGroupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#attachmentAddToGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#attachmentAddToGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addToGroupRequest** | [**AddToGroupRequest**](AddToGroupRequest.md)|  |

### Return type

[**AddToGroupResponse**](AddToGroupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachmentCreateGroupPost"></a>
# **attachmentCreateGroupPost**
> CreateGroupResponse attachmentCreateGroupPost(createGroupRequest)

Create a new group

Groups are cryptographically-secure permission-sets which allow their members to either write or read/write to the Group (there&#39;s no read-only permission). When creating a new Group, a new secret is created which can be used to encrypt Attachments. Attachments can be stored (in encrypted form) in Groups, and Group permissions can be shared with other Wallets.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AttachmentApi()
val createGroupRequest : CreateGroupRequest =  // CreateGroupRequest | 
try {
    val result : CreateGroupResponse = apiInstance.attachmentCreateGroupPost(createGroupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#attachmentCreateGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#attachmentCreateGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGroupRequest** | [**CreateGroupRequest**](CreateGroupRequest.md)|  |

### Return type

[**CreateGroupResponse**](CreateGroupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachmentDownloadPost"></a>
# **attachmentDownloadPost**
> AttachmentBody attachmentDownloadPost(downloadAttachmentRequest)

Download an Attachment

Downloads and decrypts an Attachment given an Attachment ID, and assuming it exists and a Wallet with proper credentials for the relevant Group is used

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AttachmentApi()
val downloadAttachmentRequest : DownloadAttachmentRequest =  // DownloadAttachmentRequest | 
try {
    val result : AttachmentBody = apiInstance.attachmentDownloadPost(downloadAttachmentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#attachmentDownloadPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#attachmentDownloadPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **downloadAttachmentRequest** | [**DownloadAttachmentRequest**](DownloadAttachmentRequest.md)|  |

### Return type

[**AttachmentBody**](AttachmentBody.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachmentGetGroupsPost"></a>
# **attachmentGetGroupsPost**
> GetGroupsResponse attachmentGetGroupsPost(getGroupsRequest)

List the Groups the Wallet has access to

Returns the full list of Groups the Wallet has credentials for (both write-only and read/write).

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AttachmentApi()
val getGroupsRequest : GetGroupsRequest =  // GetGroupsRequest | 
try {
    val result : GetGroupsResponse = apiInstance.attachmentGetGroupsPost(getGroupsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#attachmentGetGroupsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#attachmentGetGroupsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getGroupsRequest** | [**GetGroupsRequest**](GetGroupsRequest.md)|  |

### Return type

[**GetGroupsResponse**](GetGroupsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachmentLeaveGroupPost"></a>
# **attachmentLeaveGroupPost**
> LeaveGroupResponse attachmentLeaveGroupPost(leaveGroupRequest)

Removes an owned Wallet from a Group

Deletes any credentials and messages that relate to the given Group and are owned by the given Wallet. Does not affect other Wallets in the same Node. Only owners of Wallets can remove their own Wallets from any given Group.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AttachmentApi()
val leaveGroupRequest : LeaveGroupRequest =  // LeaveGroupRequest | 
try {
    val result : LeaveGroupResponse = apiInstance.attachmentLeaveGroupPost(leaveGroupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#attachmentLeaveGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#attachmentLeaveGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveGroupRequest** | [**LeaveGroupRequest**](LeaveGroupRequest.md)|  |

### Return type

[**LeaveGroupResponse**](LeaveGroupResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachmentListPost"></a>
# **attachmentListPost**
> ListAttachmentsResponse attachmentListPost(listAttachmentsRequest)

Lists available Attachments

Lists the Attachments available for download for a given Wallet, and filtered by further arguments. Note that Attachments must be filtered by exactly one of th e optional filters (transaction hashes or asset IDs).

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AttachmentApi()
val listAttachmentsRequest : ListAttachmentsRequest =  // ListAttachmentsRequest | 
try {
    val result : ListAttachmentsResponse = apiInstance.attachmentListPost(listAttachmentsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#attachmentListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#attachmentListPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listAttachmentsRequest** | [**ListAttachmentsRequest**](ListAttachmentsRequest.md)|  |

### Return type

[**ListAttachmentsResponse**](ListAttachmentsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachmentUploadPost"></a>
# **attachmentUploadPost**
> UploadAttachmentResponse attachmentUploadPost(uploadAttachmentRequest)

Upload an Attachment and share it with a Group

Encrypts and uploads an Attachment so that it becomes shared with a given Group. Returns a globally-unique identifier for the Attachment to be used in subsequent API calls.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AttachmentApi()
val uploadAttachmentRequest : UploadAttachmentRequest =  // UploadAttachmentRequest | 
try {
    val result : UploadAttachmentResponse = apiInstance.attachmentUploadPost(uploadAttachmentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentApi#attachmentUploadPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentApi#attachmentUploadPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadAttachmentRequest** | [**UploadAttachmentRequest**](UploadAttachmentRequest.md)|  |

### Return type

[**UploadAttachmentResponse**](UploadAttachmentResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

