Feature: Login Orange
  Background: User login into Orange page
    Given Im in Orange web page

  @LogoutSuccess
  Scenario: Verify if the logout button is working
    Given I set the username field with "Admin"
    And  I set the password field with "admin123"
    And I click in login button
    And I click in user dropdown tab
    When I click in logout button
    Then Orange login banner should be displayed

  @OptionalFieldsIsDisplayed @NeedLogout
  Scenario: Verify if optional fields button works and shows its window
    Given I set the username field with "Admin"
    And  I set the password field with "admin123"
    And I click in login button
    And I click in configuration dropdown tab
    When I click in optional fields button
    Then Optional fields window will be displayed

  @VerifyEmployeeNamesDisplayed @NeedLogout
  Scenario Outline: Check if employee names are displayed
    Given I set the username field with "Admin"
    And  I set the password field with "admin123"
    When I click in login button
    Then Employee name "<employee>" is displayed
  Examples:
    | employee|
    | Cecil |
    | Charlie |
    | Chenzira |
