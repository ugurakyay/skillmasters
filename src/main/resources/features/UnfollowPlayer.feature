Feature: Unfollow player on watchList

  Scenario: Unfollow a player in watchlist
    Given I added player in watchlist
    When I click on Player name in watchlist
    Then I land on Player detail page
    When I click on stop watch button
    Then I see button name changed to “add to watchlist again”
    When I click on back button
    Then I land on Dashboard page
    When I click on stopped following
    Then I see unfollowed players in stopped following