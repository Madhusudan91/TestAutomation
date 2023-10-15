
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseTest.baseTest;
 
public class Demo{
		
	WebDriver driver;
	
	@Test
	public void initialize() {		
		System.setProperty("webdriver.chrome.driver", "M:/Selenium/chromedriver-win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String	url = "https://www.amazon.ca./";
		driver.get(url);
		String pageTitle = driver.getTitle();

		}
		
	
}
