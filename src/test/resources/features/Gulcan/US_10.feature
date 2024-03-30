Feature: US_010-As a user, I would like to have a contact page on the site so that I can communicate with the administrators of the site where I shop.

  Background: User navigates to the contact page
    Given User is on the homepage of the website

  @UserStory10 @ContactPage @US_010-TC_001
  Scenario: User navigates to the contact page
    When User clicks on the "Contact" link in the website navigation menu
    Then User is redirected to the contact page
    And User sees a form for contacting the administrators

  @UserStory10 @ContactForm @US_010-TC_002
  Scenario: User fills out the contact form
    Given User is on the contact page
    When User fills out the contact form with valid information
    And User clicks the "Send" button
    Then User receives a confirmation message indicating the message was sent successfully

  @UserStory10 @RequiredFields @US_010-TC_003
  Scenario: User cannot submit the contact form without filling out required fields
    Given User is on the contact page
    When User tries to submit the contact form without filling out required fields
    Then User receives error messages prompting to fill out required fields
    And User cannot submit the form until all required fields are filled

  @UserStory10 @InvalidEmail @US_010-TC_004
  Scenario: User cannot submit the contact form with an invalid email address
    Given User is on the contact page
    When User fills out the contact form with an invalid email address
    And User clicks the "Send" button
    Then User receives an error message indicating the email address is invalid
    And User cannot submit the form until a valid email address is provided.