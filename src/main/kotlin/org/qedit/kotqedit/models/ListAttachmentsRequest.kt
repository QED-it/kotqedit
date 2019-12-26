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
package org.qedit.kotqedit.models


/**
 * 
 * @param walletId The Node-specific identifier of the Wallet whose credentials should be used to list Attachments
 * @param startIndex An offset used to paginate through the Attachment list; indexing is 0-based; defaults to 0
 * @param numberOfResults Maximal number of results to fetch in this call; defaults to 100
 * @param assetIds An optional list of Asset IDs; if present and not empty, only Attachments attached to Assets of one or more of the given Asset IDs will be returned; note that only Attachments attached to Assets owned or previously-owned by the given Wallet will be returned
 * @param txHashes An optional list of Transaction hashes; if present and not empty, only Attachments attached to Assets transferred or created in the referenced Transations will be returned; note that only Attachments from Transactions that are visible to the given Wallet will be returned
 */
data class ListAttachmentsRequest (
    /* The Node-specific identifier of the Wallet whose credentials should be used to list Attachments */
    val walletId: kotlin.String,
    /* An offset used to paginate through the Attachment list; indexing is 0-based; defaults to 0 */
    val startIndex: kotlin.Int? = null,
    /* Maximal number of results to fetch in this call; defaults to 100 */
    val numberOfResults: kotlin.Int? = null,
    /* An optional list of Asset IDs; if present and not empty, only Attachments attached to Assets of one or more of the given Asset IDs will be returned; note that only Attachments attached to Assets owned or previously-owned by the given Wallet will be returned */
    val assetIds: kotlin.Array<kotlin.String>? = null,
    /* An optional list of Transaction hashes; if present and not empty, only Attachments attached to Assets transferred or created in the referenced Transations will be returned; note that only Attachments from Transactions that are visible to the given Wallet will be returned */
    val txHashes: kotlin.Array<kotlin.String>? = null
) {

}

