
# GetTaskStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Unique ID of the Task |  [optional]
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | UTC time of creation of the Task in RFC-3339 format |  [optional]
**updatedAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | UTC last time the Task was updated in RFC-3339 format |  [optional]
**result** | [**Result**](Result.md) |  |  [optional]
**state** | [**TaskState**](TaskState.md) |  |  [optional]
**txHash** | **kotlin.String** | The Blockchain-generated hash of the Transaction; populated after the Blockchain Node accepted the Transaction |  [optional]
**qeditTxHash** | **kotlin.String** | The QEDIT-generated hash of the Transaction; generated after proof generation, but prior to Broadcast by the QEDIT Node |  [optional]
**type** | [**TaskType**](TaskType.md) |  |  [optional]
**&#x60;data&#x60;** | [**TaskData**](TaskData.md) |  |  [optional]
**error** | **kotlin.String** | In case of failure this field reports the reason for the failure |  [optional]



