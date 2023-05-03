package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseClass;

public class RobotDemo extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		browser("chrome");
		getUrl("https://www.amazon.in/");

		WebElement bestSeller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));

		Actions ac = new Actions(driver);

		ac.moveToElement(bestSeller).perform();

		ac.contextClick(bestSeller).perform();

		Robot r = new Robot();

		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobile = driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));

		ac.contextClick(mobile).perform();

		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		

		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement customerSerivice = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));

		ac.contextClick(customerSerivice).perform();

		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		

		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		String windowHandle = driver.getWindowHandle();
		
		System.out.println(windowHandle);
		
//		driver.switchTo().window(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		//Random order
		
		ArrayList<String> a = new ArrayList<>(windowHandles);
		//Insertion Order
		
		int size = a.size();
		System.out.println(size);
		
		Thread.sleep(2000);
		String title0 = driver.switchTo().window(a.get(0)).getTitle();
		
		Thread.sleep(2000);
		String title1 = driver.switchTo().window(a.get(1)).getTitle();
		
		Thread.sleep(2000);
		String title2 = driver.switchTo().window(a.get(2)).getCurrentUrl();
		
		Thread.sleep(2000);
		driver.switchTo().window(windowHandle);
		
		System.out.println("Array List 0th site "+ title0);
		System.out.println("Array List 1th site "+ title1);
		System.out.println("Array List 2th site "+ title2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
