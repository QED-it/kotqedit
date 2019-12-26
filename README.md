# org.qedit.kotqedit - Kotlin client library for QEDIT - Asset Transfers

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsApi* | [**analyticsGetNetworkActivityPost**](docs/AnalyticsApi.md#analyticsgetnetworkactivitypost) | **POST** /analytics/get_network_activity | Get details on past blocks either by order using start_index and number_of_results or by the tx_hashes of the transactions
*AnalyticsApi* | [**analyticsGetSyncStatusPost**](docs/AnalyticsApi.md#analyticsgetsyncstatuspost) | **POST** /analytics/get_sync_status | Get blockchain sync status information
*AttachmentApi* | [**attachmentAddToGroupPost**](docs/AttachmentApi.md#attachmentaddtogrouppost) | **POST** /attachment/add_to_group | Add a new member to a group
*AttachmentApi* | [**attachmentCreateGroupPost**](docs/AttachmentApi.md#attachmentcreategrouppost) | **POST** /attachment/create_group | Create a new group
*AttachmentApi* | [**attachmentDownloadPost**](docs/AttachmentApi.md#attachmentdownloadpost) | **POST** /attachment/download | Download an Attachment
*AttachmentApi* | [**attachmentGetGroupsPost**](docs/AttachmentApi.md#attachmentgetgroupspost) | **POST** /attachment/get_groups | List the Groups the Wallet has access to
*AttachmentApi* | [**attachmentLeaveGroupPost**](docs/AttachmentApi.md#attachmentleavegrouppost) | **POST** /attachment/leave_group | Removes an owned Wallet from a Group
*AttachmentApi* | [**attachmentListPost**](docs/AttachmentApi.md#attachmentlistpost) | **POST** /attachment/list | Lists available Attachments
*AttachmentApi* | [**attachmentUploadPost**](docs/AttachmentApi.md#attachmentuploadpost) | **POST** /attachment/upload | Upload an Attachment and share it with a Group
*HealthApi* | [**healthPost**](docs/HealthApi.md#healthpost) | **POST** /health | Perform a healthcheck of the node and its dependent services
*NodeApi* | [**nodeApproveTaskPost**](docs/NodeApi.md#nodeapprovetaskpost) | **POST** /node/approve_task | Approve task with pending incoming transaction [async call]
*NodeApi* | [**nodeCancelTaskPost**](docs/NodeApi.md#nodecanceltaskpost) | **POST** /node/cancel_task | Cancel task with pending incoming transaction both incoming and outgoing [async call]
*NodeApi* | [**nodeDeleteWalletPost**](docs/NodeApi.md#nodedeletewalletpost) | **POST** /node/delete_wallet | Delete a Wallet [async call]
*NodeApi* | [**nodeExportAuditorAccessWalletPost**](docs/NodeApi.md#nodeexportauditoraccesswalletpost) | **POST** /node/export_auditor_access_wallet | Export viewing credentials for a Wallet
*NodeApi* | [**nodeExportWalletPost**](docs/NodeApi.md#nodeexportwalletpost) | **POST** /node/export_wallet | Export wallet secret key
*NodeApi* | [**nodeGenerateWalletPost**](docs/NodeApi.md#nodegeneratewalletpost) | **POST** /node/generate_wallet | Generate a new Wallet
*NodeApi* | [**nodeGetAllWalletsPost**](docs/NodeApi.md#nodegetallwalletspost) | **POST** /node/get_all_wallets | Get all wallet IDs
*NodeApi* | [**nodeGetNotificationsPost**](docs/NodeApi.md#nodegetnotificationspost) | **POST** /node/get_notifications | Get notifications
*NodeApi* | [**nodeGetRulesPost**](docs/NodeApi.md#nodegetrulespost) | **POST** /node/get_rules | Get network governance Rules
*NodeApi* | [**nodeGetTaskStatusPost**](docs/NodeApi.md#nodegettaskstatuspost) | **POST** /node/get_task_status | Get a specific task (by ID)
*NodeApi* | [**nodeGetTasksPost**](docs/NodeApi.md#nodegettaskspost) | **POST** /node/get_tasks | Get a (potentially) filtered list of all Tasks
*NodeApi* | [**nodeImportAuditorAccessWalletPost**](docs/NodeApi.md#nodeimportauditoraccesswalletpost) | **POST** /node/import_auditor_access_wallet | Import viewing credentials for a Wallet [async call]
*NodeApi* | [**nodeImportWalletPost**](docs/NodeApi.md#nodeimportwalletpost) | **POST** /node/import_wallet | Import Wallet from a known secret key and authorization [async call]
*WalletApi* | [**walletCreateRulePost**](docs/WalletApi.md#walletcreaterulepost) | **POST** /wallet/create_rule | Create a new Rule in the network [async call]
*WalletApi* | [**walletDeleteRulePost**](docs/WalletApi.md#walletdeleterulepost) | **POST** /wallet/delete_rule | Delete an existing Rule from the network [async call]
*WalletApi* | [**walletGetActivityPost**](docs/WalletApi.md#walletgetactivitypost) | **POST** /wallet/get_activity | Get wallet activity (transactions)
*WalletApi* | [**walletGetBalancesPost**](docs/WalletApi.md#walletgetbalancespost) | **POST** /wallet/get_balances | Get wallets balances
*WalletApi* | [**walletGetNewAddressPost**](docs/WalletApi.md#walletgetnewaddresspost) | **POST** /wallet/get_new_address | Get a new address from a given diversifier or generate randomly
*WalletApi* | [**walletGetPublicKeyPost**](docs/WalletApi.md#walletgetpublickeypost) | **POST** /wallet/get_public_key | Get wallet public key
*WalletApi* | [**walletIssueAssetPost**](docs/WalletApi.md#walletissueassetpost) | **POST** /wallet/issue_asset | Issue assets [async call]
*WalletApi* | [**walletShareViewingPermissionPost**](docs/WalletApi.md#walletshareviewingpermissionpost) | **POST** /wallet/share_viewing_permission | Share the viewing credentials for a given Wallet
*WalletApi* | [**walletTransferAssetPost**](docs/WalletApi.md#wallettransferassetpost) | **POST** /wallet/transfer_asset | Transfer assets [async call]


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.qedit.kotqedit.models.AddToGroupRequest](docs/AddToGroupRequest.md)
 - [org.qedit.kotqedit.models.AddToGroupResponse](docs/AddToGroupResponse.md)
 - [org.qedit.kotqedit.models.AnalyticIssueWalletTx](docs/AnalyticIssueWalletTx.md)
 - [org.qedit.kotqedit.models.AnalyticRuleWalletTx](docs/AnalyticRuleWalletTx.md)
 - [org.qedit.kotqedit.models.AnalyticTransaction](docs/AnalyticTransaction.md)
 - [org.qedit.kotqedit.models.AnalyticTransferWalletTx](docs/AnalyticTransferWalletTx.md)
 - [org.qedit.kotqedit.models.AnalyticWalletMetadata](docs/AnalyticWalletMetadata.md)
 - [org.qedit.kotqedit.models.AnalyticWalletTx](docs/AnalyticWalletTx.md)
 - [org.qedit.kotqedit.models.AnalyticsConfidentialIssuanceDescription](docs/AnalyticsConfidentialIssuanceDescription.md)
 - [org.qedit.kotqedit.models.AnalyticsIssueTx](docs/AnalyticsIssueTx.md)
 - [org.qedit.kotqedit.models.AnalyticsMultiTransferTx](docs/AnalyticsMultiTransferTx.md)
 - [org.qedit.kotqedit.models.AnalyticsOutput](docs/AnalyticsOutput.md)
 - [org.qedit.kotqedit.models.AnalyticsOutputDescription](docs/AnalyticsOutputDescription.md)
 - [org.qedit.kotqedit.models.AnalyticsPublicIssuanceDescription](docs/AnalyticsPublicIssuanceDescription.md)
 - [org.qedit.kotqedit.models.AnalyticsRuleDefinition](docs/AnalyticsRuleDefinition.md)
 - [org.qedit.kotqedit.models.AnalyticsRuleTx](docs/AnalyticsRuleTx.md)
 - [org.qedit.kotqedit.models.AnalyticsRuleWalletDefinition](docs/AnalyticsRuleWalletDefinition.md)
 - [org.qedit.kotqedit.models.AnalyticsSpendDescription](docs/AnalyticsSpendDescription.md)
 - [org.qedit.kotqedit.models.AnalyticsTransferTx](docs/AnalyticsTransferTx.md)
 - [org.qedit.kotqedit.models.AnalyticsTxMetadata](docs/AnalyticsTxMetadata.md)
 - [org.qedit.kotqedit.models.AnalyticsTxType](docs/AnalyticsTxType.md)
 - [org.qedit.kotqedit.models.AsyncTaskCreatedResponse](docs/AsyncTaskCreatedResponse.md)
 - [org.qedit.kotqedit.models.AttachmentBody](docs/AttachmentBody.md)
 - [org.qedit.kotqedit.models.AttachmentHeader](docs/AttachmentHeader.md)
 - [org.qedit.kotqedit.models.BalanceForAsset](docs/BalanceForAsset.md)
 - [org.qedit.kotqedit.models.CreateGroupRequest](docs/CreateGroupRequest.md)
 - [org.qedit.kotqedit.models.CreateGroupResponse](docs/CreateGroupResponse.md)
 - [org.qedit.kotqedit.models.CreateRuleRequest](docs/CreateRuleRequest.md)
 - [org.qedit.kotqedit.models.DeleteRuleRequest](docs/DeleteRuleRequest.md)
 - [org.qedit.kotqedit.models.DeleteWalletRequest](docs/DeleteWalletRequest.md)
 - [org.qedit.kotqedit.models.DownloadAttachmentRequest](docs/DownloadAttachmentRequest.md)
 - [org.qedit.kotqedit.models.DownloadAttachmentResponse](docs/DownloadAttachmentResponse.md)
 - [org.qedit.kotqedit.models.EmptyContent](docs/EmptyContent.md)
 - [org.qedit.kotqedit.models.ErrorResponse](docs/ErrorResponse.md)
 - [org.qedit.kotqedit.models.ExportAuditorAccessWalletRequest](docs/ExportAuditorAccessWalletRequest.md)
 - [org.qedit.kotqedit.models.ExportAuditorAccessWalletResponse](docs/ExportAuditorAccessWalletResponse.md)
 - [org.qedit.kotqedit.models.ExportWalletRequest](docs/ExportWalletRequest.md)
 - [org.qedit.kotqedit.models.ExportWalletResponse](docs/ExportWalletResponse.md)
 - [org.qedit.kotqedit.models.GenerateWalletRequest](docs/GenerateWalletRequest.md)
 - [org.qedit.kotqedit.models.GetAllWalletsResponse](docs/GetAllWalletsResponse.md)
 - [org.qedit.kotqedit.models.GetGroupsRequest](docs/GetGroupsRequest.md)
 - [org.qedit.kotqedit.models.GetGroupsResponse](docs/GetGroupsResponse.md)
 - [org.qedit.kotqedit.models.GetNetworkActivityRequest](docs/GetNetworkActivityRequest.md)
 - [org.qedit.kotqedit.models.GetNetworkActivityResponse](docs/GetNetworkActivityResponse.md)
 - [org.qedit.kotqedit.models.GetNewAddressRequest](docs/GetNewAddressRequest.md)
 - [org.qedit.kotqedit.models.GetNewAddressResponse](docs/GetNewAddressResponse.md)
 - [org.qedit.kotqedit.models.GetNotificationsRequest](docs/GetNotificationsRequest.md)
 - [org.qedit.kotqedit.models.GetNotificationsResponse](docs/GetNotificationsResponse.md)
 - [org.qedit.kotqedit.models.GetPublicKeyRequest](docs/GetPublicKeyRequest.md)
 - [org.qedit.kotqedit.models.GetPublicKeyResponse](docs/GetPublicKeyResponse.md)
 - [org.qedit.kotqedit.models.GetRulesResponse](docs/GetRulesResponse.md)
 - [org.qedit.kotqedit.models.GetSyncStatusResponse](docs/GetSyncStatusResponse.md)
 - [org.qedit.kotqedit.models.GetTaskStatusRequest](docs/GetTaskStatusRequest.md)
 - [org.qedit.kotqedit.models.GetTaskStatusResponse](docs/GetTaskStatusResponse.md)
 - [org.qedit.kotqedit.models.GetTasksRequest](docs/GetTasksRequest.md)
 - [org.qedit.kotqedit.models.GetTasksResponse](docs/GetTasksResponse.md)
 - [org.qedit.kotqedit.models.GetWalletActivityRequest](docs/GetWalletActivityRequest.md)
 - [org.qedit.kotqedit.models.GetWalletActivityResponse](docs/GetWalletActivityResponse.md)
 - [org.qedit.kotqedit.models.GetWalletBalanceRequest](docs/GetWalletBalanceRequest.md)
 - [org.qedit.kotqedit.models.GetWalletBalanceResponse](docs/GetWalletBalanceResponse.md)
 - [org.qedit.kotqedit.models.GroupInformation](docs/GroupInformation.md)
 - [org.qedit.kotqedit.models.HealthcheckResponse](docs/HealthcheckResponse.md)
 - [org.qedit.kotqedit.models.HealthcheckResponseItem](docs/HealthcheckResponseItem.md)
 - [org.qedit.kotqedit.models.ImportAuditorAccessWalletRequest](docs/ImportAuditorAccessWalletRequest.md)
 - [org.qedit.kotqedit.models.ImportWalletRequest](docs/ImportWalletRequest.md)
 - [org.qedit.kotqedit.models.IssueAssetRequest](docs/IssueAssetRequest.md)
 - [org.qedit.kotqedit.models.LeaveGroupRequest](docs/LeaveGroupRequest.md)
 - [org.qedit.kotqedit.models.LeaveGroupResponse](docs/LeaveGroupResponse.md)
 - [org.qedit.kotqedit.models.ListAttachmentsRequest](docs/ListAttachmentsRequest.md)
 - [org.qedit.kotqedit.models.ListAttachmentsResponse](docs/ListAttachmentsResponse.md)
 - [org.qedit.kotqedit.models.Notification](docs/Notification.md)
 - [org.qedit.kotqedit.models.NotificationType](docs/NotificationType.md)
 - [org.qedit.kotqedit.models.OrderEnum](docs/OrderEnum.md)
 - [org.qedit.kotqedit.models.Result](docs/Result.md)
 - [org.qedit.kotqedit.models.Rule](docs/Rule.md)
 - [org.qedit.kotqedit.models.ShareWalletViewingPermissionRequest](docs/ShareWalletViewingPermissionRequest.md)
 - [org.qedit.kotqedit.models.ShareWalletViewingPermissionResponse](docs/ShareWalletViewingPermissionResponse.md)
 - [org.qedit.kotqedit.models.TaskActionRequest](docs/TaskActionRequest.md)
 - [org.qedit.kotqedit.models.TaskData](docs/TaskData.md)
 - [org.qedit.kotqedit.models.TaskState](docs/TaskState.md)
 - [org.qedit.kotqedit.models.TaskType](docs/TaskType.md)
 - [org.qedit.kotqedit.models.TransferAssetRequest](docs/TransferAssetRequest.md)
 - [org.qedit.kotqedit.models.UploadAttachmentRequest](docs/UploadAttachmentRequest.md)
 - [org.qedit.kotqedit.models.UploadAttachmentResponse](docs/UploadAttachmentResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-auth-token
- **Location**: HTTP header

