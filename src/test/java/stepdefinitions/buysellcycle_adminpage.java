package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.BuysellcycleAdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class buysellcycle_adminpage {

    BuysellcycleAdminPage buysellcycleAdminPage = new BuysellcycleAdminPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Admin goes to the admin login page.")
    public void admin_goes_to_the_admin_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }

    @Given("Admin clicks on the Email address or phone box and enters a valid {string}.")
    public void admin_clicks_on_the_email_address_or_phone_box_and_enters_a_valid(String string) {
        buysellcycleAdminPage.adminEmailOrPhoneBox.click();
        buysellcycleAdminPage.adminEmailOrPhoneBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("Admin clicks on the Password box and enters a valid {string}")
    public void admin_clicks_on_the_password_box_and_enters_a_valid(String string) {
        buysellcycleAdminPage.adminPasswordBox.click();
        buysellcycleAdminPage.adminPasswordBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Then("Admin clicks on the Sign In button.")
    public void admin_clicks_on_the_sign_in_button() {
        buysellcycleAdminPage.adminSignInButton.click();
    }

    @Then("Admin displays the admin dashboard page.")
    public void admin_displays_the_admin_dashboard_page() {
        Assert.assertTrue(buysellcycleAdminPage.adminDashboardButton.isDisplayed());
    }

    @Then("Admin closes the page.")
    public void admin_closes_the_page() {
        Driver.closeDriver();
    }

    @Then("Admin clicks Products link.")
    public void adminClicksProductsLink() {
        buysellcycleAdminPage.linkProduct.click();
    }

    @And("Admin displays Add New Product link")
    public void adminDisplaysAddNewProductLink() {
        buysellcycleAdminPage.linkAddNewProduct.isDisplayed();
    }

    @Then("Admin clicks Add New Product link")
    public void adminClicksAddNewProductLink() {
        buysellcycleAdminPage.linkAddNewProduct.click();
    }

    @Then("Admin displays Add New Product page")
    public void adminDisplaysAddNewProductPage() {
        String expectedUrl = "https://qa.buysellcycle.com/products/create";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Then("Admin displays General Information")
    public void admin_displays_general_information() {
        buysellcycleAdminPage.buttonGeneralInformation.isDisplayed();
    }
    @Then("Admin displays Related Product")
    public void admin_displays_related_product() {
        buysellcycleAdminPage.buttonRelatedProduct.isDisplayed();
    }
    @Then("Admin displays Up Sale")
    public void admin_displays_up_sale() {
        buysellcycleAdminPage.buttonUpSale.isDisplayed();
    }
    @Then("Admin displays Cross Sale")
    public void admin_displays_cross_sale() {
        buysellcycleAdminPage.buttonCrossSale.isDisplayed();
    }

    @And("Admin clicks Single radiobutton")
    public void adminClicksSingleRadiobutton() {
        buysellcycleAdminPage.radioButtonTypeSingle.click();
    }

    @Then("Admin clicks Variant radiobutton")
    public void adminClicksVariantRadiobutton() {
        buysellcycleAdminPage.radioButtonTypeVariant.click();
    }

    @And("Admin waits {int} seconds")
    public void adminWaitsSeconds(int seconds) {
        ReusableMethods.wait(seconds);
    }

    @Then("Admin view Name text box")
    public void admin_view_name_text_box() {
        buysellcycleAdminPage.boxProductName.isDisplayed();
    }
    @Then("Admin views Product SKU box")
    public void admin_views_product_sku_box() {
        buysellcycleAdminPage.boxProductSku.isDisplayed();
    }
    @Then("Admin displays Model Number text")
    public void admin_displays_model_number_text() {
        buysellcycleAdminPage.boxModelNumber.isDisplayed();
    }
    @Then("Admin views Category box")
    public void admin_views_category_box() {
        buysellcycleAdminPage.boxCategory.isDisplayed();
    }
    @Then("Admin displays Brand box")
    public void admin_displays_brand_box() {
        buysellcycleAdminPage.boxBrandCategory.isDisplayed();
    }
    @Then("Admin displays Unit box")
    public void admin_displays_unit_box() {
        buysellcycleAdminPage.boxUnitCategory.isDisplayed();
    }
    @Then("Admin views Barcode Type box")
    public void admin_views_barcode_type_box() {
        buysellcycleAdminPage.boxBarcodeType.isDisplayed();
    }
    @Then("Admin views Tags \\(Comma Separated) box")
    public void admin_views_tags_comma_separated_box() {
        buysellcycleAdminPage.boxTags.isDisplayed();
    }

    @Then("Admin clicks on the Password box and enters a valid \"\"yusufPassword\".")
    public void admin_clicks_on_the_password_box_and_enters_a_valid_yusuf_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User clicks on the SupportTicket linktext from the DashboardSideBar")
    public void user_clicks_on_the_support_ticket_linktext_from_the_dashboard_side_bar() {
        js.executeScript("arguments[0].scrollIntoView();",buysellcycleAdminPage.linkSupportTicket);
        buysellcycleAdminPage.linkSupportTicket.click();
    }

    @Then("User verifies entered the Support Ticket page")
    public void user_verifies_entered_the_support_ticket_page() {
        Assert.assertTrue(buysellcycleAdminPage.labelSupportTicket.isDisplayed());
    }


    @And("Admin clicks Category page")
    public void adminClicksCategoryPage() { buysellcycleAdminPage.linkCategory.click();}
    @Then("Admin clicks Brand page")
    public void adminClicksBrandPage() {buysellcycleAdminPage.linkBrand.click();}
    @And("Admin clicks Unit page")
    public void adminClicksUnitPage() {buysellcycleAdminPage.linkUnits.click();}
    @Then("Admin checks whether  physical Product is selected or not")
    public void admin_checks_whether_physical_product_is_selected_or_not() {buysellcycleAdminPage.radioButtonPhysicalProduct.isSelected();}
    @Then("If physical Product is selected, Admin enters  weight information")
    public void if_physical_product_is_selected_admin_enters_weight_information() {
        Faker faker = new Faker();
        String weightAsString = String.valueOf(faker.number().numberBetween(20,100));
        buysellcycleAdminPage.placeholderWeight.sendKeys(weightAsString);
    }
    @Then("Admin enters length information")
    public void admin_enters_length_information() {
        Faker faker = new Faker();
        String weightAsString = String.valueOf(faker.number().numberBetween(20,100));
        buysellcycleAdminPage.placeholderLength.sendKeys(weightAsString);
    }
    @Then("Admin enters breadth information")
    public void admin_enters_breadth_information() {
        Faker faker = new Faker();
        String weightAsString = String.valueOf(faker.number().numberBetween(20,100));
        buysellcycleAdminPage.placeholderBreadth.sendKeys(weightAsString);

    }
    @Then("Admin enters height information")
    public void admin_enters_height_information() {
        Faker faker = new Faker();
        String weightAsString = String.valueOf(faker.number().numberBetween(20,230));
        buysellcycleAdminPage.placeholderHeight.sendKeys(weightAsString);
    }

    @Then("Admin scrolls down the page")
    public void adminScrollsDownThePage() {
        ReusableMethods.scrollToElement(buysellcycleAdminPage.boxTags);
    }
    @Then("Admin enters Selling price")
    public void adminEntersSellingPrice() {
        Faker faker = new Faker();
        String weightAsString = String.valueOf(faker.number().numberBetween(500,1000));
        buysellcycleAdminPage.placeholderSellingPrice.sendKeys(weightAsString);

    }

    @And("Admin enters Discount")
    public void adminEntersDiscount() {
        Faker faker = new Faker();
        String weightAsString = String.valueOf(faker.number().numberBetween(20,40));
        buysellcycleAdminPage.placeholderDiscount.sendKeys(weightAsString);
    }


    @Then("Admin selects {string} from the Discount type dropdown menu")
    public void adminSelectsFromTheDiscountTypeDropdownMenu(String option1) {
        Select select = new Select(buysellcycleAdminPage.dropdownDiscountType);
        select.selectByVisibleText("Amount");

    }
    @And("Admin selects CGST from the Tax dropdown menu")
    public void adminSelectsCGSTFromTheTaxDropdownMenu() {
        buysellcycleAdminPage.dropdownTax.click();
        buysellcycleAdminPage.cgstSelect.click();
    }


    @And("Admin enters {string} to the product name placeholder")
    public void adminEntersToTheProductNamePlaceholder(String givenProduct) {
        buysellcycleAdminPage.boxProductName.sendKeys(givenProduct);

    }

    @Then("Admin selects Woman Dress from the Category dropdown")
    public void adminSelectsWomanDressFromCategoryDropdown() {
        buysellcycleAdminPage.dropdownCategorySelection.click();
        buysellcycleAdminPage.womanDress.click();
    }

    @And("Admin selects Dojon from the Unit dropdown")
    public void adminSelectsDojonFromTheUnitDropdown() {
        buysellcycleAdminPage.unitSelection.click();
        buysellcycleAdminPage.retailSelect.click();
    }


    @Then("Admin enters {string} to the Tags placeholder")
    public void adminEntersToTheTagsPlaceholder(String givenTags) {
        buysellcycleAdminPage.placeholderTags.sendKeys(givenTags);
    }

    @Then("Admin scrolls down the page until sees Tags")
    public void adminScrollsDownThePageUntilSeesTags() {
        ReusableMethods.scrollToElement(buysellcycleAdminPage.dropdownCategorySelection);
    }
}