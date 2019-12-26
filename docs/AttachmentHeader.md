
# AttachmentHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachmentId** | **kotlin.String** | The globally-unique ID of the Attachment; can be used as a reference for downloading it | 
**name** | **kotlin.String** | A name used by the uploader to describe the Attachment; does not have to be unique; should not be relied upon to uniquely identify the Attachment | 
**contentType** | **kotlin.String** | The media type (a.k.a. MIME type) of the content as specifies by the uploader of the Attachment | 
**txHash** | **kotlin.String** | The transaction hash for the transaction the Attachment was attached in. Set to empty string if the Wallet is unaware of the particular transaction in which the Attachment was attached to the Asset. |  [optional]
**assetId** | **kotlin.String** | The asset ID transferred in the transaction to which this Attachment was attached. |  [optional]
**uploadedAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The time the Attachment was uploaded at, in RFC-3339 format |  [optional]
**contentLengthBytes** | **kotlin.Long** | The length in bytes of the raw content of the Attachment |  [optional]



