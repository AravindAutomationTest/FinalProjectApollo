Feature: Home page
	Scenario: To verify homepage
		Given user is logged in 
		Given user is at home page
		When user clicks on FAQs and Articles
		Then FAQs will be displayed
		When user clicks on vaccine quires
		Then user navigates to quires page
		When user clicks on chat with us.
		Then user navigates to chat page
		When user clicks on cowin registration
		Then user navigates to Cowin page
