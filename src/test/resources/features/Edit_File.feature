
Feature: File management in Files module

  User Story: Users should be able to log in and perform actions like uploading files, creating folders,
  deleting items, and viewing the total count of files and folders in the Files module.

  Background:
    Given the user is logged in
    And the user navigates to the Files module


  Scenario: User can upload a file
    When the user uploads a file from the configuration file
    Then the file  should be visible in the files list