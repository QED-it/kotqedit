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

import org.qedit.kotqedit.models.Rule

/**
 * 
 * @param walletId The ID of the Wallet whose admin credentials should be used to create the new Rules
 * @param authorization The authorization password for the Wallet whose admin credentials should be used to create the new Rules
 * @param rulesToAdd The list of Rules to add to the network
 */
data class CreateRuleRequest (
    /* The ID of the Wallet whose admin credentials should be used to create the new Rules */
    val walletId: kotlin.String,
    /* The authorization password for the Wallet whose admin credentials should be used to create the new Rules */
    val authorization: kotlin.String,
    /* The list of Rules to add to the network */
    val rulesToAdd: kotlin.Array<Rule>
) {

}
