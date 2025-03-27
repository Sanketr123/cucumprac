package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import hooks.Hooks;

public class ReusableActions {
	
	private static final Logger logger = LogManager.getLogger(ReusableActions.class);
    private static WebDriver driver = Hooks.getDriver();

    // Scroll down
    public static void scrollDown(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + pixels + ");");
        logger.info("Scrolled down by " + pixels + " pixels");
    }

    // Click an element
    public static void clickElement(WebElement element) {
        element.click();
        logger.info("Clicked on element: " + element);
    }

    // Enter text in an input field
    public static void enterText(WebElement element, String text) {
        element.sendKeys(text);
        logger.info("Entered text: " + text);
    }

    // Get text from an element
    public static String getText(WebElement element) {
        String text = element.getText();
        logger.info("Retrieved text: " + text);
        return text;
    }

    // Take screenshot
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    // Read properties file
    public static String getProperty(String key) {
        Properties prop = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            prop.load(file);
        } catch (IOException e) {
            logger.error("Error reading config file", e);
        }
        return prop.getProperty(key);
    }

}
