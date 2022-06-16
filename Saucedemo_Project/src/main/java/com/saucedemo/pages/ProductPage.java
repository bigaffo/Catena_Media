package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	private WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	By addTocartBtn = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By ShoppingCartBtn = By.xpath("//a[@class='shopping_cart_link']");
	By confirmShirt = By.xpath("//div[@class='inventory_details_name large_size']");
	
	public ShoppingCart addToCartAndProceed() {
		 
		driver.findElement(addTocartBtn).click();
		driver.findElement(ShoppingCartBtn).click();
		return new ShoppingCart(driver);
		
	}
	//It will confirm the chosen product name.
	public String confirmProduct() {
		
		String shirtText=driver.findElement(confirmShirt).getText();
		return shirtText;
	}
	
		   
	
	

}
	
