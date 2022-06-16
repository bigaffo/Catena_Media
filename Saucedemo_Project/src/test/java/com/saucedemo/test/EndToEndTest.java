package com.saucedemo.test;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.saucedemo.pages.BaseClass;
import com.saucedemo.pages.Home;

public class EndToEndTest extends BaseClass {


	@Test

	public void endToEndTest() {
		
		Home home = new Home(driver);
		String successText = home.loginToGallery(userName, password).visitProductPage().addToCartAndProceed()
				.proceedToCheckout().inputInfoAndContinue(firstName, lastName, postalCode).proceedToComplete()
				.getCompleteText();
		Assert.assertEquals(actualFinalText, successText, "E2E not successfull");

	}

}
