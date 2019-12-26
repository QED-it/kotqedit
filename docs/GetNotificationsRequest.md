
# GetNotificationsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**walletId** | **kotlin.String** | Fetch notifications that relate to this wallet ID only |  [optional]
**types** | [**kotlin.Array&lt;NotificationType&gt;**](NotificationType.md) |  |  [optional]
**startingWithTime** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Fetch notifications reported at this timestamp or later/earlier. Later notifications will be fetched if the order is ascending, and earlier ones if the order is descending. The timestamp is expected to be in RFC-3339 format. |  [optional]
**afterId** | **kotlin.Int** | Fetch notifications after this given ID (not including the notification with the given ID). This is meant to facilitate pagination. Later notifications will be fetched if ascending order is selected, and earlier ones if descending order is selected. Warning - do not assume anything about the implementation of after_id; the values of the ID are intended to be copy-pasted from retrieved notifications for pagination. |  [optional]
**order** | [**OrderEnum**](OrderEnum.md) |  |  [optional]
**maxResults** | **kotlin.Int** | The maximal number of results to fetch |  [optional]



