@logout
Feature: Logout feature
  User Story: As a user, I should be able to log out.
  Background:
    Given the user is logged in

  Scenario: Logout scenario
    When User clicks logout button
    Then User should be logged out and redirected to login page
    And User cannot return to homepage by clicking step back button after logout