Feature: US_035-As an administrator, I would like to have a notifications section on the home page so that I can be informed about events on the site.

  Background:Admin must register on the website with the correct mail and password.

    Given Admin goes to the admin login page.
    And Admin clicks on the Email address or phone box and enters a valid "muratAdminMail".
    And Admin clicks on the Password box and enters a valid "muratPassword"
    Then Admin clicks on the Sign In button.

  @Murat @US_35-TC_001
  Scenario: Admin should display the notification icon and the number on the icon showing unread notifications on the dashboard.

    And Admin displays the admin dashboard page.
    And Admin closes the page.