Feature: US_011 As a user, I would like the site to have a page with special discounts and campaigns for new users in order to reach more users.

Background:
  Given User goes to the url
  Then User clicks on New User Zone menu
  Then Verify that user is in the new user zone page

  Scenario: TC_001 User displays the New User Zone menu  and it should be functional on the homepage navBar.
    Given User goes to the url
    Then User clicks on New User Zone menu
    Then Verify that user is in the new user zone page
    @tc2
    Scenario:TC_002  New User Zone page should have For You, Exculusive Price and Coupon sections.
             On the New User Zone page, User switches between For You, Exculusive Price and Coupon sections.

      Given User displays for you section
      Then User displays exculisive price section
      Then User displays coupon section
      Then User clicks on for you section
      And Verify that user is in the for you section
      And User clicks on exclusive price section
      And Verify that user is in the exclusive section
      And User clicks on coupon section
      And Verify that user is in the coupon section
      @tc3
      Scenario: TC_003 For You section displays products for the new user.
        Given User clicks on for you section
        Then Verify that the products is visible
@tc4
        Scenario: TC_004 Exclusive Price section  displays products with special discounts for new users.
          Given User clicks on exclusive price section
          Then Verify that special discounts are visible