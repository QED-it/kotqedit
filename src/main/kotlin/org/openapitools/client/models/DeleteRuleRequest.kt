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

import org.openapitools.client.models.Rule

/**
 * 
 * @param walletId The ID of the Wallet whose admin credentials should be used to delete the Rules
 * @param authorization The authorization password for the Wallet whose admin credentials should be used to delete the Rules
 * @param rulesToDelete The list of Rules to delete from the network
 */
data class DeleteRuleRequest (
    /* The ID of the Wallet whose admin credentials should be used to delete the Rules */
    val walletId: kotlin.String,
    /* The authorization password for the Wallet whose admin credentials should be used to delete the Rules */
    val authorization: kotlin.String,
    /* The list of Rules to delete from the network */
    val rulesToDelete: kotlin.Array<Rule>
) {

}

