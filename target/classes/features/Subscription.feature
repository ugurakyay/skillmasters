Feature: Subscription

  Scenario: create a monthly subscription
    Given I land on dashboard page
    When I click on subscriptions button on the left menu
    Then I land on subscriptions page
    When I click on create one button
    Then I land on subscription detail page monthly selected as default
    When I type credit card info on the page
    And I click on submit button