package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Welcome\\eclipse-workspace\\SeleniumMarchBatch\\Driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		//Interface				//class
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
//		driver.navigate().to("https://www.facebook.com/reg/");
		
		driver.findElement(By.id("email")).sendKeys("someone@demo.com");
		
		driver.findElement(By.id("pass")).sendKeys("123456sdfgh");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		System.out.println("Login is Succesful");
	}

}
