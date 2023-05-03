package com.selenium.org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;

public class ExplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {

		browser("chrome");
		getUrl("https://www.amazon.in/");

		WebElement login = driver.findElement(By.xpath("//span[text()='Account & Lists']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(login));

		login.click();

		// Fluent wait

		Wait wait1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);

		wait1.until(ExpectedConditions.visibilityOf(login));
	}
}
