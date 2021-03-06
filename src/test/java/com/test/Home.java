package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Base;
import com.pageFactory.LandingPage;
import com.pageFactory.TableList;
import com.pageFactory.UserAccountCredential;
import com.pageFactory.UserAccountSignout;
import com.pageFactory.UserHomePage;

public class Home extends Base {

	@BeforeMethod
	public void open() throws IOException {
		infoBrowser();
		driver.get(pp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(dataProvider = "getData")
	public void getBrowser(String id1, String pass1) throws IOException {

		LandingPage lp = new LandingPage(driver);
		lp.cokieOne();
		lp.signInButton();
		UserAccountCredential ua = new UserAccountCredential(driver);
		ua.emailId(id1);
		ua.passWord(pass1);
		ua.submitButton();
		UserHomePage uh = new UserHomePage(driver);
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		Assert.assertEquals(actual, "https://www.premierleague.com/?state=success", "passed");
		uh.action();
		uh.table();
		TableList tt = new TableList(driver);
		tt.coll();
		tt.team();
		tt.clickUsername();
		UserAccountSignout us = new UserAccountSignout(driver);
		us.signOut();

	}

	@AfterMethod
	public void close() {
		driver.close();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] info = { { "wwww", "2222" }, { "psarker347@gmail.com", "smart12346" } };
		return info;
	}

}
