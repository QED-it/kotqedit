
# AnalyticsTransferTx

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spends** | [**kotlin.Array&lt;AnalyticsSpendDescription&gt;**](AnalyticsSpendDescription.md) | The information and Proofs associated with the Assets spent in the Transfer |  [optional]
**outputs** | [**kotlin.Array&lt;AnalyticsOutputDescription&gt;**](AnalyticsOutputDescription.md) | The information and Proofs associated with the Assets output from the Transfer |  [optional]
**rk** | **kotlin.String** | The re-randomized public key of the Wallet which created the Transfer |  [optional]
**spendAuthSig** | **kotlin.String** | The signature authorizing the spend of the Assets spent in the Transfer |  [optional]
**bindingSig** | **kotlin.String** | The signature binding the spent and output Assets and verifying the balance |  [optional]
**confirmationSig** | **kotlin.String** | The signature of the confirming party if a confirmation was requested; empty if no confirmation was requested |  [optional]



