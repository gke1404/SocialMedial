Feature: 
  Creating the New Account in Amazon Application

  Scenario: 
    Passing the new credentioal for creating account

    Given Open Chrome browser and Amazon Application
    When User have to click create new account
    And passing the first name
      | abcde | fghij | klmno | pqrst |
    And passing the mobile number
      |  8253910526 | 7124639764 | 9876542342 | 8932485523 |
      | 71234987652 | 9010080100 | 8010030111 | 9001090100 |
      |  6363773736 | 9875430954 | 7010070100 | 8989598985 |
      |  8010080100 | 9876541234 | 7878784537 | 9090900909 |
    And creating password and reconfimation password
    Then User have to click continue
