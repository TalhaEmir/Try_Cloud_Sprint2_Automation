Feature: Dashboard Functionality
  User Story : As a user I should be able to modify Dashboard page

  @dashboard
  Scenario: User can modify Dashboard page
    Given User is already logged in and can see all modules and Username
    Then User can click on Customize button and select any of the Widgets.
    And User can click on Set Status button and select any of the Status options.
