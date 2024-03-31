package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;




import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BuysellcycleHomePage;
import pages.BuysellcycleRegisteredUserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class buysellcycle_homepage {

    BuysellcycleHomePage buysellcycleHomePage = new BuysellcycleHomePage();
    BuysellcycleRegisteredUserPage buysellcycleRegisteredUserPage = new BuysellcycleRegisteredUserPage();
    Faker faker =new Faker();
    Actions actions = new Actions(Driver.getDriver());
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

    @Given("User scrolls down the page until sees Footer section.")
    public void userScrollsDownThePageUntilSeesFooterSection() {
        ReusableMethods.scrollToElement(buysellcycleHomePage.aboutUsLink);
    }

    @Then("User click Blog section.")
    public void userClickBlogSection() {
        buysellcycleHomePage.blogLink.click();

    }

    @And("User confirms that they were redirected to the Blog page.")
    public void userConfirmsThatTheyWereRedirectedToTheBlogPage() {
        String expectedUrl= "https://qa.buysellcycle.com/blog";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("User scrolls down the page until sees the   Client Worldwide.Clicks on the About Us linktext from the home page")
    public void user_scrolls_down_the_page_until_sees_the_client_worldwide_clicks_on_the_about_us_linktext_from_the_home_page() {

        ReusableMethods.scrollToElement(buysellcycleHomePage.logoClientWorldwide);


    }
    @Then("User verified that Worldwide Customers, Successful Projects, Work Worked, Planning Services are visible on the page.")
    public void user_verified_that_worldwide_customers_successful_projects_work_worked_planning_services_are_visible_on_the_page() {
Assert.assertTrue(buysellcycleHomePage.logoClientWorldwide.isDisplayed());


    }

    @Then("User clicks About Linktext")
    public void user_clicks_about_linktext() {


        buysellcycleHomePage.linkAboutUs.click();
    }
    @Then("User scrolls down the page until sees the   Team Member.")
    public void user_scrolls_down_the_page_until_sees_the_team_member() {
        ReusableMethods.scrollToElement(buysellcycleHomePage.labelTeamMember);

    }
    @Then("User verified The Team Member's visible")
    public void user_verified_the_team_member_s_visible() {
  Assert.assertTrue(buysellcycleHomePage.labelTeamMember.isDisplayed());
    }

    @Then("User verified display Meet with our Team display of team members")
    public void user_verified_display_meet_with_our_team_display_of_team_members() {
        Assert.assertTrue(buysellcycleHomePage.labelTeamMember.isDisplayed());
    }

    @Then("Click on the Dashboard linktext from the home page")
    public void click_on_the_dashboard_linktext_from_the_home_page() {

        buysellcycleHomePage.linkDashboard.click();

    }
    @Then("User scrolls down the page until sees the   My WishList")
    public void user_scrolls_down_the_page_until_sees_the_my_wish_list() {
      ReusableMethods.scrollToElement(buysellcycleHomePage.linkMyWishList);


    }
    @Then("User clicks on the MyWishList page")
    public void user_clicks_on_the_my_wish_list_page() {

    buysellcycleHomePage.linkMyWishList.click();

    }

    @Then("User verified that  My Wishlist page")
    public void user_verified_that_my_wishlist_page() {
        Assert.assertTrue(buysellcycleHomePage.labelShowingResult.isDisplayed());
    }
    @Then("User verifies that the Daily Deals menu item is visible on the homepage navbar.")
    public void user_verifies_that_the_daily_deals_menu_item_is_visible_on_the_homepage_navbar() {
        Assert.assertTrue(buysellcycleHomePage.linkDailyDeals.isDisplayed());
    }
    @Then("User clicks the Daily Deals menu item on the homepage")
    public void user_clicks_the_daily_deals_menu_item_on_the_homepage() {
      buysellcycleHomePage.linkDailyDeals.click();
    }
    @Then("User ensures that clicking on the Daily Deals menu item redirects the user to the Daily Deals page.")
    public void user_ensures_that_clicking_on_the_daily_deals_menu_item_redirects_the_user_to_the_daily_deals_page() {
        String expectedResult = "https://qa.buysellcycle.com/flash-deal/march-flash-sale-gdfn6";
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Then("User confirms that a counter is displayed on the Daily Deals page.")
    public void user_confirms_that_a_counter_is_displayed_on_the_daily_deals_page() {
        buysellcycleHomePage.counter.isDisplayed();
    }
    @Then("User validates that special promotional products are visible on the Daily Deals page.")
    public void user_validates_that_special_promotional_products_are_visible_on_the_daily_deals_page() {
        Assert.assertTrue(buysellcycleHomePage.specialPromotionalProducts.size() > 0);
    }

    @Then("User scrolls down the page")
    public void user_scrolls_down_the_page() {
        ReusableMethods.scrollToElement(buysellcycleHomePage.buttonForScrollAddtoCart);
    }

    @And("User waits for {int} seconds")
    public void userWaitsForSeconds(int saniye) {
        ReusableMethods.wait(saniye);
    }

    @Then("User clicks one of the products")
    public void userClicksOneOfTheProducts() {
        buysellcycleHomePage.specialPromotionalProducts.get(0).click();
    }

    @Then("User verifies that add to cart button is visible and clicks add to cart button")
    public void userVerifiesThatAddToCartButtonIsVisibleAndClicksAddToCartButton() {
        buysellcycleHomePage.buttonAddtoCart.click();
    }

    @Then("User ensures that the product is added to the cart")
    public void userEnsuresThatTheProductIsAddedToTheCart() {
       Assert.assertTrue(buysellcycleHomePage.textAddtoCart.isDisplayed());
    }

    @And("User clicks View Cart button to see the products")
    public void userClicksViewCartButtonToSeeTheProductProducts() {
        buysellcycleHomePage.buttonViewCart.click();
    }

    @Then("User verifies that the price of the product is correct")
    public void userVerifiesThatThePriceOfTheProductIsCorrect() {
        double expectedPrice =55500.0;
        String sonucSayisiStr = buysellcycleHomePage.priceOfTheProduct.getText().replaceAll("\\D","");
        double sonucSayisiInt = Integer.parseInt(sonucSayisiStr);
        double actualPrice = sonucSayisiInt;
        double delta = 0.1;
        Assert.assertEquals(expectedPrice, actualPrice, delta);


    }

    @And("User verifies that the chosen product is correct")
    public void userVerifiesThatTheChosenProductIsCorrect() {
        String chosenProduct = buysellcycleHomePage.textChosenProduct.getText();
        String addedProduct = buysellcycleHomePage.addedProduct.getText();
        Assert.assertEquals(chosenProduct,addedProduct);

    }

    @Then("User ensures the number of the selected product is correct")
    public void userEnsuresTheNumberOfTheSelectedProductIsCorrect() {
    }

    @Then("User verifies that Add to Compare action visible")
    public void userVerifiesThatAddToCompareActionVisible() {
        
    }

    @And("User clicks Add to Compare action")
    public void userClicksAddToCompareAction() {
        buysellcycleHomePage.linkCompare.click();

    }

    @And("User confirms that the selected product is added to the comparison list")
    public void userConfirmsThatTheSelectedProductIsAddedToTheComparisonList() {

    }

    @Then("User clicks on the  button in the header")
    public void userClicksOnTheButtonInTheHeader() {
    }

    @And("User scrolls down to see Add to compare action the page")
    public void userScrollsDownToSeeAddToCompareActionThePage() {
        ReusableMethods.scrollToElement(buysellcycleHomePage.textChosenProduct);
    }

    @Then("User views the success message")
    public void userViwesTheSuccessMessage() {
        Assert.assertTrue(buysellcycleHomePage.textSuccess.isDisplayed());
    }


    @Given("User verifies the slider images visible on the home page.")
    public void user_verifies_the_slider_images_visible_on_the_home_page() {
     buysellcycleHomePage.subscribeCloseButton.click();

    assertTrue(buysellcycleHomePage.imageSlider1.isDisplayed());
    }
    @Given("User switch between slider images")
    public void user_switch_between_slider_images() throws InterruptedException {
        wait(5000);
        if (!buysellcycleHomePage.imageSlider1.isDisplayed()) {
            System.out.println("User switch between slider images");
        } else {
            System.out.println("User can not switch between slider images");
        }
    }
    @Given("User sees images in the slider are displayed in the loop in automatic order")
    public void user_sees_images_in_the_slider_are_displayed_in_the_loop_in_automatic_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @And("User clicks add to wishlist action")
    public void userClicksAddToWishlistAction() {
        buysellcycleHomePage.linkWishList.click();
    }

    @Then("User views the warning message")
    public void userViwesTheWarningMessage() {
        Assert.assertTrue(buysellcycleHomePage.textWarning.isDisplayed());
    }


    @Then("User writes less than required product number to the quantity box")
    public void userWritesLessThanRequiredProductNumberToTheQuantityBox() {
        buysellcycleHomePage.boxQuantity.clear();
        buysellcycleHomePage.boxQuantity.sendKeys("0");

    }

    @And("User writes more than required product number to the quantity box")
    public void userWritesMoreThanRequiredProductNumberToTheQuantityBox() {
        buysellcycleHomePage.boxQuantity.clear();
        buysellcycleHomePage.boxQuantity.sendKeys("5");
    }
}

    @Then("User click a product")
    public void userClickAProduct() {
      buysellcycleHomePage.firstProductName.click();
      ReusableMethods.wait(3);
    }

    @Then("User clicks on Add to Cart")
    public void userClicksOnAddToCart() {
        buysellcycleHomePage.addToCartButton.click();
        ReusableMethods.wait(1);

    }

    @Then("Verify that user has added the item")
    public void verifyThatUserHasAddedTheItem() {
     Assert.assertTrue(buysellcycleHomePage.textAddedToCart.isDisplayed());
    }

    @Then("User clicks on Add to Compare")
    public void userClicksOnAddToCompare() {
      buysellcycleHomePage.addToCompareButton.click();
      ReusableMethods.wait(2);
    }

    @Then("Verify that user has added to compare")
    public void verifyThatUserHasAddedToCompare() {
      Assert.assertTrue(buysellcycleHomePage.alertAddToCompare.isDisplayed());
    }

    @Then("User clicks on add to wishlist")
    public void userClicksOnAddToWishlist() {
        buysellcycleHomePage.addToWishListButton.click();

    }

    @Then("Verify that user has added to wishlist")
    public void verifyThatUserHasAddedToWishlist() {
        String expectedAlert="Success";
        String actualAlert=buysellcycleHomePage.alertAddToWishList.getText();
        Assert.assertEquals(expectedAlert,actualAlert);

    }

    @Then("User clicks on close icon")
    public void userClicksOnCloseIcon() {
        buysellcycleHomePage.closeIcon.click();
    }

    @Then("User clicks on All category")
    public void userClicksOnAllCategory() {
        buysellcycleHomePage.allCategory.click();

    }

    @Then("User clicks on electronics category")
    public void userClicksOnElectronicsCategory() {
       buysellcycleHomePage.electronicsCategory.click();
    }

    @Then("User clicks on home category")
    public void userClicksOnHomeCategory() {
        buysellcycleHomePage.homeCategory.click();
    }

    @Then("User clicks on get now button")
    public void userClicksOnGetNowButton() {
        buysellcycleHomePage.getNowButton.click();

    }

    @Then("Verify that the text coupon store successfully")
    public void verifyThatTheTextCouponStoreSuccessfully() {
        String expectedAlert="Success";
        String actualAlert=buysellcycleHomePage.labelSignIn.getText();
        Assert.assertEquals(expectedAlert,actualAlert);
    }

    @Then("User displays the products in the new user gift section in the coupon section")
    public void userDisplaysTheProductsInTheNewUserGiftSectionInTheCouponSection() {
        for (int i = 0; i < 4; i++) {
            Assert.assertTrue(buysellcycleHomePage.newUserGiftProducts.get(i).isDisplayed());

        }
    }

    @Then("User clicks on new user gift product")
    public void userClicksOnNewUserGiftProduct() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",buysellcycleHomePage.newUserGiftProduct);
        buysellcycleHomePage.newUserGiftProduct.click();
        ReusableMethods.wait(1);
    }
}


