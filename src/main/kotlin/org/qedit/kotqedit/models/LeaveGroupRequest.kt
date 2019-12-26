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
 * @param walletId The Node-specific identifier of the Wallet that is to leave the Group
 * @param groupId The unique identifier of the Group which is being left
 */
data class LeaveGroupRequest (
    /* The Node-specific identifier of the Wallet that is to leave the Group */
    val walletId: kotlin.String,
    /* The unique identifier of the Group which is being left */
    val groupId: kotlin.String
) {

}
