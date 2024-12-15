Feature: Finance Installment Table Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given The user clicks on the hamburger menu
    When The user clicks on the "Finance" link in the hamburger menu
    Then The user clicks on the "My Finance" button
    And The finance page should be displayed
    When Clicking on the student finance page
    Then The user clicks on the FeeBalance Detail button
    And The user should see their payment installment details