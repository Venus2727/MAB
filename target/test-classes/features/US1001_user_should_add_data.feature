Feature: US1001_user_should_add_data

#  Create a new feature file:US1001_user_should_add_data.feature
#  Write your Test Scenarios in the feature file
#  Create DataTablesStepDefinition class and Generate step definitions
#  Write your code in the step definitions class
#  When user go to
#  https://editor.datatables.net/
#  Click on the new button
#  When user enters all fields
#  And search for the first name
#  Then verify the name fields contains first name
  @datatable
  Scenario: TC01_Testing_the_data_tables_web_page
    Given user on the datatables page
    And user clicks on the new button
    When user enters the firstname
    When user enters the lastname
    When user enters the position
    When user enters the office
    When user enters the extention
    When user enters the startdate
    When user enters the salary
    And user clicks on the create button
    And search for the first name
    Then verify the name fields contains first name
