
# Notification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The unique identifier of the notification. Can be used for pagination purposes. | 
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Timestamp the notification was created at, in RFC-3339 format. | 
**walletId** | **kotlin.String** | The ID of the wallet the notification relates to. May be null in cases there is no such specific wallet. |  [optional]
**taskId** | **kotlin.String** | The ID of the task the notification relates to. May be empty in cases there is no such specific task. | 
**notificationType** | [**NotificationType**](NotificationType.md) |  | 
**content** | [**kotlin.Any**](kotlin.Any.md) |  |  [optional]



