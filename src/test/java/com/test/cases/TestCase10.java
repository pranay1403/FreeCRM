package com.test.cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		pp.clickabilityofDeal();
		
	}
	@Test(priority = 2)
	public void validateCreatebtn() {
		dp=new CreateNewDealPage(driver);
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.presenceOfElementLocated((By) dp.Create()));
		Assert.assertTrue(dp.visiabilityofCreate());
		Assert.assertTrue(dp.clickabilityofCreate());
		dp.clickonCreate();
		
	}
	@Test(priority = 3)
	public void validateTitle() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofTitle());
		Assert.assertTrue(dp.clickabilityofTitle());
		dp.clickonTitle();
		dp.EnterTitle();
		
	}
	@Test(priority=4)
	public void validateAssignTo() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofAssignto());
		Assert.assertTrue(dp.clickabilityofAssignTo());
	    selectDropindex(dp.AssignTo(), 0);
	    		
	}
	@Test(priority = 5)
	public void validateCompany() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofCompany());
		Assert.assertTrue(dp.clickabilityofCompany());
		dp.clickonCompany();
		dp.EnterCompany();
		pressEnter(driver, dp.Company());
	}
	@Test(priority=6)
	public void  validateProducts() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofProduct());
		Assert.assertTrue(dp.clickabilityofProduct());
		dp.clickonProducts();
		dp.EnterProducts();
		pressEnter(driver, dp.Products());
	}
	@Test(priority=7)
	public void validateContacts() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofContacts());
		Assert.assertTrue(dp.clickabilityofContacts());
		dp.clickonContacts();
		dp.EnterContacts();
		pressEnter(driver, dp.Contacts());
		
	}
	@Test(priority=8)
	public void validateTags() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofTags());
		Assert.assertTrue(dp.clickabilityofTags());
		dp.clickonTags();
		dp.EnterTags();
		pressEnter(driver, dp.Tags());
		
	}
	@Test(priority=9)
	public void validateProbabiblity() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofProbability());
		Assert.assertTrue(dp.clickabilityofProbability());
		dp.clickonProbability();
		dp.EnterProbability();
	}
	@Test(priority=10)
	public void validateDescription() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofDescription());
		Assert.assertTrue(dp.clickabilityofDescription());
		dp.clickabilityofDescription();
		dp.EnterDescription();
	}
	@Test(priority=11)
	public void validateAmount() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofAmount());
		Assert.assertTrue(dp.clickabilityofAmount());
		dp.clickonAmount();
		dp.EnterAmount();
	}
	@Test(priority=12)
	public void validateCommission() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofCommision());
		Assert.assertTrue(dp.clickabilityofCommission());
		dp.clickonCommission();
		dp.EnterCommission();
	}
	@Test(priority=13)
	public void validateStage() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofStage());
		Assert.assertTrue(dp.clickabilityofStage());
		selectDropindex(dp.Stage(), 2);
		
	}
	@Test(priority=14)
	public void validateStatus() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofStatus());
		Assert.assertTrue(dp.clickabilityofStatus());
		selectDropindex(dp.Status(), 1);
		
	}
	@Test(priority=15)
	public void validateNextStep() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofNextStep());
		Assert.assertTrue(dp.clickabilityofNextstep());
		dp.clickonNextSteps();
		dp.EnterNextStep();
	}
	@Test(priority=16)
	public void validateType() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofType());
		Assert.assertTrue(dp.clickabilityofType());
		selectDropindex(dp.Type(), 3);
	}
	@Test(priority=17)
	public void validateSource() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofSource());
		Assert.assertTrue(dp.clickabilityofSource());
		selectDropindex(dp.Source(), 1);
		
	}
	@Test(priority=18)
	public void validateIdentifier() {
		dp=new CreateNewDealPage(driver);
		Assert.assertTrue(dp.visiabilityofIdentifier());
		Assert.assertTrue(dp.clickabilityofIdentifier());
		dp.clickonIdentifier();
		dp.EnterIdentifier();
	}
	
}
