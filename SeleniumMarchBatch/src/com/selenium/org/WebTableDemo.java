package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) {
		browser("chrome");
		getUrl("https://www.w3schools.com/html/html_tables.asp");
		// To get all the data
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

		System.out.println(data);

		for (WebElement webElement : data) {
			String text = webElement.getText();
			System.out.println(text);
		}

		System.err.println("================================");
		// To get the Headings
		List<WebElement> heading = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));

		for (WebElement webElement : heading) {
			String text = webElement.getText();
			System.out.println(text);

		}

		System.err.println("================================");
		// To get the Specific value
		WebElement specific = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]"));
		String text = specific.getText();
		System.out.println(text);

		System.err.println("================================");
		// to get the row value
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td"));

		for (WebElement webElement : row) {
			String text2 = webElement.getText();
			System.out.println(text2);
		}
			System.err.println("================================");
			// to get the column value
			List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));

			for (WebElement webElement1 : column) {
				String text3 = webElement1.getText();
				System.out.println(text3);

			}

			driver.close();

		}

	
}
