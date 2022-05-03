Feature: All sample scenarios


  Scenario: To test the functionality of login button for valid input
    Given I am on login page
    When I enter correct username and correct password
    And I click on login button
    Then I should be redirected to home page