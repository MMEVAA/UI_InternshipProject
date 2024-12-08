Feature: Home functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: logo at the top left of the home page should be clicked
      And The user should see the company logo in the top left