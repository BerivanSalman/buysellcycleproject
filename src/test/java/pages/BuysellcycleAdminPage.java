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

    @FindBy(xpath = "(//*[text()='Products'])[1]") public WebElement linkProduct;
    @FindBy(xpath = "//*[text()='Add New Product']") public WebElement linkAddNewProduct;
    @FindBy(xpath = "//*[text()='General Information']") public WebElement buttonGeneralInformation;
    @FindBy(xpath = "(//*[@class='nav-link show'])[1]") public WebElement buttonRelatedProduct;
    @FindBy(xpath = "(//*[@class='nav-link show'])[2]") public WebElement buttonUpSale;
    @FindBy(xpath = "(//*[@class='nav-link show'])[3]") public WebElement buttonCrossSale;
    @FindBy(xpath = "//span[@class='checkmark']") public WebElement radioButtonTypeSingle;
    @FindBy(xpath ="(//span[@class='checkmark'])[2]" ) public WebElement radioButtonTypeVariant;
    @FindBy(xpath = "//*[@name='product_name']") public WebElement boxProductName;
    @FindBy(xpath = "//*[@name='product_sku']") public WebElement boxProductSku;
    @FindBy(xpath = "//*[@name='model_number']") public WebElement boxModelNumber;
    @FindBy(xpath = "(//*[@role='combobox'])[1]") public WebElement boxCategory;
    @FindBy(xpath = "(//*[@role='combobox'])[2]") public WebElement boxBrandCategory;
    @FindBy(xpath = "(//*[@role='combobox'])[3]") public WebElement boxUnitCategory;
    @FindBy(xpath = "//*[@class='nice-select primary_select mb-15']") public WebElement boxBarcodeType;
    @FindBy(xpath = "//*[@class='bootstrap-tagsinput']") public WebElement boxTags;



}