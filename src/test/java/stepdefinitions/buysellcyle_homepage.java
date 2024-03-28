package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BuysellcylePage;
import utilities.ConfigReader;
import utilities.Driver;

public class buysellcyle_homepage {
    BuysellcylePage buysellcylePage=new BuysellcylePage();
    @Given("kullanici buysellcyle anasayfasında gider")
    public void kullanici_buysellcyle_anasayfasında_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));



    }
    @Then("arama kutusuna tablet yazar enter tusuna basar")
    public void arama_kutusuna_tablet_yazar_enter_tusuna_basar() {

        buysellcylePage.aramabutonu.sendKeys("tablet");

    }
    @Then("sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();
    }


}
