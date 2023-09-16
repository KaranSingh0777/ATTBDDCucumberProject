package appFeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appFeatures"},
		glue = {"appFeatures"},
		plugin = {"pretty"},
		dryRun = false
		
		)

public class AmazonRunnerTest extends AbstractTestNGCucumberTests {

}
