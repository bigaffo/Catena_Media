package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {
	
	private WebDriver driver;

	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
	}
	By checkOutBtn = By.id("checkout");
	By removeBtn = By.xpath("//button[@class= 'btn btn_secondary btn_small cart_button']");
	
	public CheckOut proceedToCheckout() {
		
		
		driver.findElement(checkOutBtn).click();
		
		return new CheckOut(driver);
	
	}
	//confirm the remove button is in the shopping cart page
	public String confirmCart() {
		String confirmCartText = driver.findElement(removeBtn).getText();
		return confirmCartText;
		
	}
	
		   
	
	

}
	
