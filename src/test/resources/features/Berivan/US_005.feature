Feature: US_005 As a user, I would like to be able to log in with the email and password I registered with the site.

  Scenario: TC01 As a user, I should be able to reach login page successfully
    Given User goes to the buysellcyle homepage.
    And User clicks on the Log In button and displays the sign in page.
    And User confirms that the relevant image and text are displayed on the right side of the login page.
    Then User validates that the sign-in form is visible on the left side of the login page.
    And User closes the page.

  Scenario: TC02 As a user, I would like to be able to log in with the email and password I registered with the site
    Given User goes to the buysellcyle homepage.
    Then User verifies that the login link is visible on the top bar of the home page.
    And User clicks on the Log In button and displays the sign in page.
    Then  User validates that the sign-in form is visible on the left side of the login page.
    And  User verifies that email input box is visible
    And User verifies that password input box is visible
    Then User clicks on the Email address or phone box and enters a valid "berivanUserMail".
    And User clicks on the Password box and enters a valid "berivanPassword".
    And User ensures that Remember me checkBox is selectable to remember the information entered
    Then User clicks on the Sign In button.
    And User closes the page.

  Scenario: TC03 As a user, I should be able to switch to the Forgot Password page from the login page if I forget the password
    Given User goes to the buysellcyle homepage.
    Then User verifies that the login link is visible on the top bar of the home page.
    And User clicks on the Log In button and displays the sign in page.
    Then User confirms that there is a link at the bottom of the page to switch to the Forgot Password page from the login page.
    And User clicks the forgot password link
    Then User verifies that there is an email input box in the forgot password page
    And User enters a valid "berivanUserMail"
    Then User click the Send Link button
    And User closes the page.

  Scenario: TC04 As a user, I should not be able to sign in by leaving the email/phone number and password fields blank and  an error message should display

    Given User goes to the buysellcyle homepage.
    Then User verifies that the login link is visible on the top bar of the home page.
    And User clicks on the Log In button and displays the sign in page.
    Then  User validates that the sign-in form is visible on the left side of the login page.
    And  User verifies that email input box is visible
    And User verifies that password input box is visible
    Then User clicks on the Sign In button.
    And User verifies the email required error message should display.
    Then User verifies the password required error message  should display.
    And User closes the page.

  Scenario: TC05 As a user, I should not be able to sign in by leaving the password field blank and an error message should display
    Given User goes to the buysellcyle homepage.
    Then User verifies that the login link is visible on the top bar of the home page.
    And User clicks on the Log In button and displays the sign in page.
    Then  User validates that the sign-in form is visible on the left side of the login page.
    And  User verifies that email input box is visible
    And User verifies that password input box is visible
    Then User clicks on the Email address or phone box and enters a valid "berivanUserMail".
    Then User clicks on the Sign In button.
    Then User verifies the password required error message  should display.
    And User closes the page.

  Scenario: TC06 As a user, I should not be able to sign in by leaving the email field blank and an error message should display
    Given User goes to the buysellcyle homepage.
    Then User verifies that the login link is visible on the top bar of the home page.
    And User clicks on the Log In button and displays the sign in page.
    Then  User validates that the sign-in form is visible on the left side of the login page.
    And  User verifies that email input box is visible
    And User verifies that password input box is visible
    And User clicks on the Password box and enters a valid "berivanPassword".
    Then User clicks on the Sign In button.
    And User verifies the email required error message should display.
    And User closes the page.

  Scenario: TC07 As a user, I should not be able to sign in by entering an invalid email and an invalid password and an error message should display
    Given User goes to the buysellcyle homepage.
    Then User verifies that the login link is visible on the top bar of the home page.
    And User clicks on the Log In button and displays the sign in page.
    Then  User validates that the sign-in form is visible on the left side of the login page.
    And  User verifies that email input box is visible
    And User verifies that password input box is visible
    Then User clicks on the Email address or phone box and enters "berivanGecersizMail"
    And User clicks on the Password box and enters  "berivanGecersizPassword"
    Then User clicks on the Sign In button.
    And User verifies the an error message should display.
    And User closes the page.

  Scenario: TC08 As a user, I should not be able to sign in by entering an invalid email and valid  password and an error message should display
    Given User goes to the buysellcyle homepage.
    Then User verifies that the login link is visible on the top bar of the home page.
    And User clicks on the Log In button and displays the sign in page.
    Then  User validates that the sign-in form is visible on the left side of the login page.
    And  User verifies that email input box is visible
    And User verifies that password input box is visible
    Then User clicks on the Email address or phone box and enters "berivanGecersizMail"
    And User clicks on the Password box and enters a valid "berivanPassword".
    Then User clicks on the Sign In button.
    And User verifies the an error message should display.
    Then User waits 2 minutes
    And User closes the page.

    Scenario: TC09 As a user, I should not be able to sign in by entering a valid email and an invalid password and an error message should display
      Given User goes to the buysellcyle homepage.
      Then User verifies that the login link is visible on the top bar of the home page.
      And User clicks on the Log In button and displays the sign in page.
      Then  User validates that the sign-in form is visible on the left side of the login page.
      And  User verifies that email input box is visible
      And User verifies that password input box is visible
      Then User clicks on the Email address or phone box and enters a valid "berivanUserMail".
      And User clicks on the Password box and enters  "berivanGecersizPassword"
      Then User clicks on the Sign In button.
      And User verifies the an error message should display.
      And User closes the page.

      Scenario: TC10 As a user,  I should ensure that the Daily Deals feature is visible and functional, and that special promotional
      products are displayed along with a counter on the Daily Deals page.













