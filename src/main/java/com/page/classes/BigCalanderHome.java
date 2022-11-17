package com.page.classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.ReadProp;

public class BigCalanderHome {
	@FindBy(xpath = "//i[@class='chevron right icon']//parent::button")
	WebElement nextmonthbtn;
	@FindBy(xpath = "//i[@class='chevron left icon']//parent::button")
	WebElement previousmonthbtn;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/span[2]")
	WebElement actualyearmonth;
	@FindBy(xpath = "//div[@class='rbc-day-bg']")
	List<WebElement> actualdate;
	@FindBy(xpath = "//span[@class='today-button']")
	WebElement today;
	@FindBy(xpath = "//button[@type='button']//span[text()='Month']")
	WebElement month;
	@FindBy(xpath = "//button[@type='button']//span[text()='Week']")
	WebElement week;
	@FindBy(xpath = "//button[@type='button']//span[text()='Day']")
	WebElement day;
	@FindBy(xpath = "//button[@type='button']//span[text()='Agenda']")
	WebElement agenda;
	
	public BigCalanderHome(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean visiabilityOfNextmonthbtn() {
		boolean b=nextmonthbtn.isDisplayed();
		return b;		
	}
	public boolean visiabilityOfPreviousmonthbtn() {
		boolean b=previousmonthbtn.isDisplayed();
		return b;		
	}
	public boolean visiabilityOfActualyearmonth() {
		boolean b=actualyearmonth.isDisplayed();
		return b;		
	}
	public boolean visiabilityOfActualdate() {
		boolean b=true;
		return b;		
	}
	public boolean visiabilityOfTodaybtn() {
		boolean b=today.isDisplayed();
		return b;		
	}
	public boolean visiabilityOfMonthbtn() {
		boolean b=month.isDisplayed();
		return b;		
	}
	public boolean visiabilityOfWeekbtn() {
		boolean b=week.isDisplayed();
		return b;		
	}
	public boolean visiabilityOfDaybtn() {
		boolean b=day.isDisplayed();
		return b;		
	}
	public boolean visiabilityOfAgendabtn() {
		boolean b=agenda.isDisplayed();
		return b;		
	}
	public boolean clickabilityOfNextmonthbtn() {
		boolean e=nextmonthbtn.isEnabled();
		return e;		
	}
	public boolean clickabilityOfPreviousmonthbtn() {
		boolean e=previousmonthbtn.isEnabled();
		return e;		
	}
	public boolean clickabilityOfActualyearmonth() {
		boolean e=actualyearmonth.isEnabled();
		return e;		
	}
	public boolean clickabilityOfTodaybtn() {
		boolean e=today.isEnabled();
		return e;		
	}
	public boolean clickabilityOfMonthbtn() {
		boolean e=month.isEnabled();
		return e;		
	}
	public boolean clickabilityOfWeekbtn() {
		boolean e=week.isEnabled();
		return e;		
	}
	public boolean clickabilityOfDaybtn() {
		boolean e=day.isEnabled();
		return e;		
	}
	public boolean clickabilityOfAgendabtn() {
		boolean e=agenda.isEnabled();
		return e;		
	}
	public void clickOnPreviousbtn() {
		previousmonthbtn.click();
	}
	public void clickonNextbtn() {
		nextmonthbtn.click();
	}
	public void clickonMonth() {
		month.click();
	}
	public void clickonWeek() {
		week.click();
	}
	public void clickonDay() {
		day.click();
	}
	public void clickonAgenda() {
		agenda.click();
	}
	public String actualmonthyear() {
		String s=actualyearmonth.getText();
		return s;
	}
	
	public void selectrandomdate() {
		ReadProp prop=new ReadProp();
		String Expectedmonthyear=prop.ExpectedMonthYear();
		String Expecteddate=prop.ExpectedDate();
		while(true) {
			if(Expectedmonthyear.equals(actualmonthyear())) {
				
				for(WebElement s : actualdate) {
					if(Expecteddate.equals(s.getText())) {
						s.click();
						break;
					}
				}
				
				clickonNextbtn();
				break;
			}
			
			
			}
	}
	
}
