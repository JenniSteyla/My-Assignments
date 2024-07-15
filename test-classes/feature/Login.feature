Feature: Leaftaps Login Feature
Scenario: Login into leaftaps with positive credentials
Given Launch the browser
And Load the URL
And Enter the username
And Enter the password
When Click on the Login button
When Click on the CRMSFA link
Then Verify the Title of the page 
Given Close the browser