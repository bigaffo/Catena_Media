package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
	protected WebDriver driver;
	protected static final String actualFinalText = "THANK YOU FOR YOUR ORDER";
	protected static final String userName = "standard_user";
	protected static final String password = "secret_sauce";
	protected static final String firstName = "James";
	protected static final String lastName = "Ocorner";
	protected static final String postalCode = "23401";
	protected static final String confirmLoginText = "LOGOUT";
	protected static final String confirmProductText = "Sauce Labs Bolt T-Shirt";
	protected static final String confirmRemoveBtnText = "REMOVE";
	


	public WebDriver setupBrowser() {
		// System.setProperty("webdriver.gecko.driver", "c:\\browser\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\browser\\chromedriver.exe");
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
		return driver;
	}

	@BeforeMethod
	public void startBrowser() {
		BaseClass base = new BaseClass();
		this.driver = base.setupBrowser();

	}

	
	  @AfterMethod 
	  public void tearDown() { 
	  
	  driver.quit(); }
	 
	
		
	
	 
}
