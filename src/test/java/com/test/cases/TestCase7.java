package com.test.cases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.BigCalanderHome;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;
@Listeners(com.baseclass.ListnerClass.class)
public class TestCase7 extends BaseClass {
	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	BigCalanderHome bcp;
	
	@Test(priority=1,description = "initial setup for handeling calender")
	public void initialSetup() {
		hp=new HomePage(driver);
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		pp=new ProfilePage(driver);
		pp.clickoncalender();
	}
	@Test(priority=2,description="validate buttons")
	public void validateNextbtn() {
		bcp=new BigCalanderHome(driver);
		Assert.assertTrue(bcp.visiabilityOfNextmonthbtn());
		Assert.assertTrue(bcp.clickabilityOfNextmonthbtn());
		bcp.clickonNextbtn();
		
	}
	@Test(priority=3,description="validate buttons")
	public void validatePreviousbtn() {
		bcp=new BigCalanderHome(driver);
		Assert.assertTrue(bcp.visiabilityOfPreviousmonthbtn());
		Assert.assertTrue(bcp.clickabilityOfPreviousmonthbtn());
		bcp.clickOnPreviousbtn();
	}
	@Test(priority=4,description="validate buttons")
	public void validateTodaybtn() {
		bcp=new BigCalanderHome(driver);
		Assert.assertTrue(bcp.visiabilityOfTodaybtn());
		Assert.assertTrue(bcp.clickabilityOfTodaybtn());
		bcp.clickabilityOfTodaybtn();
		backword();
	}
	@Test(priority=5,description="validate buttons")
	public void validateMonthbtn() {
		bcp=new BigCalanderHome(driver);
		Assert.assertTrue(bcp.visiabilityOfMonthbtn());
		Assert.assertTrue(bcp.clickabilityOfMonthbtn());
	}
	@Test(priority=6,description="validate buttons")
	public void validateWeekbtn() {
		bcp=new BigCalanderHome(driver);
		Assert.assertTrue(bcp.clickabilityOfWeekbtn());
		Assert.assertTrue(bcp.visiabilityOfWeekbtn());
		bcp.clickonWeek();
		backword();
		
	}
	@Test(priority=7,description="validate buttons")
	public void validateDaybtn() {
		bcp=new BigCalanderHome(driver);
		Assert.assertTrue(bcp.visiabilityOfDaybtn());
		Assert.assertTrue(bcp.clickabilityOfDaybtn());
		bcp.clickonDay();
		backword();
	}
	@Test(priority=8,description="validate buttons")
	public void validateAgendabtn() {
		bcp=new BigCalanderHome(driver);
		Assert.assertTrue(bcp.visiabilityOfAgendabtn());
		Assert.assertTrue(bcp.clickabilityOfAgendabtn());
		bcp.clickonAgenda();
		backword();
		
	}
	@Test(priority=9,description="validate calanderFuctionality")
	public void enterRandondate() {
		bcp=new BigCalanderHome(driver);
		bcp.selectrandomdate();
		System.out.println(getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
