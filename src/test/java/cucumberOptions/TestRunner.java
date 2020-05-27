package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/mockJson.feature", glue = { "stepdefinations" }, plugin = { "pretty",
		"html:target" }, monochrome = true, dryRun = false)
public class TestRunner {

}
