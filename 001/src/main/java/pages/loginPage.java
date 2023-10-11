package pages;

import baseTest.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends baseTest{

	//Enter email id or mobile number
	//@FindBy(xpath="//*[@id='ap_email']")
	@FindBy(id="ap_email")
	WebElement enterEmail;
	
	//Continue button
	//@FindBy(xpath="//*[@id='continue-announce']")
	@FindBy(id="continue-announce")
	WebElement continueBtn;
	
	//Password Field
	//@FindBy(xpath="//*[@id='ap_password']")
	@FindBy(id="ap_password")
	WebElement enterPswd;
	
	//Password Field
	//@FindBy(xpath="//*[@id='signInSubmit']")
	@FindBy(id="signInSubmit")
	WebElement signInBtn;
	
	
	
	
	
}
