@logout
Feature: Logout feature
  User Story: As a user, I should be able to log out.

  Background:
    Given the user is logged in

  Scenario: Logout scenario
    When User clicks logout header button
    And User clicks logout button
    Then User should be logged out and redirected to login page

  Scenario:
    When User clicks logout header button
    And User clicks logout button
    Then User cannot return to homepage by clicking step back button after logout

