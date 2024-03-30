package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;

import pages.BuysellcycleHomePage;
import pages.BuysellcycleRegisteredUserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class buysellcycle_homepage {

    BuysellcycleHomePage buysellcycleHomePage = new BuysellcycleHomePage();
    BuysellcycleRegisteredUserPage buysellcycleRegisteredUserPage = new BuysellcycleRegisteredUserPage();

    @Given("User goes to the buysellcyle homepage.")
    public void user_goes_to_the_buysellcyle_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }



    @Given("User clicks on the Log In button and displays the sign in page.")
    public void user_clicks_on_the_log_in_button_and_displays_the_sign_in_page() {
        buysellcycleHomePage.loginButton.click();
        Assert.assertTrue(buysellcycleHomePage.labelSignIn.isDisplayed());
    }

    @Given("User clicks on the Email address or phone box and enters a valid {string}.")
    public void user_clicks_on_the_email_address_or_phone_box_and_enters_a_valid(String string) {
        buysellcycleHomePage.emailOrPhoneBox.click();
        buysellcycleHomePage.emailOrPhoneBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("User clicks on the Password box and enters a valid {string}.")
    public void user_clicks_on_the_password_box_and_enters_a_valid(String string) {
        buysellcycleHomePage.passwordBox.click();
        buysellcycleHomePage.passwordBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Then("User clicks on the Sign In button.")
    public void user_clicks_on_the_sign_in_button() {
        buysellcycleHomePage.signInButton.click();
    }

    @And("User closes the page.")
    public void userClosesThePage() {
        Driver.closeDriver();
    }

    @And("User waits for {int} second\\(s).")
    public void userWaitsForSecondS(int second) {
        ReusableMethods.wait(second);
    }

    @Given("User clicks on the Track Your Order and displays to Track Your Order page")
    public void user_clicks_on_the_track_your_order_and_displays_to_track_your_order_page() {
        buysellcycleHomePage.LinkTrackYourOrder.click();
        buysellcycleHomePage.labelTrackYourOrder.isDisplayed();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/track-order";
        assertEquals(actualUrl,expectedUrl);
    }

    @Given("User clicks on the Compare and displays to Compare page")
    public void user_clicks_on_the_compare_and_displays_to_compare_page() {
        buysellcycleHomePage.LinkCompare.click();
        buysellcycleHomePage.labelCompare.isDisplayed();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/compare";
        assertEquals(actualUrl,expectedUrl);
    }

    @Given("User clicks on the Shopping Cart and displays to Shopping Cart page")
    public void user_clicks_on_the_shopping_cart_and_displays_to_shopping_cart_page() {
        buysellcycleHomePage.LinkCart.click();
        buysellcycleHomePage.labelOrderSummaryInCart.isDisplayed();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/cart";
        assertEquals(actualUrl,expectedUrl);
    }

    @Given("User clicks on the New User Zone and displays to New User Zone page")
    public void user_clicks_on_the_new_user_zone_and_displays_to_new_user_zone_page() {
        buysellcycleHomePage.LinkNewUserZone.click();
        buysellcycleHomePage.labelForNewUserZone.isDisplayed();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/new-user-zone/welcome-buysellcycle!-u7dzv";
        assertEquals(actualUrl,expectedUrl);
    }

    @Given("User clicks on the Daily Deals and displays to Daily Deals page")
    public void user_clicks_on_the_daily_deals_and_displays_to_daily_deals_page() {
        buysellcycleHomePage.LinkDailyDeals.click();
        buysellcycleHomePage.LinkDailyDeals.isDisplayed();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/flash-deal/march-flash-sale-gdfn6";
        assertEquals(actualUrl,expectedUrl);
    }

    @Given("User clicks on the Wish List and displays to Wish List page")
    public void user_clicks_on_the_wish_list_and_displays_to_wish_list_page() {
       String actualUrl = Driver.getDriver().getCurrentUrl();
       String expectedUrl = "https://qa.buysellcycle.com/my-wishlist";
       assertEquals(actualUrl,expectedUrl);

    }



}