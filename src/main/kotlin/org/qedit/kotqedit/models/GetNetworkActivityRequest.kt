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
 * @param startIndex An offset used to paginate through the activity history; indexing is 0-based
 * @param numberOfResults Maximal number of results to fetch in this call
 * @param txHashes 
 */
data class GetNetworkActivityRequest (
    /* An offset used to paginate through the activity history; indexing is 0-based */
    val startIndex: kotlin.Int,
    /* Maximal number of results to fetch in this call */
    val numberOfResults: kotlin.Int,
    val txHashes: kotlin.Array<kotlin.String>? = null
) {

}

