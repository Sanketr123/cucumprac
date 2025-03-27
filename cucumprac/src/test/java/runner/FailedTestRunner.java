package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenarios.txt", glue = { "stepDefination", "hooks" }, plugin = { "pretty",
		"html:target/cucumber-reports.html", "json:target/cucumber-reports/Cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, monochrome = true)
public class FailedTestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}


	
	//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: