Feature: Header Section UI
  As a user
  I want to interact with the header section
  So that I can navigate to different parts of the application

  Scenario: view headerSection details
  Given the user is logged in3
  When the user enters valid credentials3
  Then the header should display the logo3
  When the user clicks the Popular link in the header3
  Then the popular movies page should be displayed3

