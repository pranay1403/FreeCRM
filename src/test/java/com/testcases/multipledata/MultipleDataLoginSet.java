package com.testcases.multipledata;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.page.classes.HomePage;
import com.page.classes.LoginPage;
@Listeners(com.baseclass.ListnerClass.class)
public class MultipleDataLoginSet extends BaseClass {
	HomePage hp;
	LoginPage lp;
	@Test(priority=1)
	public void intialSetup() {
		hp=new HomePage(driver);
		hp.clickonLogIn();
	}
	
	@Test(dependsOnMethods = "intialSetup" ,dataProviderClass = com.baseclass.MultipleDataProvider.class,dataProvider =  "LoginSet")
	public void multipleSetvalidate(String username,String pass) {
		
		lp=new LoginPage(driver);
		lp.Enterusername(username);
		lp.Enterpassword(pass);
		lp.clickOnloginbtn();
		
	}

}
