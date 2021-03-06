# AnalyticsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsGetNetworkActivityPost**](AnalyticsApi.md#analyticsGetNetworkActivityPost) | **POST** /analytics/get_network_activity | Get details on past blocks either by order using start_index and number_of_results or by the tx_hashes of the transactions
[**analyticsGetSyncStatusPost**](AnalyticsApi.md#analyticsGetSyncStatusPost) | **POST** /analytics/get_sync_status | Get blockchain sync status information


<a name="analyticsGetNetworkActivityPost"></a>
# **analyticsGetNetworkActivityPost**
> GetNetworkActivityResponse analyticsGetNetworkActivityPost(getNetworkActivityRequest)

Get details on past blocks either by order using start_index and number_of_results or by the tx_hashes of the transactions

List all verified Transactions from the network, even ones that do not have anything to do with any Wallet stored in the Node; For each such Transaction all of public information is returned in a structured format; However, no private information is returned even if some private information is known.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AnalyticsApi()
val getNetworkActivityRequest : GetNetworkActivityRequest =  // GetNetworkActivityRequest | 
try {
    val result : GetNetworkActivityResponse = apiInstance.analyticsGetNetworkActivityPost(getNetworkActivityRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#analyticsGetNetworkActivityPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#analyticsGetNetworkActivityPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getNetworkActivityRequest** | [**GetNetworkActivityRequest**](GetNetworkActivityRequest.md)|  |

### Return type

[**GetNetworkActivityResponse**](GetNetworkActivityResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="analyticsGetSyncStatusPost"></a>
# **analyticsGetSyncStatusPost**
> GetSyncStatusResponse analyticsGetSyncStatusPost()

Get blockchain sync status information

Returns detailed information about the status of the sync between the QEDIT Node and the underlying Blockchain

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = AnalyticsApi()
try {
    val result : GetSyncStatusResponse = apiInstance.analyticsGetSyncStatusPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#analyticsGetSyncStatusPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#analyticsGetSyncStatusPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSyncStatusResponse**](GetSyncStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

