package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public static WebDriver driver ;
	
	public static void browser(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\SeleniumMarchBatch\\Driver\\chromedriver.exe");
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
		}else if (name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Welcome\\eclipse-workspace\\SeleniumMarchBatch\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}
		else {
			System.out.println("Browser Name is Incorrect");
		}
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public static void sendkeysAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
