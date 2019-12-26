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

import org.openapitools.client.models.AnalyticsOutput

/**
 * The data of a particular Issuance transaction
 * @param outputs The data of the Assets issued (multiple Assets may potentially be issued in a single Issuance transaction)
 * @param publicKey The public key of the Wallet that performed the Issuance
 * @param signature The signature on the transaction by the secret key of the Wallet that performed the Issuance
 */
data class AnalyticsIssueTx (
    /* The data of the Assets issued (multiple Assets may potentially be issued in a single Issuance transaction) */
    val outputs: kotlin.Array<AnalyticsOutput>? = null,
    /* The public key of the Wallet that performed the Issuance */
    val publicKey: kotlin.String? = null,
    /* The signature on the transaction by the secret key of the Wallet that performed the Issuance */
    val signature: kotlin.String? = null
) {

}
