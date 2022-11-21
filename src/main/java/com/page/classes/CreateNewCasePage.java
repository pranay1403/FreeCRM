package com.page.classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCasePage {
	@FindBy(xpath = "//input[@name='title']")
	private WebElement title;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
	private WebElement assignto;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div")
	private WebElement selectassign;

	@FindBy(xpath = "//div[@name='contact']//child::input[@class]")
	private WebElement contact;

	@FindBy(xpath = "//div[@name='company']//child::input[@class]")
	private WebElement company;

	@FindBy(xpath = "//div[@name='deal']//child::input[@class]")
	private WebElement deal;

	@FindBy(xpath = "//div[@name='type']//child::div[text()]")
	private WebElement type;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div[1]/div/input")
	private WebElement deadline;

	@FindBy(xpath = "//div[text()='November 2022']/parent::div")
	WebElement actualMonthYear;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div")
	List<WebElement> actualDate;

	@FindBy(xpath = "//button[text()='Next Month']")
	WebElement nextmonth;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div/div/input")
	private WebElement closedate;

	@FindBy(xpath = "//span[text()='Technical Support']//parent::div[@name='type']")
	private WebElement selecttype;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/input")
	private WebElement tag;

	@FindBy(xpath = "//div[@name='priority']//child::div[text()]")
	private WebElement priority;

	@FindBy(xpath = "//span[text()='High']//parent::div")
	private WebElement selectpriority;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement description;

	@FindBy(xpath = "//div[@name='status']//child::div[text()]")
	private WebElement status;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div")
	private WebElement selectstatus;

	@FindBy(xpath = "//input[@name='identifier']")
	private WebElement identifier;

	@FindBy(xpath = "//i[@class='save icon']//parent::button")
	private WebElement save;

	@FindBy(xpath = "//i[@class='edit icon']//parent::button")
	private WebElement create;

	public CreateNewCasePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public boolean visiabilityofCreate() {
		boolean b = create.isDisplayed();
		return b;
	}

	public boolean visiabilityofTitle() {
		boolean b = title.isDisplayed();
		return b;
	}

	public boolean visiabilityofAssignTo() {
		boolean b = assignto.isDisplayed();
		return b;
	}

	public boolean visiabilityofContact() {
		boolean b = contact.isDisplayed();
		return b;
	}

	public boolean visiabilityofCompany() {
		boolean b = company.isDisplayed();
		return b;
	}

	public boolean visiabilityofDeal() {
		boolean b = deal.isDisplayed();
		return b;
	}

	public boolean visiabilityofType() {
		boolean b = type.isDisplayed();
		return b;
	}

	public boolean visiabilityofDeadline() {
		boolean b = deadline.isDisplayed();
		return b;
	}

	public boolean visiabilityofClosedate() {
		boolean b = closedate.isDisplayed();
		return b;
	}

	public boolean visiabilityofTag() {
		boolean b = tag.isDisplayed();
		return b;
	}

	public boolean visiabilityofDescription() {
		boolean b = description.isDisplayed();
		return b;
	}

	public boolean visiabilityofPriority() {
		boolean b = priority.isDisplayed();
		return b;
	}

	public boolean visiabilityofStatus() {
		boolean b = status.isDisplayed();
		return b;
	}

	public boolean visiabilityofIdentifier() {
		boolean b = identifier.isDisplayed();
		return b;
	}

	public boolean visiabilityofSave() {
		boolean b = save.isDisplayed();
		return b;
	}

	public boolean clickabilityofCreate() {
		boolean b = create.isEnabled();
		return b;
	}

	public boolean clickabilityofTitle() {
		boolean b = title.isEnabled();
		return b;
	}

	public boolean clickabilityofAssignTo() {
		boolean b = assignto.isEnabled();
		return b;
	}

	public boolean clickabilityofContact() {
		boolean b = contact.isEnabled();
		return b;
	}

	public boolean clickabilityofCompany() {
		boolean b = company.isEnabled();
		return b;
	}

	public boolean clickabilityofDeal() {
		boolean b = deal.isEnabled();
		return b;
	}

	public boolean clickabilityofType() {
		boolean b = type.isEnabled();
		return b;
	}

	public boolean clickabilityofDeadline() {
		boolean b = deadline.isEnabled();
		return b;
	}

	public boolean clickabilityofClosedate() {
		boolean b = closedate.isEnabled();
		return b;
	}

	public boolean clickabilityofTags() {
		boolean b = tag.isEnabled();
		return b;
	}

	public boolean clickabilityofDescripation() {
		boolean b = description.isEnabled();
		return b;
	}

	public boolean clickabilityofPriority() {
		boolean b = priority.isEnabled();
		return b;
	}

	public boolean clickabilityofStatus() {
		boolean b = status.isEnabled();
		return b;
	}

	public boolean clickabilityofIdentifier() {
		boolean b = identifier.isEnabled();
		return b;
	}

	public boolean clickabilityofSave() {
		boolean b = save.isEnabled();
		return b;
	}

	public void clickonCreate() {
		create.click();
	}

	public void clickonTitle() {
		title.click();
	}

	public void clickonAssignTo() {
		assignto.click();
	}

	public void clickonContact() {
		contact.click();
	}

	public void clickonCompany() {
		company.click();
	}

	public void clickonDeal() {
		deal.click();
	}

	public void clickonType() {
		type.click();
	}

	public void clickonDeadline() {
		deadline.click();
	}

	public void clickonClosedate() {
		closedate.click();
	}

	public void clickonTags() {
		tag.click();
	}

	public void clickonDescription() {
		description.click();
	}

	public void clickonPriority() {
		priority.click();
	}

	public void clickonStatus() {
		status.click();
	}

	public void clickonIdentifier() {
		identifier.click();
	}

	public void clickonSave() {
		save.click();
	}

	public void clickonSelectAssignto() {
		selectassign.click();
	}

	public void clickonSelectPriority() {
		selectpriority.click();
	}

	public void clickonSelectStatus() {
		selectstatus.click();
	}

	public void clickonSelectType() {
		selecttype.click();
	}

	public void EnterTitle() {
		title.sendKeys("My first case");
	}

	public void EnterContact() {
		contact.sendKeys("MNJNHH5558");
	}

	public void EnterCompany() {
		company.sendKeys("Wipro.PrivateLTD.Kharadi");
	}

	public void EnterDeal() {
		deal.sendKeys("is the best deal");
	}

	public void EnterTags() {
		tag.sendKeys("Aer3r33");
	}

	public void EnterDescription() {
		description.sendKeys("This case study about our first deal;");
	}

	public void EnterIdentifier() {
		identifier.sendKeys("pranaygaikwadpatil@gmail.com");
	}

	public WebElement Contact() {
		WebElement e = contact;
		return e;
	}

	public WebElement Company() {
		WebElement e = company;
		return e;
	}

	public WebElement Deal() {
		WebElement e = deal;
		return e;
	}

	public WebElement Tags() {
		WebElement e = tag;
		return e;
	}

	public WebElement Deadline() {
		WebElement e = deadline;
		return e;
	}
	
	public WebElement Closedate() {
		WebElement e = closedate;
		return e;
	}
	public String actualMonthYear() {
		String acmy = actualMonthYear.getText();
		return acmy;
	}

	public void clickonNextMonth() {
		nextmonth.click();
	}

	public void EnterDeadline() {
		String expectedDate = "17";
		String expectedMonthYear = "December 2022";
		String actualmonthyear = actualMonthYear();

		while (true) {
			if (actualmonthyear.contains(expectedMonthYear)) {

				for (WebElement s : actualDate) {
					String actualdate = s.getText();
					if (expectedDate.equals(actualdate)) {
						s.click();
						break;
					}
					clickonNextMonth();
					break;
				}

			}

		}

	}
	public void EnterDeadLine() {
		deadline.sendKeys("31/12/2022 16:45");
	}
	
	public void EnterClosedate() {
		closedate.sendKeys("27/12/2022 18:00");
	}
}


