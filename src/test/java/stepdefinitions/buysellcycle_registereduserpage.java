package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BuysellcycleAdminPage;
import pages.BuysellcycleHomePage;
import pages.BuysellcycleRegisteredUserPage;
import utilities.ConfigReader;
import utilities.Driver;

public class buysellcycle_registereduserpage {

    BuysellcycleHomePage buysellcycleHomePage = new BuysellcycleHomePage();
    BuysellcycleRegisteredUserPage buysellcycleRegisteredUserPage = new BuysellcycleRegisteredUserPage();

    @And("User displays the user dashboard page.")
    public void userDisplaysTheUserDashboardPage() {
        Assert.assertTrue(buysellcycleRegisteredUserPage.headDashboardButton.isDisplayed());
    }


}