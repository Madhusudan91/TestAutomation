package methods;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import baseTest.baseTest;

public class homePage extends baseTest{
	
		
	public void verifyHomePage() {
		Assert.assertEquals(true, pages.homePage.logo.isDisplayed());
	}
	
	
	public void enterValueAndSearch() {

		wait.until(ExpectedConditions.elementToBeClickable(pages.homePage.searchTxtbox));
		pages.homePage.searchTxtbox.sendKeys("Stroller");
		
	}
	
}
