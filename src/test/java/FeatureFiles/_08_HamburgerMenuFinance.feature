Feature:Payment Options


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given Click on the hamburger menu
    When Go to Finance section
    Then Click on my finance button
    And View payment page