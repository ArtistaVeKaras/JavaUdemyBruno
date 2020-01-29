Feature: If the user clicks on the reset button tham all information should be reset from the contact form


Background: 
	    Given I access webdriveruniversity  
		And I click on the contact form

Scenario: Enter the information in the contact form, when the user clicks the reset button then information should be removed
		And I enter the username
		And I enter the password
		And I enter an email address
		And I enter comments 
		And I click on the reset button 
		Then All the information listed by the user on the contact form should now be removed