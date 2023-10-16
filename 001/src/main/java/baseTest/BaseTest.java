package baseTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public static WebDriver driver;
	public static WebDriverWait wait;
		
	public static void initialize() {		
	//System.setProperty("webdriver.chrome.driver", "M:/Selenium/chromedriver-win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public static void launchUrl() {
	String	url = "https://www.amazon.ca/";
	driver.get(url);
	String pageTitle = driver.getTitle();
	
	}
	
	public void closeBrowser() {
	driver.close();
	}
}
