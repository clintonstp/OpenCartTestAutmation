Feature: Welcome to Landing Page
  as a user I want to get access to my landing page so that I can login


  Scenario: verify user can access landing page
  Given I navigate to DemoOpenCart webpage
    When I navigate to "https://www.opencart.com/index.php?route=account/register"
    And I fill user "<email>"
    And I enter the "<password>"


    Examples:
    |user name           |password
    |clintonstp@yahoo.com|Finish500+
