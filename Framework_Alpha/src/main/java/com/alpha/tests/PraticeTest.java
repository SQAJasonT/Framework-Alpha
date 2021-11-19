package com.alpha.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.alpha.pages.BaseClass;
import com.alpha.pages.LocatorPage;


public class PraticeTest extends BaseClass{
	
	
	@Test
	public void FlightBooking()
	{
		
		String expectedTitle = "Spice Jet Flight Booker";
		String actualTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualTitle, expectedTitle);
		System.out.println("The actual title is " + actualTitle);

	}

}
