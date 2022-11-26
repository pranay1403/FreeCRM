package com.test.cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.CreateNewDealPage;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
import com.page.classes.ProfilePage;
@Listeners(com.baseclass.ListnerClass.class)
public class TestCase10 extends BaseClass {

	HomePage hp;
	LoginPage lp;
	ProfilePage pp;
	CreateNewDealPage dp;
	@Test(priority = 1)
	public void initialSetup() {
		hp=new HomePage(driver);
		hp.clickonLogIn();
		lp=new LoginPage(driver);
		lp.Entercredentials();
		lp.clickOnloginbtn();
		pp=new ProfilePage(driver);
		pp.clickonDeal();
	}
	@Test(priority = 2,dependsOnMethods = "initialSetup")
	public void validateCreatebtn() {
		dp=new CreateNewDealPage(driver);
//		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
//		w.until(ExpectedConditions.presenceOfElementLocated((By) dp.Create()));
		AssertJUnit.assertTrue(dp.visiabilityofCreate());
		AssertJUnit.assertTrue(dp.clickabilityofCreate());
		dp.clickonCreate();
		
	}
	@Test(priority = 3,dependsOnMethods = "validateCreatebtn")
	public void validateTitle() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofTitle());
		AssertJUnit.assertTrue(dp.clickabilityofTitle());
		dp.clickonTitle();
		dp.EnterTitle();
		
	}
	@Test(priority=4,dependsOnMethods = "validateCreatebtn")
	public void validateAssignTo() {
		dp=new CreateNewDealPage(driver);
//		Assert.assertTrue(dp.visiabilityofAssignto());
//		Assert.assertTrue(dp.clickabilityofAssignTo());
//	    selectDropindex(dp.AssignTo(), 0);
		dp.clickonAssignTo();
		dp.clickonSelectAssignTo();
	    		
	}
	@Test(priority = 5)
	public void validateCompany() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofCompany());
		AssertJUnit.assertTrue(dp.clickabilityofCompany());
		dp.clickonCompany();
		dp.EnterCompany();
		pressEnter(driver, dp.Company());
	}
	@Test(priority=6)
	public void  validateProducts() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofProduct());
		AssertJUnit.assertTrue(dp.clickabilityofProduct());
		dp.clickonProducts();
		dp.EnterProducts();
		pressEnter(driver, dp.Products());
	}
	@Test(priority=7)
	public void validateContacts() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofContacts());
		AssertJUnit.assertTrue(dp.clickabilityofContacts());
		dp.clickonContacts();
		dp.EnterContacts();
		pressEnter(driver, dp.Contacts());
		
	}
	@Test(priority=8)
	public void validateTags() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofTags());
		AssertJUnit.assertTrue(dp.clickabilityofTags());
		dp.clickonTags();
		dp.EnterTags();
		pressEnter(driver, dp.Tags());
		
	}
	@Test(priority=9)
	public void validateProbabiblity() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofProbability());
		AssertJUnit.assertTrue(dp.clickabilityofProbability());
		dp.clickonProbability();
		dp.EnterProbability();
	}
	@Test(priority=10)
	public void validateDescription() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofDescription());
		AssertJUnit.assertTrue(dp.clickabilityofDescription());
		dp.clickabilityofDescription();
		dp.EnterDescription();
	}
	@Test(priority=11)
	public void validateAmount() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofAmount());
		AssertJUnit.assertTrue(dp.clickabilityofAmount());
		dp.clickonAmount();
		dp.EnterAmount();
	}
	@Test(priority=12)
	public void validateCommission() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofCommision());
		AssertJUnit.assertTrue(dp.clickabilityofCommission());
		dp.clickonCommission();
		dp.EnterCommission();
	}
	@Test(priority=13)
	public void validateStage() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofStage());
		AssertJUnit.assertTrue(dp.clickabilityofStage());
//		selectDropindex(dp.Stage(), 2);
		dp.clickonStage();
		dp.clickonSelectStage();
	}
	
	@Test(priority=14)
	public void validateStatus() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofStatus());
		AssertJUnit.assertTrue(dp.clickabilityofStatus());
//		selectDropindex(dp.Status(), 1);
		dp.clickonStatus();
		dp.clickonSelectStatus();
	}
	@Test(priority=15)
	public void validateNextStep() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofNextStep());
		AssertJUnit.assertTrue(dp.clickabilityofNextstep());
		dp.clickonNextSteps();
		dp.EnterNextStep();
	}
	@Test(priority=16)
	public void validateType() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofType());
		AssertJUnit.assertTrue(dp.clickabilityofType());
//		selectDropindex(dp.Type(), 3);
		dp.clickonType();
		dp.clickonSelectType();
	}
	@Test(priority=17)
	public void validateSource() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofSource());
		AssertJUnit.assertTrue(dp.clickabilityofSource());
//		selectDropindex(dp.Source(), 1);
		dp.clickonSource();
		dp.clickonSelectSource();
	}
	@Test(priority=18)
	public void validateIdentifier() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofIdentifier());
		AssertJUnit.assertTrue(dp.clickabilityofIdentifier());
		dp.clickonIdentifier();
		dp.EnterIdentifier();
	}
	
	@Test(priority=19)
	public void validateSavebtn() {
		dp=new CreateNewDealPage(driver);
		AssertJUnit.assertTrue(dp.visiabilityofSave());
		AssertJUnit.assertTrue(dp.clickabilityofSave());
		dp.clickonSave();
	}
	
}
