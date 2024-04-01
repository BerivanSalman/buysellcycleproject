Feature:As a registered user, I would like to have a page on my dashboard where I can display my coupons / perform coupon transactions

  Scenario: TC01 As a registered user, I would like to have a page on my dashboard where I can display my coupons / perform coupon transactions
    Given User goes to the buysellcyle homepage.
    Then User verifies that the login link is visible on the top bar of the home page.
    And User clicks on the Log In button and displays the sign in page.
    Then User verifies that email input box is visible
    And User verifies that password input box is visible
    Then User clicks on the Email address or phone box and enters a valid "berivanUserMail".
    And User clicks on the Password box and enters a valid "berivanPassword".
    Then User clicks on the Sign In button.
    And User verifies that the user is successfully logged into the system.
    Then User scrolls down the page until sees My Coupons
    Then User ensures that My Coupons menu item should be visible
    And User waits for 2 seconds
    And User clicks My coupons menu item
    Then User ensures that Add Coupons window should be visible on My Coupons page
    And User closes the page.

    Scenario: TC02 As a registered user, I should be able to add coupon code, copy and delete it from the list.
      Given User goes to the buysellcyle homepage.
      Then User verifies that the login link is visible on the top bar of the home page.
      And User clicks on the Log In button and displays the sign in page.
      Then User verifies that email input box is visible
      And User verifies that password input box is visible
      Then User clicks on the Email address or phone box and enters a valid "berivanUserMail".
      And User clicks on the Password box and enters a valid "berivanPassword".
      Then User clicks on the Sign In button.
      And User verifies that the user is successfully logged into the system.
      Then User scrolls down the page until sees My Coupons
      Then User ensures that My Coupons menu item should be visible
      And User waits for 2 seconds
      And User clicks My coupons menu item
      Then User ensures that Add Coupons window should be visible on My Coupons page
      And User clicks to the placeholder to enter a coupon code
      Then User enters a valid code
      And User clicks Add Coupon link
      Then User verifies that the coupons that the user has collected should be listed as Collected Coupons list
      And User clicks copy item under the action
      Then User views the success message
      And User clicks delete item under the action
      Then User ensures that Are you sure to delete? is visible
      And User clicks delete button
      Then User views the success message
      And User closes the page.




