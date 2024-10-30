Feature: User Story :

  As a user, I should be able to create a new group under Contacts module
@contact
  Scenario: New group under contacts

  Given User can create a new group under Contacts Module
  And User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
  Then User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.