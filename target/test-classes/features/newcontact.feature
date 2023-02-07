#Author: Mahendra
@tag
Feature: feature to test signup functionality

  Scenario: Add new contacts
    Given The user is on dashboard
    And User clicks on the new contact button
    When User adds valid inputs
    And User selects all the check boxes
    Then User clicks the save button
