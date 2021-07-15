Feature: Health blog
Scenario: To verigy health blog
	Given User is logged in
	And User is at home page
	When user clicks on read the latest articles 
	Then user navigates to page
	When user clicks on take a mental health scan 
	Then user navigates to Assessment page
	When user clicks on Explore health life 
	Then user navigates to partners hdfc website
	When user clicks on explore apollo kavach program 
	Then user navigates to apolo kavach registration page.