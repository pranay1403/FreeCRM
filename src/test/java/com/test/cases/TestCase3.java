package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.CompaniesPage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;

public class TestCase3 extends BaseClass {

	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	

	@Test(priority=1)
	public void intiateforvalidation() {
		hp = new HomePage(driver);
		hp.clickonLogIn();
		lp = new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		
	}

	@Test(priority = 2)
	public void ValidateCalender() {

		pp = new ProfilePage(driver);
		Assert.assertTrue(pp.VisibilityofCalender());
		Assert.assertTrue(pp.clickabilityofCalender());
		pp.clickoncalender();
		backword();
	}

	@Test(priority = 3)
	public void ValidateContact() {
		pp = new ProfilePage(driver);
		Assert.assertTrue(pp.VisibilityofContact());
		Assert.assertTrue(pp.clickabilityofContact());
		pp.clickoncontact();
		backword();
	}

	@Test(priority = 4)
	public void ValidateCompany() {
		pp = new ProfilePage(driver);
		Assert.assertTrue(pp.VisibilityofCompanies());
		Assert.assertTrue(pp.clickabilityofCompanies());
		pp.clickoncompany();
		backword();
	}
}
