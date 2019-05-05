package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountCredential {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"ism-email\"]") WebElement email;
	@FindBy(xpath="//*[@id=\"ism-password\"]") WebElement pass;
	@FindBy(css=".btn.btn-primary") WebElement submit;
	
	public UserAccountCredential(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void emailId() {
		email.sendKeys("psarker347@gmail.com");
	}
	
	public void passWord() {
		pass.sendKeys("smart12346");
	}

	public void submitButton() {
		submit.click();
	}

}
