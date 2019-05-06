package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	

	public static WebDriver driver;
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
	public void picture(String uu) throws IOException {
		File ff=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ff, new File("C:\\Users\\palsa\\Desktop\\md\\"+uu+"photo.png"));
	}

}
