# HealthApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthPost**](HealthApi.md#healthPost) | **POST** /health | Perform a healthcheck of the node and its dependent services


<a name="healthPost"></a>
# **healthPost**
> HealthcheckResponse healthPost()

Perform a healthcheck of the node and its dependent services

Reports the health of the various components of the system as well as an overall status for the Node. If the Node&#39;s status is good, then the Node is synced with the Blockchain and can successfully process requests.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = HealthApi()
try {
    val result : HealthcheckResponse = apiInstance.healthPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HealthApi#healthPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HealthApi#healthPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthcheckResponse**](HealthcheckResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

