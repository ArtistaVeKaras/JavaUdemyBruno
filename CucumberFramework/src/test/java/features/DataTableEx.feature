Feature: Using the Contact Us form to add a comment and extract the data from the comments box	
	
#Using the contact form
Background: 
	Given I access webdriveruniversity  
	
	
@ContactUs1
Scenario: Submit information using the contact us form
		And I enter the firstname
		And I enter the lastname
		And I enter an email address
		And I enter comments 
		| example of the first comment | exmaple of the second comment |
		And I click the submit button
		Then The information should successfully be subimiited via the contact us form
		