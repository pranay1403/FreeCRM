package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage {
	WebDriver driver;
	
	@FindBy(xpath="//div[@name='view']")
	WebElement View ;
	
	@FindBy(xpath="//button[text()= 'Show Filters']")
	WebElement ShowFilter;
    
	@FindBy(xpath="//button[text()= 'Export']")
	WebElement Export;
	
	@FindBy(xpath="//button[text()= 'Create']")
	WebElement Create;
	
	@FindBy(xpath="//div[@name= 'action']")
	WebElement Action;
	
	@FindBy(xpath="//div[@role= 'button']")
	WebElement Click;
	
	@FindBy(xpath="//th[text()= 'Name']")
	WebElement Name;
	
	@FindBy(xpath="//th[text()= 'Address']")
	WebElement Address;
	
	@FindBy(xpath="//a[text()='1']")
	WebElement NumberActive;
	
	
	
	public CompaniesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean VisibillityofView() {
		boolean d = View.isDisplayed();
		return d;
	}
	
	public boolean VisibillityofShowFilter() {
		boolean e = ShowFilter.isDisplayed();
		return e;
	}
	
	public boolean VisibillityofExport() {
		boolean f = Export.isDisplayed();
		return f;
	}
	
	public boolean VisibillityofCreate() {
		boolean g = Create.isDisplayed();
		return g;
	}
	
	public boolean VisibillityofName() {
		boolean h = Name.isDisplayed();
		return h;
	}
	
	public boolean VisibillityofAddress() {
		boolean i = Address.isDisplayed();
		return i;
	}
	
	public boolean VisibillityofNumberActive() {
		boolean j = NumberActive.isDisplayed();
		return j;
	}
	
	public boolean ClickabillityofView() {
		boolean k = View.isEnabled();
		return k;
	}
	
	public boolean ClickabillityofShowFilter() {
		boolean l = ShowFilter.isEnabled();
		return l;
	}
	
	public boolean ClickabillityofExport() {
		boolean m = Export.isEnabled();
		return m;
	}
	
	public boolean ClickabillityofCreate() {
		boolean n = Create.isEnabled();
		return n;
	}
	
	public boolean ClickabillityofName() {
		boolean o = Name.isEnabled();
		return o;
	}
	
	public boolean ClickabillityofAddress() {
		boolean p = Address.isEnabled();
		return p;
	}
	
	public boolean ClickabillityofNumberActive() {
		boolean q = NumberActive.isEnabled();
		return q;
	}
	
	public void ClickonView() {
		View.click();
	}
	
	public void CliockonShowFilter() {
		ShowFilter.click();
	}
	
	public void CliockonExport() {
		Export.click();
	}
	
	public void CliockonCreate() {
		Create.click();
	}
	public void CliockonName() {
		Name.click();
	}
	public void CliockonAddress() {
		Address.click();
	}
	public void CliockonNumberActive() {
		NumberActive.click();
	}
	
	public String PageTitle() {
		String a = driver.getTitle();
		return a;
				
	}
	
	
	
	
}
