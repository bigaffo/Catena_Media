package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Complete {
	
	private WebDriver driver;

	public Complete(WebDriver driver) {
		this.driver = driver;
	}
	By successMessage = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");
	
	
	public String getCompleteText() {
		
		
		String confirmText=driver.findElement(successMessage).getText();
		return confirmText;
		
		
		
		
	}
	
		   
	
	

}
	
