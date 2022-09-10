Feature: Login Orange
  Background: User login into Orange page
    Given Im in Orange web page

  @AddJobSuccessfully @NeedLogout
  Scenario: Add a job in admin section
    Given I set the username field with "Admin"
    And  I set the password field with "admin123"
    And I click in login button
    And I click in Admin button
    And I click in Job tab
    And I click in Job Titles button
    And I click in +Add button
    And I fill the job title information with
      |Ux Ui|Design interfaces|Experience in ux|
    When I click in save button
    Then A successfully saved message shows and the job is successfully saved
