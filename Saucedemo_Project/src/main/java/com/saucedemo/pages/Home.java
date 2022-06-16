package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	private WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	By usernameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginBtn = By.id("login-button");

	public ProductGallery loginToGallery(String userName, String password) {
		driver.findElement(usernameField).sendKeys(userName);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginBtn).click();
		return new ProductGallery(driver);

	}

}
