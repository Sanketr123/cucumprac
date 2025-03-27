Feature: Login Functionality
@Regression
  Scenario Outline: login feature
    Given I am on the webiste
    When I enter "<username>" and "<password>" 
    And I click the login button
    Then I am on homepage

    Examples: 
      | username | password                 | status  |
      | practice |   SuperSecretPassword!   | success |
      | invalid  |     wrong pass           | Fail    |
