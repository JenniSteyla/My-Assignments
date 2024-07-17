Feature: Sales Force Edit Account Name Feature
Background:
Given Launch the browser and load the URL
Given Enter the username
And Enter the password
When Click on the login button
And Click on the toggle menu button and view all
And Click on accounts tab

Scenario: Sales Force Account name editing using positive credentials 
#When Click on Search
Given Searching the account using unique account name as 'Jenni'
When Click on the Account name 
And Click the dropdown icon 
And Select edit option in dropdown
And Click on the type and select technology partner
And Click on the industry and select Healthcare
Given Enter the Billing street as 'C2 Punjab Road, Block-10' 
And Enter the Billing city as 'Neyveli'
And Enter the Billing Zip as '607801'
And Enter the Billing state as 'Tamil Nadu'
And Enter the Billing country as 'India'
And Enter the Shipping street as 'C2 Punjab Road, Block-10'
And Enter the Shipping city as 'Neyveli'
And Enter the Shipping Zip as '607801'
And Enter the Shipping state as 'Tamil Nadu'
And Enter the Shipping country as 'India'
When Click on the customer priority and select low
And Click on the SLA and select silver
And Click on the Active and select no
Given Enter the Phone number as '9600240775'
When Click on the upsell oppourtunity and select no 
And Click on the save button
Then Verify Phone number


