Feature: US_037-As an administrator, I would like to have a page on the site where I can see all active and inactive customers together.

  Background: Administrator is logged in and navigates to the page for managing customers
    Given Administrator is logged in
    And Administrator navigates to the "Customers" page in the admin panel

  @UserStory37 @ViewAllCustomers @US_037-TC_001
  Scenario: Administrator views all active customers
    When Administrator is on the "Customers" page
    Then Administrator sees a list of all active customers with their relevant information (e.g., name, email, registration date)
    And Administrator verifies that all active customers are displayed correctly

  @UserStory37 @ViewAllCustomers @US_037-TC_002
  Scenario: Administrator views all inactive customers
    When Administrator is on the "Customers" page
    And Administrator selects the option to view inactive customers
    Then Administrator sees a list of all inactive customers with their relevant information (e.g., name, email, last login date)
    And Administrator verifies that all inactive customers are displayed correctly

  @UserStory37 @ViewAllCustomers @US_037-TC_003
  Scenario: Administrator views both active and inactive customers together
    When Administrator is on the "Customers" page
    And Administrator selects the option to view both active and inactive customers
    Then Administrator sees a combined list of all active and inactive customers with their relevant information
    And Administrator verifies that all customers, both active and inactive, are displayed correctly

  @UserStory37 @ViewAllCustomers @US_037-TC_004
  Scenario: Administrator searches for a specific customer
    When Administrator is on the "Customers" page
    And Administrator uses the search functionality to find a specific customer by name or email
    Then Administrator sees the search results displaying the customer's information
    And Administrator verifies that the search functionality works correctly
