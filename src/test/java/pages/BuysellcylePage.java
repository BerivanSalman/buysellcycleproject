package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BuysellcylePage {

    public BuysellcylePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inlineFormInputGroup")
    public WebElement aramabutonu;
}
