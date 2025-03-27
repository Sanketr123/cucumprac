package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefination", "hooks" }, plugin = { "pretty",
		"html:target/cucumber-reports.html", "json:target/cucumber-reports/Cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenarios.txt"}, monochrome = true,tags="@Regression")
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}


	
	//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: