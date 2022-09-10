Feature: Login Orange
  Background: User login into Orange page
    Given Im in Orange web page

  @LoginWithValidCredentials @NeedLogout
  Scenario: Login into Orange page with valid credentials
    Given I set the username field with "Admin"
    And  I set the password field with "admin123"
    When I click in login button
    Then The Orange banner should be displayed

  @LoginWithInvalidCredentials
  Scenario: Login into Orange page with valid credentials
    Given I set the username field with "Admon"
    And  I set the password field with "xxxxx"
    When I click in login button
    Then The error message should be displayed