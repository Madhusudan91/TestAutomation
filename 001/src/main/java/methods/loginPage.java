package methods;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import baseTest.baseTest;

public class loginPage extends baseTest{
	pages.loginPage loginPage = new pages.loginPage();
		
	public void verifyloginPage() {
		Assert.assertEquals(true, loginPage.continueBtn.isEnabled());
	}
	
	
	public void enterLoginDetails() {
		wait.until(ExpectedConditions.elementToBeClickable(loginPage.enterEmail));
		loginPage.enterEmail.sendKeys("4379372512");	
		loginPage.continueBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(loginPage.enterPswd));
		loginPage.enterPswd.sendKeys("Noirr@25");	
		loginPage.signInBtn.click();
				
	}
	
}
