Feature: 
  To validating Create New Account Function of Facebook Application

  @smoke
  Scenario: 
    To passing the values using datatable for facebook Create New Account function

    Given To Open Facebook through Chrome
    When User have to click create new account button
    And User have to pass the first name
      | GK | Ela | GKE | GKS |
    And To user have to pass the last name
      | no1 | GK    |
      | no2 | MSDVJ |
      | no3 | GKE   |
    And To user have to pass the mobile number
      | mob1       | mob2       | mob3       | mob4       |
      | 8253910526 | 7124639764 | 9876542342 | 8932485523 |
      | 1234987652 | 9010080100 | 8010030111 | 9001090100 |
      | 6363773736 | 9875430954 | 7010070100 | 8989598985 |
      | 8010080100 | 9876541234 | 7878784537 | 9090900909 |
    And To user have to enter the password
      | 8010080100 | 9876541234 | 7878784537 | 9090900909 |
      | 6363773736 | 9875430954 | 7010070100 | 8989598985 |
      | 8010080100 | 9876541234 | 7878784537 | 9090900909 |
    And user have to enter birthday date
    And user have to enter birthday month
    And user have to enter birthday year
    And User have to click the gender  option
    And click the sign up button
    Then Close the browser
