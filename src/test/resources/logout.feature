 
Feature: Parabank logout testing
Description: User should already have an account
Background: User should be loged in
 
Scenario Outline: As a logged-in user, I want to logout successfully from Parabank website
Given open the browser
And pass the URL "<URL>"
When enter username "<username>" in the Username field
And enter password "<password>" in the Password field
And click on Login
And click on Log Out
Then Validate logout is successful
Examples:
|URL                                                           |username|password|
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC|rbari124|Abc123321|
