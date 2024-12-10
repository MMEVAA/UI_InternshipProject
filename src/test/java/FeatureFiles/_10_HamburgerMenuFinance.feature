Feature: Payment Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: The remaining debt should be visible when the payment is made.
      Given Navigate to My Finance
      When Checks that Online Payment and Fee Balance Details buttons are visible on the payment page
      Then Making Payment via Stripe
      And Balance Update and Visibility
      Then Successful Payment Message

