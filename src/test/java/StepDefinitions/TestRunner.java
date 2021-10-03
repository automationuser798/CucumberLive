package StepDefinitions;



import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true, 
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = { "src/test/resources/FeatureCollections/" },
		tags = {"@SmokeTest"}
//		dryRun = true
		
		)

public class TestRunner {

}