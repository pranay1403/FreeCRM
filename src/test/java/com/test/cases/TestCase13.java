package com.test.cases;

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
		Assert.assertTrue(ncp.visiabilityofCreatebtn());
		Assert.assertTrue(ncp.clickabilityofCreate());
		ncp.clickoncreate();
		ncp.clickonCancel();
		ncp.clickoncreate();
	}

	@Test(priority = 3)
	public void validateCallTime() {
		ncp = new CreateNewCallPage(driver);
		Assert.assertTrue(ncp.clickabilityofCalltime());
		Assert.assertTrue(ncp.visiabilityofCalltime());
		ncp.clickonCalltime();
		ncp.EnterCallTime();

	}

	@Test(priority = 4)
	public void validateStarttime() {
		ncp = new CreateNewCallPage(driver);
		Assert.assertTrue(ncp.clickabilityofStarttime());
		Assert.assertTrue(ncp.visiabilityofStarttime());
		ncp.clickonStarttime();
		ncp.EnterStarttime();
	}

	@Test(priority = 5)
	public void validateAssignTo() {
		ncp = new CreateNewCallPage(driver);
		Assert.assertTrue(ncp.visiabilityofAssignto());
		Assert.assertTrue(ncp.clickabilityofAssignto());
//	    selectDropindex(dp.AssignTo(), 0);
		ncp.clickonAssignto();
		ncp.SelectAssignto();

	}
	
	@Test(priority=6)
	public void validateDuration() {
		ncp=new CreateNewCallPage(driver);
		Assert.assertTrue(ncp.clickabilityofDuration());
		Assert.assertTrue(ncp.visiabilityofDuration());
		ncp.clickonDuration();
		ncp.EnterDuration();
	}
	
	@Test(priority=7)
	public void validateFlag() {
		ncp=new CreateNewCallPage(driver);
		Assert.assertTrue(ncp.clickabilityofFlag());
		Assert.assertTrue(ncp.visiabilityofFlag());
		ncp.clickonFlag();
		ncp.SelectFlag();
	}
	
	@Test(priority=8)
	public void validateType() {
		ncp=new CreateNewCallPage(driver);
		Assert.assertTrue(ncp.clickabilityofType());
		Assert.assertTrue(ncp.visiabilityofType());
		ncp.clickonType();
		ncp.SelectType();
	}

}
