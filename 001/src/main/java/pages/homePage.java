package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {
	
	//Amazon logo
	//@FindBy(xpath="//*[@id='logo-ext']")
	@FindBy(id="logo-ext")
	public static WebElement logo;
		
	//Profile button
	@FindBy(xpath="(//span[contains(text(),'Account & Lists')]")
	public static WebElement accntsNLists;
	
	//login button
	@FindBy(xpath="(//span[contains(text(),'Sign in')])[1]")
	public static WebElement sigInBtn;

	//Enter to search Element
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	public static WebElement searchTxtbox;
	
	//Search button
	@FindBy(xpath="//*[@id='nav-search-submit-button']")
	public static WebElement searchBtn;
	
	//Select a product from dropdown
	@FindBy(xpath="//div[@class='a-section a-spacing-base']//h2//a//span")
	public static WebElement searchValuesDrpdwn;
	
	
	
	

}
