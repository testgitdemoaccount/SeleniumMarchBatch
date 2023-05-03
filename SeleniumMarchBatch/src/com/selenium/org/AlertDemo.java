package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.baseclass.BaseClass;

public class AlertDemo extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Welcome\\eclipse-workspace\\SeleniumMarchBatch\\Driver\\msedgedriver.exe");
		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
		
//		WebDriver driver = new EdgeDriver();
//		
//		driver.get("https://demo.automationtesting.in/Alerts.html");
//		
//		driver.manage().window().maximize();
		
		browser("chrome");
		
		getUrl("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertButton.click();
		
		//Simple, Confirm, Prompt
		
		Thread.sleep(1500);
//		driver.switchTo().alert().accept();
		acceptAlert();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		alert2.click();
		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		dismissAlert();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		
		WebElement alert3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		alert3.click();
		
//		String text = alert3.getText();
		
//		System.out.println();
//		driver.switchTo().alert().sendKeys("Welcome to Java");
		sendkeysAlert("Welcome to Java");
		
//		driver.switchTo().alert().accept();
		acceptAlert();
		
		
		
	}

}
