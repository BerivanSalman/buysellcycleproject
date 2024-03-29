package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Properties;


public class BuysellcycleHomePage {


    public BuysellcycleHomePage(){PageFactory.initElements(Driver.getDriver(),this);}
public void homePage() throws InterruptedException {
    Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

}


}