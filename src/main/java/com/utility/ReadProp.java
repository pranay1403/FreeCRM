package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	Properties prop;

	public ReadProp() {

<<<<<<< HEAD
		String path = "E:\\eclipse-workspace4\\com.FreeCRM\\Configfile\\testdata.properties";
=======
		String path = "E:\\Crm framework\\FreeCRM\\Configfile\\testdata.properties";
>>>>>>> 60378a28f9276207e731e284d02d2bf7e95e5317
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

}
