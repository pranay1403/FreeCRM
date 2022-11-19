package com.test.cases;

import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.CreateNewCasePage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;

public class TestCase12 extends BaseClass{
	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	CreateNewCasePage ncp;

	@Test(priority = 1)
	public void initialSetup() {
		hp = new HomePage(driver);
		hp.clickonLogIn();
		lp = new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		pp = new ProfilePage(driver);
		pp.clickoncompany();
		pp.clickonCreateComp();
		pp.clickoncompany();
		pp.clickonCreateComp();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pp.clickonName();
		pp.Entername();
		pressEnter(driver, pp.name());
		
	}
}
