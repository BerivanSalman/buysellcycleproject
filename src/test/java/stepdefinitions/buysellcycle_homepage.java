package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import pages.BuysellcycleHomePage;
import pages.BuysellcycleRegisteredUserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.concurrent.TimeUnit;

public class buysellcycle_homepage {

    BuysellcycleHomePage buysellcycleHomePage = new BuysellcycleHomePage();
    BuysellcycleRegisteredUserPage buysellcycleRegisteredUserPage = new BuysellcycleRegisteredUserPage();

    @Given("User goes to the buysellcyle homepage.")
    public void user_goes_to_the_buysellcyle_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }

    @Then("User closed to page")
    public void user_closed_to_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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

    @And("User scrolls down the page until sees the Best Deals section.")
    public void userScrollsDownThePageUntilSeesTheBestDealsSection() {
        ReusableMethods.scrollToElement(buysellcycleHomePage.labelBestDeals);
    }

    @Then("User sees Best Deals section on the body.")
    public void userSeesBestDealsSectionOnTheBody() {
        Assert.assertTrue(buysellcycleHomePage.labelBestDeals.isDisplayed());
    }

    @Then("User sees Best Deals items.")
    public void userSeesBestDealsItems() {
        Assert.assertTrue(buysellcycleHomePage.productBestDealsItem.isDisplayed());
    }

    @Then("User clicks on View All button.")
    public void user_clicks_on_view_all_button() {
        buysellcycleHomePage.bestDealsViewAllButton.click();
    }
    @Then("User sees all Best Deals items.")
    public void user_sees_all_best_deals_items() {
        Assert.assertTrue(buysellcycleHomePage.labelBestDealsPage.isDisplayed());
    }

    @Then("User sees Best Deals items and clicks on any item.")
    public void userSeesBestDealsItemsAndClicksOnAnyItem() {
        Assert.assertTrue(buysellcycleHomePage.labelBestDealsAllProducts.isDisplayed());
    }

    @And("User views clicked item.")
    public void userViewsClickedItem() {
    }

    @And("User clicks on the adding to cart button.")
    public void userClicksOnTheAddingToCartButton() {
    }

    @Then("User click the View Cart button on the alert page that appears.")
    public void userClickTheViewCartButtonOnTheAlertPageThatAppears() {
    }

    @And("User sees that the product has been added to the cart.")
    public void userSeesThatTheProductHasBeenAddedToTheCart() {
    }

    @Then("User comes back to the page and closes the alert.")
    public void userComesBackToThePageAndClosesTheAlert() {
    }

    @And("User clicks on Add To Compare button.")
    public void userClicksOnAddToCompareButton() {
    }

    @And("User gets alert message Product added to compare list successfully.")
    public void userGetsAlertMessageProductAddedToCompareListSuccessfully() {
    }

    @Then("User clicks on Compare button on the head.")
    public void userClicksOnCompareButtonOnTheHead() {
    }

    @And("User sees that the product has been added to the for compare.")
    public void userSeesThatTheProductHasBeenAddedToTheForCompare() {
    }

    @Then("User comes back to the page.")
    public void userComesBackToThePage() {
    }

    @And("User clicks on Add To Wishlist button.")
    public void userClicksOnAddToWishlistButton() {
    }

    @Then("User gets alert message Product added to wishlist successfully.")
    public void userGetsAlertMessageProductAddedToWishlistSuccessfully() {
    }

    @And("User clicks on Wishlist button on the head.")
    public void userClicksOnWishlistButtonOnTheHead() {
    }

    @Then("User sees that the product has been added to the for wishlist.")
    public void userSeesThatTheProductHasBeenAddedToTheForWishlist() {
    }


    @Given("User clicks on New Product Deals title")
    public void userClicksOnNewProductDealsTitle() {
        buysellcycleHomePage.NewProductDealsButton.click();
    }

    @Then("Verify that user can go to the related pages")
    public void verifyThatUserCanGoToTheRelatedPages() {
        Assert.assertTrue(buysellcycleHomePage.labelBestDeals.isDisplayed());
    }


    @Then("User displays filter by Rating")
    public void userDisplaysFilterByRating() {
        Assert.assertTrue(buysellcycleHomePage.filterByRate.isDisplayed());
    }

    @Then("User clicks on five stars button")
    public void userClicksOnFiveStarsButton() {
        buysellcycleHomePage.filterFiveStar.click();
    }

    @And("User displays filter by price")
    public void userDisplaysFilterByPrice() {

    }

    @And("User chooses between 150 and 200 price")
    public void userChoosesBetweenAndPrice() {

    }


    @Then("Verify that user displays the products with five star")
    public void verifyThatUserDisplaysTheProductsWithFiveStar() {

    }

    @And("User clicks on filter button")
    public void userClicksOnFilterButton() {

    }

    @And("Verify that user displays the products between 350-2000")
    public void verifyThatUserDisplaysTheProductsBetween() {
    }

    @Then("User displays the lists of the latest products on the best deals page")
    public void userDisplaysTheListsOfTheLatestProductsOnTheBestDealsPage() {
        Assert.assertTrue(buysellcycleHomePage.lenovoPructuctName.isDisplayed());
    }

    @Then("User clicks on Grid View item")
    public void userClicksOnGridViewItem() {
        buysellcycleHomePage.gridViewIcon.click();


    }

    @Then("User displays products")
    public void userDisplaysProducts() {

    }

    @Then("User clicks on Man'Apparel on the left side")
    public void userClicksOnManApparelOnTheLeftSide() {
        buysellcycleHomePage.mansApparelButton.click();

    }

    @Then("User clicks on refresh button on the best deals page")
    public void userClicksOnRefreshButtonOnTheBestDealsPage() {
        buysellcycleHomePage.refreshButton.click();

    }

    @Then("User displays that the page has been refreshed")
    public void userDisplaysThatThePageHasBeenRefreshed() {
        Assert.assertTrue(buysellcycleHomePage.relaxPlaySwingProduct.isDisplayed());

    }

    @Given("User goes to the url")
    public void userGoesToTheUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

    }

    @Then("User clicks on New User Zone menu")
    public void userClicksOnNewUserZoneMenu() {
        buysellcycleHomePage.newUserZoneButton.click();
    }

    @Then("Verify that user is in the new user zone page")
    public void verifyThatUserIsInTheNewUserZonePage() {
      Assert.assertTrue(buysellcycleHomePage.labelSuprisesForNewUsers.isDisplayed());
    }

    @Then("User displays for you section")
    public void userDisplaysForYouSection() {
        Assert.assertTrue(buysellcycleHomePage.forYouButton.isDisplayed());

    }

    @Then("User displays exculisive price section")
    public void userDisplaysExculisivePriceSection() {
        Assert.assertTrue(buysellcycleHomePage.exclusivePriceButton.isDisplayed());

    }

    @Then("User displays coupon section")
    public void userDisplaysCouponSection() {
        Assert.assertTrue(buysellcycleHomePage.couponButton.isDisplayed());

    }

    @Then("User clicks on for you section")
    public void userClicksOnForYouSection() {
      buysellcycleHomePage.forYouButton.click();
    }

    @And("Verify that user is in the for you section")
    public void verifyThatUserIsInTheForYouSection() {
      Assert.assertTrue(buysellcycleHomePage.labelProducts.isDisplayed());
    }

    @And("User clicks on exclusive price section")
    public void userClicksOnExclusivePriceSection() {
        buysellcycleHomePage.exclusivePriceButton.click();

    }

    @And("Verify that user is in the exclusive section")
    public void verifyThatUserIsInTheExclusiveSection() {
     Assert.assertTrue(buysellcycleHomePage.labelExclusivePrice.isDisplayed());
    }

    @And("User clicks on coupon section")
    public void userClicksOnCouponSection() {
        ReusableMethods.wait(1);
       buysellcycleHomePage.couponButton.click();
    }

    @And("Verify that user is in the coupon section")
    public void verifyThatUserIsInTheCouponSection() {
       Assert.assertTrue(buysellcycleHomePage.couponText.isDisplayed());
    }

    @Then("Verify that the products is visible")
    public void verifyThatTheProductsIsVisible() {
     Assert.assertTrue(buysellcycleHomePage.firstProductName.isDisplayed());
    }

    @Then("Verify that special discounts are visible")
    public void verifyThatSpecialDiscountsAreVisible() {
       Assert.assertTrue(buysellcycleHomePage.specialDiscountName.isDisplayed());
    }
}