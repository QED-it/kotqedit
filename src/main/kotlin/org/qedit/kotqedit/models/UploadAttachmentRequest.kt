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

import org.qedit.kotqedit.models.AttachmentBody

/**
 * 
 * @param walletId The Node-specific identifier of the Wallet whose credentials should be used to upload the Attachment
 * @param authorization The authorization password for the Wallet
 * @param groupId The globally-unique ID of the Group the Attachment should be shared with
 * @param body 
 */
data class UploadAttachmentRequest (
    /* The Node-specific identifier of the Wallet whose credentials should be used to upload the Attachment */
    val walletId: kotlin.String,
    /* The authorization password for the Wallet */
    val authorization: kotlin.String,
    /* The globally-unique ID of the Group the Attachment should be shared with */
    val groupId: kotlin.String,
    val body: AttachmentBody
) {

}

