package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensKartCartPage {
	
	public static WebDriver driver;
	
	@FindBy (xpath = "//input[@class='promoCode']")
	private WebElement promocode;
	
	@FindBy (xpath = "//button[text()='Apply']")
	private WebElement apply;
	
	@FindBy (xpath = "//button[text()='Place Order']")
	private WebElement placeOrder;

	public GreensKartCartPage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2,this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getPromocode() {
		return promocode;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	
	
}
