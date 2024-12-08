Feature: Hamburger menu messaging functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Delete action on Trash page
      Given Navigate to Trash
      When Click the delete button on the trash page
      Then User should delete successfully message
      And Click the restore button on the trash page
      Then User should restore successfully message

