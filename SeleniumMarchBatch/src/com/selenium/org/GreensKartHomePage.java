package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensKartHomePage {
	
	public static WebDriver driver;
	
	@FindBy (xpath = "//input[@class='search-keyword']")
	private WebElement search;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy (xpath = "//input[@class='quantity']")
	private WebElement quantity;
	
	@FindBy (xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	@FindBy (xpath = "//img[@alt='Cart'] ")
	private WebElement cartIcon;
	
	@FindBy (xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement proceedToCheckout;
	

	

	public GreensKartHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);;
		
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}
	
	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}
}
