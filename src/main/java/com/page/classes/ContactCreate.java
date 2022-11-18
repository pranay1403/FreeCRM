package com.page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactCreate {

	@FindBy(xpath="//button[text()='Cancel']")
	WebElement cancel ;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement save ;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname ;
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middlename ;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname ;
	
	@FindBy(xpath="//div[@name='company']")
	WebElement company ;
	
	@FindBy(xpath="//div[@class='four wide field']")
	WebElement accessbtn ;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement email ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[3]/button")
	WebElement emailaddbtn ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div")
	WebElement tag ;
	
	@FindBy(name="category")
	WebElement category ;
	
	@FindBy(name="status")
	WebElement status ;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description ;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[1]/div/div/div/div[1]/div")
	WebElement socialchannels ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[1]/div/div/div/div[3]/button")
	WebElement socialaddbtn ;
	
	@FindBy(xpath="//div[@name='timezone']")
	WebElement timezone ;
	
	@FindBy(xpath="//input[@name='address']")
	WebElement adress ;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city ;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state ;
	
	@FindBy(xpath="//input[@name='zip']")
	WebElement postcode ;
	
	@FindBy(xpath="div[name='country']")
	WebElement country ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[6]/button")
	WebElement countryaddbtn ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/div/div[1]/div/input")
	WebElement mobcountry ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/div/div[2]/div/input")
	WebElement number ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/div/div[3]/div/input")
	WebElement numbertype ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/div/div[4]/button")
	WebElement numberaddbtn ;
	
	@FindBy(xpath="//input[@name='position']")
	WebElement position ;
	
	@FindBy(xpath="//input[@name='department']")
	WebElement department ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/input")
	WebElement supervisor ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div/input")
	WebElement assistant ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[10]/div[1]/div/div/input")
	WebElement referredby ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[10]/div[2]/div/div")
	WebElement source ;
	
	@FindBy(xpath="//input[@name='do_not_call']")
	WebElement donotcall ;
	
	@FindBy(xpath="//input[@name='do_not_text']")
	WebElement donottext ;
	
	@FindBy(xpath="//input[@name='do_not_email']")
	WebElement donotemail ;
	
	@FindBy(xpath="//input[@name='day']")
	WebElement day ;
	
	@FindBy(xpath="//div[@name='month']")
	WebElement month ;
	
	@FindBy(xpath="//input[@name='year']")
	WebElement year;
	
	@FindBy(xpath="//input[@name='identifier']")
	WebElement identifier;
	
	@FindBy(xpath="input[name='image'][type='text']")
	WebElement image;
	
	public ContactCreate(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean VisibilityofCancel() {
		boolean s = cancel.isDisplayed();
		return s;
	}
	public boolean Visibilityofsave() {
		boolean s = save.isDisplayed();
		return s;
	}
	public boolean Clickabilityofcancel() {
		boolean s = cancel.isEnabled();
		return s;
	}
	public void enterfirstname() {
		firstname.sendKeys("Rama");
	}
	public void entermiddlename() {
		middlename.sendKeys("Shankar");
	}
	public void enterlastname() {
		lastname.sendKeys("rana");
	}
	
	public void entercompany() {
		company.sendKeys("rana.india.pvt.ltd");
	}
	public void clickonaccessbtn() {
		accessbtn.click();
	}
	public void entertag() {
		tag.sendKeys("1512");
	}
	public void enteremail() {
		email.sendKeys("rama@gmail.com");
	}
	
	public void clickonemailaddbtn() {
		emailaddbtn.click();
	}
	
	public void Selectcategory() {
		category.click();
	}
	
	public void Selectstatus() {
		status.click();
	}
	
	public void enterdescription() {
		description.sendKeys("Communication issue");
	}
	
	public void Selectsocialchannels() {
		 socialchannels.click();
	}
	public void clickonsocialaddbtn() {
		socialaddbtn.click();
	}
	
	public void Selecttimezone() {
		timezone.click();
	}
	
	public void enteradress() {
		adress.sendKeys("wagholi");
	}
	
	public void entercity() {
		city.sendKeys("pune");
	}
	public void enterstate() {
		state.sendKeys("maharastra");
	}
	
	public void enterpostcode() {
		postcode.sendKeys("414412");
	}
	
	public void clickoncountry() {
		country.click();
	}
	
	public void clickoncountryaddbtn() {
		countryaddbtn.click();
	}
	
	public void clickonmobcountry() {
		mobcountry.click();
	}
	public void enternumber() {
		number.sendKeys("1234567890");
	}
	public void enternumbertype() {
		numbertype.sendKeys("Home");
	}
	public void clickonnumberaddbtn() {
		numberaddbtn.click();
	}
	
	public void enterposition() {
		position.sendKeys("QA Er");
	}
	public void enterdepartment() {
		department.sendKeys("Testing");
	}
	
	public void entersupervisor() {
		supervisor.sendKeys("Shankar");
	}
	public void enterassistant() {
		assistant.sendKeys("Shankar");
	}
	
	public void enterreferredby() {
		referredby.sendKeys("Shankar");
	}
	
	public void Selecsource() {
		source.click();
	}
	public void clickondonotcall() {
		donotcall.click();
	}
	public void clickondonottext() {
		donottext.click();
	}
	public void clickondonotemail() {
		donotemail.click();
	}
	public void enterday() {
		day.sendKeys("18");
	}
	
	public void Selectmonth() {
	month.click();
	}
	public void enteryear() {
		year.sendKeys("1995");
	}
	public void enteridentifier() {
		identifier.sendKeys("mol on right hand");
	}
	public boolean Visibilityofimage() {
		boolean s = image.isDisplayed();
		return s;
	}
	
	public void clickonsave() {
	save.click();
	}
	
	
	
	
}

