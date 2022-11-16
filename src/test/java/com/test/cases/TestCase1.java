package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.baseclass.BaseClass;
import com.page.classes.HomePage;
/*Please change in base class With @BeforeTest to @BeforeMethod
 * & Also Change @AfterTest to @AfterMethod to validate all
 * page element 
 * Author:/ Pranay Gaikwad 
 */
@Listeners(com.baseclass.ListnerClass.class)
public class TestCase1 extends BaseClass {
	public static HomePage hp;
	@Test(description = "validate freeCrm homepage", priority = 1)
	public void ValidateLogo() {
	    hp = new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOflogo());
		hp.clickonlogo();
	}
	@Test(description = "validate freeCrm homepage", priority = 2)
	public void ValidateLogin() {
		hp=new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfLogin());
		hp.clickonLogIn();
	}
	@Test(description = "validate freeCrm homepage", priority = 3)
	public void ValidateSignUp() {
		hp=new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfSignUp());
		hp.clickonSignUp();
	}
	@Test(description = "validate freeCrm homepage", priority = 4)
	public void ValidateCustomer() {
		hp=new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfCustomer());
		hp.clickonCustomer();
	}
	@Test(description = "validate freeCrm homepage", priority = 5)
	public void ValidateContactUs() {
		hp=new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfcontactus());
		hp.clickonContactUs();
	}
	@Test(description = "validate freeCrm homepage", priority = 6)
	public void ValidateFeatures() {
		hp=new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfFeatures());
		hp.clickonFeatures();
	}
	@Test(description = "validate freeCrm homepage", priority = 7)
	public void ValidatePricing() {
		hp=new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfPricing());
		hp.clickonpricing();
	}
}
