package com.stepsDef;

import java.io.IOException;

import org.testng.Assert;

import com.base.Base;
import com.pageFactory.LandingPage;
import com.pageFactory.TableList;
import com.pageFactory.UserAccountCredential;
import com.pageFactory.UserAccountSignout;
import com.pageFactory.UserHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	
	
	
	

@Given("^user able to open require browser$")
public void user_able_to_open_require_browser() throws IOException {
	infoBrowser();
}

@Given("^enter require url$")
public void enter_require_url(){

	driver.get(pp.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}

@Given("^user able to click SignIn button$")
public void user_able_to_click_SignIn_button() {
	LandingPage lp = new LandingPage(driver);
	lp.cokieOne();
	lp.signInButton();
}

@When("^user into signin page with valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_into_signin_page_with_valid_and(String id, String pass) throws Throwable {
	UserAccountCredential ua = new UserAccountCredential(driver);
	ua.emailId(id);
	ua.passWord(pass);
}


@When("^user click submit button and appear user account page with validation$")
public void user_click_submit_button_and_appear_user_account_page_with_validation() {
	UserAccountCredential ua = new UserAccountCredential(driver);
	ua.submitButton();
	UserHomePage uh = new UserHomePage(driver);
	String actual = driver.getCurrentUrl();
	System.out.println(actual);
	Assert.assertEquals(actual, "https://www.premierleague.com/?state=success", "passed");

	
	
}

@When("^mouse over on premier league link button and click tables$")
public void mouse_over_on_premier_league_link_button_and_click_tables() {
	UserHomePage uh = new UserHomePage(driver);
	uh.action();
	uh.table();
}

@Then("^fetch current Team and coloum name from default location$")
public void fetch_current_Team_and_coloum_name_from_default_location() {
	TableList tt = new TableList(driver);
	tt.coll();
	tt.team();
	
}

@Then("^user able to SignOut by click username and signout button$")
public void user_able_to_SignOut_by_click_username_and_signout_button() {
	TableList tt = new TableList(driver);
	tt.clickUsername();
	UserAccountSignout us = new UserAccountSignout(driver);
	us.signOut();
}



}
