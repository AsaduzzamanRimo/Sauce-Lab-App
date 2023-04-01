Feature: Login Scenario

  Scenario Outline: Login with invalid username

    When I enter  Invalid username as "<username>"
    And I enter password as "<password>"
    And I click the login button
    Then Login should fail with an error message "<error>"
    Examples:
      | username      | password    | error                                                        |
      | standard_user | invalidPass | Username and password do not match any user in this service. |

  Scenario Outline: Login with invalid password
    When I enter  Valid username as "<username>"
    And I enter InValidpassword as "<password>"
    And I click the login button
    Then Login should fail with an error message "<error>"
    Examples:
      | username      | password    | error                                                        |
      | standard_user | invalidPass | Username and password do not match any user in this service. |

  Scenario Outline: Login with valid username and Password
    When I enter  Valid username as "<username>"
    And I enter password as "<password>"
    And I click the login button
    Then Login should sueccesfull and show Tittle "<tittle>"
    Examples:

      | username      | password    | tittle                                                       |
      | standard_user | invalidPass | this is product |
