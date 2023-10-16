package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseTest.BaseTest;

public class productDetailsPage extends BaseTest {

		//Product Description
		@FindBy(id="productTitle")
		WebElement prdctDesc;
}
