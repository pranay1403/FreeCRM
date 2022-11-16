package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.ReadProp;

public class LoginPage {
	ReadProp prop=new ReadProp();
	String username=prop.username();
	String pass=prop.password();
	

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginbtn;

	@FindBy(xpath = "//a[text()='Sign Up']")
	private WebElement signup;

	@FindBy(xpath = "//a[text()='Forgot your password?']")
	private WebElement forgotpass;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public boolean visiabilityOfEmail() {
		boolean b = email.isDisplayed();
		return b;
	}

	public boolean visiabilityOfPassword() {
		boolean b = password.isDisplayed();
		return b;
	}

	public boolean visiabilityOfloginbtn() {
		boolean b = loginbtn.isDisplayed();
		return b;
	}

	public boolean visiabilityOfForgotPass() {
		boolean b = forgotpass.isDisplayed();
		return b;
	}

	public boolean visiabilityOfSignUp() {
		boolean b = signup.isDisplayed();
		return b;
	}

	public void clickOnloginbtn() {
		loginbtn.click();
	}

	public void clickOnForgotpass() {
		forgotpass.click();
	}

	public void clickOnSignUp() {
		signup.click();
	}
	public void clickOnEmail() {
		email.click();
	}
	public void clickonPassword() {
		password.click();
	}
	public void Entercredentials() {
		email.sendKeys(username);
		password.sendKeys(pass);
	}

}
