package baseTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

public class baseTest {

	public static WebDriver driver;
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
	@BeforeTest
	public void initialize() {		
	System.setProperty("webdriver.chrome.driver", "M:/Selenium/chromedriver-win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	// Launch google site
	@Test
	public void launchUrl() {
	String	url = "https://www.google.com/";
	driver.get(url);
	String pageTitle = driver.getTitle();
	
	}
	
	@Test(dependsOnMethods="launchUrl")
	public void search() {		
	WebElement ele = driver.findElement(By.xpath("//*[@type='search']"));
	ele.sendKeys("Toolsqa");
	Assert.assertEquals("Test", "test2");
	}
	
	
	@AfterTest
	public void closeBrowser() {
	driver.close();
	}
}
