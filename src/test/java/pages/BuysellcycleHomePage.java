package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Properties;


public class BuysellcycleHomePage {


    public WebElement[] buttonAddToCart;

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

    @FindBy(xpath = "(//*[text()='Daily Deals'])") public WebElement linkDailyDeals;
    @FindBy(xpath = "//*[@id='count_down']") public WebElement counter;
    @FindBy(xpath = "//*[@class='col-xl-3 col-lg-4 col-md-6 col-6 d-flex']") public List<WebElement> specialPromotionalProducts;
    @FindBy(xpath = "//*[@class='amaz_primary_btn addToCartFromThumnail']" )public List<WebElement> buttonsAddtoCart;
    @FindBy(xpath = "(//*[@class='amaz_primary_btn addToCartFromThumnail'])[2]") public WebElement buttonForScrollAddtoCart;
    @FindBy(xpath = "//*[@id='add_to_cart_btn']") public WebElement buttonAddtoCart;
    @FindBy(xpath = "//*[text()='Item added to your cart']") public WebElement textAddtoCart;
    @FindBy(xpath = "//*[text()='View cart']") public WebElement buttonViewCart;
    @FindBy(xpath = "//*[@class='font_16 f_w_700 m-0 lh-1 text-nowrap']") public WebElement priceOfTheProduct;
    @FindBy(xpath = "(//*[text()='Red Front Zipper Long Dress'])[1]") public WebElement textChosenProduct;
    @FindBy(xpath = "//*[@class='font_16 f_w_700 m-0 theme_hover']") public WebElement addedProduct;
    @FindBy(xpath = "//*[@id='add_to_compare_btn_modify']") public WebElement linkCompare;
    @FindBy(xpath = "//*[text()='Success'] ") public WebElement textSuccess;
    @FindBy(xpath = "//*[@id='wishlist_btn']") public WebElement linkWishList;
    @FindBy(xpath ="//*[text()='Warning'] ")  public WebElement textWarning;
    @FindBy(xpath = "//*[@name='qty']") public WebElement boxQuantity;







}