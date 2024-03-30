Feature: US_027-As a registered user, I would like to be able to view the sellers I follow on one page.

  Background: User is logged in and navigates to the page for viewing followed sellers
    Given User is logged in
    And User navigates to the "My Account" section

  @UserStory27 @ViewFollowedSellers @US_027-TC_001
  Scenario: User views followed sellers on one page
    When User clicks on the "Followed Sellers" option in the "My Account" section
    Then User is directed to a page displaying all the sellers they follow
    And User can see a list of sellers with their relevant information (e.g., name, profile picture, ratings)
    And User can easily navigate to each seller's profile from the list
