package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	private WebDriver driver;

	@FindBy(id = "username")
	private WebElement homepage;

	@FindBy(tagName = "a")
	private List<WebElement> alllinksonhomepage;

	@FindBy(xpath = "//a[@class='button secondary radius btn btn-danger']")
	private WebElement logoutButton;

	@FindBy(xpath = "//h4[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]")
	private WebElement welcomemessage;

	@FindBy(id = "examples-dropdown")
	private WebElement clickondemos;

	@FindBy(css = "li[class='nav-item dropdown col-6 col-md-auto'] li:nth-child(1) a:nth-child(1)")
	private WebElement clickonexamples;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void onhomepage() {

		String hipracticetext = homepage.getText();

		Assert.assertEquals(hipracticetext, "Hi, practice!");

		System.out.println("logged in successfully");
	}

	public int totallinksonhomepage() {

		System.out.println("Total links on homepage are" + alllinksonhomepage.size());
		
		int linkCount = alllinksonhomepage.size();
		
		return linkCount;

	}

	public void clickonlogoutbutton() {

		logoutButton.click();
	}

	public String welcomemessage() {

		String welcome = welcomemessage.getText();
		
		return welcome;
	}

	public void clickondemos() {

		clickondemos.click();
	}

	public ExamplesPage selectExamples() {

		clickonexamples.click();
		
		return new ExamplesPage(driver);
	}

}
