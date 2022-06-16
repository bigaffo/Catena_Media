package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductGallery {
	
	private WebDriver driver;

	public ProductGallery(WebDriver driver) {
		this.driver = driver;
	}
	By shirtLink = By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
	By burgerMenu = By.xpath("//button[@id='react-burger-menu-btn']");
	By logOutMenu = By.xpath("//a[@id='logout_sidebar_link']");
	
	//to confirm if the logout button is present o n the landing page.
	public String confirmLogin() {
		
		driver.findElement(burgerMenu).click();
		String logOutText=driver.findElement(logOutMenu).getText();
		return logOutText;
	}
	
	
	public ProductPage visitProductPage() {
		
		
		driver.findElement(shirtLink).click();
		return new ProductPage(driver);
		
		
	}
	
		   
	
	

}
	
