Feature: Home Tab Menu Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Verify Header Menu links, Hamburger Menu, and Upper Right Corner Items
    Given The user verifies Header menu by clicking on the Header menu links
      | coursesButton     |
      | calendarButton    |
      | attendanceButton  |
      | assignmentsButton |
      | gradingButton     |
    And The user clicks on the Hamburger menu and Hamburger submenu
    Then The user verifies items in the upper right corner
      | notificationsIcon |
      | newMessageIcon    |
      | profileMenu       |