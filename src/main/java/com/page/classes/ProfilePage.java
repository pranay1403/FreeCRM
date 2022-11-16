package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	@FindBy(xpath="//a[@href='/calendar']")
	WebElement calender;
	
	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contact ;
	
	@FindBy(xpath="//a[@href='/companies']")
	WebElement Company ;
	
	
	
public	ProfilePage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}

public boolean VisibilityofCalender() {
	boolean s = calender.isDisplayed();
	return s ;
}

public boolean VisibilityofContact() {
	boolean s = contact.isDisplayed();
	return s ;
}

public boolean VisibilityofCompanies() {
	boolean s = Company.isDisplayed();
	return s ;
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

public void clickoncalender() {
	calender.click();
}
public void clickoncontact() {
	contact.click();
}
public void clickoncompany() {
	Company.click();
}
}
