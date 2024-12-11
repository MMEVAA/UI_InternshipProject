Feature:Payment Options


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    Then Click on the hamburger menu
    Then Go to Finance section
    Then Click on my finance button


  Scenario:
    Given 3 noktalı menüye tıkla
    When Ödeme raporunu indir
    Then İndirilen raporu doğrula

