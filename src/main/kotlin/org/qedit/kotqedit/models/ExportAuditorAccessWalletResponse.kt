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
 * @param walletId The ID of the exported Wallet in the Node from which it was exported
 * @param publicKey The public key of the exported Wallet which uniquely identifies it across the network
 * @param accessKey The encrypted viewing key
 */
data class ExportAuditorAccessWalletResponse (
    /* The ID of the exported Wallet in the Node from which it was exported */
    val walletId: kotlin.String,
    /* The public key of the exported Wallet which uniquely identifies it across the network */
    val publicKey: kotlin.String,
    /* The encrypted viewing key */
    val accessKey: kotlin.String
) {

}

