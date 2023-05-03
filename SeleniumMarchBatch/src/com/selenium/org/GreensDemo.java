package com.selenium.org;

import java.time.Duration;

import com.baseclass.BaseClass;

public class GreensDemo extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		GreensKartHomePage g = new GreensKartHomePage(driver);
		
		g.getSearch().sendKeys("carr");
		Thread.sleep(2000);
		
		g.getSubmit().click();
		Thread.sleep(2000);
		
		g.getQuantity().clear();
		g.getQuantity().sendKeys("5");
		Thread.sleep(2000);
		
		g.getAddToCart().click();
		Thread.sleep(2000);
		
		g.getCartIcon().click();
		
		g.getProceedToCheckout().click();
		
		GreensKartCartPage g1 = new GreensKartCartPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		g1.getPromocode().sendKeys("free");
		
		g1.getApply().click();
		
		g1.getPlaceOrder().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}