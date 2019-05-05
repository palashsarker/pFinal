package com.validation;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;

public class UrlValidation extends Base {
	@Test
	public void valid() throws IOException {
		infoBrowser();
		driver.get(pp.getProperty("url"));
		String actual=driver.getCurrentUrl();
		System.out.println(actual);
		Assert.assertEquals(actual, "https://www.premierleague.com/home");
		
		
	}
}
