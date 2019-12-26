
# AnalyticTransferWalletTx

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isIncoming** | **kotlin.Boolean** | Boolean signifying whether the Assets were transferred to the Wallet in question; false of the Assets were transferred from the Wallet into another |  [optional]
**senderId** | **kotlin.String** | The public key of the Wallet the Assets were transferred from |  [optional]
**recipientAddress** | **kotlin.String** | The address of the Wallet the Assets were transferred to |  [optional]
**confirmedBy** | **kotlin.String** | The public key of the Wallet that confirmed receipt of this transfer |  [optional]
**assetId** | **kotlin.String** | The ID of an Asset Type. It must be a string of length 0 to 40 characters. Allowed characters are lower- and uppercase letters, digits, dot (.), and hyphen (-). It must not end with an hyphen. Asset IDs are case-sensitive.  |  [optional]
**amount** | **kotlin.Int** | The amount of Assets transferred |  [optional]
**memo** | **kotlin.String** | The private memo attached to the Transfer |  [optional]



