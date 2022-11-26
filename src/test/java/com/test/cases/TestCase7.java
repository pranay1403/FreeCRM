package com.test.cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
		AssertJUnit.assertTrue(bcp.visiabilityOfNextmonthbtn());
		AssertJUnit.assertTrue(bcp.clickabilityOfNextmonthbtn());
		bcp.clickonNextbtn();
		
	}
	@Test(priority=3,description="validate buttons")
	public void validatePreviousbtn() {
		bcp=new BigCalanderHome(driver);
		AssertJUnit.assertTrue(bcp.visiabilityOfPreviousmonthbtn());
		AssertJUnit.assertTrue(bcp.clickabilityOfPreviousmonthbtn());
		bcp.clickOnPreviousbtn();
	}
	@Test(priority=4,description="validate buttons")
	public void validateTodaybtn() {
		bcp=new BigCalanderHome(driver);
		AssertJUnit.assertTrue(bcp.visiabilityOfTodaybtn());
		AssertJUnit.assertTrue(bcp.clickabilityOfTodaybtn());
		bcp.clickabilityOfTodaybtn();
		backword();
	}
	@Test(priority=5,description="validate buttons")
	public void validateMonthbtn() {
		bcp=new BigCalanderHome(driver);
		AssertJUnit.assertTrue(bcp.visiabilityOfMonthbtn());
		AssertJUnit.assertTrue(bcp.clickabilityOfMonthbtn());
	}
	@Test(priority=6,description="validate buttons")
	public void validateWeekbtn() {
		bcp=new BigCalanderHome(driver);
		AssertJUnit.assertTrue(bcp.clickabilityOfWeekbtn());
		AssertJUnit.assertTrue(bcp.visiabilityOfWeekbtn());
		bcp.clickonWeek();
		backword();
		
	}
	@Test(priority=7,description="validate buttons")
	public void validateDaybtn() {
		bcp=new BigCalanderHome(driver);
		AssertJUnit.assertTrue(bcp.visiabilityOfDaybtn());
		AssertJUnit.assertTrue(bcp.clickabilityOfDaybtn());
		bcp.clickonDay();
		backword();
	}
	@Test(priority=8,description="validate buttons")
	public void validateAgendabtn() {
		bcp=new BigCalanderHome(driver);
		AssertJUnit.assertTrue(bcp.visiabilityOfAgendabtn());
		AssertJUnit.assertTrue(bcp.clickabilityOfAgendabtn());
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
