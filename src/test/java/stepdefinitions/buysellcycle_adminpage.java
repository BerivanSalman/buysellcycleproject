package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BuysellcycleAdminPage;
import utilities.ConfigReader;
import utilities.Driver;

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

}