package com.saucedemo.test;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.saucedemo.pages.BaseClass;
import com.saucedemo.pages.Home;


public class AddToCartTest extends BaseClass {

	
	@Test
	public void addToCartTest() {
		
		Home home = new Home(driver);
		String removeBtnText=home.loginToGallery(userName, password).visitProductPage()
		.addToCartAndProceed().confirmCart();
		Assert.assertEquals(confirmRemoveBtnText,removeBtnText, "There is not product in the Shopping Cart");
		
	}
		
			
	
	
}


