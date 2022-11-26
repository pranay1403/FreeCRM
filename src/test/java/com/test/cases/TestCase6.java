package com.test.cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.CompaniesPage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;

@Listeners(com.baseclass.ListnerClass.class)
public class TestCase6 extends BaseClass {

	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	CompaniesPage mp;

	@Test(priority = 1, description = "Companies Page Validation")
	public void initiateValidation() {
		hp = new HomePage(driver);
		hp.clickonLogIn();
		lp = new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		pp = new ProfilePage(driver);
		pp.clickoncompany();
		//mp = new CompaniesPage(driver);
		//System.out.println(mp.PageTitle());
	}

	@Test(priority = 2)
	public void Validation() {
		mp = new CompaniesPage(driver);

		AssertJUnit.assertTrue(mp.VisibillityofView());
		AssertJUnit.assertTrue(mp.ClickabillityofView());

		AssertJUnit.assertTrue(mp.ClickabillityofShowFilter());
		AssertJUnit.assertTrue(mp.VisibillityofShowFilter());

		AssertJUnit.assertTrue(mp.ClickabillityofNumberActive());
		AssertJUnit.assertTrue(mp.VisibillityofNumberActive());

		AssertJUnit.assertTrue(mp.ClickabillityofName());
		AssertJUnit.assertTrue(mp.VisibillityofName());

		AssertJUnit.assertTrue(mp.ClickabillityofExport());
		AssertJUnit.assertTrue(mp.VisibillityofExport());

		AssertJUnit.assertTrue(mp.ClickabillityofCreate());
		AssertJUnit.assertTrue(mp.VisibillityofCreate());

		AssertJUnit.assertTrue(mp.ClickabillityofAddress());
		AssertJUnit.assertTrue(mp.VisibillityofAddress());

	}

	@Test(priority = 3)
	public void ClickonCreate() {
		mp = new CompaniesPage(driver);
		mp.CliockonCreate();
	}

}
