Feature: Register New User

  Scenario Outline: Verify new unregister user can register
    Given I navigate to SauceDemo webpage
  #  When I click on account register button
    And I fill in the "<username>"
    And I enter the "<password>"
    Then I should see the product page



    Examples:
    |username| password|
    |standard_user   |secret_sauce|
   # | visual_user    |secret_sauce|
    #|Junior   |Kusi     |

@regression @invalid
  Scenario Outline: cenario Outline: Verify new unregister user cannot login with invalid credentials
    Given I navigate to DemoOpenCart webpage
    When I click on account register button
    And I fill in the "<username>"
    And I enter the "<password>"
Examples:
    |username|password |
    |Stephen |Clinton  |
    |Junior  |Kusi     |
