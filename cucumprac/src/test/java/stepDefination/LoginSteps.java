package stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import context.TestContext;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import utility.ConfigReader;
import utility.ReusableActions;

public class LoginSteps {
	
	//private WebDriver driver = Hooks.getDriver();
    private LoginPage loginPage;
    private static final Logger logger = LogManager.getLogger(LoginSteps.class);
    private TestContext testContext;
    private WebDriver driver; 
    //private static final Logger logger = LogManager.getLogger(LoginSteps.class);

   // private LoginSteps LoginSteps;
    
    
    public LoginSteps(TestContext context) {
        this.testContext = context;
        this.driver = context.driver; 
        this.loginPage = context.loginPage;  // Using shared LoginPage instance
    }
    
    @Given("I am on the webiste")
    public void i_am_on_the_webiste() {
    	 String url = ConfigReader.getProperty("url");
        driver.get(url);
       // loginPage = new LoginPage(driver);
        logger.info("Navigated to login page");
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
    	ReusableActions.scrollDown(500);
        loginPage.enterCredentials(username, password);
        logger.info("Entered credentials: " + username);
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
    	 //ReusableActions.clickElement(loginPage.loginButton);
        loginPage.clickLogin();
        logger.info("Clicked login button");
    }

 
   
  
	@Then("I am on homepage")
    public void I_am_on_homepage(){
    	
    	loginPage.onhomepage();
    	//System.out.println("i am on homepage");
    	
    }

}
