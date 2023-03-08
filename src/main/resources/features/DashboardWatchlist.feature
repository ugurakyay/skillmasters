Feature: login user can see watch list

  Scenario: Watchlist Dashboard
    Given logged in user can see WatchList
    And user can see watchlist (if watchlist is empty go next step)
    And user press Go to Player Database button
    Then user go to Player database Tab
    And user can press eye icon in action colon
    Then user can see player details
    And user can add watch list player
    And user can add notes this player
    And user click Back button
    Then user can see this player in watchlist Tab
    And user can click starred colon star icon
    Then user can see this player in starred tab
