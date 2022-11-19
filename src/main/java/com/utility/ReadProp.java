package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	Properties prop;

	public ReadProp() {


		String path = "E:\\eclipse-workspace4\\com.FreeCRM\\Configfile\\testdata.properties";



		prop = new Properties();

		try {
			FileInputStream file = new FileInputStream(path);
			prop.load(file);
		} catch (IOException E) {
			E.printStackTrace();
		}
	}
	public String url() {
		String url=prop.getProperty("url");
		return url;
	}
	public String browser() {
		String browser=prop.getProperty("browser");
		return browser;
	}
	public String username() {
		String username=prop.getProperty("username");
		return username;
	}
	public String password() {
		String password=prop.getProperty("password");
		return password;
	}
	public String ExpectedMonthYear() {
		String v=prop.getProperty("ExpextedMonthYear");
		return v;
	}
	public String ExpectedDate() {
		String v=prop.getProperty("ExpectedDate");
		return v;
	}

}
