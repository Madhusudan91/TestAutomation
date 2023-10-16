package pages;

import baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BaseTest{

	//Enter email id or mobile number
	//@FindBy(xpath="//*[@id='ap_email']")
	@FindBy(id="ap_email")
	public WebElement enterEmail;
	
	//Continue button
	//@FindBy(xpath="//*[@id='continue-announce']")
	@FindBy(id="continue-announce")
	public WebElement continueBtn;
	
	//Password Field
	//@FindBy(xpath="//*[@id='ap_password']")
	@FindBy(id="ap_password")
	public WebElement enterPswd;
	
	//Password Field
	//@FindBy(xpath="//*[@id='signInSubmit']")
	@FindBy(id="signInSubmit")
	public WebElement signInBtn;
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
