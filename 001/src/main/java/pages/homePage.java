package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.baseTest;

public class homePage extends baseTest{
	
	//Amazon logo
	//@FindBy(xpath="//*[@id='logo-ext']")
	@FindBy(id="logo-ext")
	public WebElement logo;
		
	//Profile button
	@FindBy(xpath="(//span[contains(text(),'Account & Lists')]")
	public WebElement accntsNLists;
	
	//login button
	@FindBy(xpath="(//span[contains(text(),'Sign in')])[1]")
	public WebElement sigInBtn;

	//Enter to search Element
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	public WebElement searchTxtbox;
	
	//Search button
	@FindBy(xpath="//*[@id='nav-search-submit-button']")
	public WebElement searchBtn;
	
	//Select a product from dropdown
	@FindBy(xpath="//div[@class='a-section a-spacing-base']//h2//a//span")
	public WebElement searchValuesDrpdwn;
	
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	

}
