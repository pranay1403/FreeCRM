package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.CreateNewCasePage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;
@Listeners(com.baseclass.ListnerClass.class)
public class TestCases11 extends BaseClass {

	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	CreateNewCasePage ncp;

	@Test(priority = 1)
	public void initialSetup() {
		hp = new HomePage(driver);
		hp.clickonLogIn();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp = new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		pp = new ProfilePage(driver);
		pp.clickonCase();
	}

	@Test(priority = 2, dependsOnMethods = "initialSetup")
	public void validateCreatebtn() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofCreate());
		Assert.assertTrue(ncp.clickabilityofCreate());
		ncp.clickonCreate();

	}

	@Test(priority = 3)
	public void validateTitle() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofTitle());
		Assert.assertTrue(ncp.clickabilityofTitle());
		ncp.clickonTitle();
		ncp.EnterTitle();
	}

	@Test(priority = 4)
	public void validateAssignTo() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofAssignTo());
		Assert.assertTrue(ncp.clickabilityofAssignTo());
//	    selectDropindex(dp.AssignTo(), 0);
		ncp.clickonAssignTo();
		ncp.clickonSelectAssignto();
	}

	@Test(priority = 5)
	public void validateContact() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofContact());
		Assert.assertTrue(ncp.clickabilityofContact());
		ncp.clickonContact();
		ncp.EnterContact();
		pressEnter(driver, ncp.Contact());
	}

	@Test(priority = 6)
	public void validateCompany() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofCompany());
		Assert.assertTrue(ncp.clickabilityofCompany());
		ncp.clickonCompany();
		ncp.EnterCompany();
		pressEnter(driver, ncp.Company());

	}

	@Test(priority = 7)
	public void validateDeal() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofDeal());
		Assert.assertTrue(ncp.clickabilityofDeal());
		ncp.clickonDeal();
		ncp.EnterDeal();
		pressEnter(driver, ncp.Deal());
	}

	@Test(priority = 8)
	public void validateType() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofType());
		Assert.assertTrue(ncp.clickabilityofType());
//		selectDropindex(dp.Type(), 3);
		ncp.clickonType();
		ncp.clickonSelectType();
	}

	@Test(priority = 9)
	public void validateTags() {
		ncp = new CreateNewCasePage(driver);

		Assert.assertTrue(ncp.visiabilityofTag());
		Assert.assertTrue(ncp.clickabilityofTags());
		ncp.clickonTags();
		ncp.EnterTags();
		pressEnter(driver, ncp.Tags());
	}

	@Test(priority = 10)
	public void validatePriority() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofPriority());
		Assert.assertTrue(ncp.clickabilityofPriority());
		ncp.clickonPriority();
		ncp.clickonSelectPriority();
	}

	@Test(priority = 11)
	public void validateDescription() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofDescription());
		Assert.assertTrue(ncp.clickabilityofDescripation());
		ncp.clickonDescription();
		ncp.EnterDescription();
	}

	@Test(priority = 12)
	public void validateStatus() {
		ncp = new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofStatus());
		Assert.assertTrue(ncp.clickabilityofStatus());
//		selectDropindex(dp.Status(), 1);
		ncp.clickonStatus();
		ncp.clickonSelectStatus();

	}
	@Test(priority=13)
	public void validateIdentifier() {
		ncp=new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofIdentifier());
		Assert.assertTrue(ncp.clickabilityofIdentifier());
		ncp.clickonIdentifier();
		ncp.EnterIdentifier();
	}
	@Test(priority=16)
	public void validateSavebtn() {
		ncp=new CreateNewCasePage(driver);
		Assert.assertTrue(ncp.visiabilityofSave());
		Assert.assertTrue(ncp.clickabilityofSave());
		ncp.clickonSave();
	}
	
	@Test(dependsOnMethods = "validateCreatebtn",priority = 15)
	public void validateDeadline() {
		ncp=new CreateNewCasePage(driver);
		ncp.clickonDeadline();
		ncp.EnterDeadLine();
		pressEnter(driver, ncp.Deadline());
	}
	
	@Test(priority=14)
	public void validateClosedate() {
		ncp=new CreateNewCasePage(driver);
		ncp.clickonClosedate();
		ncp.EnterClosedate();
		pressEnter(driver, ncp.Closedate());
		
		
		
	}
}
