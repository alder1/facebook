Feature: As a user of ParentPay Application, I want to login to the application so I can make payment for my son's school stuffs

  Scenario:
    Given I navigate to the landing page of PPay
    When I click on Login button
    And I enter my valid email address/username & my Valid password
    And I click on the Login button
    Then I should login successfully