#Author: Mahendra
@tag
Feature: feature to test adding new contact functionality

  Scenario: Add new contacts
    Given The user is on dashboard
    And User clicks on the new contact button
    When user clicks on choose contact dropdown field and selects the new contact
    And User adds valid inputs
    And User selects checkboxes as needed
    Then The user clicks on the save changes button