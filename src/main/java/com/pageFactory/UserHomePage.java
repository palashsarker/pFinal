package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"mainNav\"]/nav/ul/li[1]/div[1]") WebElement act;
	@FindBy(xpath="//*[@id=\"mainNav\"]/nav/ul/li[1]/div[2]/ul/li[4]/a") WebElement tab;
	
	

	public UserHomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public void action() {
		Actions aa = new Actions(driver);
		aa.moveToElement(act).build().perform();
	}
	
	public void table() {
		tab.click();
	}
}
