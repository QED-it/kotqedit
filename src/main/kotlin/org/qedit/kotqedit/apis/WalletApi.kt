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
package org.qedit.kotqedit.apis

import org.qedit.kotqedit.models.AsyncTaskCreatedResponse
import org.qedit.kotqedit.models.CreateRuleRequest
import org.qedit.kotqedit.models.DeleteRuleRequest
import org.qedit.kotqedit.models.ErrorResponse
import org.qedit.kotqedit.models.GetNewAddressRequest
import org.qedit.kotqedit.models.GetNewAddressResponse
import org.qedit.kotqedit.models.GetPublicKeyRequest
import org.qedit.kotqedit.models.GetPublicKeyResponse
import org.qedit.kotqedit.models.GetWalletActivityRequest
import org.qedit.kotqedit.models.GetWalletActivityResponse
import org.qedit.kotqedit.models.GetWalletBalanceRequest
import org.qedit.kotqedit.models.GetWalletBalanceResponse
import org.qedit.kotqedit.models.IssueAssetRequest
import org.qedit.kotqedit.models.ShareWalletViewingPermissionRequest
import org.qedit.kotqedit.models.ShareWalletViewingPermissionResponse
import org.qedit.kotqedit.models.TransferAssetRequest

import org.qedit.kotqedit.infrastructure.*

class WalletApi(basePath: kotlin.String = "https://localhost") : ApiClient(basePath) {

    /**
    * Create a new Rule in the network [async call]
    * Create new Rules that can either create a new admin, a new issuer, or both; The Rules are created by a Wallet that needs to have admin rights; The Rules grant rights to other Wallets through the Wallets&#39; public keys.
    * @param createRuleRequest  
    * @return AsyncTaskCreatedResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletCreateRulePost(createRuleRequest: CreateRuleRequest) : AsyncTaskCreatedResponse {
        val localVariableBody: kotlin.Any? = createRuleRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/create_rule",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<AsyncTaskCreatedResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AsyncTaskCreatedResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Delete an existing Rule from the network [async call]
    * Delete an existing Rule from the network; The Rule is deleted by a Wallet which needs to have admin rights.
    * @param deleteRuleRequest  
    * @return AsyncTaskCreatedResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletDeleteRulePost(deleteRuleRequest: DeleteRuleRequest) : AsyncTaskCreatedResponse {
        val localVariableBody: kotlin.Any? = deleteRuleRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/delete_rule",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<AsyncTaskCreatedResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AsyncTaskCreatedResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get wallet activity (transactions)
    * List transactions that were created by a specifed Wallet or that affected that Wallet; All known details of each such transaction will be returned.
    * @param getWalletActivityRequest  
    * @return GetWalletActivityResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletGetActivityPost(getWalletActivityRequest: GetWalletActivityRequest) : GetWalletActivityResponse {
        val localVariableBody: kotlin.Any? = getWalletActivityRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/get_activity",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<GetWalletActivityResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetWalletActivityResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get wallets balances
    * Get a list of the Asset Types held within a given Wallet and the amount of each type held.
    * @param getWalletBalanceRequest  
    * @return GetWalletBalanceResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletGetBalancesPost(getWalletBalanceRequest: GetWalletBalanceRequest) : GetWalletBalanceResponse {
        val localVariableBody: kotlin.Any? = getWalletBalanceRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/get_balances",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<GetWalletBalanceResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetWalletBalanceResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get a new address from a given diversifier or generate randomly
    * Generate an Address for the Wallet; the address can be used by other Wallet owners to issue or transfer Assets into said Wallet; If a diversifier is provided, then the generated address is deterministically generated from the diversifier; If the diversifier is omitted, then a random diversifier is used and the resulting Address will be random; in both cases the Address cannot be linked to the Wallet by parties that do not have access to the Wallet. All generated Addresses of a Wallet are always valid and cannot be invalidated.
    * @param getNewAddressRequest  
    * @return GetNewAddressResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletGetNewAddressPost(getNewAddressRequest: GetNewAddressRequest) : GetNewAddressResponse {
        val localVariableBody: kotlin.Any? = getNewAddressRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/get_new_address",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<GetNewAddressResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetNewAddressResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get wallet public key
    * Get the unique public key of the Wallet; This key is unique across the entire network and is used to identify the Wallet.
    * @param getPublicKeyRequest  
    * @return GetPublicKeyResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletGetPublicKeyPost(getPublicKeyRequest: GetPublicKeyRequest) : GetPublicKeyResponse {
        val localVariableBody: kotlin.Any? = getPublicKeyRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/get_public_key",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<GetPublicKeyResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetPublicKeyResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Issue assets [async call]
    * Issue Assets from a Wallet to a recipient Address; The issuing Wallet is required to have matching issuance rights (in the form of a matching Rule); Issuance can be done either confidentially or in public; In order to issue confidentially, the matching Rule must explicitly allow this.
    * @param issueAssetRequest  
    * @return AsyncTaskCreatedResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletIssueAssetPost(issueAssetRequest: IssueAssetRequest) : AsyncTaskCreatedResponse {
        val localVariableBody: kotlin.Any? = issueAssetRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/issue_asset",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<AsyncTaskCreatedResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AsyncTaskCreatedResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Share the viewing credentials for a given Wallet
    * Share a viewing key that allows viewing all transactions to and from a wallet, including past transactions. The key is shared via p2p messenger directly to the recipient, and is encrypted specifically for the intended recipient address. Upon arrival, the wallet is automatically added to the recipient&#39;s node. The viewing key does not enable making any transactions (including rule changes, issuance, and transfers) on behalf of the exported Wallet.
    * @param shareWalletViewingPermissionRequest  
    * @return ShareWalletViewingPermissionResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletShareViewingPermissionPost(shareWalletViewingPermissionRequest: ShareWalletViewingPermissionRequest) : ShareWalletViewingPermissionResponse {
        val localVariableBody: kotlin.Any? = shareWalletViewingPermissionRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/share_viewing_permission",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ShareWalletViewingPermissionResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ShareWalletViewingPermissionResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Transfer assets [async call]
    * Transfer a specified amount of a specified Asset Type from a specified Wallet to a specified Address; Transfers are always completely confidential.
    * @param transferAssetRequest  
    * @return AsyncTaskCreatedResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun walletTransferAssetPost(transferAssetRequest: TransferAssetRequest) : AsyncTaskCreatedResponse {
        val localVariableBody: kotlin.Any? = transferAssetRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/wallet/transfer_asset",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<AsyncTaskCreatedResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AsyncTaskCreatedResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}