Feature:About us is displayed and access is checked.



  Scenario: You must acces the About us page from the home page

    Given User goes to the buysellcyle homepage.
    Then User waits for 1 seconds.
    And User closes the pop-up window.
    And user clicks on the AboutUs button and displays the about us page.
    Then User closes the page.

