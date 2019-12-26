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
 * @param attachmentId The globally-unique ID of the Attachment; used to reference the Attachment and to download it; should be stored by the App for future reference\\
 */
data class UploadAttachmentResponse (
    /* The globally-unique ID of the Attachment; used to reference the Attachment and to download it; should be stored by the App for future reference\\ */
    val attachmentId: kotlin.String
) {

}
