Feature: Home Page Functionality
  As a user
  I want to view the homepage
  So that I can browse available movies

  Scenario: View the homepage
    Given the user is logged in2
    When the user navigates to the home page2
    Then the popular movies section should be displayed2
    And the search bar should be available2
