package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.CalenderPage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;
@Listeners(com.baseclass.ListnerClass.class)
public class TestCase4 extends BaseClass {
	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	CalenderPage cp;
	@Test(priority = 1)
	public void initialSetup() {
		hp=new HomePage(driver);
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		pp=new ProfilePage(driver);
		pp.clickoncalender();
	}
	
	@Test(description="Event Add in calender",dependsOnMethods = "initialSetup")
	public void addEvents() {
		cp=new CalenderPage(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(cp.visiabilityofCreate());
		cp.clickonCreate();
		Assert.assertTrue(cp.visiabilityofTitle());
		cp.clickonTitle();
		cp.enterTitle();
		Assert.assertTrue(cp.visiabilityofCategory());
		cp.clickonCategory();
		Assert.assertTrue(cp.visiabilityofTags());
		cp.clickonTag();
		cp.enterTags();
		Assert.assertTrue(cp.visiabilityofDiscription());
		cp.clickonDescription();
		cp.enterDescription();
		Assert.assertTrue(cp.visiabilityofLocation());
		cp.clickonLocation();
		cp.enterLocation();
//     	Assert.assertTrue(cp.visiabilityofAllday());
//		cp.clickonAllday();
//		Assert.assertTrue(cp.visiabilityofDeal());
		cp.clickonDeal();
		cp.enterDealdetails();
//		Assert.assertTrue(cp.visiabilityofCase());
		cp.clickonCase();
		cp.enterCases();
//		Assert.assertTrue(cp.visiabilityofTask());
		cp.clickonTask();
		cp.enterTaskDetails();
//		Assert.assertTrue(cp.visiabilityofReminder());
		cp.clickonReminder();
		cp.enterReminderTime();
//		Assert.assertTrue(cp.visiabilityofParticipant());
		cp.clickonParticipants();
		cp.enterParticipants();
//		Assert.assertTrue(cp.visiabilityofCompany());
		cp.clickonCompany();
		cp.enterCompany();
//		Assert.assertTrue(cp.visiabilityofIndentifier());
		cp.clickonIdentifier();
		cp.enterIdentifier();
//		Assert.assertTrue(cp.visiabilityofSave());
		cp.clickonSave();
		
		
	}
}
