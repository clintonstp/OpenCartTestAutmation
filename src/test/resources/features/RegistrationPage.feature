Feature: Registration Page

  Scenario Outline: Verify new user can register for new account
    Given I am an un login user on the OpenCart website
    Then I should be able to login for an account with OpenCart
    And I fill in the "<user email>"
    And I fill in the "<password>"

    Examples:
      | user email   | password |
      | user2 email  | password |
      | user3 email  | password |
      | user 4 email | password |