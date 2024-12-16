Feature: Attandance Excecuses

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


    Scenario: When I cannot attend class, report my excuse on the campus website.
    Given Navigate to Attendance
    When Click Attendance Excuses and add Attendance Excuses button
      Then Send the my excuses