Feature: Register New User

  Scenario Outline: Verify new unregister user can register
    Given I navigate to DemoOpenCart webpage
    When I click on account register button
    And I fill in the "<firstname>"
    And I enter the "<lastname>"
    Examples: