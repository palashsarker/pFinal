Feature: Fetch current Team Name from default location with user signIn


Scenario Outline: Enter user account with valid credential and fetch require data

Given user able to open require browser
And enter require url 
And user able to click SignIn button 
When user into signin page with valid "<ID>" and "<PASS>"
And user click submit button and appear user account page with validation 
And mouse over on premier league link button and click tables
Then fetch current Team and coloum name from default location
And user able to SignOut by click username and signout button

Examples:
|ID|PASS|
|dada|22|
|psarker347@gmail.com|smart12346|

