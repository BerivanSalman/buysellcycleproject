Feature: US_020-As a registered user, I would like to have a page on my Dashboard where I can view my orders.

  Background:User must register on the website with the correct mail and password.

    Given User goes to the buysellcyle homepage.
    And User clicks on the Log In button and displays the sign in page.
    And User clicks on the Email address or phone box and enters a valid "muratUserMail".
    And User clicks on the Password box and enters a valid "muratPassword".
    Then User clicks on the Sign In button.

  @Murat @US_020-TC_001
    Scenario: The registered user can see and interact with the My Order menu title in the Dashboard sideBar.

      And User displays the user dashboard page.

