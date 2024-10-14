Feature: Login Page Functionality
  As a user
  I want to log in to the application
  So that I can access my account

  Scenario: Successful login with valid credentials
    Given the user is on the login page1
    When the user enters valid credentials1
    Then the user should be redirected to the homepage1
    Then the username, password fields, and login button should be visible1

