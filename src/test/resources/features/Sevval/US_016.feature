Feature: As a user, I would like to have a footer section to view useful links and site access.

  Background: User goes to the homepage and scrolls down the page
    Given User goes to the buysellcyle homepage.


  @Sevval  @US_016-TC_001
  Scenario:TC_01_The user should be able to view the footer section on the home page.
    Given User scrolls down the page until sees Footer section.

  @Sevval  @TC_002
  Scenario: TC_02_The user should be able to view useful links in the footer section and be directed to the relevant links.

    Given User scrolls down the page until sees Footer section.
    Then User click About Us section.
    And User comfirms that they were redirected to the About Us page.
    Then User click Blog section.
    And User confirms that they were redirected to the Blog page.
    Then User comes back to the page.