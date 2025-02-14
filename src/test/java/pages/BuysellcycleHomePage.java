package pages;




import com.github.javafaker.Faker;
import org.bouncycastle.asn1.x9.X9ECParameters;

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

    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[1]")
    public WebElement LinkTrackYourOrder;

    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[2]")
    public WebElement LinkCompare;

    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[3]")
    public WebElement LinkWishList;


    @FindBy(xpath = "/html/body/header/div/div[1]/div/div/div/div/div[2]/a[4]/span")
    public WebElement LinkCart;




    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])")

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

    @FindBy(xpath = "/html/body/header/div/div[1]/div/div/div/div/div[2]/a[3]/span")
    public WebElement linkWishListFullPath;

    @FindBy(xpath = "(//footer//div[contains(@class, 'container')])[1]")
    public WebElement footerSection;

    @FindBy(xpath = "(//*[text()='About Us'])[3]")
    public WebElement aboutUsLink;

    @FindBy(xpath = "(//*[text()='Blog'])[3]")
    public WebElement blogLink;

    @FindBy(xpath = "//div[@class=\"about_countBox mb_30 text-center\"][1]")
    public WebElement logoClientWorldwide;

    @FindBy(xpath = "//*[text()='About Us']")
    public WebElement linkAboutUs;

    @FindBy(xpath = "(//*[@class='section__title2 mb_35'])[2]")
    public WebElement labelTeamMember;

    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")
    public WebElement    linkDashboard;


    @FindBy(xpath = "(//*[@class='single_top_lists d-flex align-items-center d-none d-md-inline-flex'])[3]")
    public  WebElement linkMyWishList;


    @FindBy(xpath = "//h5[@class='font_14 f_w_400 flex-fill mb-0']")
    public WebElement labelShowingResult;


    @FindBy(xpath = "//p[@class='sign_up_text']")
    public WebElement labelForgotPassword;

    @FindBy(xpath = "(//*[@class='nice-select amaz_select4'])[2]")
    public  WebElement filterWishList;

    @FindBy(xpath = "(//*[@class='addToCompareFromThumnail'])[1]")
    public WebElement compareButton;

    @FindBy( xpath= "/html/body/div[3]/div[1]/div/div[3]/a/img")
    public WebElement imageSlider1;


    @FindBy(xpath = "(//*[@id='inlineFormInputGroup'])[1]")
    public WebElement searchButton;


    @FindBy(xpath = "/html/body/div[15]/div/div/div[1]/i")
    public WebElement subscribeCloseButton;

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

    @FindBy(xpath = "(//*[@class='lazyload'])[3]")
    public WebElement exclusiveProduct;

    @FindBy(xpath = "(//*[@class='lazyload'])[3]")
    public WebElement gridViewProduct3;

    @FindBy(xpath = "(//*[@class='lazyload'])[3]")
    public WebElement gridViewProduct2;


    @FindBy(xpath = "(//*[@class='lazyload'])[4]")
    public WebElement newProductDealsProduct;

    @FindBy(xpath = "//*[text()='Filter']")
    public WebElement filterButton;



    //*****************************Gulcan Locate ***************************

    @FindBy(xpath = "/html/body/header/div/div[3]/div/div/div/div/div[3]/nav/ul/li[5]/a")
    public WebElement getContactButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div[3]/div/a[1]")
    public WebElement getSocialMediaButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/form/div/div[1]/input")
    public WebElement getNameInput;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/form/div/div[2]/input")
    public WebElement getEmailInput;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/form/div/div[3]/div")
    public WebElement getOrderButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/form/div/div[3]/div/ul/li[1]")
    public WebElement getOrderOptionButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/form/div/div[5]/button")
    public WebElement getSendMessageButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/h4")
    public WebElement GetInTouchForm;

    @FindBy(xpath = "/html/body/script[10]")
    public WebElement getMessage;

    @FindBy(xpath="(//*[text()='Dashboard'])[2]")
    public WebElement dashboardLink;


    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[2]/div/ul/li[2]/a")
    public WebElement myProfileLink;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[2]/div/ul/li[3]/a")
    public WebElement myOrderLink;

    @FindBy(xpath = "/html/body/footer/div[2]/div/div[2]/div/div/div/a[1]")
    public WebElement helpAndContactLink;

    @FindBy(xpath = "/html/body/footer/div[2]/div/div[2]/div/div/div/a[2]")
    public WebElement trackOrderLink;

    @FindBy(xpath = "/html/body/footer/div[2]/div/div[2]/div/div/div/a[3]")
    public WebElement returnAndExchangeLink;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[2]/form/input")
    public WebElement subscribeEmailBox;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[2]/form/button")
    public WebElement subscribeButton;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[3]" )
    public WebElement appMarketLinksSection;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[3]/div/div/a[1]")
    public WebElement googlePlayLink;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[3]/div/div/a[2]")
    public WebElement appleStoreLink;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[3]")
    public WebElement socialLinksSection;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[3]/a[1]")
    public WebElement youtubeIcon;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[3]/a[2]")
    public WebElement linkedinIcon;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[3]/a[3]")
    public WebElement instagramIcon;

    @FindBy(xpath = "/html/body/footer/div[1]/div/div/div[4]/div/div[3]/a[4]")
    public WebElement facebookIcon;

    @FindBy(xpath = "/html/body/footer/div[2]/div/div[2]/div/div")
    public WebElement copyrightText;

    @FindBy(xpath = "/html/body/div[24]/a")
    public WebElement goToTopButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/form/div/div[1]/input")
    public WebElement orderTrackingNumberBox;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/form/div/div[3]/button")
    public WebElement trackNowButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/form/div/div[2]/input")
    public WebElement secretIDBox;

    @FindBy(xpath = "/html/body/header/div/div[3]/div/div/div/div/div[2]/ul/li[6]/a")
    public WebElement accessoriesTitle;

    @FindBy(xpath = "/html/body/header/div/div[3]/div/div/div/div/div[2]/ul/li[6]/ul/li[3]/ul/li[2]/a")
    public WebElement manwatchtitle;
    @FindBy (xpath = "(//*[@class='position-relative d-flex align-items-center'])[9]")
    public WebElement refferalLink;

    @FindBy(xpath = "//*[@name='code']")
    public WebElement refferalCode;

    @FindBy(xpath = "//*[@class='font_24 f_w_700 mb_20']")
    public WebElement labelMyRefferalCode;

    @FindBy(xpath = "//*[@id='copyBtn']")
    public WebElement copyCodeButton;

    @FindBy(xpath = "//*[@class='toast-title']")
    public WebElement labelSucces;

    @FindBy(xpath = "//*[@class='font_14 f_w_700 priamry_text']")
    public WebElement labelSl;

    @FindBy(xpath = "//*[@class='font_20 f_w_700 mb_20']")
    public WebElement labelUserList;

}