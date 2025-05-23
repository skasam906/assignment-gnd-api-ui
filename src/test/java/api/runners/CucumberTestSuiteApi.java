package api.runners;

import api.testbase.TestBase;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "api.stepDefs",
        features = "src/test/resources/features/bookerAPI.feature",
        plugin = {"pretty", "html:target/test-output/report.html"})
public class CucumberTestSuiteApi extends TestBase {
}
