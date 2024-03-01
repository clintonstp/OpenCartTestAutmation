Feature: BuyProducts
  As a user I want ot be able to select shirt so that I can buy later
  Scenario Outline: Verify user can buy shirts
    Given I navigate to SauceDemo webpage to
    And I fill in the "<username>"
    And I enter the "<password>"
    And a T-shirt to add to cart





    Examples:
      |username| password|
      |standard_user   |secret_sauce|