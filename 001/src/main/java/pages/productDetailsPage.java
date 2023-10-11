package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseTest.baseTest;

public class productDetailsPage extends baseTest {

		//Product Description
		@FindBy(id="productTitle")
		WebElement prdctDesc;
}
