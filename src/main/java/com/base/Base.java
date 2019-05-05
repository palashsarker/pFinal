package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	

	public WebDriver driver;
	public Properties pp;
	
	public WebDriver infoBrowser() throws IOException {
		pp = new Properties();
		FileInputStream ff = new FileInputStream("C:\\Users\\palsa\\eclipse-workspaceNew\\PremierFinal\\src\\main\\resources\\data.properties");
		pp.load(ff);
		String browserName=pp.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\palsa\\eclipse-workspaceNew\\PremierFinal\\AllDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");	
		} else if(browserName.equals("IE")){
			System.setProperty("webdriver.IE.driver", "C:\\Users\\palsa\\eclipse-workspaceNew\\PremierFinal\\AllDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");	
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}


}
