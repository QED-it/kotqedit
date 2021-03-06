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

import org.qedit.kotqedit.models.ErrorResponse
import org.qedit.kotqedit.models.GetNetworkActivityRequest
import org.qedit.kotqedit.models.GetNetworkActivityResponse
import org.qedit.kotqedit.models.GetSyncStatusResponse

import org.qedit.kotqedit.infrastructure.*

class AnalyticsApi(basePath: kotlin.String = "https://localhost") : ApiClient(basePath) {

    /**
    * Get details on past blocks either by order using start_index and number_of_results or by the tx_hashes of the transactions
    * List all verified Transactions from the network, even ones that do not have anything to do with any Wallet stored in the Node; For each such Transaction all of public information is returned in a structured format; However, no private information is returned even if some private information is known.
    * @param getNetworkActivityRequest  
    * @return GetNetworkActivityResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun analyticsGetNetworkActivityPost(getNetworkActivityRequest: GetNetworkActivityRequest) : GetNetworkActivityResponse {
        val localVariableBody: kotlin.Any? = getNetworkActivityRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/analytics/get_network_activity",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<GetNetworkActivityResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetNetworkActivityResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get blockchain sync status information
    * Returns detailed information about the status of the sync between the QEDIT Node and the underlying Blockchain
    * @return GetSyncStatusResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun analyticsGetSyncStatusPost() : GetSyncStatusResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/analytics/get_sync_status",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<GetSyncStatusResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GetSyncStatusResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
