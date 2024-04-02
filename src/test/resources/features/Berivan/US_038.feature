Feature: As an administrator I would like to have a page to add a new product to the site.

  Scenario: TC01 As an administrator, I should be able to access "Add New Product" page from the Dashboard sidebar.
     Given Admin goes to the admin login page.
    Then Admin clicks on the Email address or phone box and enters a valid "berivanAdminMail".
    And Admin clicks on the Password box and enters a valid "berivanPassword"
    Then Admin clicks on the Sign In button.
    And Admin displays the admin dashboard page.
    Then Admin clicks Products link.
    And Admin displays Add New Product link
    And Admin clicks Add New Product link
    Then Admin displays Add New Product page
    And Admin closes the page.

    Scenario: TC02 As an administrator, I should be able to view the required sections(General Information, Related Product, Up Sale, Cross sale) displayed
  on the "Add New Product" and select at least one of the type options displayed in the Product Information section

    Given Admin goes to the admin login page.
    Then Admin clicks on the Email address or phone box and enters a valid "berivanAdminMail".
    And Admin clicks on the Password box and enters a valid "berivanPassword"
    Then Admin clicks on the Sign In button.
    And Admin displays the admin dashboard page.
    Then Admin clicks Products link.
    And Admin displays Add New Product link
    And Admin clicks Add New Product link
    Then Admin displays Add New Product page
    And Admin displays General Information
    Then Admin displays Related Product
    And Admin displays Up Sale
    Then Admin displays Cross Sale
    And Admin waits 3 seconds
    Then Admin clicks Variant radiobutton
    And Admin waits 3 seconds
    And Admin clicks Single radiobutton
    And Admin closes the page.

  @wip
Scenario: TC03 As an administrator, I should be able to view all required text boxes such as Name, Product SKU, Model Number,
Category, Brand, Unit, Barcode Type and Tags (Comma Separated) in the Product Information section.

  Given Admin goes to the admin login page.
  Then Admin clicks on the Email address or phone box and enters a valid "berivanAdminMail".
  And Admin clicks on the Password box and enters a valid "berivanPassword"
  Then Admin clicks on the Sign In button.
  And Admin displays the admin dashboard page.
  Then Admin clicks Products link.
  And Admin displays Add New Product link
  And Admin clicks Add New Product link
  Then Admin displays Add New Product page
  And Admin view Name text box
  Then Admin views Product SKU box
  And Admin displays Model Number text
  Then Admin views Category box
  And Admin displays Brand box
  Then Admin displays Unit box
  And Admin views Barcode Type box
  And Admin views Tags (Comma Separated) box
  Then Admin closes the page.

    Scenario: TC04 As an administrator, I should be able to be redirect from the Product Information section to the Category, Brand, and Unit addition pages.






