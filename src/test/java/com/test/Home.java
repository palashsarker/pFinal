package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.Base;
import com.pageFactory.LandingPage;
import com.pageFactory.TableList;
import com.pageFactory.UserAccountCredential;
import com.pageFactory.UserHomePage;

public class Home extends Base {
	
	@Test
	public void getBrowser() throws IOException {
		infoBrowser();
		driver.get(pp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		LandingPage lp = new LandingPage(driver);
		lp.cokieOne();
		lp.signInButton();
		UserAccountCredential ua = new UserAccountCredential(driver);
		ua.emailId();
		ua.passWord();
		ua.submitButton();
		UserHomePage uh = new UserHomePage(driver);
		uh.action();
		uh.table();
		TableList tt = new TableList(driver);
		tt.coloums();
		tt.team();
		
	}
}
