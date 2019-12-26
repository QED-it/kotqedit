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

import org.openapitools.client.models.AnalyticsTxMetadata

/**
 * 
 * @param metadata 
 * @param content The detailed content of the transaction; format differs depending on the transaction type
 */
data class AnalyticTransaction (
    val metadata: AnalyticsTxMetadata? = null,
    /* The detailed content of the transaction; format differs depending on the transaction type */
    val content: kotlin.Any? = null
) {

}
