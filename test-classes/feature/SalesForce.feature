Feature: Salesforce account Feature
Scenario: Creating account in salesforce with positive credentials
Given Launch the browser and load the URL
Given Enter the username
And Enter the password
When Click on the login button
And Click on the toggle menu button and view all
And Click on accounts tab and click on new
Given Enter the Account name
When Select ownership as public
And Click on save button
Then Verify the account name


