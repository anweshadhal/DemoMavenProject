#Author: your.email@your.domain.com
Feature: Customer wants to view mails

  @Login
  Scenario Outline: Verify user landed on Email inbox
    Given Launch the driver
    When user enters the "<EmailID>"
    And enter the "<Password>"
    Then I verify the email inbox

    Examples: 
      | EmailID                  | Password    |
      | anwesha.dhal95@gmail.com | Mamuni@2021 |