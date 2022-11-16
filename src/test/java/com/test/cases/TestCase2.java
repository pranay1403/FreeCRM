package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;

@Listeners(com.baseclass.ListnerClass.class)
public class TestCase2 extends BaseClass {
	HomePage hp;
	LoginPage lp;

	@Test(description = "Validate Login Fuctionality Of FreeCRM", priority = 1)
	public void validateEmail() {
		hp = new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfLogin());
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		Assert.assertTrue(lp.visiabilityOfEmail());
		lp.clickOnEmail();
		backword();
	}

	@Test(description = "Validate Login Fuctionality Of FreeCRM", priority = 2)
	public void validatePassword() {
		hp = new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfLogin());
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		Assert.assertTrue(lp.visiabilityOfPassword());
		lp.clickonPassword();
		backword();
	}
	@Test(description = "Validate Login Fuctionality Of FreeCRM", priority = 3)
	public void validateLoginbtn() {
		hp = new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfLogin());
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		Assert.assertTrue(lp.visiabilityOfloginbtn());
		lp.clickOnloginbtn();
		backword();
	}
	@Test(description = "Validate Login Fuctionality Of FreeCRM", priority = 4)
	public void validateForgotpass() {
		hp = new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfLogin());
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		Assert.assertTrue(lp.visiabilityOfForgotPass());
		lp.clickOnForgotpass();
		backword();
		backword();
	}
	@Test(description = "Validate Login Fuctionality Of FreeCRM", priority = 5)
	public void validateSignUp() {
		hp = new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfLogin());
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		Assert.assertTrue(lp.visiabilityOfSignUp());
		lp.clickOnSignUp();
		backword();
		backword();
	}

	@Test(description = "Validate Login Fuctionality Of FreeCRM", priority = 6)
	public void ValidateLoginFuctionality() {

		hp = new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfLogin());
		hp.clickonLogIn();
		lp = new LoginPage(driver);
		Assert.assertTrue(lp.visiabilityOfEmail());
		Assert.assertTrue(lp.visiabilityOfPassword());
		Assert.assertTrue(lp.visiabilityOfloginbtn());
		lp.Entercredentials();
		lp.clickOnloginbtn();
	}
}
