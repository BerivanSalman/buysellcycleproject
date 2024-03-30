package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Properties;


public class BuysellcycleHomePage {


    public BuysellcycleHomePage(){PageFactory.initElements(Driver.getDriver(),this);}




    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailOrPhoneBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//h3[@class='m-0']")
    public WebElement labelSignIn;

    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[1]")
    public WebElement LinkTrackYourOrder;

    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[2]")
    public WebElement LinkCompare;

    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[3]")
    public WebElement LinkWishList;

    @FindBy(xpath = "((//*[text()='Cart ('])[1]")
    public WebElement LinkCart;

    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[]")
    public WebElement LinkDailyDeals;

    @FindBy(xpath = "//*[span='New User Zone']")
    public WebElement LinkNewUserZone;

    @FindBy(xpath = "(//*[text()='Track Your Order'])[2]")
    public WebElement labelTrackYourOrder;

    @FindBy(xpath = "//*[@class='compare_title_div']")
    public WebElement labelCompare;

    @FindBy(xpath = "//*[text()='Order Summary']")
    public WebElement labelOrderSummaryInCart;

    @FindBy(xpath = "//*[text()='Surprises for new users']")
    public WebElement labelForNewUserZone;

    @FindBy(xpath = "//*[@class='section__title d-flex align-items-center gap-3 m-0 flex-wrap']")
    public WebElement labelForDailyDeals;



}