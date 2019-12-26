
# GetTasksRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startIndex** | **kotlin.Int** | An offset used to paginate through the Task list; indexing is 0-based | 
**numberOfResults** | **kotlin.Int** | Maximal number of results to fetch in this call | 
**types** | [**kotlin.Array&lt;TaskType&gt;**](TaskType.md) | Types of Tasks to fetch; fetch all types if omitted |  [optional]
**results** | [**kotlin.Array&lt;Result&gt;**](Result.md) | List of results (statuses) to filter by; fetch in_progress tasks if omitted |  [optional]
**order** | [**OrderEnum**](OrderEnum.md) |  |  [optional]



