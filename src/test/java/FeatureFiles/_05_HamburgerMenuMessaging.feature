Feature:Messaging Options


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given Click on the new message icon
    When  Click send message
    Then  Click add recipient and select recipients
    And Add medium, topic, message, file and send
    Then Go to outbox and check your message

