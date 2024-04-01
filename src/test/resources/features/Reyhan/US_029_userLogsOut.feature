Feature: US_029 The user logs out

  Background:
    Given User goes to the buysellcyle homepage.

  @Reyhan @US_029-TC_001
  Scenario:The logged in user should be able to logout from the site via top of the home page
    When Registered user clicks on LOGIN
    Then Registered user clicks on the Email address or phone box
    And Registered user writes his "email" or phone number
    Then Registered user clicks on the Password box
    And Registered user writes his/her "Password"
    Then Registered user clicks to signs in
    Then The logout link displays top of the homepage
    Then Click to logout link

  @Reyhan @US_029-TC_002
  Scenario:The logged in user should be able to logout from the site via top of the home page
    When Registered user clicks on LOGIN
    Then Registered user clicks on the Email address or phone box
    And Registered user writes his "email" or phone number
    Then Registered user clicks on the Password box
    And Registered user writes his/her "Password"
    Then Registered user clicks to signs in
    Then The logout link displays via dashboard sidebar
    Then Click to logout link at the dashboard sidebar


    Then User closes the page.