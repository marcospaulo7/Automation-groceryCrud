package runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                plugin = {"pretty", "json:reports/cucumber.json, html:reports/cucumberHtml.html"},
                features = {"./src/test/resources/feature"} ,
                glue = {"com.automationpratic.steps", "com.automationpratice.configuration"},
                tags = "@smoketest")



public class RunTest {


}
