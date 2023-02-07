#Author: Mahendra


Feature: feature to test login functionality

  
  Scenario: User logs into the system
    Given The user is on login page
    When The user enters valid details
    And The user clicks on captcha
    And The user clicks on login button
    Then The user is navigated to dashboard
    
    
