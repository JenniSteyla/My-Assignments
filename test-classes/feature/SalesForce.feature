Feature: Salesforce account Feature

Scenario Outline: Creating account in salesforce with positive credentials
Given Launch the browser and load the URL
Given Enter the username <user>
And Enter the password <pass>
When Click on the login button
And Click on the toggle menu button and view all
And Click on accounts tab 
And Click on New option
Given Enter the Account name <accname>
When Select ownership as public
And Click on save button
Then Verify the account name

Examples:
|accname|user|pass|
|'Jenni'|dilip@testleaf.com|testleaf@2024|


