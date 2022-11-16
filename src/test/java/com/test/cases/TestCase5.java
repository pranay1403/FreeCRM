package com.test.cases;

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
Assert.assertTrue(cp.Clickabilityofaction());
Assert.assertTrue(cp.ClickabilityofCategory());	
Assert.assertTrue(cp.ClickabilityofEmail());	
Assert.assertTrue(cp.Clickabilityofcreate());
Assert.assertTrue(cp.Clickabilityofexport());
Assert.assertTrue(cp.ClickabilityofName());
Assert.assertTrue(cp.Clickabilityofrightmark());
Assert.assertTrue(cp.ClickabilityofShowfilter());
Assert.assertTrue(cp.ClickabilityofStatus());
Assert.assertTrue(cp.ClickabilityofView());
Assert.assertTrue(cp.Visibilityofaction());
Assert.assertTrue(cp.VisibilityofAdress());
Assert.assertTrue(cp.VisibilityofCategory());
Assert.assertTrue(cp.Visibilityofcreate());
Assert.assertTrue(cp.VisibilityofEmail());
Assert.assertTrue(cp.Visibilityofexport());
Assert.assertTrue(cp.Visibilityofname());
Assert.assertTrue(cp.VisibilityofOne());
Assert.assertTrue(cp.VisibilityofOption());
Assert.assertTrue(cp.VisibilityofPhone());
Assert.assertTrue(cp.VisibilityofPhone());
Assert.assertTrue(cp.VisibilityofRightmark());
Assert.assertTrue(cp.VisibilityofShowfilter());
Assert.assertTrue(cp.VisibilityofStatus());
Assert.assertTrue(cp.VisibilityofView());
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
