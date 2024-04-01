package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BuysellcycleRegisteredUserPage {

    public BuysellcycleRegisteredUserPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")
    public WebElement headDashboardButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/form/div/div[1]/input")
    public WebElement emailAdressOrPhoneButton;

    @FindBy(xpath ="/html/body/div/div[1]/div/form/div/div[2]/input")
    public WebElement passwordBox;

    @FindBy(xpath = "/html/body/header/div/div[2]/div/div/div/div/div[3]/div[1]/div/span/a[2]")
    public WebElement logOutTopOfPageButton;

    @FindBy(xpath = "[text='Logout Successfully']")
    public WebElement popupSuccessLogout;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/div/ul/li[16]/a")
    public WebElement logOutDashboardSidebar;


    @FindBy(xpath = "(//*[text()='Login'])[1]") public WebElement logInButton;
    @FindBy(xpath = "//*[@class='img-fluid']") public WebElement imageSignInPage;
    @FindBy(xpath = "//*[text()='Turn your ideas into reality..']") public WebElement signInPageText;
    @FindBy(xpath = "//*[text()='Sign in with Email or Phone']") public WebElement signInForm;
    @FindBy(xpath = "(//*[@name='login'])[2]") public WebElement emailPlaceholder;
    @FindBy(xpath = "//*[@name='password']") public WebElement passwordPlaceholder;
    @FindBy(xpath = "//*[@id='sign_in_btn']") public WebElement signInButton;
    @FindBy(xpath = "//*[@class='checkmark mr_15']") public WebElement checkBoxRememberMe;
    @FindBy(xpath = "//*[text()='Click Here']") public WebElement linkForgotPassword;
    @FindBy(xpath = "//*[@name='email']") public WebElement forgotPasswordEmailPlaceholder;
    @FindBy(xpath = "//*[text()='Send link']") public WebElement sendLinkButton;
    @FindBy(xpath = "(//*[@class='text-danger'])[1]") public WebElement labelEmailRequired;
    @FindBy(xpath = "(//*[@class='text-danger'])[3]") public WebElement labelPasswordRequired;
    @FindBy(xpath = "//*[text()='These credentials do not match our records.']") public WebElement labelDoNotMatch;
    @FindBy(xpath = "//*[@class='text-capitalize']") public WebElement scrollToMyCoupons;
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center'])[5]") public WebElement buttonMyCoupons;
    @FindBy(xpath = "//*[text()='Add Coupons']") public WebElement windowAddCoupon;
    @FindBy(xpath = "//*[@name='code']")public WebElement codePlaceholder;
    @FindBy(xpath = "//*[text()='Add Coupon']")public WebElement buttonAddCoupon;
    @FindBy(xpath = "(//*[@class='gj-cursor-pointer copyBtn'])[3]") public WebElement buttonCopyCoupon;
    @FindBy(xpath = "(//*[@class='font_14 f_w_500 mute_text text-nowrap'])[5]") public WebElement collectedCoupon;
    @FindBy(xpath = "(//*[@class='gj-cursor-pointer coupon_delete_btn'])[2]") public WebElement actionDelete;
    @FindBy(xpath = "//*[@class='text-center']") public WebElement textDelete;
    @FindBy(xpath = "//*[@id='dataDeleteBtn']") public WebElement buttonDelete;


}
