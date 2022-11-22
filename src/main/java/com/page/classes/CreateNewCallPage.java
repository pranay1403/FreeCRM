package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCallPage {

	@FindBy(xpath = "//i[@class='edit icon']//parent::button")
	WebElement create;
	
	@FindBy(xpath = "//i[@class='cancel icon']")
	WebElement cancel;

	@FindBy(xpath = "//label[text()='Call Time']/parent::div/div/div/input[@type='text']")
	WebElement calltime;

	@FindBy(xpath = "//label[text()='Start Time']//parent::div//div//div//input[@type='text']")
	WebElement starttime;

	@FindBy(xpath = "//label[text()='Assigned To']//parent::div//div//i")
	WebElement assignto;

	@FindBy(xpath = "//span[text()='Pra Gai']//parent::div[@class='selected item']")
	WebElement selectassign;

	@FindBy(xpath = "//label[text()='Type']//parent::div//div//div[text()='Select']")
	WebElement type;

	@FindBy(xpath = "//span[text()='HANGOUT']//parent::div")
	WebElement selecttype;

	@FindBy(xpath = "//input[@name='duration']")
	WebElement duration;

	@FindBy(xpath = "//div[@name='flag']//child::div[text()]")
	WebElement flag;

	@FindBy(xpath = "//span[text()='Important']//parent::div")
	WebElement selectflag;

	@FindBy(xpath = "//label[@for='tags']//child::div//input")
	WebElement tag;

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement description;

	@FindBy(xpath = "//label[text()='Contacts']//parent::div/div")
	WebElement contact;

	@FindBy(xpath = "//label[text()='Deal']//parent::div/div")
	WebElement deal;

	@FindBy(xpath = "//label[text()='Case']//parent::div/div")
	WebElement cases;

	@FindBy(xpath = "//label[text()='Task']//parent::div/div")
	WebElement task;

	@FindBy(xpath = "//div[@name='hint']")
	WebElement hintcountry;

	@FindBy(xpath = "//span[text()='India']//parent::div")
	WebElement selectindia;

	@FindBy(xpath = "//input[@Placeholder='Number']")
	WebElement number;

	@FindBy(xpath = "//input[@Placeholder='Home, Work, Mobile...']")
	WebElement home;

	@FindBy(xpath = "//button[@class='ui tiny basic icon button']")
	WebElement add;

	@FindBy(xpath = "//input[@name='identifier']")
	WebElement identifier;

	public CreateNewCallPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public boolean visiabilityofCreatebtn() {
		boolean b = create.isDisplayed();
		return b;
	}

	public boolean visiabilityofCalltime() {
		boolean b = calltime.isDisplayed();
		return b;
	}

	public boolean visiabilityofStarttime() {
		boolean b = starttime.isDisplayed();
		return b;
	}

	public boolean visiabilityofAssignto() {
		boolean b = assignto.isDisplayed();
		return b;
	}

	public boolean visiabilityofType() {
		boolean b = type.isDisplayed();
		return b;
	}

	public boolean visiabilityofDuration() {
		boolean b = duration.isDisplayed();
		return b;
	}

	public boolean visiabilityofFlag() {
		boolean b = flag.isDisplayed();
		return b;
	}

	public boolean visiabilityofTags() {
		boolean b = tag.isDisplayed();
		return b;
	}

	public boolean visiabilityofDescription() {
		boolean b = description.isDisplayed();
		return b;
	}

	public boolean visiabilityofContacts() {
		boolean b = contact.isDisplayed();
		return b;
	}

	public boolean visiabilityofDeal() {
		boolean b = deal.isDisplayed();
		return b;
	}

	public boolean visiabilityofTasks() {
		boolean b = task.isDisplayed();
		return b;
	}

	public boolean visiabilityofCase() {
		boolean b = cases.isDisplayed();
		return b;
	}

	public boolean visiabilityofIdentifier() {
		boolean b = identifier.isDisplayed();
		return b;
	}

	public boolean visiabilityofCountry() {
		boolean b = hintcountry.isDisplayed();
		return b;
	}

	public boolean visiabilityofNumber() {
		boolean b = number.isDisplayed();
		return b;
	}

	public boolean visiabilityofHome() {
		boolean b = home.isDisplayed();
		return b;
	}

	public boolean clickabilityofCreate() {
		boolean b = create.isEnabled();
		return b;
	}

	public boolean clickabilityofCalltime() {
		boolean b = calltime.isEnabled();
		return b;
	}

	public boolean clickabilityofStarttime() {
		boolean b = starttime.isEnabled();
		return b;
	}

	public boolean clickabilityofAssignto() {
		boolean b = assignto.isEnabled();
		return b;
	}

	public boolean clickabilityofType() {
		boolean b = type.isEnabled();
		return b;
	}

	public boolean clickabilityofDuration() {
		boolean b = duration.isEnabled();
		return b;
	}

	public boolean clickabilityofFlag() {
		boolean b = flag.isEnabled();
		return b;
	}

	public boolean clickabilityofTags() {
		boolean b = tag.isEnabled();
		return b;
	}

	public boolean clickabilityofDescription() {
		boolean b = description.isEnabled();
		return b;
	}

	public boolean clickabilityofContacts() {
		boolean b = contact.isEnabled();
		return b;
	}

	public boolean clickabilityofDeal() {
		boolean b = deal.isEnabled();
		return b;
	}

	public boolean clickabilityofCase() {
		boolean b = cases.isEnabled();
		return b;
	}

	public boolean clickabilityofTasks() {
		boolean b = task.isEnabled();
		return b;
	}

	public boolean clickabilityofCountry() {
		boolean b = hintcountry.isEnabled();
		return b;
	}

	public boolean clickabilityofNumber() {
		boolean b = number.isEnabled();
		return b;
	}

	public boolean clickabilityofHome() {
		boolean b = home.isEnabled();
		return b;
	}

	public boolean clickabilityofIdentifier() {
		boolean b = identifier.isEnabled();
		return b;
	}

	public void clickoncreate() {
		create.click();
	}
	
	public void clickonCancel() {
		cancel.click();
	}

	public void clickonCalltime() {
		calltime.click();
	}

	public void clickonStarttime() {
		starttime.click();
	}

	public void clickonAssignto() {
		assignto.click();
	}

	public void clickonDuration() {
		duration.click();
	}

	public void clickonType() {
		type.click();
	}

	public void clickonFlag() {
		flag.click();
	}

	public void clickonDescription() {
		description.click();
	}

	public void clickonTags() {
		tag.click();
	}

	public void clickonCase() {
		cases.click();
	}

	public void clickonTask() {
		task.click();
	}

	public void clickonContacts() {
		contact.click();
	}

	public void clickonDeal() {
		deal.click();
	}

	public void clickonCountry() {
		hintcountry.click();
	}

	public void clickonNumber() {
		number.click();
	}

	public void clickonHome() {
		home.click();
	}

	public void clickonIdentifier() {
		identifier.click();
	}

	public void SelectType() {
		selecttype.click();
	}

	public void SelectFlag() {
		selectflag.click();
	}

	public void SelectAssignto() {
		selectassign.click();
	}

	public void SelectCountry() {
		selectindia.click();
	}

	public WebElement Calltime() {
		WebElement s = calltime;
		return s;
	}

	public WebElement Starttime() {
		WebElement s = starttime;
		return s;
	}

	public WebElement Assignto() {
		WebElement s = assignto;
		return s;
	}

	public WebElement Tags() {
		WebElement s = tag;
		return s;
	}

	public WebElement Deal() {
		WebElement s = deal;
		return s;
	}

	public WebElement Task() {
		WebElement s = task;
		return s;
	}

	public WebElement Contact() {
		WebElement s = contact;
		return s;
	}

	public WebElement Identifier() {
		WebElement s = identifier;
		return s;
	}

	public WebElement Case() {
		WebElement s = cases;
		return s;
	}

	public WebElement description() {
		WebElement s = description;
		return s;
	}

	public WebElement Country() {
		WebElement s = hintcountry;
		return s;
	}
	
	public void EnterCallTime() {
		calltime.sendKeys("30/11/2022 16:45");
	}
	
	public void EnterStarttime() {
		starttime.sendKeys("29/11/2022 18:30");
	}
	
	public void EnterDuration() {
		duration.sendKeys("10.00 min");
	}
	
	

}
