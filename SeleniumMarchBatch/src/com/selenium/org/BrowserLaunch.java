package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("wedriver.chrome.driver",
				"C:\\Users\\Welcome\\eclipse-workspace\\SeleniumMarchBatch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//interface	               //class
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
//		Thread.sleep(2000); //static wait
//		driver.quit();
	}

}
