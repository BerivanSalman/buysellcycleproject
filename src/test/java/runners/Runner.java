package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/rapor.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features", // calisacak Feature/Scenario'lar nerede ?
        glue = "stepdefinitions" ,    // calisacak Feature/Scenario'larin kodlari nerede?

        tags = "@US_019-TC_003",  // hangi Feature/Scenario'lar calisacak ?


        tags = "@tc9",  // hangi Feature/Scenario'lar calisacak ?


        tags = "@Smok",  // hangi Feature/Scenario'lar calisacak ?

        tags = "@ka",  // hangi Feature/Scenario'lar calisacak ?



        dryRun = false  // true yapilirsa testi calistirmadan eksik adimlari verir
        // testleri calistirirken dryRun = false olmalidir
)

public class Runner {

}