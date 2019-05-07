package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TableList {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"mainNav\"]/a[3]/span") WebElement pal;
	
	
	public TableList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void team() {

		List<WebElement> rows = driver
				.findElements(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[1]/div[3]/div/div/div/table/tbody/tr"));
		int totalrows = rows.size();
		String rowA = "//*[@id=\"mainContent\"]/div[2]/div[1]/div[3]/div/div/div/table/tbody/tr[";
		String collA = "]/td[3]";
		int count = 1;
		for (int i = 1; i <= totalrows; i = i + 2) {

			WebElement ss = driver.findElement(By.xpath(rowA + i + collA));
			System.out.println("TName" + count + "==	 " + ss.getText());
			count++;
		}

	}

	// *[@id="mainContent"]/div[2]/div[1]/div[3]/div/div/div/table/thead/tr/th[5]

	// *[@id="mainContent"]/div[2]/div[1]/div[3]/div/div/div/table/thead/tr/th[4]

	public void coll() {
		List<WebElement> a = driver
				.findElements(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[1]/div[3]/div/div/div/table/thead/tr/th"));
		int totalcoll = a.size();
		System.out.println(totalcoll);
		String collA="// *[@id=\"mainContent\"]/div[2]/div[1]/div[3]/div/div/div/table/thead/tr/th[";
		String collB="]";
				for(int i=1;i<=totalcoll;i++) {
					//System.out.println(driver.findElement(By.xpath(collA+i+collB)));
					WebElement collname=driver.findElement(By.xpath(collA+i+collB));
					System.out.print("  "+collname.getText());
				}
				System.out.println();
	}
	
	
	public void clickUsername() {
		pal.click();
	}

	
}
