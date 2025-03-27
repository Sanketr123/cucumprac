package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ExamplesPage {

	private WebDriver driver;

	@FindBy(xpath = "//main[@class='flex-shrink-0 py-3']//div[@class='row mt-3']//div[1]")
	private WebElement footerlinkbox;

	@FindBy(css = "main[class='flex-shrink-0 py-3'] ul:nth-child(1) li")     //main[class='flex-shrink-0 py-3'] ul:nth-child(1) li
	private List<WebElement> footerlinks;

	public ExamplesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getfooterlinks() {

		int ftlinks = footerlinks.size();
		
		String footersname = footerlinks.toString();

		System.out.println("Total footer links are " + ftlinks);

		System.out.println(footersname);

	}

}
