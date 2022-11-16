package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
@Listeners(com.baseclass.ListnerClass.class)
public class TestCase2 extends BaseClass{

	@Test(description = "Validate Login Fuctionality Of FreeCRM")
	public void ValidateLoginFuctionality() {
		
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.visiabilityOfLogin());
		hp.clickonLogIn();
		LoginPage lp=new LoginPage(driver);
		Assert.assertTrue(lp.visiabilityOfEmail());
		Assert.assertTrue(lp.visiabilityOfPassword());
		Assert.assertTrue(lp.visiabilityOfloginbtn());
		lp.Entercredentials();
		lp.clickOnloginbtn();
		}
}
