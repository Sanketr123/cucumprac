package context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ExamplesPage;
import pages.HomePage;
import pages.LoginPage;

public class TestContext {
	
	 public WebDriver driver;
	  public HomePage homePage;
	    public LoginPage loginPage;

	    public ExamplesPage examplesPage;
	    public TestContext() {
	        System.setProperty("webdriver.chrome.driver", "path-to-chromedriver");
	       driver = new ChromeDriver(); // Single WebDriver instance
	    
	       homePage = new HomePage(driver);
	        loginPage = new LoginPage(driver);
	        examplesPage = new ExamplesPage(driver); 
	    
	    }

}
