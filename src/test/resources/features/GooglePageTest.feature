@One
Feature: Google Search Function
  Scenario: Java Search
    Given User is on Google Home page
    When User search Java Tutorial
    Then Should display Java Result page
@SmokeTest
  Scenario: Selenium Search
    Given User is on Google Home page
    When User search Selenium Tutorial
    Then Should display Selenium Result page