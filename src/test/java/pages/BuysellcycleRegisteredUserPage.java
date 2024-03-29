package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BuysellcycleRegisteredUserPage {

    public BuysellcycleRegisteredUserPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")
    public WebElement headDashboardButton;

    @FindBy(xpath = "(//*[text()='Login'])[1]") public WebElement logInButton;
    @FindBy(xpath = "//*[@class='img-fluid']") public WebElement imageSignInPage;
    @FindBy(xpath = "//*[text()='Turn your ideas into reality..']") public WebElement signInPageText;
    @FindBy(xpath = "//*[text()='Sign in with Email or Phone']") public WebElement signInForm;
    @FindBy(xpath = "(//*[@name='login'])[2]") public WebElement emailPlaceholder;
    @FindBy(xpath = "//*[@name='password']") public WebElement passwordPlaceholder;
    @FindBy(xpath = "//*[@id='sign_in_btn']") public WebElement signInButton;
    @FindBy(xpath = "//*[@class='checkmark mr_15']") public WebElement checkBoxRememberMe;
    @FindBy(xpath = "//*[text()='Click Here']") public WebElement linkForgotPassword;
    @FindBy(xpath = "//*[@placeholder='Email Address']") public WebElement forgotPasswordEmailPlaceholder;
    @FindBy(xpath = "//*[text()='Send link']") public WebElement sendLinkButton;
    @FindBy(xpath = "(//*[@class='text-danger'])[1]") public WebElement labelEmailRequired;
    @FindBy(xpath = "(//*[@class='text-danger'])[3]") public WebElement labelPasswordRequired;
    @FindBy(xpath = "//*[text()='These credentials do not match our records.']") public WebElement labelDoNotMatch;
}
