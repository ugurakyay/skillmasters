Feature: Stared player

  Scenario:Dashboard (Starred)

  Scenario: Star a player in watchlist
    Given I added player in watchlist
    When I click on star icon on the player
    And I click on OK on message popup
    Then I see selected star is colored
