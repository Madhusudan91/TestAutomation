package methods;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import baseTest.BaseTest;

public class HomePage extends BaseTest{
	pages.homePage homePage = new pages.homePage();
	
		
	public void verifyHomePage() {
		Assert.assertEquals(true, homePage.logo.isDisplayed());
	}
	
	public void clickToLogin() {
		Actions action = new Actions(driver);
		action.moveToElement(homePage.accntsNLists);
		wait.until(ExpectedConditions.elementToBeClickable(homePage.sigInBtn));
		homePage.searchTxtbox.click();
		homePage.sigInBtn.click();
				
	}
	
	public  void enterValueAndSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(homePage.searchTxtbox));
		homePage.searchTxtbox.sendKeys("Stroller");	
		Select select = new Select (homePage.searchValuesDrpdwn);
		select.selectByVisibleText("Stroller fan");
		
	}
	
}
