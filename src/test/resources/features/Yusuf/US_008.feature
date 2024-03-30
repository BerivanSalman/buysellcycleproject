Feature:About us Page is working

  Background:

    Given User goes to the buysellcyle homepage.


  @US_008-TC_001
  Scenario:You must acces the About us page from the home page


  Then User clicks About Linktext

    Then User closes the page.
  @US_008-TC_002
    Scenario: Their numbers should be visible on the Worldwide Customer, Successful Project, Job Employed, Planning Services boards on the About Us page
      Then User scrolls down the page until sees the   Client Worldwide.Clicks on the About Us linktext from the home page
      And User verified that Worldwide Customers, Successful Projects, Work Worked, Planning Services are visible on the page.
      Then    User closes the page.

  @US_008-TC_003
      Scenario:  On the About Us page, the text Team Member appears with verification
        Then User scrolls down the page until sees the   Team Member.
        Then User verified The Team Member's visible
        Then User closes the page.

  @US_008-TC_004
          Scenario: Characters, situations and pictures of Avery Collins, Emily Pattinson, Jason Statham, Jaxon Westwood must appear on the About Us page.
          Then User scrolls down the page until sees the   Team Member.
          Then User verified display Meet with our Team display of team members
          Then User closes the page.















