Feature: login
  Scenario: login user with true username and password
    Given open browser enter address
    When user see username and password area
    And user press sign in
    Then user see dashboard screen


