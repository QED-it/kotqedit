# NodeApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nodeApproveTaskPost**](NodeApi.md#nodeApproveTaskPost) | **POST** /node/approve_task | Approve task with pending incoming transaction [async call]
[**nodeCancelTaskPost**](NodeApi.md#nodeCancelTaskPost) | **POST** /node/cancel_task | Cancel task with pending incoming transaction both incoming and outgoing [async call]
[**nodeDeleteWalletPost**](NodeApi.md#nodeDeleteWalletPost) | **POST** /node/delete_wallet | Delete a Wallet [async call]
[**nodeExportAuditorAccessWalletPost**](NodeApi.md#nodeExportAuditorAccessWalletPost) | **POST** /node/export_auditor_access_wallet | Export viewing credentials for a Wallet
[**nodeExportWalletPost**](NodeApi.md#nodeExportWalletPost) | **POST** /node/export_wallet | Export wallet secret key
[**nodeGenerateWalletPost**](NodeApi.md#nodeGenerateWalletPost) | **POST** /node/generate_wallet | Generate a new Wallet
[**nodeGetAllWalletsPost**](NodeApi.md#nodeGetAllWalletsPost) | **POST** /node/get_all_wallets | Get all wallet IDs
[**nodeGetNotificationsPost**](NodeApi.md#nodeGetNotificationsPost) | **POST** /node/get_notifications | Get notifications
[**nodeGetRulesPost**](NodeApi.md#nodeGetRulesPost) | **POST** /node/get_rules | Get network governance Rules
[**nodeGetTaskStatusPost**](NodeApi.md#nodeGetTaskStatusPost) | **POST** /node/get_task_status | Get a specific task (by ID)
[**nodeGetTasksPost**](NodeApi.md#nodeGetTasksPost) | **POST** /node/get_tasks | Get a (potentially) filtered list of all Tasks
[**nodeImportAuditorAccessWalletPost**](NodeApi.md#nodeImportAuditorAccessWalletPost) | **POST** /node/import_auditor_access_wallet | Import viewing credentials for a Wallet [async call]
[**nodeImportWalletPost**](NodeApi.md#nodeImportWalletPost) | **POST** /node/import_wallet | Import Wallet from a known secret key and authorization [async call]


<a name="nodeApproveTaskPost"></a>
# **nodeApproveTaskPost**
> nodeApproveTaskPost(taskActionRequest)

Approve task with pending incoming transaction [async call]

Confirmation request tasks are confirmed using this point. After the user confirms the incoming transaction, it is asynchronously sent to the blockchain and its status can be queried like any other async task.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val taskActionRequest : TaskActionRequest =  // TaskActionRequest | 
try {
    apiInstance.nodeApproveTaskPost(taskActionRequest)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeApproveTaskPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeApproveTaskPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskActionRequest** | [**TaskActionRequest**](TaskActionRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeCancelTaskPost"></a>
# **nodeCancelTaskPost**
> AsyncTaskCreatedResponse nodeCancelTaskPost(taskActionRequest)

Cancel task with pending incoming transaction both incoming and outgoing [async call]

A user may select to decline an incoming transaction. The related task will change its result to failure both on senders and the receivers side. This endpoint can also be used to cancel an outgoing pending transaction that is awaiting user interaction from the receiver

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val taskActionRequest : TaskActionRequest =  // TaskActionRequest | 
try {
    val result : AsyncTaskCreatedResponse = apiInstance.nodeCancelTaskPost(taskActionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeCancelTaskPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeCancelTaskPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskActionRequest** | [**TaskActionRequest**](TaskActionRequest.md)|  |

### Return type

[**AsyncTaskCreatedResponse**](AsyncTaskCreatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeDeleteWalletPost"></a>
# **nodeDeleteWalletPost**
> AsyncTaskCreatedResponse nodeDeleteWalletPost(deleteWalletRequest)

Delete a Wallet [async call]

Deletes a Wallet from the Node; All private information about the Wallet will be deleted including transactional history, balances, and keys; If the secret key of the Wallet are not stored elsewhere then all Assets held in the Wallet will be forever lost! If the secret key of the Wallet is stored elsewhere, then all held Assets and the entire transactional history of the Wallet can be restored from the Blockchain at any time by importing the Wallet into a Node.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val deleteWalletRequest : DeleteWalletRequest =  // DeleteWalletRequest | 
try {
    val result : AsyncTaskCreatedResponse = apiInstance.nodeDeleteWalletPost(deleteWalletRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeDeleteWalletPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeDeleteWalletPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteWalletRequest** | [**DeleteWalletRequest**](DeleteWalletRequest.md)|  |

### Return type

[**AsyncTaskCreatedResponse**](AsyncTaskCreatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeExportAuditorAccessWalletPost"></a>
# **nodeExportAuditorAccessWalletPost**
> ExportAuditorAccessWalletResponse nodeExportAuditorAccessWalletPost(exportAuditorAccessWalletRequest)

Export viewing credentials for a Wallet

Export a viewing key that allows viewing all transactions to and from a wallet, including past transactions. The viewing key is encrypted for a specific Address, and can only be recovered by someone in possession of either a secret key or a viewing key for the Wallet that Address belongs to. The viewing key does enable making any transactions (including rule changes, issuance, and transfers) on behalf of the exported Wallet.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val exportAuditorAccessWalletRequest : ExportAuditorAccessWalletRequest =  // ExportAuditorAccessWalletRequest | 
try {
    val result : ExportAuditorAccessWalletResponse = apiInstance.nodeExportAuditorAccessWalletPost(exportAuditorAccessWalletRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeExportAuditorAccessWalletPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeExportAuditorAccessWalletPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportAuditorAccessWalletRequest** | [**ExportAuditorAccessWalletRequest**](ExportAuditorAccessWalletRequest.md)|  |

### Return type

[**ExportAuditorAccessWalletResponse**](ExportAuditorAccessWalletResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeExportWalletPost"></a>
# **nodeExportWalletPost**
> ExportWalletResponse nodeExportWalletPost(exportWalletRequest)

Export wallet secret key

Export an encrypted form of the Wallet&#39;s secret key; The authorization password under which the secret key is encrypted is the same one under which it was originally created or imported; Knowledge of the secret key and the authorization password is required to import the Wallet into a Node in the future.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val exportWalletRequest : ExportWalletRequest =  // ExportWalletRequest | 
try {
    val result : ExportWalletResponse = apiInstance.nodeExportWalletPost(exportWalletRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeExportWalletPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeExportWalletPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportWalletRequest** | [**ExportWalletRequest**](ExportWalletRequest.md)|  |

### Return type

[**ExportWalletResponse**](ExportWalletResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeGenerateWalletPost"></a>
# **nodeGenerateWalletPost**
> nodeGenerateWalletPost(generateWalletRequest)

Generate a new Wallet

Randomly generate a new Wallet under a specified ID; This only affects the Node and in particular nothing about this action is broadcast to the Blockchain; The Wallet ID is required to be unique within the Node, but can otherwise be user-defined.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val generateWalletRequest : GenerateWalletRequest =  // GenerateWalletRequest | 
try {
    apiInstance.nodeGenerateWalletPost(generateWalletRequest)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeGenerateWalletPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeGenerateWalletPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateWalletRequest** | [**GenerateWalletRequest**](GenerateWalletRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeGetAllWalletsPost"></a>
# **nodeGetAllWalletsPost**
> GetAllWalletsResponse nodeGetAllWalletsPost()

Get all wallet IDs

Returns a list of the IDs of all Wallets currently stored on the Node. Both full-access and view-only Wallets are listed.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
try {
    val result : GetAllWalletsResponse = apiInstance.nodeGetAllWalletsPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeGetAllWalletsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeGetAllWalletsPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAllWalletsResponse**](GetAllWalletsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nodeGetNotificationsPost"></a>
# **nodeGetNotificationsPost**
> GetNotificationsResponse nodeGetNotificationsPost(getNotificationsRequest)

Get notifications

Notifications are the Node&#39;s way to report about recent activity and status changes. This endpoint allows polling for these changes and fetching the updates. The notifications can be filtered in multiple ways.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val getNotificationsRequest : GetNotificationsRequest =  // GetNotificationsRequest | 
try {
    val result : GetNotificationsResponse = apiInstance.nodeGetNotificationsPost(getNotificationsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeGetNotificationsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeGetNotificationsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getNotificationsRequest** | [**GetNotificationsRequest**](GetNotificationsRequest.md)|  |

### Return type

[**GetNotificationsResponse**](GetNotificationsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeGetRulesPost"></a>
# **nodeGetRulesPost**
> GetRulesResponse nodeGetRulesPost()

Get network governance Rules

Returns a full list of all the Rules that govern admin and issuance rights within the network.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
try {
    val result : GetRulesResponse = apiInstance.nodeGetRulesPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeGetRulesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeGetRulesPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetRulesResponse**](GetRulesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nodeGetTaskStatusPost"></a>
# **nodeGetTaskStatusPost**
> GetTaskStatusResponse nodeGetTaskStatusPost(getTaskStatusRequest)

Get a specific task (by ID)

Returns the meta-data of a given Task and its current status. The particular, private details of the Task such as an Asset ID or amount in a Transfer are not returned.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val getTaskStatusRequest : GetTaskStatusRequest =  // GetTaskStatusRequest | 
try {
    val result : GetTaskStatusResponse = apiInstance.nodeGetTaskStatusPost(getTaskStatusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeGetTaskStatusPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeGetTaskStatusPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getTaskStatusRequest** | [**GetTaskStatusRequest**](GetTaskStatusRequest.md)|  |

### Return type

[**GetTaskStatusResponse**](GetTaskStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeGetTasksPost"></a>
# **nodeGetTasksPost**
> GetTasksResponse nodeGetTasksPost(getTasksRequest)

Get a (potentially) filtered list of all Tasks

Returns a list of all Tasks along with their meta-data and statuses. The particular, private details of the Task such as an Asset ID or amount in a Transfer are not returned. Tasks can be filtered using various parameters as specified in the request body.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val getTasksRequest : GetTasksRequest =  // GetTasksRequest | 
try {
    val result : GetTasksResponse = apiInstance.nodeGetTasksPost(getTasksRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeGetTasksPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeGetTasksPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getTasksRequest** | [**GetTasksRequest**](GetTasksRequest.md)|  |

### Return type

[**GetTasksResponse**](GetTasksResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeImportAuditorAccessWalletPost"></a>
# **nodeImportAuditorAccessWalletPost**
> AsyncTaskCreatedResponse nodeImportAuditorAccessWalletPost(importAuditorAccessWalletRequest)

Import viewing credentials for a Wallet [async call]

Import a viewing key generated by the export_auditor_access_wallet endpoint. This will create a read-only wallet which can be queried with endpoints such as get_activity and get_balances, but cannot be used to perform transactions. The Wallet whose Address was used as the recipient for the exported viewing key must already be imported within the Node in order for this process to succeed.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val importAuditorAccessWalletRequest : ImportAuditorAccessWalletRequest =  // ImportAuditorAccessWalletRequest | 
try {
    val result : AsyncTaskCreatedResponse = apiInstance.nodeImportAuditorAccessWalletPost(importAuditorAccessWalletRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeImportAuditorAccessWalletPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeImportAuditorAccessWalletPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importAuditorAccessWalletRequest** | [**ImportAuditorAccessWalletRequest**](ImportAuditorAccessWalletRequest.md)|  |

### Return type

[**AsyncTaskCreatedResponse**](AsyncTaskCreatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeImportWalletPost"></a>
# **nodeImportWalletPost**
> AsyncTaskCreatedResponse nodeImportWalletPost(importWalletRequest)

Import Wallet from a known secret key and authorization [async call]

Import a Wallet into the Node under a specified ID; All the transactional history and outstanding balanced of the Wallet will be extracted from the Blockchain; The Wallet ID is required to be unique within the Node, but can otherwise be user-defined.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = NodeApi()
val importWalletRequest : ImportWalletRequest =  // ImportWalletRequest | 
try {
    val result : AsyncTaskCreatedResponse = apiInstance.nodeImportWalletPost(importWalletRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeApi#nodeImportWalletPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeApi#nodeImportWalletPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importWalletRequest** | [**ImportWalletRequest**](ImportWalletRequest.md)|  |

### Return type

[**AsyncTaskCreatedResponse**](AsyncTaskCreatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

