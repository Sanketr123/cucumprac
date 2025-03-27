
Feature: HomePage Testing
  

  @Smoke
  Scenario: Total 18 links must be present on homepage
   Given I am on the webiste
    When I enter "practice" and "SuperSecretPassword!" 
    And I click the login button 
    When I count and print total number of links present
    Then then click on logout button
    
    @Smoke
    Scenario: Welcome to secure area message
    Given I am on the webiste
    When I enter "practice" and "SuperSecretPassword!" 
    And I click the login button 
    When extract welcome massage
    Then then click on logout button
    

  #@tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

 #   Examples: 
#      | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |
