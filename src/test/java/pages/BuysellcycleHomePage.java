package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
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

    @FindBy(xpath = "//h3[@id='best_deals_title']")
    public WebElement labelBestDeals;

    @FindBy(xpath = "(//div[@class='product__meta text-center'])[11]")
    public WebElement productBestDealsItem;

    @FindBy(xpath = "(//span[@class='title_text'])[1]")
    public WebElement bestDealsViewAllButton;

    @FindBy(xpath = "(//div[@class='row'])[5]")
    public WebElement labelBestDealsPage;

    @FindBy(xpath = "//h5[@class='font_16 f_w_500 mr_10 mb-0']")
    public WebElement labelBestDealsAllProducts;

}