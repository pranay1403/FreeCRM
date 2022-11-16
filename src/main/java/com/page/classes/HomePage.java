package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(xpath = "//a[text()='Sign Up']")
	private WebElement signup;

	@FindBy(xpath = "//a[text()='Pricing']")
	private WebElement pricing;

	@FindBy(xpath = "//a[text()='Features']")
	private WebElement features;

	@FindBy(xpath = "//a[text()='Customers']")
	private WebElement customer;

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactus;

	@FindBy(xpath = "//img[@src='https://freecrm.com/images/freecrm_logo.png']")
	private WebElement logo;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean visiabilityOflogo() {
		boolean b = logo.isDisplayed();
		return b;
	}

	public boolean visiabilityOfLogin() {
		boolean b = login.isDisplayed();
		return b;
	}

	public boolean visiabilityOfSignUp() {
		boolean b = signup.isDisplayed();
		return b;
	}

	public boolean visiabilityOfPricing() {
		boolean b = pricing.isDisplayed();
		return b;
	}

	public boolean visiabilityOfcontactus() {
		boolean b = contactus.isDisplayed();
		return b;
	}

	public boolean visiabilityOfFeatures() {
		boolean b = features.isDisplayed();
		return b;
	}

	public boolean visiabilityOfCustomer() {
		boolean b = customer.isDisplayed();
		return b;
	}

	public void clickonLogIn() {
		login.click();
	}

	public void clickonlogo() {
		logo.click();
	}

	public void clickonSignUp() {
		signup.click();
	}

	public void clickonCustomer() {
		customer.click();
	}

	public void clickonFeatures() {
		features.click();
	}

	public void clickonpricing() {
		pricing.click(); 
	}

	public void clickonContactUs() {
		contactus.click();
	}
	public String getTile() {
		String s=driver.getTitle();
		return s;
	}

}
