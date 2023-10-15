import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseTest.baseTest;
 
public class addProductToCart extends baseTest {
	methods.homePage homePage = new methods.homePage();
	methods.loginPage loginPage = new methods.loginPage();
	
	public addProductToCart() { 
		super();
		}
		
	
	 @BeforeClass 
	 public void launchApp() {
		 initialize();
		 launchUrl();
		 }
	 	
	  @BeforeTest 
	  public void login() { 
		  homePage.clickToLogin();
		  loginPage.verifyloginPage();
		  loginPage.enterLoginDetails();
	  }
	  
	  
	  @Test 
	  public void addProductAndVerify() {
		  homePage.verifyHomePage();
		  homePage.enterValueAndSearch(); 
	  }
	  
	  @AfterTest 
	  public void logOut() {
	   }
	  
	  
	  @AfterClass
	  public void closeBrowser() { 
		  driver.close(); }
	  }
	 

