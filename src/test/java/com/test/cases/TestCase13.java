package com.test.cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.CreateNewCallPage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;
@Listeners(com.baseclass.ListnerClass.class)
public class TestCase13 extends BaseClass {

	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	CreateNewCallPage ncp;

	@Test(priority = 1)
	public void initialSetup() {
		hp = new HomePage(driver);
		hp.clickonLogIn();
	
		lp = new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		pp = new ProfilePage(driver);
		pp.clickonCall();
	}

	@Test(priority = 2, dependsOnMethods = "initialSetup")
	public void validateCreatebtn() {
		ncp = new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.visiabilityofCreatebtn());
		AssertJUnit.assertTrue(ncp.clickabilityofCreate());
		ncp.clickoncreate();
		ncp.clickonCancel();
		ncp.clickoncreate();
	}

	@Test(priority = 3)
	public void validateCallTime() {
		ncp = new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofCalltime());
		AssertJUnit.assertTrue(ncp.visiabilityofCalltime());
		ncp.clickonCalltime();
		ncp.EnterCallTime();
		pressEnter(driver, ncp.Calltime());

	}

	@Test(priority = 4)
	public void validateStarttime() {
		ncp = new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofStarttime());
		AssertJUnit.assertTrue(ncp.visiabilityofStarttime());
		ncp.clickonStarttime();
		ncp.EnterStarttime();
		pressEnter(driver, ncp.Starttime());
	}

	@Test(priority = 5)
	public void validateAssignTo() {
		ncp = new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.visiabilityofAssignto());
		AssertJUnit.assertTrue(ncp.clickabilityofAssignto());
//	    selectDropindex(dp.AssignTo(), 0);
		ncp.clickonAssignto();
		ncp.SelectAssignto();

	}
	
	@Test(priority=6)
	public void validateDuration() {
		ncp=new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofDuration());
		AssertJUnit.assertTrue(ncp.visiabilityofDuration());
		ncp.clickonDuration();
		ncp.EnterDuration();
	}
	
	@Test(priority=7)
	public void validateFlag() {
		ncp=new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofFlag());
		AssertJUnit.assertTrue(ncp.visiabilityofFlag());
		ncp.clickonFlag();
		ncp.SelectFlag();
	}
	
	@Test(priority=8)
	public void validateType() {
		ncp=new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofType());
		AssertJUnit.assertTrue(ncp.visiabilityofType());
		ncp.clickonType();
		ncp.SelectType();
	}
	
	@Test(priority=9)
	public void validateTag() {
		ncp=new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofTags());
		AssertJUnit.assertTrue(ncp.visiabilityofTags());
		ncp.clickonTags();
		ncp.EnterTag();
		pressEnter(driver, ncp.Tags());

	}
	
	@Test(priority=10)
	public void validateDescription() {
		ncp=new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofDescription());
		AssertJUnit.assertTrue(ncp.visiabilityofDescription());
		ncp.clickonDescription();
		ncp.EnterDescription();
		
	}
	
	@Test(priority=11)
	public void validateContacts() {
		ncp=new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofContacts());
		AssertJUnit.assertTrue(ncp.visiabilityofContacts());
		ncp.clickonContacts();
		ncp.EnterContacts();
		pressEnter(driver, ncp.Contact());
	}
	
	@Test(priority=12)
	public void validateDeal() {
		ncp=new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofDeal());
		AssertJUnit.assertTrue(ncp.visiabilityofDeal());
		ncp.clickonDeal();
		ncp.EnterDeal();
		pressEnter(driver, ncp.Deal());
		
	}
	
	@Test(priority=13)
	public void validateCase() {
		ncp=new CreateNewCallPage(driver);
		AssertJUnit.assertTrue(ncp.clickabilityofCase());
		AssertJUnit.assertTrue(ncp.visiabilityofCase());
		ncp.clickonCase();
		ncp.EnterCase();
		pressEnter(driver, ncp.Case());
	}
		
		
		
		
		
		
		
		
}
