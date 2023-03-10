@Two
Feature: Login Function
#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display Home Page

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Home Page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Home Page
#
#Examples:
#|username|password|
#|test1|pass1|
#|test2|pass2|
#|tomsmith|SuperSecretPassword!|

@RegressionTest @SmokeTest
Scenario: Valid Login
Given User is on Login Page
When User enters credentials
			|username|password|
			|test1|pass1|
			|test2|pass2|
			|tomsmith|SuperSecretPassword!|
Then Should display Home Page

