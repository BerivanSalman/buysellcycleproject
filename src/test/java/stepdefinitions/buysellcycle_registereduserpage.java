package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BuysellcycleAdminPage;
import pages.BuysellcycleHomePage;
import pages.BuysellcycleRegisteredUserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;



public class buysellcycle_registereduserpage {

    BuysellcycleHomePage buysellcycleHomePage = new BuysellcycleHomePage();
    BuysellcycleRegisteredUserPage buysellcycleRegisteredUserPage = new BuysellcycleRegisteredUserPage();

    @And("User displays the user dashboard page.")
    public void userDisplaysTheUserDashboardPage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.headDashboardButton.isDisplayed());
    }
    @Then("User validates that the sign-in form is visible on the left side of the login page.")
    public void userValidatesThatTheSignInFormIsVisibleOnTheLeftSideOfTheLoginPage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.signInForm.isDisplayed());
    }

    @And("User confirms that the relevant image and text are displayed on the right side of the login page.")
    public void userConfirmsThatTheRelevantImageAndTextAreDisplayedOnTheRightSideOfTheLoginPage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.imageSignInPage.isDisplayed());
        Assert.assertTrue(buysellcycleRegisteredUserPage.signInPageText.isDisplayed());
    }

    @And("User ensures that Remember me checkBox is selectable to remember the information entered")
    public void userEnsuresThatRememberMeCheckBoxIsSelectableToRememberTheInformationEntered() {
        buysellcycleRegisteredUserPage.checkBoxRememberMe.click();
    }

    @Then("User verifies that the login link is visible on the top bar of the home page.")
    public void userVerifiesThatTheLoginLinkIsVisibleOnTheTopBarOfTheHomePage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.logInButton.isDisplayed());
    }

    @And("User verifies that email input box is visible")
    public void userVerifiesThatEmailInputBoxIsVisible() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.emailPlaceholder.isDisplayed());
    }

    @And("User verifies that password input box is visible")
    public void userVerifiesThatPasswordInputBoxIsVisible() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.passwordPlaceholder.isDisplayed());
    }

    @And("User clicks the forgot password link")
    public void userClicksTheForgotPasswordLink() {
        buysellcycleRegisteredUserPage.linkForgotPassword.click();
    }

    @Then("User confirms that there is a link at the bottom of the page to switch to the Forgot Password page from the login page.")
    public void userConfirmsThatThereIsALinkAtTheBottomOfThePageToSwitchToTheForgotPasswordPageFromTheLoginPage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.linkForgotPassword.isDisplayed());
    }


    @Then("User verifies that there is an email input box in the page")
    public void userVerifiesThatThereIsAnEmailInputBoxInThePage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.forgotPasswordEmailPlaceholder.isDisplayed());
    }

    @And("User enters a valid {string}")
    public void userEntersAValid(String string) {
        buysellcycleRegisteredUserPage.forgotPasswordEmailPlaceholder.click();
        buysellcycleRegisteredUserPage.forgotPasswordEmailPlaceholder.sendKeys(ConfigReader.getProperty(string));
    }

    @Then("User click the Send Link button")
    public void userClickTheSendLinkButton() {
        buysellcycleRegisteredUserPage.sendLinkButton.click();
    }

    @Then("User verifies that there is an email input box in the forgot password page")
    public void userVerifiesThatThereIsAnEmailInputBoxInTheForgotPasswordPage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.forgotPasswordEmailPlaceholder.isDisplayed());
    }


    @And("User verifies the email required error message should display.")
    public void userVerifiesTheEmailRequiredErrorMessageShouldDisplay() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.labelEmailRequired.isDisplayed());
    }

    @Then("User verifies the password required error message  should display.")
    public void userVerifiesThePasswordRequiredErrorMessageShouldDisplay() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.labelPasswordRequired.isDisplayed());

    }

    @Then("User clicks on the Email address or phone box and enters an invalid email {string}")
    public void userClicksOnTheEmailAddressOrPhoneBoxAndEntersAnInvalidEmail(String verilenMail) {
        buysellcycleRegisteredUserPage.emailPlaceholder.click();
        buysellcycleRegisteredUserPage.emailPlaceholder.sendKeys(verilenMail);
    }

    @And("User clicks on the Password box and enters an invalid password {string}")
    public void userClicksOnThePasswordBoxAndEntersAnInvalidPassword(String verilenPassword) {
        buysellcycleRegisteredUserPage.passwordPlaceholder.click();
        buysellcycleRegisteredUserPage.passwordPlaceholder.sendKeys(verilenPassword);
    }

    @And("User verifies the an error message should display.")
    public void userVerifiesTheAnErrorMessageShouldDisplay() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.labelDoNotMatch.isDisplayed());
    }

    @Then("User waits {int} minutes")
    public void userWaitsMinutes(int minutes) {
        try {
            Thread.sleep(minutes*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User clicks on the Email address or phone box and enters {string}")
    public void userClicksOnTheEmailAddressOrPhoneBoxAndEnters(String gecersizMail) {
        buysellcycleRegisteredUserPage.emailPlaceholder.click();
        buysellcycleRegisteredUserPage.emailPlaceholder.sendKeys(ConfigReader.getProperty(gecersizMail));

    }

    @And("User clicks on the Password box and enters  {string}")
    public void userClicksOnThePasswordBoxAndEnters(String gecersizPassword) {
        buysellcycleRegisteredUserPage.passwordPlaceholder.click();
        buysellcycleRegisteredUserPage.passwordPlaceholder.sendKeys(ConfigReader.getProperty(gecersizPassword));
    }

    @When("Registered user clicks on LOGIN")
    public void registered_user_clicks_on_login() {
        buysellcycleRegisteredUserPage.logInButton.click();
    }
    @Then("Registered user clicks on the Email address or phone box")
    public void registered_user_clicks_on_the_email_address_or_phone_box() {
        buysellcycleRegisteredUserPage.emailAdressOrPhoneButton.click();
    }

    @And("Registered user writes his {string} or phone number")
    public void registeredUserWritesHisOrPhoneNumber(String mail) {
        buysellcycleRegisteredUserPage.emailAdressOrPhoneButton.sendKeys(ConfigReader.getProperty("reyhanUserMail"));
    }


    @Then("Registered user clicks on the Password box")
    public void registretedUserClicksOnThePasswordBox() {
        buysellcycleRegisteredUserPage.passwordBox.click();
    }

    @And("Registered user writes his\\/her {string}")
    public void registeredUserWritesHisHer(String P) {
        buysellcycleRegisteredUserPage.passwordBox.sendKeys(ConfigReader.getProperty("reyhanPassword"));
    }
    @Then("Registered user clicks to signs in")
    public void registeredUserClicksToSignsIn() {
        buysellcycleRegisteredUserPage.signInButton.click();
    }


    @Then("The logout link displays top of the homepage")
    public void theLogoutLinkDisplaysTopOfTheHomepage() {
        buysellcycleRegisteredUserPage.logOutTopOfPageButton.isDisplayed();
    }

    @And("Click to logout link")
    public void clickToLogoutLink() {
        buysellcycleRegisteredUserPage.logOutTopOfPageButton.click();
    }


    @Then("Click to logout link at the dashboard sidebar")
    public void clickToLogoutLinkAtTheDashboardSidebar() {
        // WebElement element = buysellcycleRegisteredUserPage.logOutDashboardSidebar;

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10); // Bekleme zaman aşımı: 10 saniye
        // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'logout')]")));


    }

    @Then("The logout link displays via dashboard sidebar")
    public void theLogoutLinkDisplaysViaDashboardSidebar() {
    }


    @Given("Registered user clicks to Home button in the header")
    public void registeredUserClicksToHomeButtonInTheHeader() {
        buysellcycleRegisteredUserPage.homeButton.click();
    }


    @Then("Registered user redirects to the checkout page for the products they selected via cart")
    public void registeredUserRedirectsToTheCheckoutPageForTheProductsTheySelectedViaCart() {
        buysellcycleRegisteredUserPage.shoppingCartLink.click();

    }

    @Then("Registered user clicks on the ADD TO CART")
    public void registeredUserClicksOnTheADDTOCART() {
        ReusableMethods.scrollToElement(buysellcycleRegisteredUserPage.viewShoppingCartButton);
        buysellcycleRegisteredUserPage.viewShoppingCartButton.click();
    }


    @Then("Registered user confirms to his\\/her product with click on ADD TO CART")
    public void registeredUserConfirmsToHisHerProductWithClickOnADDTOCART() {
        buysellcycleRegisteredUserPage.firstProductInCart.isDisplayed();
    }

    @And("Registered user clicks to PROCEED TO CHECKOUT")
    public void registeredUserClicksToPROCEEDTOCHECKOUT() {
        ReusableMethods.scrollToElement(buysellcycleRegisteredUserPage.proceedToCheckoutButton);
        ReusableMethods.wait(2);
        buysellcycleRegisteredUserPage.proceedToCheckoutButton.click();
    }

    @Then("Registered user displays how many of each product to be purchase")
    public void registeredUserDisplaysHowManyOfEachProductToBePurchase() {
        buysellcycleRegisteredUserPage.numberOfProduct.isDisplayed();
    }


    @And("The amount to be paid on the checkout page displays on the page")
    public void theAmountToBePaidOnTheCheckoutPageDisplaysOnThePage() {
        buysellcycleRegisteredUserPage.priceOfProduct.isDisplayed();
    }

    @Then("Registered user displays to Email under the Contact Information")
    public void registeredUserDisplaysToEmailUnderTheContactInformation() {
        ReusableMethods.scrollToElement(buysellcycleRegisteredUserPage.emailBox);
        buysellcycleRegisteredUserPage.emailBox.isDisplayed();
    }

    @Then("Registered user displays to Name under the Contact Information")
    public void registeredUserDisplaysToNameUnderTheContactInformation() {
        buysellcycleRegisteredUserPage.nameBox.isDisplayed();
    }

    @Then("Registered user displays to  Address under the Contact Information")
    public void registeredUserDisplaysToAddressUnderTheContactInformation() {
        buysellcycleRegisteredUserPage.addressBox.isDisplayed();
    }

    @Then("Registered user displays to  Country under the Contact Information")
    public void registeredUserDisplaysToCountryUnderTheContactInformation() {
        buysellcycleRegisteredUserPage.countryBox.isDisplayed();
    }

    @Then("Registered user displays to State under the Contact Information")
    public void registeredUserDisplaysToStateUnderTheContactInformation() {
        buysellcycleRegisteredUserPage.stateBox.isDisplayed();
    }

    @Then("Registered user displays to City under the Contact Information")
    public void registeredUserDisplaysToCityUnderTheContactInformation() {
        buysellcycleRegisteredUserPage.cityBox.isDisplayed();
    }

    @Then("Registered user displays to Postal\\/Pin Code under the Contact Information")
    public void registeredUserDisplaysToPostalPinCodeUnderTheContactInformation() {
        buysellcycleRegisteredUserPage.postal_pinCodeBox.isDisplayed();
    }

    @Given("Registered user clicks to note for the order on the checkout page")
    public void registeredUserClicksToNoteForTheOrderOnTheCheckoutPage() {
        ReusableMethods.scrollToElement(buysellcycleRegisteredUserPage.emailBox);
        ReusableMethods.wait(2);
        buysellcycleRegisteredUserPage.noteBox.click();
    }
    @Then("Registered user enters note for the order on the checkout page")
    public void registeredUserEntersNoteForTheOrderOnTheCheckoutPage() {
        buysellcycleRegisteredUserPage.noteBox.sendKeys("Write something"+ Keys.ENTER);
    }

    @Given("Registered user displays to terms and conditions is chosen")
    public void registeredUserDisplaysToTermsAndConditionsIsChosen() {
        ReusableMethods.scrollToElement(buysellcycleRegisteredUserPage.termsAndConditionsText);

    }


    @And("Registered user can continue in the page")
    public void registeredUserCanContinueInThePage() {

        WebElement checkbox = buysellcycleRegisteredUserPage.termsAndConditionsText;
        if (checkbox.isSelected()) {
            System.out.println("Registered user can continue in the page");
        } else {
            System.out.println("Registered user can't continue in the page");
        }

    }

    @Then("User verifies that the user is successfully logged into the system.")
    public void user_verifies_that_the_user_is_successfully_logged_into_the_system() {
        String expectedResult = "https://qa.buysellcycle.com/profile/dashboard" ;
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Then("User ensures that My Coupons menu item should be visible")
    public void user_ensures_that_my_coupons_menu_item_should_be_visible() {
        buysellcycleRegisteredUserPage.buttonMyCoupons.isDisplayed();
    }

    @Then("User ensures that Add Coupons window should be visible on My Coupons page")
    public void user_ensures_that_add_coupons_window_should_be_visible_on_my_coupons_page() {
        buysellcycleRegisteredUserPage.windowAddCoupon.isDisplayed();
    }

    @Then("User scrolls down the page until sees My Coupons")
    public void userScrollsDownThePageUntilSeesMyCoupons() {
        ReusableMethods.scrollToElement(buysellcycleRegisteredUserPage.scrollToMyCoupons);
    }

    @And("User clicks My coupons menu item")
    public void userClicksMyCouponsMenuItem() {
        buysellcycleRegisteredUserPage.buttonMyCoupons.click();

    }

    @Then("User clicks to the placeholder to enter a coupon code")
    public void user_clicks_to_the_placeholder_to_enter_a_coupon_code() {
        buysellcycleRegisteredUserPage.codePlaceholder.click();

    }
    @Then("User enters a valid code")
    public void user_enters_a_valid_code() {
        buysellcycleRegisteredUserPage.codePlaceholder.sendKeys("ucuz127");
    }
    @Then("User clicks Add Coupon link")
    public void user_clicks_add_coupon_link() {
        buysellcycleRegisteredUserPage.buttonAddCoupon.click();
    }
    @Then("User verifies that the coupons that the user has collected should be listed as Collected Coupons list")
    public void user_verifies_that_the_coupons_that_the_user_has_collected_should_be_listed_as_collected_coupons_list() {
        String expectedCodeCoupon  ="ucuz127";
        String actualCodeCoupon = buysellcycleRegisteredUserPage.collectedCoupon.getText();
        Assert.assertEquals(expectedCodeCoupon,actualCodeCoupon);
    }
    @Then("User clicks copy item under the action")
    public void user_clicks_copy_item_under_the_action() {
        buysellcycleRegisteredUserPage.buttonCopyCoupon.click();
    }

    @Then("User clicks delete item under the action")
    public void user_clicks_delete_item_under_the_action() {
        buysellcycleRegisteredUserPage.actionDelete.click();
    }


    @Then("User clicks delete button")
    public void user_clicks_delete_button() {
        buysellcycleRegisteredUserPage.buttonDelete.click();
    }

    @Then("User ensures that Are you sure to delete? is visible")
    public void userEnsuresThatAreYouSureToDeleteIsVisible() {
        buysellcycleRegisteredUserPage.textDelete.isDisplayed();
    }

    @Given("User displays the support menu item in the dashboard sidebar")
    public void userDisplaysTheSupportMenuItemInTheDashboardSidebar() {
        buysellcycleRegisteredUserPage.supportTicketButton.isDisplayed();
    }

    @Then("Verify that the support menu is visible")
    public void verifyThatTheSupportMenuIsClickable() {
        Assert.assertTrue( buysellcycleRegisteredUserPage.supportTicketButton.isDisplayed());
    }

    @Given("User clicks on support menu item")
    public void userClicksOnSupportMenuItem() {
        buysellcycleRegisteredUserPage.supportTicketButton.click();
    }

    @Then("Verify that user is in the support menu page")
    public void verifyThatUserIsInTheSupportMenuPage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.labelAllSubmittedTicket.isDisplayed());
    }


    @Then("User displays all submitted ticket")
    public void userDisplaysAllSubmittedTicket() {
        for (int i = 0; i < 5; i++) {
            Assert.assertTrue(buysellcycleRegisteredUserPage.allSubmittedTicketElements.get(i).isDisplayed());
        }
    }

    @Then("Ticket ID title,Subject title,Priority title,Last Update are visible")
    public void ticketIDTitleSubjectTitlePriorityTitleLastUpdateAreVisible() {
        for (int i = 0; i < 4; i++) {
            Assert.assertTrue(buysellcycleRegisteredUserPage.allSubmittedElementsTitles.get(i).isDisplayed());
        }
    }

    @Then("User clicks on View button")
    public void userClicksOnViewButton() {
        buysellcycleRegisteredUserPage.viewButton.click();
    }

    @Then("Status, priorty,category informations are visible")
    public void statusPriortyCategoryInformationsAreVisible() {

    }





}
