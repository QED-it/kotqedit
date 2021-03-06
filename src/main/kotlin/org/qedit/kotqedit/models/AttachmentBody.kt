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
 * The payload of the Attachment
 * @param name A name used by the caller of the API to describe the Attachment; does not have to be unique; should not be relied upon to uniquely identify the Attachment; defaults to the empty string (\"\")
 * @param contentType The media type (a.k.a. MIME type) of the content; defaults to 'application/x-binary'
 * @param content The representation of the Attachment in standard base64 encoding without padding (see RFC-4648)
 */
data class AttachmentBody (
    /* The representation of the Attachment in standard base64 encoding without padding (see RFC-4648) */
    val content: kotlin.String,
    /* A name used by the caller of the API to describe the Attachment; does not have to be unique; should not be relied upon to uniquely identify the Attachment; defaults to the empty string (\"\") */
    val name: kotlin.String? = null,
    /* The media type (a.k.a. MIME type) of the content; defaults to 'application/x-binary' */
    val contentType: kotlin.String? = null
) {

}

