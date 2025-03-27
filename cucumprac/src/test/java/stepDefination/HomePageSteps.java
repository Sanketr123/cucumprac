package stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class HomePageSteps {
	
	private WebDriver driver = Hooks.getDriver();
    private LoginPage loginPage;
    private HomePage homepage;
    
    
	    @When("I count and print total number of links present")
	    public void I_count_and_print_total_number_of_links_present( ) {
	        
	    	homepage = new HomePage(driver);
	    	        String currentUrl = driver.getCurrentUrl();
	    	       if (!currentUrl.contains("secure")) {
	    	           throw new AssertionError("Not on homepage! Login might have failed.");
	    	       }
	    	
	    	       int totalLinks = homepage.totallinksonhomepage();
	    	       
	    	       Assert.assertTrue(totalLinks > 0, "Total links should be greater than zero");
	    	       }

	    @Then("then click on logout button")
	    public void then_click_on_logout_button() {
	       
	    	homepage.clickonlogoutbutton();
	    }
	    
	    
	    @When("extract welcome massage")
	    public void extract_welcome_massage( ) {
	        
	    	/*
	    	homepage = new HomePage(driver);
	    	        String currentUrl = driver.getCurrentUrl();
	    	       if (!currentUrl.contains("secure")) {
	    	           throw new AssertionError("Not on homepage! Login might have failed.");
	    	       }
	    	*/
	    	homepage = new HomePage(driver);
	    	String message = homepage.welcomemessage();
	    	
	    	Assert.assertEquals(message.trim(), "Welcome to the Secure Area. When you are done click logout below." 
                    );
	    }

	  


}
