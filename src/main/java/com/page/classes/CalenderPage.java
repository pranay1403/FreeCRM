package com.page.classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderPage {
    Actions ac;
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	private WebElement create;

	@FindBy(name = "title")
	private WebElement title;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div[1]/div/input")
	private WebElement startdate;

	@FindBy(xpath = "//button[text()='Previous Month']")
	private WebElement previousmonth;

	@FindBy(xpath = "//button[text()='Next Month']")
	private WebElement nextmonth;

	@FindBy(xpath = "//div[@role='option']")
	List<WebElement> date;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div/input")
	private WebElement enddate;

	@FindBy(name = "category")
	private WebElement category;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")
	private WebElement tag;

	@FindBy(name = "description")
	private WebElement description;

	@FindBy(name = "location")
	private WebElement location;

	@FindBy(xpath =  "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div/input")
	private WebElement allday;

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/div/input")
	private WebElement deal;

	@FindBy(xpath ="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[1]/div/div/input")
	private WebElement task;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")
	private WebElement cases;

	@FindBy(name = "reminder_minutes")
	private WebElement reminder;

	@FindBy(xpath="//div[@name='participants']//input[@type='text']")
	private WebElement participant;

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/input")
	private WebElement comp;

	@FindBy(xpath="//input[@name='identifier']")
	private WebElement indentifier;

	@FindBy(xpath = "//span[text()='Meeting']")
	private WebElement meeting;
	
	@FindBy(xpath = "//i[@class='save icon']")
	private WebElement save;

	public CalenderPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	public boolean visiabilityofSave() {
		boolean b=save.isDisplayed();
		return b;
	}
	public boolean visiabilityofCreate() {
		boolean b = create.isDisplayed();
		return b;
	}

	public boolean visiabilityofTitle() {
		boolean b = title.isDisplayed();
		return b;
	}

	public boolean visiabilityofStartdate() {
		boolean b = startdate.isDisplayed();
		return b;
	}

	public boolean visiabilityofEndDate() {
		boolean b = enddate.isDisplayed();
		return b;
	}

	public boolean visiabilityofCategory() {
		boolean b = category.isDisplayed();
		return b;
	}

	public boolean visiabilityofTags() {
		boolean b = tag.isDisplayed();
		return b;
	}

	public boolean visiabilityofDiscription() {
		boolean b = description.isDisplayed();
		return b;
	}

	public boolean visiabilityofLocation() {
		boolean b = location.isDisplayed();
		return b;
	}

	public boolean visiabilityofAllday() {
		boolean b = allday.isDisplayed();
		return b;
	}

	public boolean visiabilityofDeal() {
		boolean b = deal.isDisplayed();
		return b;
	}

	public boolean visiabilityofTask() {
		boolean b = task.isDisplayed();
		return b;
	}

	public boolean visiabilityofCase() {
		boolean b = cases.isDisplayed();
		return b;
	}

	public boolean visiabilityofReminder() {
		boolean b = reminder.isDisplayed();
		return b;
	}

	public boolean visiabilityofParticipant() {
		boolean b = participant.isDisplayed();
		return b;
	}

	public boolean visiabilityofCompany() {
		boolean b = comp.isDisplayed();
		return b;
	}

	public boolean visiabilityofIndentifier() {
		boolean b = indentifier.isDisplayed();
		return b;
	}

	public boolean visiabilityofNextMonth() {
		boolean b = nextmonth.isDisplayed();
		return b;
	}

	public boolean visiabilityofPreviousMonth() {
		boolean b = previousmonth.isDisplayed();
		return b;
	}
	public void clickonSave() {
		save.click();
	}

	public void clickonTitle() {
		title.click();
	}

	public void clickonStartDate() {
		startdate.click();
	}

	public void clickonEndDate() {
		enddate.click();
	}

	public void clickonCategory() {
		category.click();
		meeting.click();
	}

	public void clickonTag() {
		tag.click();
		
	}

	public void clickonDescription() {
		description.click();
	}

	public void clickonLocation() {
		location.click();
	}

	public void clickonAllday() {
		allday.click();
	}

	public void clickonDeal() {
		deal.click();

	}

	public void clickonTask() {
		task.click();
	}

	public void clickonCase() {
		cases.click();
	}

	public void clickonReminder() {
		reminder.click();
	}

	public void clickonParticipants() {
		participant.click();
	}

	public void clickonCompany() {
		comp.click();
	}

	public void clickonIdentifier() {
		indentifier.click();
	}

	public void clickonNextMonth() {
		nextmonth.click();
	}

	public void clickonPreviousMonth() {
		previousmonth.click();
	}
	public void clickonCreate() {
		create.click();
	}
	public void enterTitle() {
		title.sendKeys("Mock Meeting");
	}
	public void enterTags() {
		tag.sendKeys("ASD@#21");
	}
	public void enterDescription() {
		description.sendKeys("This meeting is related to discuss about FreeCRM framework.");
	}
	public void enterLocation() {
		location.sendKeys("A/p-Wagholi,Tal-Haveli,Dist-Pune,Pin-412110");
	}
	public void enterDealdetails() {
	
		deal.sendKeys("Job Assurance Deal");
	}
	public void enterTaskDetails() {
		
		task.sendKeys("Disscussing about Work");
	}
	public void enterCases() {

		cases.sendKeys("12");
		
	}
	public void enterReminderTime() {
	
		reminder.sendKeys("15 Min");
	}
	public void enterParticipants() {
		
		participant.sendKeys("Yogesh and Aniket");
	}
	public void enterCompany() {
	
		comp.sendKeys("Bytesquare Technology Kharadi");
		
	}
	public void enterIdentifier() {
		
		indentifier.sendKeys("14112");
	}
	public WebElement Company() {
		WebElement c=this.comp;
		return c;
	}
	public WebElement tag() {
		WebElement c=this.tag;
		return c;
	}
	public WebElement Task() {
		WebElement c=this.task;
		return c;
	}
	public WebElement Deal() {
		WebElement c=this.deal;
		return c;
	}
	public WebElement Case() {
		WebElement c=this.cases;
		return c;
	}
	public WebElement Participants() {
		WebElement c=this.participant;
		return c;
	}
	public WebElement Identifier() {
		WebElement c=this.indentifier;
		return c;
	}
	

}
