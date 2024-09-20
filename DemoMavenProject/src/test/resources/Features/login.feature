@UAT
Feature: Test the login functionality

	Background: Verify if the user is on login page
	Given user is on login page
	
  @login @Regression
  Scenario Outline: check th login with valid credentials
    When user enters "<userId>" and "<password>"
    And clicks on login button
    Then user is naviagted to the home page

    Examples: 
      | userId                   | password    |
      | anwesha.dhal95@gmail.com | Mamuni@1995 |
      
  @login @Smoke
  Scenario Outline: check th login with valid credentials
    When user enters "<userId>" and "<password>"
    And clicks on login button
    Then user is naviagted to the home page

    Examples: 
      | userId                   | password    |
      | anwesha.dhal95@gmail.com | Mamuni@1995 |
