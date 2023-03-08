Feature: SignUp to Skillmaster

  Scenario: SignUp
    Given open browser enter
    When user see homepage area
    And user press sign up
    And user sign up screen
    Then user chose“ I am a recruiter”
    And user fill the field
    And user click sign up
    And user chose sport type, enter school name
    Then user see dashboard
