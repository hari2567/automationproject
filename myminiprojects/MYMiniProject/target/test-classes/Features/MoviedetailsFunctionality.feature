Feature: View Movie Details
  As a user
  I want to view the details of a selected movie
  So that I can get more information before watching

  Scenario: View movie details
    Given I enter  login page4
    When the user enters valid credentials4
    And I should enter   home page4
    And I should enter   popular page4
    Then the title, description, rating, and reviews should be displayed4
