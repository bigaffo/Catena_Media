package com.saucedemo.test;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.saucedemo.pages.BaseClass;
import com.saucedemo.pages.Home;


public class LoginTest extends BaseClass {


	@Test
	public void loginTest() {
		
		Home home = new Home(driver);
		String loginText=home.loginToGallery(userName, password).confirmLogin();
		Assert.assertEquals(confirmLoginText,loginText, "login not successfull");
		
				
	}	
}


