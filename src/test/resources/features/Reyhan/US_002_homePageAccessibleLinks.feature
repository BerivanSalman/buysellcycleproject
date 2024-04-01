
@Smok
Feature: US_002 The user performs site operations with accessible links on the homepage's top bar

  Background:
    Given User goes to the buysellcyle homepage.

  @Reyhan @US_002-TC_001-TC_002-TC_003-TC_004-TC_005-TC_006
  Scenario:User uses to simple links on the top bar of the site
    And User clicks on the Track Your Order and displays to Track Your Order page
    And User clicks on the Compare and displays to Compare page
    And User clicks on the Shopping Cart and displays to Shopping Cart page
    And User clicks on the New User Zone and displays to New User Zone page
    And User clicks on the Daily Deals and displays to Daily Deals page
    And User clicks on the Wish List and displays to Wish List page

    Then User closes the page.


