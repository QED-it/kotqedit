
# AnalyticsOutputDescription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cv** | **kotlin.String** | The commitment to both the Asset Type and amount of the Note |  [optional]
**cm** | **kotlin.String** | The commitment to the entire Note |  [optional]
**zkproof** | **kotlin.String** | The Proof that the commitments match |  [optional]
**epk** | **kotlin.String** | The ephemeral public key used to encrypt the Note contents for the receiver |  [optional]
**encNote** | **kotlin.String** | The Note encryption for the receiver |  [optional]
**encSender** | **kotlin.String** | The Note encryption for the sender |  [optional]
**requireConfirmationFromRk** | **kotlin.String** | The rerandomized (fully-anonymous) public key of the wallet that confirmed receipt of the output; identity of this wallet can only be recovered by the sending and confirming wallets (including view-only copies of these wallets); empty if no confirmation was requested |  [optional]



