Feature: Dashboard feature
  As a user I want to add employee

  Scenario: User should navigate to add employee page
    Given   I am on Home Page
    When    I enter username "Admin"
    And     I enter password "admin123"
    And     I click on login button
    And     I click on pim button
    And     I click on add button
    Then    I am on add employee page
#   assert text is differed to made test fail
#   back ground added on given stage in the page
  Scenario: User should add employee successfully
    Given   I am on employee page
#      home page button are added in do log in background
    When    I click on add button
    And     I enter firstname "ravi"
    And     I enter lastname "mak"
    Then    I click on save button

