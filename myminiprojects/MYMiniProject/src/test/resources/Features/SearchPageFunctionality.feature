Feature: Search for Movies
  As a user
  I want to search for specific movies
  So that I can quickly find content I am interested in

  Scenario: Successful search with valid query
    Given I click to login page6
    When the user enters valid credentials6
    And the user enters a movie title in the search bar6
    And the user enters a non-existent movie title6
    Then matching movies should be displayed6
    Then matching no results found6
