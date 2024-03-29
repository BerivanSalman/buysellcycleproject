package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.BuysellcycleHomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class buysellcycle_homepage {

    BuysellcycleHomePage buysellcylePage=new BuysellcycleHomePage();



    private WebDriver driver;
    @Given("User goes to {string}")
    public void user_goes_to(String url) throws InterruptedException {
        buysellcylePage.homePage();
    }



    @Then("User closed to page")
    public void user_closed_to_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
