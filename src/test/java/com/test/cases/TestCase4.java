package com.test.cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
	
	@Test(description="Event Add in calender",dependsOnMethods = "initialSetup",priority=2)
	public void addEvents() throws InterruptedException {
		cp=new CalenderPage(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertTrue(cp.visiabilityofCreate());
		cp.clickonCreate();
		AssertJUnit.assertTrue(cp.visiabilityofTitle());
		cp.clickonTitle();
		cp.enterTitle();
		AssertJUnit.assertTrue(cp.visiabilityofCategory());
		cp.clickonCategory();
		AssertJUnit.assertTrue(cp.visiabilityofTags());
		cp.clickonTag();
		cp.enterTags();
		pressEnter(driver, cp.tag());
		AssertJUnit.assertTrue(cp.visiabilityofDiscription());
		cp.clickonDescription();
		cp.enterDescription();
		AssertJUnit.assertTrue(cp.visiabilityofLocation());
		cp.clickonLocation();
		cp.enterLocation();
//     	Assert.assertTrue(cp.visiabilityofAllday());
//		cp.clickonAllday();
//		Assert.assertTrue(cp.visiabilityofDeal());
		cp.clickonDeal();
		cp.enterDealdetails();
		pressEnter(driver, cp.Deal());
		AssertJUnit.assertTrue(cp.visiabilityofCase());
		cp.clickonCase();
		cp.enterCases();
		pressEnter(driver, cp.Case());
		AssertJUnit.assertTrue(cp.visiabilityofTask());
		cp.clickonTask();
		cp.enterTaskDetails();
		pressEnter(driver, cp.Task());
		AssertJUnit.assertTrue(cp.visiabilityofReminder());
		cp.clickonReminder();
		cp.enterReminderTime();
		AssertJUnit.assertTrue(cp.visiabilityofParticipant());
		cp.clickonParticipants();
		cp.enterParticipants();
		pressEnter(driver, cp.Participants());
		AssertJUnit.assertTrue(cp.visiabilityofCompany());
		cp.clickonCompany();
		cp.enterCompany();
		pressEnter(driver, cp.Company());
//		Thread.sleep(2000);
		AssertJUnit.assertTrue(cp.visiabilityofIndentifier());
		cp.clickonIdentifier();
		cp.enterIdentifier();
		pressEnter(driver, cp.Identifier());
		AssertJUnit.assertTrue(cp.visiabilityofSave());
		cp.clickonSave();
	
		Thread.sleep(5000);
		}
	
		@Test(priority = 3,dependsOnMethods = "addEvents")
		public void currPageTitle() {
			
			System.out.println("current page title:"+getTitle());
		}
		
	}

