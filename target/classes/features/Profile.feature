Feature: Update Profile

  Scenario: Update password on Profile
    Given I land on dashboard page
    When I click on Manage profile button on the left menu
    Then I land on my profile page
    When I type new password
    And I type password validation
    And I click on update password button
    Then I see Your password is updated message