package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	@FindBy(css=".btn-primary.cookies-notice-accept") WebElement cokie;
	@FindBy(xpath="//*[@id=\"mainNav\"]/a[2]/span") WebElement signIn;
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void cokieOne() {
		cokie.click();
	}
	
	public void signInButton() {
		signIn.click();
	}
	
	

}
