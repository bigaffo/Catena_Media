package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
	
	private WebDriver driver;

	public CheckOut(WebDriver driver) {
		this.driver = driver;
	}
	By firstNameField = By.id("first-name");
	By lastNameField = By.id("last-name");
	By postalCodeField = By.id("postal-code");
	By continueBtn = By.id("continue");
	
	public Summary inputInfoAndContinue(String firstName, String lastName, String postalcode){
		
		
		driver.findElement(firstNameField).sendKeys(firstName);
		driver.findElement(lastNameField).sendKeys(lastName);
		driver.findElement(postalCodeField).sendKeys(postalcode);
		driver.findElement(continueBtn).click();
		return new Summary(driver);
	}
	
		   
	
	

}
	
