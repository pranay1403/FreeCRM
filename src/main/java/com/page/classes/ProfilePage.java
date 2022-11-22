package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	@FindBy(xpath = "//a[@href='/calendar']")
	WebElement calender;

	@FindBy(xpath = "//a[@href='/contacts']")
	WebElement contact;

	@FindBy(xpath = "//a[@href='/companies']")
	WebElement Company;

	@FindBy(xpath = "//a [@href='/deals']")
	WebElement deal;
	
	@FindBy(xpath = "//a[@href='/cases']")
	WebElement cases;
	
	@FindBy(xpath = "//a [@href='/calls']")
	WebElement call;
	
	@FindBy(xpath = "//i[@class='edit icon']//parent::button[@class='ui linkedin button']")
	WebElement createcomp;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input")
	WebElement name;
	
	@FindBy(xpath = "//i[@class='cancel icon']/parent::button")
	WebElement cancalcomp;
	
	public ProfilePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public boolean VisibilityofCalender() {
		boolean s = calender.isDisplayed();
		return s;
	}

	public boolean VisibilityofContact() {
		boolean s = contact.isDisplayed();
		return s;
	}

	public boolean VisibilityofCompanies() {
		boolean s = Company.isDisplayed();
		return s;
	}
	public boolean VisibilityofDeal() {
		boolean s = deal.isDisplayed();
		return s;
	}
	public boolean VisibilityofCases() {
		boolean s = cases.isDisplayed();
		return s;
	}
	
	public boolean VisibilityofCall() {
		boolean s = call.isDisplayed();
		return s;
	}

	public boolean clickabilityofCalender() {
		boolean s = calender.isEnabled();
		return s;
	}

	public boolean clickabilityofContact() {
		boolean s = contact.isEnabled();
		return s;
	}

	public boolean clickabilityofCompanies() {
		boolean s = Company.isEnabled();
		return s;
	}
	public boolean clickabilityofDeal() {
		boolean s = deal.isEnabled();
		return s;
	}
	public boolean clickabilityofCase() {
		boolean s = cases.isEnabled();
		return s;
	}
	
	public boolean clickabilityofCall() {
		boolean s = call.isEnabled();
		return s;
	}

	public void clickoncalender() {
		calender.click();
	}

	public void clickoncontact() {
		contact.click();
	}

	public void clickoncompany() {
		Company.click();
	}
	
	public void clickonDeal() {
		deal.click();
	}
	public void clickonCase() {
		cases.click();
	}
	
	public void clickonCall() {
		call.click();
	}
	public void clickonCreateComp() {
		createcomp.click();
	}
	public void clickonName() {
		name.click();
	}
	public void Entername() {
		name.sendKeys("Wagholi pvt.");
	}
	public WebElement name() {
		WebElement n=name;
		return n;
	}
	public void clickonCancalComp() {
		cancalcomp.click();
	}
}
