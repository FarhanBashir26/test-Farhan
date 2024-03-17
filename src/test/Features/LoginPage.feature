Feature: feature to open login page of SwagLabs with details
  Scenario: user enters usernamePassword
    Given user and password is entered
    When Login button is clicked
    Then page is redirected to Home screen