Feature: As a user, I would like the site to have a page with daily specials and discounts.

  Scenario: TC01 As a user,  I should ensure that the Daily Deals feature is visible and functional, and that special promotional
  products are displayed along with a counter on the Daily Deals page.

    Given User goes to the buysellcyle homepage.
    Then User verifies that the Daily Deals menu item is visible on the homepage navbar.
    And User clicks the Daily Deals menu item on the homepage
    Then User ensures that clicking on the Daily Deals menu item redirects the user to the Daily Deals page.
    And User confirms that a counter is displayed on the Daily Deals page.
    Then User validates that special promotional products are visible on the Daily Deals page.
    And User closes the page.

    Scenario: TC02 As a user, I should be able to perform 'add to cart' action on the products
      Given User goes to the buysellcyle homepage.
      Then User verifies that the Daily Deals menu item is visible on the homepage navbar.
      And User clicks the Daily Deals menu item on the homepage
      Then User ensures that clicking on the Daily Deals menu item redirects the user to the Daily Deals page.
      And User confirms that a counter is displayed on the Daily Deals page.
      Then User validates that special promotional products are visible on the Daily Deals page.
      And User scrolls down the page
      Then User clicks one of the products
      And User verifies that add to cart button is visible and clicks add to cart button
      And User waits for 2 seconds
      Then User ensures that the product is added to the cart
      And User clicks View Cart button to see the products
      Then User verifies that the price of the product is correct
      And User verifies that the chosen product is correct
       And User closes the page.

    Scenario: TC03 As a user, I should be able to perform Add to Compare  action on the product
      Given User goes to the buysellcyle homepage.
      Then User verifies that the Daily Deals menu item is visible on the homepage navbar.
      And User clicks the Daily Deals menu item on the homepage
      Then User ensures that clicking on the Daily Deals menu item redirects the user to the Daily Deals page.
      Then User validates that special promotional products are visible on the Daily Deals page.
      And User scrolls down the page
      Then User clicks one of the products
      And User scrolls down to see Add to compare action the page
      And User waits for 2 seconds
      Then User verifies that Add to Compare action visible
      And User clicks Add to Compare action
      Then User views the success message
      And User closes the page.

  Scenario: TC04 As a user, I should be able to perform 'Add to wishlist' action on the products
    Given User goes to the buysellcyle homepage.
    Then User verifies that the Daily Deals menu item is visible on the homepage navbar.
    And User clicks the Daily Deals menu item on the homepage
    Then User ensures that clicking on the Daily Deals menu item redirects the user to the Daily Deals page.
    Then User validates that special promotional products are visible on the Daily Deals page.
    And User scrolls down the page
    Then User clicks one of the products
    And User scrolls down to see Add to compare action the page
    And User waits for 2 seconds
    And User clicks add to wishlist action
    And User waits for 2 seconds
    Then User views the warning message
    And User closes the page.
  @ka
    Scenario: TC05 As a user, I should not be able to choose more or less products than the maximum amount I should choose
      Given User goes to the buysellcyle homepage.
      Then User verifies that the Daily Deals menu item is visible on the homepage navbar.
      And User clicks the Daily Deals menu item on the homepage
      Then User ensures that clicking on the Daily Deals menu item redirects the user to the Daily Deals page.
      Then User validates that special promotional products are visible on the Daily Deals page.
      And User scrolls down the page
      Then User clicks one of the products
      Then User writes less than required product number to the quantity box
      And User waits for 2 seconds
      Then User views the warning message
      And User writes more than required product number to the quantity box
      And User waits for 2 seconds
      Then  User views the warning message
      And User closes the page.











