package com.selenium.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class WaitsDemo extends BaseClass{
	
	public static void main(String[] args) {
		
		browser("chrome");
		
		getUrl("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		login.click();
		
	}

}
