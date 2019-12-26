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


import com.squareup.moshi.Json

/**
* The current result (status) of the Task
* Values: pending,inProgress,awaitingUserInteraction,success,failure
*/
enum class Result(val value: kotlin.String){

    @Json(name = "pending") pending("pending"),

    @Json(name = "in_progress") inProgress("in_progress"),

    @Json(name = "awaiting_user_interaction") awaitingUserInteraction("awaiting_user_interaction"),

    @Json(name = "success") success("success"),

    @Json(name = "failure") failure("failure");

}

