Feature: Login into account
	Existing user should be able to login to account using corret credentials
	
	
Background: 
	Given User navigates to GitHub website
	And User enter a valid username	
	
@Login2	
Scenario: Login into account with correct credentials
	And User enter a "hip-poptuga01" password
	When User click on the login button
	Then User should be taken to the successful loginpage

@Login2
Scenario: Login into account with correct credentials
	And User enter a "invalid" password
	When User click on the login button
	Then User should be taken to the successful loginpage
	
