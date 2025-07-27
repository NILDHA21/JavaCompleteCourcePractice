Feature: login functionality
Scenario: validate login page with valid credentials
Given user should open chrome browser
When user enter username and password
And click on login button
Then page should be nevigated to the next page
And close the browser 