package com.baseclass;

import org.testng.annotations.DataProvider;

import com.utility.ReadProp;

public class MultipleDataProvider {
	
		ReadProp prop =new ReadProp();
		@DataProvider(name="LoginSet")
		public Object [][] logindata(){
			
			Object [][] loginset=new Object[3][2];
			loginset[0][0]=prop.username();
			loginset[0][1]=prop.password();
			loginset[1][0]=prop.username1();
			loginset[1][1]=prop.password1();
			loginset[2][0]=prop.username2();
			loginset[2][1]=prop.password2();
			
			
			
			
			return loginset;
			
		}
}
