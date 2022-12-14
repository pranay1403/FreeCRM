package com.test.cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
		AssertJUnit.assertTrue(pp.VisibilityofCalender());
		AssertJUnit.assertTrue(pp.clickabilityofCalender());
		pp.clickoncalender();
		backword();
	}

	@Test(priority = 3)
	public void ValidateContact() {
		pp = new ProfilePage(driver);
		AssertJUnit.assertTrue(pp.VisibilityofContact());
		AssertJUnit.assertTrue(pp.clickabilityofContact());
		pp.clickoncontact();
		backword();
	}

	@Test(priority = 4)
	public void ValidateCompany() {
		pp = new ProfilePage(driver);
		AssertJUnit.assertTrue(pp.VisibilityofCompanies());
		AssertJUnit.assertTrue(pp.clickabilityofCompanies());
		pp.clickoncompany();
		backword();
	}
}
