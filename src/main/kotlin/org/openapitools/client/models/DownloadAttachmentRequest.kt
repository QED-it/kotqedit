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
package org.openapitools.client.models


/**
 * 
 * @param walletId The Node-specific identifier of the Wallet whose credentials should be used to download the Attachment
 * @param attachmentId The globally-unique ID of the Attachment to be downloaded
 */
data class DownloadAttachmentRequest (
    /* The Node-specific identifier of the Wallet whose credentials should be used to download the Attachment */
    val walletId: kotlin.String,
    /* The globally-unique ID of the Attachment to be downloaded */
    val attachmentId: kotlin.String
) {

}

