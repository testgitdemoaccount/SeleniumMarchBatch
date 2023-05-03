package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;

public class DropdownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		browser("chrome");
		getUrl("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		WebElement product = driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select s = new Select(product);
		s.selectByValue("Yahoo");
		
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s1 = new Select(animal);
		s1.selectByVisibleText("Avatar");
		
		WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
		Select s2 = new Select(food);
		
		boolean multiple = s2.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = s2.getOptions();
		
		System.out.println(options);
		
		int size = options.size();
		System.out.println(size);
		
		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
		}
		
		Thread.sleep(1500);
		s2.selectByIndex(2);
		Thread.sleep(1500);
		s2.selectByIndex(1);
		System.out.println("======================");
		List<WebElement> allSelectedOptions = s2.getAllSelectedOptions();
		
		for (WebElement webElement1 : allSelectedOptions) {
			String text1 = webElement1.getText();
			System.out.println(text1);
		}
		Thread.sleep(1500);
		s2.selectByIndex(3);
		Thread.sleep(1500);
		s2.deselectByValue("donut");
		Thread.sleep(1500);
		s2.deselectAll();
		
		WebElement firstSelectedOption = s2.getFirstSelectedOption();
		
		String text = firstSelectedOption.getText();		
		System.err.println(text);
		
		
		
		
		
		
		
		
		
		
		
	}

}
