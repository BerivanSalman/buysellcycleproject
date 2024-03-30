Feature: US_014-As a user, I would like to have various functions in the home page body section to make shopping easier.

  Background: User goes to the homepage and scrolls down the page
    Given User goes to the buysellcyle homepage.


    @Murat @US_014 @US_014-TC_001
    Scenario: The user should be able to see the all products listed in the 'Best Deals' body section.

      And User scrolls down the page until sees the Best Deals section.
      Then User sees Best Deals section on the body.
      Then User sees Best Deals items.
      And User clicks on View All button.
      And User sees all Best Deals items.
      Then User closes the page.

    @Murat @US_014-TC_002
    Scenario: The user should be able to perform operations on the products in the 'Best Deals' section (adding to cart,
    selecting products for comparison, adding to the wishlist and viewing).

      And User scrolls down the page until sees the Best Deals section.
      Then User sees Best Deals section on the body.
      Then User sees Best Deals items and clicks on any item.
      And User views clicked item.
      And User clicks on the adding to cart button.
      Then User click the View Cart button on the alert page that appears.
      And User sees that the product has been added to the cart.
      Then User comes back to the page and closes the alert.
      And User clicks on Add To Compare button.
      And User gets alert message Product added to compare list successfully.
      Then User clicks on Compare button on the head.
      And User sees that the product has been added to the for compare.
      Then User comes back to the page.
      And User clicks on Add To Wishlist button.
      Then User gets alert message Product added to wishlist successfully.
      And User clicks on Wishlist button on the head.
      Then User sees that the product has been added to the for wishlist.
      And User closes the page.

    @Murat @US_014-TC_003
    Scenario: The user should be able to see the all products listed in the 'Feature Categories' body section.

      Then User slides the page to bottom
      And User sees 'Feature Categories' section on the body.
      And User sees 'Feature Categories' items.
      Then User clicks on 'View All' button.
      And User sees all 'Feature Categories' items.

    @Murat @US_014-TC_004
    Scenario: The user should be able to perform operations on the products in the 'Feature Categories' section
    (adding to cart, selecting products for comparison, adding to the wishlist and viewing).

    @Murat @US_014-TC_005
    Scenario: The user should be able to see the all products listed in the 'Top Rating' body section.

    @Murat @US_014-TC_006
    Scenario: The user should be able to perform operations on the products in the 'Top Rating' section (adding to cart,
    selecting products for comparison, adding to the wishlist and viewing).

    @Murat @US_014-TC_007
    Scenario: The user should be able to see the all products listed in the 'People Choices' body section.

    @Murat @US_014-TC_008
    Scenario: The user should be able to perform operations on the products in the 'People Choices' section (adding to cart, selecting products for comparison, adding to the wishlist and viewing).