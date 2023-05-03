package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseClass;

public class ActionsDemo extends BaseClass{
	
	
	public static void main(String[] args) {
		browser("chrome");
		getUrl("https://www.amazon.in/");
		
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(prime).perform();
		
		ac.contextClick().perform();
		
		ac.click();
		
		
		
	}

}
