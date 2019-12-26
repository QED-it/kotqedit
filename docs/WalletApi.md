# WalletApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletCreateRulePost**](WalletApi.md#walletCreateRulePost) | **POST** /wallet/create_rule | Create a new Rule in the network [async call]
[**walletDeleteRulePost**](WalletApi.md#walletDeleteRulePost) | **POST** /wallet/delete_rule | Delete an existing Rule from the network [async call]
[**walletGetActivityPost**](WalletApi.md#walletGetActivityPost) | **POST** /wallet/get_activity | Get wallet activity (transactions)
[**walletGetBalancesPost**](WalletApi.md#walletGetBalancesPost) | **POST** /wallet/get_balances | Get wallets balances
[**walletGetNewAddressPost**](WalletApi.md#walletGetNewAddressPost) | **POST** /wallet/get_new_address | Get a new address from a given diversifier or generate randomly
[**walletGetPublicKeyPost**](WalletApi.md#walletGetPublicKeyPost) | **POST** /wallet/get_public_key | Get wallet public key
[**walletIssueAssetPost**](WalletApi.md#walletIssueAssetPost) | **POST** /wallet/issue_asset | Issue assets [async call]
[**walletShareViewingPermissionPost**](WalletApi.md#walletShareViewingPermissionPost) | **POST** /wallet/share_viewing_permission | Share the viewing credentials for a given Wallet
[**walletTransferAssetPost**](WalletApi.md#walletTransferAssetPost) | **POST** /wallet/transfer_asset | Transfer assets [async call]


<a name="walletCreateRulePost"></a>
# **walletCreateRulePost**
> AsyncTaskCreatedResponse walletCreateRulePost(createRuleRequest)

Create a new Rule in the network [async call]

Create new Rules that can either create a new admin, a new issuer, or both; The Rules are created by a Wallet that needs to have admin rights; The Rules grant rights to other Wallets through the Wallets&#39; public keys.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val createRuleRequest : CreateRuleRequest =  // CreateRuleRequest | 
try {
    val result : AsyncTaskCreatedResponse = apiInstance.walletCreateRulePost(createRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletCreateRulePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletCreateRulePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRuleRequest** | [**CreateRuleRequest**](CreateRuleRequest.md)|  |

### Return type

[**AsyncTaskCreatedResponse**](AsyncTaskCreatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletDeleteRulePost"></a>
# **walletDeleteRulePost**
> AsyncTaskCreatedResponse walletDeleteRulePost(deleteRuleRequest)

Delete an existing Rule from the network [async call]

Delete an existing Rule from the network; The Rule is deleted by a Wallet which needs to have admin rights.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val deleteRuleRequest : DeleteRuleRequest =  // DeleteRuleRequest | 
try {
    val result : AsyncTaskCreatedResponse = apiInstance.walletDeleteRulePost(deleteRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletDeleteRulePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletDeleteRulePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteRuleRequest** | [**DeleteRuleRequest**](DeleteRuleRequest.md)|  |

### Return type

[**AsyncTaskCreatedResponse**](AsyncTaskCreatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletGetActivityPost"></a>
# **walletGetActivityPost**
> GetWalletActivityResponse walletGetActivityPost(getWalletActivityRequest)

Get wallet activity (transactions)

List transactions that were created by a specifed Wallet or that affected that Wallet; All known details of each such transaction will be returned.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val getWalletActivityRequest : GetWalletActivityRequest =  // GetWalletActivityRequest | 
try {
    val result : GetWalletActivityResponse = apiInstance.walletGetActivityPost(getWalletActivityRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletGetActivityPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletGetActivityPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getWalletActivityRequest** | [**GetWalletActivityRequest**](GetWalletActivityRequest.md)|  |

### Return type

[**GetWalletActivityResponse**](GetWalletActivityResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletGetBalancesPost"></a>
# **walletGetBalancesPost**
> GetWalletBalanceResponse walletGetBalancesPost(getWalletBalanceRequest)

Get wallets balances

Get a list of the Asset Types held within a given Wallet and the amount of each type held.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val getWalletBalanceRequest : GetWalletBalanceRequest =  // GetWalletBalanceRequest | 
try {
    val result : GetWalletBalanceResponse = apiInstance.walletGetBalancesPost(getWalletBalanceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletGetBalancesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletGetBalancesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getWalletBalanceRequest** | [**GetWalletBalanceRequest**](GetWalletBalanceRequest.md)|  |

### Return type

[**GetWalletBalanceResponse**](GetWalletBalanceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletGetNewAddressPost"></a>
# **walletGetNewAddressPost**
> GetNewAddressResponse walletGetNewAddressPost(getNewAddressRequest)

Get a new address from a given diversifier or generate randomly

Generate an Address for the Wallet; the address can be used by other Wallet owners to issue or transfer Assets into said Wallet; If a diversifier is provided, then the generated address is deterministically generated from the diversifier; If the diversifier is omitted, then a random diversifier is used and the resulting Address will be random; in both cases the Address cannot be linked to the Wallet by parties that do not have access to the Wallet. All generated Addresses of a Wallet are always valid and cannot be invalidated.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val getNewAddressRequest : GetNewAddressRequest =  // GetNewAddressRequest | 
try {
    val result : GetNewAddressResponse = apiInstance.walletGetNewAddressPost(getNewAddressRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletGetNewAddressPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletGetNewAddressPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getNewAddressRequest** | [**GetNewAddressRequest**](GetNewAddressRequest.md)|  |

### Return type

[**GetNewAddressResponse**](GetNewAddressResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletGetPublicKeyPost"></a>
# **walletGetPublicKeyPost**
> GetPublicKeyResponse walletGetPublicKeyPost(getPublicKeyRequest)

Get wallet public key

Get the unique public key of the Wallet; This key is unique across the entire network and is used to identify the Wallet.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val getPublicKeyRequest : GetPublicKeyRequest =  // GetPublicKeyRequest | 
try {
    val result : GetPublicKeyResponse = apiInstance.walletGetPublicKeyPost(getPublicKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletGetPublicKeyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletGetPublicKeyPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getPublicKeyRequest** | [**GetPublicKeyRequest**](GetPublicKeyRequest.md)|  |

### Return type

[**GetPublicKeyResponse**](GetPublicKeyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletIssueAssetPost"></a>
# **walletIssueAssetPost**
> AsyncTaskCreatedResponse walletIssueAssetPost(issueAssetRequest)

Issue assets [async call]

Issue Assets from a Wallet to a recipient Address; The issuing Wallet is required to have matching issuance rights (in the form of a matching Rule); Issuance can be done either confidentially or in public; In order to issue confidentially, the matching Rule must explicitly allow this.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val issueAssetRequest : IssueAssetRequest =  // IssueAssetRequest | 
try {
    val result : AsyncTaskCreatedResponse = apiInstance.walletIssueAssetPost(issueAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletIssueAssetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletIssueAssetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueAssetRequest** | [**IssueAssetRequest**](IssueAssetRequest.md)|  |

### Return type

[**AsyncTaskCreatedResponse**](AsyncTaskCreatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletShareViewingPermissionPost"></a>
# **walletShareViewingPermissionPost**
> ShareWalletViewingPermissionResponse walletShareViewingPermissionPost(shareWalletViewingPermissionRequest)

Share the viewing credentials for a given Wallet

Share a viewing key that allows viewing all transactions to and from a wallet, including past transactions. The key is shared via p2p messenger directly to the recipient, and is encrypted specifically for the intended recipient address. Upon arrival, the wallet is automatically added to the recipient&#39;s node. The viewing key does not enable making any transactions (including rule changes, issuance, and transfers) on behalf of the exported Wallet.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val shareWalletViewingPermissionRequest : ShareWalletViewingPermissionRequest =  // ShareWalletViewingPermissionRequest | 
try {
    val result : ShareWalletViewingPermissionResponse = apiInstance.walletShareViewingPermissionPost(shareWalletViewingPermissionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletShareViewingPermissionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletShareViewingPermissionPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shareWalletViewingPermissionRequest** | [**ShareWalletViewingPermissionRequest**](ShareWalletViewingPermissionRequest.md)|  |

### Return type

[**ShareWalletViewingPermissionResponse**](ShareWalletViewingPermissionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="walletTransferAssetPost"></a>
# **walletTransferAssetPost**
> AsyncTaskCreatedResponse walletTransferAssetPost(transferAssetRequest)

Transfer assets [async call]

Transfer a specified amount of a specified Asset Type from a specified Wallet to a specified Address; Transfers are always completely confidential.

### Example
```kotlin
// Import classes:
//import org.qedit.kotqedit.infrastructure.*
//import org.qedit.kotqedit.models.*

val apiInstance = WalletApi()
val transferAssetRequest : TransferAssetRequest =  // TransferAssetRequest | 
try {
    val result : AsyncTaskCreatedResponse = apiInstance.walletTransferAssetPost(transferAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletTransferAssetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletTransferAssetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferAssetRequest** | [**TransferAssetRequest**](TransferAssetRequest.md)|  |

### Return type

[**AsyncTaskCreatedResponse**](AsyncTaskCreatedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

