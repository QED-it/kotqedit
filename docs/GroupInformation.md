
# GroupInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **kotlin.String** | The unique identifier of the Group | 
**joinedAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Timestamp of when the Group credentials were shared with the Wallet. The timestamp is in RFC-3339 format. | 
**readPermission** | **kotlin.Boolean** | Boolean set to true if and only if read permission for the given Group was shared with the given Wallet. Note that write access is always shared. | 
**memo** | **kotlin.String** | The memo used by the application that first shared this Group with the given Wallet when calling &#x60;add_to_group&#x60;. | 



