Feature: Hamburger Menu Navigation

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    When The user clicks on the hamburger menu
    When The user hovers over the "Messaging" option

  Scenario: Opening the hamburger menu
    Then The following options should be displayed:
      | Option       |
      | Send Message |
      | Inbox        |
      | Outbox       |
      | Trash        |

  Scenario: Navigating to Send Message page via the "Messaging" submenu
    Given Click on the Send Message option
    Then User should redirect to Send Message URL

  Scenario: Navigating to Inbox page via the "Messaging" submenu
    Given Click on the Inbox option
    Then User should redirect to Inbox URL

  Scenario: Navigating to Outbox page via the "Messaging" submenu
    Given Click on the Outbox option
    Then User should redirect to Outbox URL

  Scenario: Navigating to Trash page via the "Messaging" submenu
    Given Click on the Trash option
    Then User should redirect to Trash URL
