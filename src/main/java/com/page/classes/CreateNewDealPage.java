package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewDealPage {
    @FindBy(xpath = "//button [@class='ui linkedin button']//child::i[@class='edit icon']")
    private WebElement create;
    
	@FindBy(xpath = "//input[@name='title']")
	private WebElement title;

	@FindBy(xpath = "//div[@class='ui active visible fluid multiple selection dropdown']")
	private WebElement assign;

	@FindBy(xpath = "//div[@name='company']//child::input")
	private WebElement company;

	@FindBy(xpath = "//div[@name='products']//child::input")
	private WebElement product;

	@FindBy(xpath = "//div[@name='contacts']//child::input")
	private WebElement contact;

	@FindBy(xpath = "//div[@class='ui active visible fluid multiple search selection dropdown']")
	private WebElement tag;

	@FindBy(xpath = "//input[@name='probability']")
	private WebElement probability;

	@FindBy(xpath = "//textarea [@name='description']")
	private WebElement description;

	@FindBy(xpath = "//input [@name='amount']")
	private WebElement amount;

	@FindBy(xpath = "//input [@name='commission']")
	private WebElement commision;

	@FindBy(xpath = "//div [@name='stage']//child::div[text()]")
	private WebElement stage;

	@FindBy(xpath = "//div [@name='status']//child::div[text()]")
	private WebElement status;

	@FindBy(xpath = "//textarea [@name='next_step']")
	private WebElement nextstep;

	@FindBy(xpath = "//div [@name='type']//child::div[text()]")
	private WebElement type;

	@FindBy(xpath = "//div [@name='source']//child::div[text()]")
	private WebElement source;

	@FindBy(xpath = "//input [@name='identifier']")
	private WebElement identifier;

	public CreateNewDealPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
    
	public boolean visiabilityofCreate() {
		boolean b=create.isDisplayed();
		return b;
	}
	public boolean visiabilityofTitle() {
		boolean b = title.isDisplayed();
		return b;
	}

	public boolean visiabilityofAssignto() {
		boolean b = assign.isDisplayed();
		return b;
	}

	public boolean visiabilityofCompany() {
		boolean b = company.isDisplayed();
		return b;
	}

	public boolean visiabilityofProduct() {
		boolean b = product.isDisplayed();
		return b;
	}

	public boolean visiabilityofContacts() {
		boolean b = contact.isDisplayed();
		return b;
	}

	public boolean visiabilityofTags() {
		boolean b = tag.isDisplayed();
		return b;
	}

	public boolean visiabilityofProbability() {
		boolean b = probability.isDisplayed();
		return b;
	}

	public boolean visiabilityofDescription() {
		boolean b = description.isDisplayed();
		return b;
	}

	public boolean visiabilityofAmount() {
		boolean b = amount.isDisplayed();
		return b;
	}

	public boolean visiabilityofCommision() {
		boolean b = commision.isDisplayed();
		return b;
	}

	public boolean visiabilityofStage() {
		boolean b = stage.isDisplayed();
		return b;
	}

	public boolean visiabilityofStatus() {
		boolean b = status.isDisplayed();
		return b;
	}

	public boolean visiabilityofNextStep() {
		boolean b = nextstep.isDisplayed();
		return b;
	}

	public boolean visiabilityofType() {
		boolean b = type.isDisplayed();
		return b;
	}

	public boolean visiabilityofSource() {
		boolean b = source.isDisplayed();
		return b;
	}

	public boolean visiabilityofIdentifier() {
		boolean b = identifier.isDisplayed();
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
		boolean b = assign.isEnabled();
		return b;
	}

	public boolean clickabilityofCompany() {
		boolean b = company.isEnabled();
		return b;
	}

	public boolean clickabilityofProduct() {
		boolean b = product.isEnabled();
		return b;
	}

	public boolean clickabilityofContacts() {
		boolean b = contact.isEnabled();
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

	public boolean clickabilityofProbability() {
		boolean b = probability.isEnabled();
		return b;
	}

	public boolean clickabilityofAmount() {
		boolean b = amount.isEnabled();
		return b;
	}

	public boolean clickabilityofCommission() {
		boolean b = commision.isEnabled();
		return b;
	}

	public boolean clickabilityofStage() {
		boolean b = stage.isEnabled();
		return b;
	}

	public boolean clickabilityofStatus() {
		boolean b = status.isEnabled();
		return b;
	}

	public boolean clickabilityofNextstep() {
		boolean b = nextstep.isEnabled();
		return b;
	}

	public boolean clickabilityofType() {
		boolean b = type.isEnabled();
		return b;
	}

	public boolean clickabilityofSource() {
		boolean b = source.isEnabled();
		return b;
	}

	public boolean clickabilityofIdentifier() {
		boolean b = identifier.isEnabled();
		return b;
	}
	
	public void clickonCreate() {
		create.click();
	}

	public void clickonTitle() {
		title.click();
	}

	public void clickonAssignTo() {
		assign.click();
	}

	public void clickonCompany() {
		company.click();
	}

	public void clickonProducts() {
		product.click();
	}

	public void clickonContacts() {
		contact.click();
	}

	public void clickonTags() {
		tag.click();
	}

	public void clickonDescription() {
		description.click();
	}

	public void clickonProbability() {
		probability.click();
	}

	public void clickonAmount() {
		amount.click();
	}

	public void clickonCommission() {
		commision.click();
	}

	public void clickonStage() {
		stage.click();
	}

	public void clickonStatus() {
		status.click();
	}

	public void clickonNextSteps() {
		nextstep.click();
	}

	public void clickonType() {
		type.click();
	}

	public void clickonSource() {
		source.click();
	}

	public void clickonIdentifier() {
		identifier.click();
	}
	public WebElement AssignTo() {
		WebElement b=assign;
		return b;
	}
	public WebElement Stage() {
		WebElement b=stage;
		return b;
	}
	public WebElement Status() {
		WebElement b=status;
		return b;
	}
	public WebElement Type() {
		WebElement b=type;
		return b;
	}
	public WebElement Source() {
		WebElement b=source;
		return b;
	}
	public WebElement Company() {
		WebElement b=company;
		return b;
	}
	public WebElement Contacts() {
		WebElement b=contact;
		return b;
	}
	public WebElement Products() {
		WebElement b=product;
		return b;
	}
	public WebElement Tags() {
		WebElement b=tag;
		return b;
	}
	public WebElement Create() {
		WebElement c=this.create;
		return c;
	}
	public void EnterTitle() {
		title.sendKeys("My First Deal.");
	}
	public void EnterCompany() {
		company.sendKeys("ByteSquareTech,Kharadi");
	}
	public void EnterProducts() {
		product.sendKeys("Service base");
	}
	public void EnterContacts() {
		contact.sendKeys("MH124534");
	}
	public void EnterTags() {
		tag.sendKeys("AQWE1541");
	}
	public void EnterDescription() {
		description.sendKeys("To deal about new technology develope in the market");
	}
	public void EnterProbability() {
		probability.sendKeys("96.3");
	}
	public void EnterNextStep() {
		nextstep.sendKeys("To final meeting arrange in next week");
	}
	public void EnterIdentifier() {
		identifier.sendKeys("Red Shirt and Blue Pant.");
	}
	public void EnterAmount() {
		amount.sendKeys("100000");
		
	}
	public void EnterCommission() {
		commision.sendKeys("5000");
	}
}
