package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseClass;

public class DragAndDropDemo extends BaseClass{
	
	public static void main(String[] args) {
		
		browser("chrome");
		
		getUrl("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		
		WebElement target = driver.findElement(By.id("box101"));
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(source, target).perform();
		
		System.out.println("Source is Moved to the Target");
	}
	

}
