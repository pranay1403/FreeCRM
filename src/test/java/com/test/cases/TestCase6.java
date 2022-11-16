package com.test.cases;

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

		Assert.assertTrue(mp.VisibillityofView());
		Assert.assertTrue(mp.ClickabillityofView());

		Assert.assertTrue(mp.ClickabillityofShowFilter());
		Assert.assertTrue(mp.VisibillityofShowFilter());

		Assert.assertTrue(mp.ClickabillityofNumberActive());
		Assert.assertTrue(mp.VisibillityofNumberActive());

		Assert.assertTrue(mp.ClickabillityofName());
		Assert.assertTrue(mp.VisibillityofName());

		Assert.assertTrue(mp.ClickabillityofExport());
		Assert.assertTrue(mp.VisibillityofExport());

		Assert.assertTrue(mp.ClickabillityofCreate());
		Assert.assertTrue(mp.VisibillityofCreate());

		Assert.assertTrue(mp.ClickabillityofAddress());
		Assert.assertTrue(mp.VisibillityofAddress());

	}

	@Test(priority = 3)
	public void ClickonCreate() {
		mp = new CompaniesPage(driver);
		mp.CliockonCreate();
	}

}
