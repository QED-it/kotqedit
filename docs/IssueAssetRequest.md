
# IssueAssetRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**walletId** | **kotlin.String** | The ID of the Wallet that has the required Issuance privileges | 
**authorization** | **kotlin.String** | The authorization password for the Wallet that has the Issuance privileges | 
**recipientAddress** | **kotlin.String** | The Address of the recipient of the issued Assets | 
**assetId** | **kotlin.String** | The ID of an Asset Type. It must be a string of length 0 to 40 characters. Allowed characters are lower- and uppercase letters, digits, dot (.), and hyphen (-). It must not end with an hyphen. Asset IDs are case-sensitive.  | 
**amount** | **kotlin.Int** | the amount of Assets to issue | 
**confidential** | **kotlin.Boolean** | Boolean which should be true if the issuance should be confidential, and false of the Issuance should be public | 
**memo** | **kotlin.String** | An app-customizable field to store additional private data relating to the issuance; the memo is shared between the sender and the receiver, but is not divulged to other parties | 
**attachmentIds** | **kotlin.Array&lt;kotlin.String&gt;** | The globally-unique identifiers of the Attachments to attach to the issued Asset; the attachments must already be uploaded, and their identifiers are returned by the upload endpoint |  [optional]



