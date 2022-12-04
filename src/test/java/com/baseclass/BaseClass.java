package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.utility.ReadProp;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	Select sc;
	public static WebDriver driver;
	ReadProp prop = new ReadProp();
	String browser = prop.browser();
	String url = prop.url();

	@BeforeTest(alwaysRun = true)
	public void BrowserStart() {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Wrong Input");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public void captureScreenShot(WebDriver driver, String testName) throws IOException {
		// step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot) driver);

		// step2: call getScreenshotAs method to create image file

		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());

		File src = screenshot.getScreenshotAs(OutputType.FILE);

		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + timestamp + ".png");

		// step3: copy image file to destination
		FileUtils.copyFile(src, dest);

	}

	public void backword() {
		driver.navigate().back();
	}

	public void pressEnter(WebDriver driver, WebElement e) {
		Actions ac = new Actions(driver);
		ac.moveToElement(e).keyDown(Keys.ENTER).build().perform();
	}

	public void pressControl(WebDriver driver, WebElement e) {
		Actions ac = new Actions(driver);
		ac.moveToElement(e).keyDown(Keys.CONTROL).build().perform();
	}

	public void pressTabs(WebDriver driver, WebElement e) {
		Actions ac = new Actions(driver);
		ac.moveToElement(e).keyDown(Keys.TAB).build().perform();
	}
	public void selectDropindex(WebElement e,int i) {
		sc=new Select(e);
		sc.selectByIndex(i);
	}
	public void selectDropvisibletext( WebElement e, String s) {
		sc=new Select(e);
		sc.selectByVisibleText(s);
	}
	public void selectDropbyvalue( WebElement e,String s) {
		sc=new Select(e);
		sc.selectByValue(s);
	}

	public String getTitle() {
		String s = driver.getTitle();
		return s;
	}

	@AfterTest()
	public void browserTearUp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
