Feature: Submit data to webdriveruniversity.com using the conctac us form
	A user should be able to submit information via the contact us form
	
	
Background: 
	Given I access webdriveruniversity  
	And I click on the contact form
	
	
@ContactUs
Scenario: Submit information using the contact us form
		And I enter the firstname
		And I enter the lastname
		And I enter an email address
		And I enter comments 
		And I click the submit button
		Then The information should successfully be subimiited via the contact us form
		
