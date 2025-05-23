package ui.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "ui.stepDefs",
        features = "src/test/resources/features/shoppingUI.feature",
        plugin = {"pretty", "html:target/test-output/report.html"})
public class CucumberTestSuiteUi {
}
