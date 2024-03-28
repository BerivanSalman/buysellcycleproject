package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BuysellcycleRegisteredUserPage {

    public BuysellcycleRegisteredUserPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")
    public WebElement headDashboardButton;
}
