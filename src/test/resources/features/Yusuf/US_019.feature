Feature: User must use "MyListWish" Page

  Background:
    Given User goes to the buysellcyle homepage.




  @US_019-TC_001

  Scenario: The My Wish List menu title appears in the Dashboard sideBar and must be active.


    Then  Click on the Dashboard linktext from the home page
    And  User scrolls down the page until sees the   My WishList
    Then User clicks on the MyWishList page
    Then  User verified that  My Wishlist page
    Then User closes the page.



  @US_019-TC_002
  Scenario: Favorite products should be displayed on the My Wish List page.
    Then User scrolls down the page until sees the   My WishList
    And  User clicks on the MyWishList page
    Then User verifies that the number of products displayed is greater than 0}}
    Then User closes the page.


  @US_019-TC_003
  Scenario:The products in my wish list should be filtered and searched.

    Then User scrolls down the page until sees the   My WishList
    Then User clicks on the MyWishList page
    Then User clicks New button
    Then User closes the page.

  @US_019-TC_004
  Scenario: It should be added to the Compare section with the compare button on the My Wishlist page.
    Then User scrolls down the page until sees the   My WishList
    Then User clicks on the MyWishList page
    And User clicks on the MyWishList page
    Then User clicks  the 'Compare' button on the product
    Then User clicks on 'Compare' button on the head.
    Then User verifie  the product has been added to the page
    Then User closes the page.



















