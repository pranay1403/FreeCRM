package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[@name='view']")
	WebElement view;
	
	@FindBy(xpath="//button[text()='Show Filters']")
	WebElement showfilter;
	
	@FindBy(xpath="//button[text()='Export']")
	WebElement export;
	
	@FindBy(xpath="//div[@name='action']")
	WebElement action;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement creat;

	@FindBy(xpath="//th[text()='Name']")
	WebElement name;
	
	@FindBy(xpath="//th[text()='Address']")
	WebElement adress;
	
	@FindBy(xpath="//th[text()='Category']")
	WebElement category;
	
	@FindBy(xpath="//th[text()='Status']")
	WebElement status;
	
	@FindBy(xpath="//th[text()='Phone']")
	WebElement phone;
	
	@FindBy(xpath="//th[text()='Email']")
	WebElement email;
	
	@FindBy(xpath="//th[text()='Options']")
	WebElement options;
	
	@FindBy(xpath="//div[@class='ui basic icon left attached button']")
	WebElement rightmark;
	
	@FindBy(xpath="//a[text()='1']")
	WebElement one;
	
	public ContactPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean VisibilityofView() {
	boolean	s = view.isDisplayed();
	return s;
	}

public 	boolean VisibilityofShowfilter() {
		boolean	s = showfilter.isDisplayed();
		return s;
		}	
public	boolean Visibilityofexport() {
		boolean	s = export.isDisplayed();
		return s;
		}	
public	boolean Visibilityofaction() {
		boolean	s = action.isDisplayed();
		return s;
		}	
	
public	boolean Visibilityofcreate() {
		boolean	s = creat.isDisplayed();
		return s;
		}	
	
public boolean ClickabilityofView() {
		boolean	s = view.isEnabled();
		return s;
		}
	
public	boolean ClickabilityofShowfilter() {
		boolean	s = showfilter.isEnabled();
		return s;
		}	
public	boolean Clickabilityofexport() {
		boolean	s = export.isEnabled();
		return s;
		}	
public	boolean Clickabilityofaction() {
		boolean	s = action.isEnabled();
		return s;
		}
public	boolean Clickabilityofcreate() {
		boolean	s = creat.isEnabled();
		return s;
		}	
public	boolean Visibilityofname() {
		boolean	s =name.isDisplayed();
		return s;
		}	
public	boolean ClickabilityofName() {
		boolean	s = name.isEnabled();
		return s;
		}	
public	boolean VisibilityofAdress() {
		boolean	s =adress.isDisplayed();
		return s;
		}	

	
public	boolean VisibilityofCategory() {
		boolean	s =category.isDisplayed();
		return s;
		}	
public	boolean ClickabilityofCategory() {
		boolean	s = category.isEnabled();
		return s;
		}
public	boolean VisibilityofStatus() {
		boolean	s =status.isDisplayed();
		return s;
		}	
public	boolean ClickabilityofStatus() {
		boolean	s = status.isEnabled();
		return s;
		}
	
public	boolean VisibilityofPhone() {
		boolean	s =phone.isDisplayed();
		return s;
		}	
	
public	boolean VisibilityofEmail() {
		boolean	s =email.isDisplayed();
		return s;
		}	
public	boolean ClickabilityofEmail() {
		boolean	s = email.isEnabled();
		return s;
		}
	
public	boolean VisibilityofOption() {
		boolean	s =options.isDisplayed();
		return s;
		}	

	
public	boolean VisibilityofRightmark() {
		boolean	s =rightmark.isDisplayed();
		return s;
		}	
public	boolean Clickabilityofrightmark() {
		boolean	s =rightmark.isEnabled();
		return s;
		}
public	boolean VisibilityofOne() {
		boolean	s =one.isDisplayed();
		return s;
		}	
	
	
	public void ClickonCreate() {
		creat.click();
	}
	
	public String Gettitle() {
		String s = driver.getTitle();
		return s;
	}
	
	
	
}



