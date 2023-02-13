#Author: Mahendra
#@mustRun
Feature: feature to test signup functionality

	@SmokeTesting
  Scenario: User creates an account
    Given The user is on registration page
    When The user inputs valid details
    And The user selects captcha
    And User clicks on register button
    Then navigated to dashboard
   