package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class OuterRunner {

    final String tags = "@US_35-TC_001";

    @CucumberOptions(
            plugin = {
                    "html:target/reports/" + tags + "-report.html",
                    "json:target/json-reports/" + tags + "-report.json",
                    "junit:target/xml-report/" + tags + "-report.xml",
                    "rerun:target/failedRerun.txt"
            },
            features = "src/test/resources",
            glue = {"stepdefinitions"},
            tags = tags,
            dryRun = false
    )

    public class Runner {}

}