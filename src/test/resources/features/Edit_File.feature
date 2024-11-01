
Feature: File management in Files module

  User Story: Users should be able to log in and perform actions like uploading files, creating folders,
  deleting items, and viewing the total count of files and folders in the Files module.

  Background:
    Given the user is logged in
    And the user navigates to the Files module



  Scenario Outline: User can upload a <file>
    When the user clicks on the option button
    And the user uploads a "<file>"
    Then the file "<file>" should be visible in the files list

    Examples:
      | file           |
      | TryCatch.txt   |


  Scenario Outline: User can create a new folder
    When the user clicks on the option button
    And the user clicks on the New folder button
    And the user enters the folder name as <"Emir">
    Then a folder named "<folderName>" should be visible in the files list

    Examples:
      | folderName |
      | Emir     |


  Scenario Outline: User can delete any selected item from its three dots menu
    When the user clicks on the three dots menu next to the item named "<exampleFile>"
    And the user selects the "Delete" option
    Then the item named "exampleFile.txt" should no longer be visible in the files list
    Examples:
      | exampleFile |
      | Emir        |


  Scenario: Show total count under files list table
    Then the total count of files and folders is shown
