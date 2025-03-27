
Feature: Examples page

@Regression
  Scenario: Get footer link. Total links are 9.
   Given I am on the webiste
    When I enter "practice" and "SuperSecretPassword!" 
    And I click the login button 
    Then extract welcome massage
    And go to demos dropdown and click on example
    Then print all the footer link
    
