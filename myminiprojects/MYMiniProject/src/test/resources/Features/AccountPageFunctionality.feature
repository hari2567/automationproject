Feature: Account Page
  As a user
  I want to view and manage my account settings
  So that I can update my preferences

  Scenario: View account details
    Given I click on login page7
    When the user navigates to the account page7
    Then the user’s profile information should be displayed7
    And the user should be able to log out or update their information7
