package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.google.common.io.Files;

public class FramesDemo extends BaseClass{
	
	public static void main(String[] args) {
		browser("chrome");
		
		getUrl("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		text.sendKeys("Java");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	
		
		WebElement nestedFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	
		driver.switchTo().frame(nestedFrame);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	
		
//	driver.switchTo().frame(iframe)
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("Welcome to Java");
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		WebElement site = driver.findElement(By.xpath("//a[text()='Practice Site']"));
		
		boolean displayed = site.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = site.isEnabled();
		System.out.println(enabled);
		
		
		boolean selected = site.isSelected();
		System.out.println(selected);
	}
	

}
