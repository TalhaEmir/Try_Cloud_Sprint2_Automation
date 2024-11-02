Feature: User Story :

  As a user, I should be able to create a new group under Contacts module

  Background:
    Given the user is logged in
    And the user navigates to the Contacts module
@contact
  Scenario: New group under contacts
  When user can clicks on the link New group
  And user can enters the group name "group10"
  And user can click on the link All contacts
  And User can see all the available groups name "group10" through the group’s dropdown menu
  Then User can add a new property as "Annive"