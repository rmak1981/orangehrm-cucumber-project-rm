Feature: orange hrm log in and log out

  As a user I want to login to orange hrm and log out

  Scenario: User should log in successfully
    Given   I am on Home Page
    When    I enter username "Admin"
    And     I enter password "admin123"
    And     I click on login button
    Then    I should log in successfully

  Scenario: User should log out successfully
    Given   I am on Home Page
    When    I enter username "Admin"
    And     I enter password "admin123"
    And     I click on login button
    And     I click on welcome to admin menu
    And     I click on logout button
    Then    I should log out successfully
