Feature: Headers
	Scenario: To verify headers
	 	Given Open the home page
    Given user enters valid mobile number
    Given user clicks on Generate OTP
    When user cliks on appointments
    Then user navigates to book appointments page
  	When user clicks on health 
  	Then user navigates to health records 
    When user clicks on medicine
    Then user navigates to  medicines and essentials
    When user clicks on labtests
    Then user navigates to book labtests
    When user clicks on covid19
    Then user navigates to covid19 page