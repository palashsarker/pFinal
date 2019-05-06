package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountSignout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"ismr-content\"]/div/div[2]/div/a[2]") WebElement sign;
	
	
	public UserAccountSignout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


	public void signOut() {
		sign.click();
	}

}
