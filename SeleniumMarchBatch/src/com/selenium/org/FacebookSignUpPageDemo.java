package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;

public class FacebookSignUpPageDemo extends BaseClass {

	public static void main(String[] args) {

		browser("chrome");
		getUrl("https://www.facebook.com/reg/");

		WebElement userName = driver.findElement(By.xpath("//input[@name='firstname']"));
		userName.sendKeys("Sample");

		WebElement surName = driver.findElement(By.xpath("//input[@name='lastname']"));
		surName.sendKeys("Demo");

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("someone@demo.com");

		WebElement reEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reEmail.sendKeys("someone@demo.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("1234567890");

		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		s.selectByIndex(7);

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByValue("10");

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2005");

		driver.findElement(By.xpath("//label[text()='Male']")).click();

		WebElement signUp = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signUp.click();

	}

}
