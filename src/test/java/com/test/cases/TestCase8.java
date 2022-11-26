package com.test.cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.ContactCreate;
import com.page.classes.ContactPage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;
@Listeners(com.baseclass.ListnerClass.class)

public class TestCase8 extends BaseClass {

	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	ContactPage cp;
	ContactCreate cm;
	
	@Test(priority=1)
	public void intialsetup() {
		hp=new HomePage(driver);
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();

		pp= new ProfilePage(driver);
		pp.clickoncontact();
		cp = new ContactPage(driver);
		cp.ClickonCreate();
		}
	
	@Test(priority=2)
	public void Visibilityofcancel() {
		cm = new ContactCreate(driver);
		AssertJUnit.assertTrue(cm.VisibilityofCancel());
		AssertJUnit.assertTrue(cm.Clickabilityofcancel());
		AssertJUnit.assertTrue(cm.Visibilityofsave());
	}
	
	@Test(priority=3)
	public void entercred() throws InterruptedException {
		cm = new ContactCreate(driver);
		cm.enterfirstname();
		cm.entermiddlename();
		cm.enterlastname();
		
//		cm.entercompany();
		cm.clickonaccessbtn();
//		cm.entertag();
		cm.enteremail();
//		cm.clickonemailaddbtn();
		cm.Selectcategory();
		cm.Selectstatus();
		cm.enterdescription();
		cm.Selectsocialchannels();
		cm.clickonsocialaddbtn();
		cm.Selecttimezone();
		cm.enteradress();
		cm.entercity();
		cm.enterstate();
		cm.enterpostcode();
//		cm.clickoncountry();
//		cm.clickoncountryaddbtn();
//		cm.clickonmobcountry();
		cm.enternumber();
		cm.enternumbertype();
		cm.clickonnumberaddbtn();
		cm.enterposition();
		cm.enterdepartment();
		cm.entersupervisor();
		cm.enterassistant();
//		cm.enterreferredby();
//		cm.Selecsource();
//		cm.clickondonotcall();
//		cm.clickondonottext();
//		cm.clickondonotemail();
		cm.enterday();
//		cm.Selectmonth();
		cm.enteryear();
//		cm.enteridentifier();
//		cm.Visibilityofimage();
	}
	
	@Test(dependsOnMethods="entercred",priority=4)
	public void clickonsave() {
		cm = new ContactCreate(driver);
		cm.clickonsave();
	}

	
	
	
}
