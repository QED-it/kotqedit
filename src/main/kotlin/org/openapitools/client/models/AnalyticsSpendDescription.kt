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
 * @param cv The commitment to both the Asset Type and amount of the Note
 * @param anchor The anchor (root) of the Merkle tree used in the Proof
 * @param nullifier The Note's Nullifier
 * @param zkproof The Proof that the Note indeed exists in the Merkle tree and belongs to the spender
 */
data class AnalyticsSpendDescription (
    /* The commitment to both the Asset Type and amount of the Note */
    val cv: kotlin.String? = null,
    /* The anchor (root) of the Merkle tree used in the Proof */
    val anchor: kotlin.String? = null,
    /* The Note's Nullifier */
    val nullifier: kotlin.String? = null,
    /* The Proof that the Note indeed exists in the Merkle tree and belongs to the spender */
    val zkproof: kotlin.String? = null
) {

}

