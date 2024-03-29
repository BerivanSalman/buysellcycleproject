Feature: US_005 As a user, I would like to be able to log in with the email and password I registered with the site.

   Scenario: TC01_As a user, I should be able to reach login page successfully

     Given User goes to "".
     Then User clicks on the Log In button and displays the sign in page.
     And User confirms that the relevant image and text ("Turn your ideas into reality.") are displayed on the right side of the login page.
     Then User validates that the sign-in form is visible on the left side of the login page.
      And User closes the page.



