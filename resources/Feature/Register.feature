Feature: NopCommerce Registration
  Background:
    Given User able to Open Browser
    And Enter an Url

  Scenario Outline: Nopcommerce Registration Test
    When User click on Registration Link
    And User can click on gender Female
    Then User can enter "<First Name>" and "<Last Name>"
    Then User can enter "<Birth day>" and "<Month>" and "<Year>"
    Then User enter "<EMAIL>"
    Then User is able to enter "<PASSWORD>"
    Then User now can enter "<Confirm Password>"
    Then User click on Register button
    And User close the browser
    Examples:
    |First Name|Last Name|Birth day|Month|Year|EMAIL|PASSWORD|Confirm Password|
    |John      |Abraham  |23       |08   |2000|abd1@gmail.com|tester1|tester1 |
    |Krishna   |Chabra   |02       |09   |1989|abd2@gmail.com|tester2|tester2 |
