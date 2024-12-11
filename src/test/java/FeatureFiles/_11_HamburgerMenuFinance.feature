Feature:Finance Options


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    Then Click on the hamburger menu
    Then Go to Finance section
    Then Click on my finance button

  Scenario:

    Then Click view icon
    And Click on Stripe and share icon
    Then Enter the payment amount and information and complete the payment.
