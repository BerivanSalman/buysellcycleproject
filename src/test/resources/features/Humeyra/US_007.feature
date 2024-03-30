Feature: As a user, I would like to have a page where I can follow the current products on the site where I shop.

  Background:User must register on the website with the correct mail and password.

    Given User goes to the buysellcyle homepage.
    And User clicks on the Log In button and displays the sign in page.
    And User clicks on the Email address or phone box and enters a valid "humeyraUserMail".
    And User clicks on the Password box and enters a valid "humeyraPassword".
    Then User clicks on the Sign In button.

  Scenario: TC_001 User displays the New Product deals menu title  and redirects on the homepage navBar.
    Given User clicks on New Product Deals title
    Then Verify that user can go to the related pages

  Scenario: TC_002 User displays ilters for filtering operations and they should be  functional on the left side of the Best Deals page.

    Given User clicks on New Product Deals title
    Then User displays filter by Rating
    Then User clicks on five stars button
    Then User clicks on five stars button
    Then Verify that user displays the products with five star
    And User displays filter by price
    And User chooses between 150 and 200 price
    And User clicks on filter button
    And Verify that user displays the products between 350-2000

    Scenario: TC_003 User lists the latest product on the Best Deals pages .
      Given User clicks on New Product Deals title
      Then User displays the lists of the latest products on the best deals page

      Scenario: TC_004 User changes listing and display settings when listing products on the Best Deals page.

        Given User clicks on New Product Deals title
        Then User clicks on Grid View item
        Then User displays products
@tc
        Scenario: TC_005 User displays the refresh button on the Best Deals page and it should be functional.
          Given User clicks on New Product Deals title
          Then User clicks on Man'Apparel on the left side
          Then User clicks on refresh button on the best deals page
          Then User displays that the page has been refreshed




