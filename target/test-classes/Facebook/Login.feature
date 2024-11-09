Feature: 
  To validating the Login Function of Facebook

  @sanity
  Scenario Outline: 
    
    To passing the values using Example tag for login function

    Given To Open Facebook through Chrome
    When User have to pass the username "<username>" data
    And User have to pass the password "<password dataa>" data
    And To click the login button
    Then to close the browser

    Examples: 
      | username | password dataa |
      | Gk       | 123@gk         |
      | gke      | @gk!123        |
      | @ela     | gke0912        |
