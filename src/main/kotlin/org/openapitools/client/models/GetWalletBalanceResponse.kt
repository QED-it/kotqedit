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

import org.openapitools.client.models.BalanceForAsset

/**
 * 
 * @param walletId The ID of the Wallet
 * @param assets The balances of the various Asset Types held by the Wallet
 */
data class GetWalletBalanceResponse (
    /* The ID of the Wallet */
    val walletId: kotlin.String,
    /* The balances of the various Asset Types held by the Wallet */
    val assets: kotlin.Array<BalanceForAsset>
) {

}

