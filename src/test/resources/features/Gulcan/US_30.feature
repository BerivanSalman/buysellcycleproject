Feature: US_030-As a user, I want the products I like to be listed on a page for later evaluation and perhaps purchase.

  Background: User is logged in and navigates to the page for managing wishlist
    Given User is logged in
    And User is on the homepage of the website

  @UserStory30 @WishlistManagement @US_030-TC_001
  Scenario: User adds products to the wishlist
    When User finds a product they like on the homepage
    And User clicks on the "Add to Wishlist" button for that product
    Then User verifies that the product is added to their wishlist
    And User receives a confirmation message indicating the product was added successfully

    @UserStory30 @WishlistManagement @US_030-TC_002
    Scenario: User attempts to add a product to the wishlist that is already in the wishlist
      Given User is logged in
      And User has already added a product to their wishlist
      And User is on the homepage of the website
      When User finds the same product they have already added to their wishlist
      And User clicks on the "Add to Wishlist" button for that product again
      Then User receives a warning message indicating that the product is already in their wishlist
      And User verifies that the product is not duplicated in their wishlist

  @UserStory30 @WishlistManagement @US_030-TC_003
  Scenario: User views the wishlist
    When User clicks on the "Wishlist" option in the website navigation menu
    Then User is directed to a page displaying all the products they have added to their wishlist
    And User can see a list of products with their relevant information (e.g., name, price, image)
    And User can easily navigate to each product's details page from the list

  @UserStory30 @WishlistManagement @US_030-TC_004
  Scenario: User removes products from the wishlist
    When User is viewing their wishlist
    And User clicks on the "Delete" button next to a product they no longer want in their wishlist
    Then User verifies that the product is removed from their wishlist
    And User receives a confirmation message indicating the product was removed successfully.
