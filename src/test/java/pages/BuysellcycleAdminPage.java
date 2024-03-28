package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BuysellcycleAdminPage {

    public BuysellcycleAdminPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@name='login']")
    public WebElement adminEmailOrPhoneBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement adminSignInButton;

    @FindBy(xpath = "(//div[@class='nav_title'])[1]")
    public WebElement adminDashboardButton;

    @FindBy(xpath = "//i[@class='fa fa-bell']")
    public WebElement iconAdminNotification;

}