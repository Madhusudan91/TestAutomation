package Products;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseTest.BaseTest;
 
public class AddProductToCart extends BaseTest {
	methods.HomePage homePage = new methods.HomePage();
	methods.LoginPage loginPage = new methods.LoginPage();
	
	public AddProductToCart() { 
		super();
		}
		
	
	 @BeforeClass 
	 public void launchApp() {
		 initialize();
		 launchUrl();
		 }
	 	
	  @BeforeMethod
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
	  
	  @AfterMethod 
	  public void logOut() {
	   }
	  
	  
	  @AfterClass
	  public void closeBrowser() { 
		  driver.close(); }
	  }
	 

