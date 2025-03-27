package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	private WebDriver driver;
	
    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;
    
    @FindBy(id = "username")
    private WebElement hompage;
    
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    public void enterCredentials(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        logger.info("Entered username and password");
    }

    public void clickLogin() {
        loginButton.click();
    }
    
    public void onhomepage() {
    	
    	String hipracticetext =hompage.getText();
    	
    	 logger.info("Got hipractice text from homepage after login");
    	System.out.println(hipracticetext);
    }
    
    
}
