
# AnalyticsRuleTx

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**senderPublicKey** | **kotlin.String** | The public key of the Wallet used to create the Rule |  [optional]
**rulesToAdd** | [**kotlin.Array&lt;AnalyticsRuleDefinition&gt;**](AnalyticsRuleDefinition.md) | The details of the Rules added in this transaction |  [optional]
**rulesToDelete** | [**kotlin.Array&lt;AnalyticsRuleDefinition&gt;**](AnalyticsRuleDefinition.md) | The details of the Rules deleted in this transaction |  [optional]
**nonce** | **kotlin.Int** | The nonce used to make this Rule transaction unique |  [optional]
**signature** | **kotlin.String** | The signature authorizing the Rule changes, made by the Wallet that made the Rule changes |  [optional]



