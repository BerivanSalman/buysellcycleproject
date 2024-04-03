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
    Given Admin goes to the admin login page.
    Then Admin clicks on the Email address or phone box and enters a valid "berivanAdminMail".
    And Admin clicks on the Password box and enters a valid "berivanPassword"
    Then Admin clicks on the Sign In button.
    And Admin displays the admin dashboard page.
    Then Admin clicks Products link.
    And Admin displays Add New Product link
    And Admin clicks Add New Product link
    Then Admin displays Add New Product page
    And Admin clicks Category page
    Then Admin clicks Brand page
    And Admin clicks Unit page
    Then Admin closes the page.

  @wip
  Scenario: TC05  As an administrator, I should be able to enter the physical information of the product ıf the product to be added is a physical product,
  Price Info and Stock information
    Given Admin goes to the admin login page.
    Then Admin clicks on the Email address or phone box and enters a valid "berivanAdminMail".
    And Admin clicks on the Password box and enters a valid "berivanPassword"
    Then Admin clicks on the Sign In button.
    And Admin displays the admin dashboard page.
    Then Admin clicks Products link.
    And Admin displays Add New Product link
    And Admin clicks Add New Product link
    Then Admin displays Add New Product page
    Then Admin scrolls down the page
    And Admin checks whether  physical Product is selected or not
    Then If physical Product is selected, Admin enters  weight information
    And Admin enters length information
    Then Admin enters breadth information
    And Admin enters height information
    Then Admin enters Selling price
    And Admin enters Discount
    Then Admin selects "Amount" from the Discount type dropdown menu
    Then Admin waits 2 seconds
    And Admin selects CGST from the Tax dropdown menu
    And Admin closes the page.

  Scenario: TC06 As an administrator, I should be able to upload images to the site for the product to be added.
    Given Admin goes to the admin login page.
    Then Admin clicks on the Email address or phone box and enters a valid "berivanAdminMail".
    And Admin clicks on the Password box and enters a valid "berivanPassword"
    Then Admin clicks on the Sign In button.
    And Admin displays the admin dashboard page.
    Then Admin clicks Products link.
    And Admin displays Add New Product link
    And Admin clicks Add New Product link
    Then Admin displays Add New Product page


  Scenario: TC07 As an administrator, I should be able to add a product to the site by entering the required information.
    Given Admin goes to the admin login page.
    Then Admin clicks on the Email address or phone box and enters a valid "berivanAdminMail".
    And Admin clicks on the Password box and enters a valid "berivanPassword"
    Then Admin clicks on the Sign In button.
    And Admin displays the admin dashboard page.
    Then Admin clicks Products link.
    And Admin displays Add New Product link
    And Admin clicks Add New Product link
    Then Admin displays Add New Product page
    And Admin enters "Dress" to the product name placeholder
    Then Admin selects Woman Dress from the Category dropdown
    And Admin selects Dojon from the Unit dropdown
    Then Admin scrolls down the page until sees Tags
    Then Admin enters "Dress" to the Tags placeholder
    And Admin closes the page.

