package stepDefination;

import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ExamplesPage;
import pages.HomePage;
import pages.LoginPage;

public class ExamplesPageSteps {
	
	private WebDriver driver = Hooks.getDriver();
    private LoginPage loginPage;
    private HomePage homepage;
    private ExamplesPage examplespage;
	
	@And("go to demos dropdown and click on example")
	 public void go_to_demos_dropdown_and_click_on_example( ) {
		
		//examplespage = new ExamplesPage(driver);
		
		homepage = new HomePage(driver);
		
		homepage.clickondemos();
		
		
		homepage.selectExamples();
	}
	
	
	
	
    @Then("print all the footer link")
    public void print_all_the_footer_link( ){
    	examplespage = new ExamplesPage(driver);
    	examplespage.getfooterlinks();
    }
    

}
