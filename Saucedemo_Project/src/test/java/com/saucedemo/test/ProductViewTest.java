package com.saucedemo.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.BaseClass;
import com.saucedemo.pages.Home;


public class ProductViewTest extends BaseClass {

	

	@Test
	public void productViewTest() {
		
		Home home = new Home(driver);
		String productText=home.loginToGallery(userName, password).visitProductPage().confirmProduct();
		Assert.assertEquals(confirmProductText,productText, "product view is not successfull");
			
			
	}
			
	
}


