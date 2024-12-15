Feature: Delete messages from the Outbox via the Hamburger Menu

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    When The user clicks on the hamburger menu
    When The user hovers over the "Messaging" option

  Scenario: Delete message successfully
    Given Click on the Outbox option
    Then User should redirect to Outbox URL
    And Click on the Move to Trash icon
    Then User should see to confirm message
    And  Click on the Yes button
    Then User should see to success delete message