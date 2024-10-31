
Feature: File management in Files module

  User Story: Users should be able to log in and perform actions like uploading files, creating folders,
  deleting items, and viewing the total count of files and folders in the Files module.

  Background:
    Given the user is logged in
    And the user navigates to the Files module


  Scenario: User can upload a file
    When the user selects the "Upload file" option
    And the user chooses a file named "exampleFile.txt" to upload
    Then the file named "exampleFile.txt" should be visible in the files list
