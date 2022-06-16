package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Summary {
	
	private WebDriver driver;

	public Summary(WebDriver driver) {
		this.driver = driver;
	}
	By finishBtn = By.id("finish");
	
	
	public Complete proceedToComplete() {
		
		
		driver.findElement(finishBtn).click();
		
		return new Complete(driver);
		
		
		
	}
	
		   
	
	

}
	
