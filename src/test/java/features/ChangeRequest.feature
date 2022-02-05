Feature: Create an new Change Request in ServiceNow

Scenario:
Given Set EndPoint or URI for the server
And Setup Authentication
When Place the POST Reqest for ChangeRequest
Then Verify the Statu Code
And Print the Response Body