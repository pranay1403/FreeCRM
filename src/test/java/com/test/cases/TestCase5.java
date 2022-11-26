package com.test.cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.ContactPage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;
@Listeners(com.baseclass.ListnerClass.class)
public class TestCase5 extends BaseClass {

	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	ContactPage cp;

	@Test(priority = 1)
	public void intiateValidate() {
		hp = new HomePage(driver);
		hp.clickonLogIn();
		lp = new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		pp = new ProfilePage(driver);
		pp.clickoncontact();
		
	}
@Test(priority=2)
public void Validition() {
cp= new ContactPage(driver);
//cp.Gettitle();
AssertJUnit.assertTrue(cp.Clickabilityofaction());
AssertJUnit.assertTrue(cp.ClickabilityofCategory());	
AssertJUnit.assertTrue(cp.ClickabilityofEmail());	
AssertJUnit.assertTrue(cp.Clickabilityofcreate());
AssertJUnit.assertTrue(cp.Clickabilityofexport());
AssertJUnit.assertTrue(cp.ClickabilityofName());
AssertJUnit.assertTrue(cp.Clickabilityofrightmark());
AssertJUnit.assertTrue(cp.ClickabilityofShowfilter());
AssertJUnit.assertTrue(cp.ClickabilityofStatus());
AssertJUnit.assertTrue(cp.ClickabilityofView());
AssertJUnit.assertTrue(cp.Visibilityofaction());
AssertJUnit.assertTrue(cp.VisibilityofAdress());
AssertJUnit.assertTrue(cp.VisibilityofCategory());
AssertJUnit.assertTrue(cp.Visibilityofcreate());
AssertJUnit.assertTrue(cp.VisibilityofEmail());
AssertJUnit.assertTrue(cp.Visibilityofexport());
AssertJUnit.assertTrue(cp.Visibilityofname());
AssertJUnit.assertTrue(cp.VisibilityofOne());
AssertJUnit.assertTrue(cp.VisibilityofOption());
AssertJUnit.assertTrue(cp.VisibilityofPhone());
AssertJUnit.assertTrue(cp.VisibilityofPhone());
AssertJUnit.assertTrue(cp.VisibilityofRightmark());
AssertJUnit.assertTrue(cp.VisibilityofShowfilter());
AssertJUnit.assertTrue(cp.VisibilityofStatus());
AssertJUnit.assertTrue(cp.VisibilityofView());
}
@Test(priority=4)
public void ClickonCreat()	{
	cp= new ContactPage(driver);
	cp.ClickonCreate();
}
@Test(priority=3)
public void GetTitle()	{
	cp= new ContactPage(driver);
	System.out.println(cp.Gettitle());
}	
}
