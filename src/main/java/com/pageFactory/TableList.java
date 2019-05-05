package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableList {
	WebDriver driver;

	public TableList(WebDriver driver) {
		this.driver = driver;

	}

	public void team() {

		List<WebElement> rows = driver
				.findElements(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[1]/div[3]/div/div/div/table/tbody/tr"));
		int totalrows = rows.size();
		String rowA = "//*[@id=\"mainContent\"]/div[2]/div[1]/div[3]/div/div/div/table/tbody/tr[";
		String collA = "]/td[3]";
		int count = 0;
		for (int i = 1; i <= totalrows; i = i + 2) {

			WebElement ss = driver.findElement(By.xpath(rowA + i + collA));
			System.out.println("TeamName" + count + "==			" + ss.getText());
			count++;
		}

	}

	public void coloums() {

		// *[@id="mainContent"]/div[2]/div[1]/div[3]/div/div/div/table/thead/tr/th[3]
		// *[@id="mainContent"]/div[2]/div[1]/div[3]/div/div/div/table/thead/tr/th[2]

		List<WebElement> colls = driver
				.findElements(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[1]/div[3]/div/div/div/table/thead/tr/th"));
		int totalcolls = colls.size();
		String a = "//*[@id=\"mainContent\"]/div[2]/div[1]/div[3]/div/div/div/table/thead/tr/th[";
		String b = "]";
		for (int i = 1; i < totalcolls; i++) {
			WebElement coloum = driver.findElement(By.xpath(a + i + b));
			System.out.print("	" + coloum.getText());
		}

	}

}
