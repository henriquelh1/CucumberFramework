Feature: Submit data to webdriveruniversity.com using contact us form
	A user should submit information via the contact us form

Scenario: Submit information using the contact us form
	Given I access webdriveruniversity
	When I click on the contact
	And I enter first name
	And I enter last name
	And I enter an email address
	And I enter comments
	When I click on the submit button
	Then the info should successfully be submitted via the the contact us form
	
Scenario: Submit non valid data via the contact us form
	Given I access webdriveruniversity
	When I click on the contact
	And I enter non first name
	And I enter last name
	And I enter an email address
	And I enter comments
	When I click on the submit button
	Then the info should successfully be submitted via the the contact us form