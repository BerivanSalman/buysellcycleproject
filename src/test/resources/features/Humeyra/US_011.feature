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
@tc5
     Scenario: TC_005 For You  section  perform operation on products (adding to cart,wishlist,comparing).
       Given User clicks on for you section
       Then User click a product
       Then User clicks on Add to Cart
       Then Verify that user has added the item
       Then User clicks on close icon
       Then User clicks on Add to Compare
       Then Verify that user has added to compare
       Then User clicks on add to wishlist
       Then Verify that user has added to wishlist
  @tc6
     Scenario: TC_006 User switches between existing categories in the Exclusive Price section.
       Given User clicks on exclusive price section
       Then User clicks on All category
       Then User clicks on electronics category
       Then User clicks on home category
    @tc7
    Scenario: TC_007 A valid coupon is listed in the designated Coupon section and it is redeemed for its intended purpose.
      Given User clicks on coupon section
      Then Verify that user is in the coupon section
      Then User clicks on get now button
      Then Verify that the text coupon store successfully
      @tc8
      Scenario: TC_008 Products is displayed in the new User Gift section in the Coupon section.
        Given User clicks on coupon section
        Then User displays the products in the new user gift section in the coupon section
     @tc9
    Scenario: TC_009 In the New User Gift section, it should be possible to perform operations on products
             (adding to cart, selecting products for comparison, adding to Wish list, and viewing).
      Given User clicks on coupon section
      Then User clicks on new user gift product
      Then User clicks on Add to Cart
      Then Verify that user has added the item
      Then User clicks on close icon
      Then User clicks on Add to Compare
      Then Verify that user has added to compare
      Then User clicks on add to wishlist
      Then Verify that user has added to wishlist
