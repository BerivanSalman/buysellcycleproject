package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class BuysellcycleAdminPage {

    public BuysellcycleAdminPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@name='login']")
    public WebElement adminEmailOrPhoneBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordBox;

    @FindBy(xpath = "//*[@class='amaz_primary_btn style2 radius_5px  w-100 text-uppercase  text-center mb_25']")
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
    @FindBy(xpath = "(//*[@class='checkmark'])[3]") public WebElement radioButtonPhysicalProduct;
    @FindBy(xpath = "//*[@name='weight']")  public WebElement placeholderWeight;
    @FindBy(xpath = "//*[@name='length']") public WebElement placeholderLength;
    @FindBy(xpath = "//*[@name='breadth']") public WebElement placeholderBreadth;
    @FindBy(xpath = "//*[@name='height']") public WebElement placeholderHeight;

    @FindBy(xpath = "(//*[text()='Support Ticket'])[1]")
    public WebElement linkSupportTicket;
    @FindBy(xpath = "(//*[text()='Support Ticket'])[2]")
    public WebElement linkSupportTicket2;

    @FindBy(xpath = "//*[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px']")
    public WebElement labelSupportTicket;

    @FindBy(xpath = "//*[@id='add_new']")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[text()='Open a Ticket']")
    public WebElement labelOpenaTicket;

    @FindBy(xpath = "//*[@class='primary_input_field']")
    public WebElement textBoxSubject;

    @FindBy(xpath = "(//*[@class='current'])[2]")
    public WebElement categoryListDDM;

    @FindBy(xpath = "(//*[@class='current'])[3]")
    public WebElement priortyDDM;

    @FindBy(xpath = "(//*[@class='current'])[5]")
    public WebElement statusDDM;

    @FindBy(xpath = "//*[@class='primary-btn semi_large2 fix-gr-bg']")
    public WebElement createTicketbutton;

    @FindBy(xpath = "//*[@for='ticket_file']")
    public WebElement browsebutton;

    @FindBy(xpath = "(//*[text()='Category'])[1]") public WebElement linkCategory;
    @FindBy(xpath = "(//*[text()='Brand'])[1]") public WebElement linkBrand;
    @FindBy(xpath = "(//*[text()='Units'])[1]") public WebElement linkUnits;
    @FindBy(xpath = "//*[@name='selling_price']") public WebElement placeholderSellingPrice;
    @FindBy(xpath = "//*[@name='discount']") public WebElement placeholderDiscount;
    @FindBy(xpath = "//*[@name='discount_type']") public WebElement dropdownDiscountType;
    @FindBy(xpath = "//*[@id='tax_id']")public WebElement dropdownTax;
    @FindBy(xpath = "//*[@class='selection']") public WebElement dropdownCategorySelection;
    @FindBy(xpath = "//*[text()='---> Woman Dress']") public WebElement womanDress;
    @FindBy(xpath = "//*[@class='nice-select primary_select mb-15 unit']") public WebElement unitSelection;
    @FindBy(xpath = "(//*[text()='retail'])[2]") public WebElement retailSelect;
    @FindBy(xpath = "//*[text()='CGST']") public WebElement cgstSelect;
    @FindBy(xpath = "//*[@for='minimum_order_qty']") public WebElement placeholderMinimumOrder;
    @FindBy(xpath = "//div[@id='GenaralInfo']/div[1]/div[1]/div[1]/div[1]/div[15]/div[2]/div[1]") public WebElement placeholderTags;



}