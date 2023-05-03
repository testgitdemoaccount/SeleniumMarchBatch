package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class JavaScriptExecutorDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		browser("chrome");
		getUrl("https://www.amazon.in/");
		
		WebElement logo = driver.findElement(By.xpath("//a[@aria-label='Amazon India Home']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", logo);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement button = driver.findElement(By.xpath("//span[text()='FREE one delivery']"));
		 
		js.executeScript("arguments[0].click();", button);
	}
}
