package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BuysellcycleAdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class buysellcycle_adminpage {

    BuysellcycleAdminPage buysellcycleAdminPage = new BuysellcycleAdminPage();

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
}