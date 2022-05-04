Feature: All sample scenarios


  @loginReal @validData
  Scenario: To test the functionality of login button for valid input
    Given I am on login page
    When I enter correct username and correct password
    And I click on login button
    Then I should be redirected to home page

   @dummyLogin @validData
  Scenario: To test the functionality of login button for valid input
    Given I am on login page of billing page
   #  When I enter correct username and correct password on billing page
     When I enter username as "admin" and password as "password" on billing page
     And I click on login button of billing page
    Then I should be redirected to Dashboard

  @dummyLogin
  Scenario: To test the functionality of login button for valid input
    Given I am on login page of billing page
  #  When I enter incorrect username and incorrect password on billing page
    When I enter username as "abcd" and password as "xyz" on billing page
    And I click on login button of billing page
    Then I should get error

  @dummyLogin
  Scenario: To test the functionality of login button for valid input
    Given I am on login page of billing page
    #When I enter blank username and password on billing page
    When I enter username as "" and password as "" on billing page
    And I click on login button of billing page
    Then I should get another error


    @userReg
    Scenario: to test the functionality of submit button
      Given I am on user registration page
      When I enter below Data
      | Amol | Ujagare | 7878787 | amol@gmail.com |
      And I click on submit button
      Then user should be added


  @subscribe
  Scenario Outline: to test the functionality of subscribe button
    Given I am on user subscription page
    When I enter <name> ,<contact> ,<email>
    And I click on subscribe button
    Then user should be subscribed
    Examples:
      | name   | contact | email        |
      | Ashish | 12345   | as@gmail.com |
      | Amol   | 22345   | am@gmail.com |
      | Amar   | 32345   | ar@gmail.com |
      | Sandip | 42345   | sa@gmail.com |
