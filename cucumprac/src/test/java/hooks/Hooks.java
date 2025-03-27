package hooks;

import java.io.File; 

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.cucumber.core.logging.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ExtentReportManager;

public class Hooks {
	
	private static WebDriver driver;
    private static final Logger logger = LogManager.getLogger(Hooks.class); // Correct import	
    
    @Before
    public void setUp() {
    	ChromeOptions options = new ChromeOptions();
    	//options.addArguments("--proxy-server=" + PROXY_ADDRESS);
    	options.addExtensions(new File("C:\\Users\\qaind\\Downloads\\uBlock-Origin-Lite-Chrome-Web-Store.crx"));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        logger.info("Browser initialized");
        ExtentReportManager.getInstance();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
           // logger.error("Test failed: " + scenario.getName());
        }
        if (driver != null) {
            driver.quit();
           logger.info("Browser closed");
        }
        ExtentReportManager.flush();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
