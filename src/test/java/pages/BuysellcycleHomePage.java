package pages;

feature/Reyhan1
import org.junit.Assert;

import org.bouncycastle.jcajce.provider.asymmetric.X509;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
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

    @FindBy(xpath = "(//*[text()='New Product Deals'])[1]")
    public WebElement NewProductDealsButton;

    @FindBy(xpath = "(//*[@class='font_18 f_w_700'])[1]")
    public WebElement filterByRate;

    @FindBy(xpath = "//*[@data-value='5']")
    public WebElement filterFiveStar;

    @FindBy(xpath = "(//*[@class='font_18 f_w_700'])[2]")
    public WebElement filterByPrice;

    @FindBy(xpath = "(//*[@class='thumb'])[1]")
    public WebElement lenovoPructuctName;

    @FindBy(xpath = "//*[@title='Gird View']")
    public WebElement gridViewIcon;

    @FindBy(xpath = "(//*[text()=\"Men's Apparel\"])[2]")
    public WebElement mansApparelButton;

    @FindBy(xpath = "//*[@id='refresh_btn']")
    public WebElement refreshButton;

    @FindBy(xpath = "(//*[@class='thumb'])[3]")
    public WebElement relaxPlaySwingProduct;

    @FindBy(xpath = "//*[text()='New User Zone']")
    public WebElement newUserZoneButton;

    @FindBy(xpath = "//*[text()='Surprises for new users']")
    public WebElement labelSuprisesForNewUsers;

    @FindBy(xpath = "//*[text()='For You']")
    public WebElement forYouButton;

    @FindBy(xpath = "(//*[text()='Exclusive Price'])[1]")
    public WebElement exclusivePriceButton;

    @FindBy(xpath = "//*[text()='Coupon']")
    public WebElement couponButton;

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement labelProducts;

    @FindBy(xpath = "(//*[text()='Exclusive Price'])[2]")
    public WebElement labelExclusivePrice;

    @FindBy(xpath = "//*[@class='coupon_text']")
    public WebElement couponText;

    @FindBy(xpath = "(//*[@class='lazyload'])[1]")
    public WebElement firstProductName;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center discount'])[3]")
    public WebElement specialDiscountName;


    @FindBy(xpath = "(//footer//div[contains(@class, 'container')])[1]")
    public WebElement footerSection;

    @FindBy(xpath = "(//*[text()='About Us'])[3]")
    public WebElement aboutUsLink;

    @FindBy(xpath = "(//*[text()='Blog'])[3]")
    public WebElement blogLink;

    @FindBy(xpath = "//div[@class=\"about_countBox mb_30 text-center\"][1]")
    public WebElement logoClientWorldwide;

    @FindBy(linkText = "About Us")
    public WebElement linkAboutUs;

    @FindBy(xpath = "(//*[@class='section__title2 mb_35'])[2]")
    public WebElement labelTeamMember;

    @FindBy(linkText = "Dashboard")
    public WebElement linkDashboard;

    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
    public  WebElement linkMyWishList;


    @FindBy(xpath = "//h5[@class='font_14 f_w_400 flex-fill mb-0']")
    public WebElement labelShowingResult;

    @FindBy(xpath = "(//*[@class='col-md-6'])[1]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[text()='Item added to your cart']")
    public WebElement textAddedToCart;

    @FindBy(xpath = "//*[@class='close_modal_icon']")
    public WebElement closeIcon;

    @FindBy(xpath = "//*[@id='add_to_compare_btn_modify']")
    public WebElement addToCompareButton;

    @FindBy(xpath = "//*[text()='Success']")
    public WebElement alertAddToCompare;

    @FindBy(xpath = "//*[@id='wishlist_btn']")
    public WebElement addToWishListButton;

    @FindBy(xpath = "//*[text()='Warning']")
    public WebElement alertAddToWishList;

    @FindBy(xpath = "(//*[@role='tab'])[4]")
    public WebElement allCategory;

    @FindBy(xpath = "(//*[@role='tab'])[5]")
    public WebElement electronicsCategory;

    @FindBy(xpath = "(//*[@role='tab'])[6]")
    public WebElement homeCategory;

    @FindBy(xpath = "//*[text()='Get Now']")
    public WebElement getNowButton;

    @FindBy(xpath = "//*[text()='Success']")
    public WebElement alertgetNow;

    @FindBy(xpath = "//*[@class='col-xl-3 col-lg-4 col-md-6']")
    public List<WebElement> newUserGiftProducts;

    @FindBy(xpath = "((//*[@class='lazyload'])[2])")
    public WebElement newUserGiftProduct;

    @FindBy(xpath = "(//*[@class='col-md-6'])[1]")
    public WebElement addToCartButtonNewUserGift;



}