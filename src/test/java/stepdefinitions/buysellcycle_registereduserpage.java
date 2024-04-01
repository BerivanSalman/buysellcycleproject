package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.BuysellcycleAdminPage;
import pages.BuysellcycleHomePage;
import pages.BuysellcycleRegisteredUserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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
        WebElement element = buysellcycleRegisteredUserPage.logOutDashboardSidebar;
        WebElement bestSportShoesElementi = Driver.getDriver().findElement(By.xpath("element"));
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",bestSportShoesElementi);


    }

    @Then("The logout link displays via dashboard sidebar")
    public void theLogoutLinkDisplaysViaDashboardSidebar() {
    }
}