Feature: NopCommerce Login
  Background:
    Given user able to open Browser
    And Enter an Url

    #Simple Hard coded scenario.
  @E2E @Regression @Login
  Scenario: Nopcommerce valid Login Test
    When User click on Login Link
    And User is on Login Page and Verify Login Page Title
    Then User enter username and password and click on Login button
    Then User is on Home Page and Verify Home page Title
    And User close the browser

    #simple Data Driven without example keyword
  @E2E @Sanity
  Scenario: Nopcommerce valid Login Test
    When User click on Login Link
    And User is on Login Page and Verify Login Page Title
    Then User enter "test12@gmail.com" and "12ggkjgj" and click on Login button
    Then User is on Home Page and Verify Home page Title
    And User close the browser

    #Data Driven with Example keyword
  @Smoke
  Scenario Outline: Nopcommerce valid Login Test
    When User click on Login Link
    And User is on Login Page and Verify Login Page Title
    Then User enter "<username>" and "<password>" and Click on Login button
    Then User is on Home Page and Verify Home page Title
    And User close the browser
    Examples:
    |username|password|
    |abc1@gmail.com|Test12345|
    |abc2"gmail.com|Test123|
    |abc3"gmail.com|Test345|

    #Data Table
  @Sanity @Regression @E2E
  Scenario: Nopcommerce valid Login Test
    When User click on Login Link
    And User is on Login Page and Verify Login Page Title
    Then User enter USERNAME and PASSWORD and click on Login button
    |abcd5@gmail.com|Test@123|
    Then User is on Home Page and Verify Home page Title
    And User close the browser