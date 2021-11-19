package com.alpha.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorPage {
	
	WebDriver driver; 
	
	public LocatorPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath = "//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']") WebElement departCity;
	@FindBy(xpath = "//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']") WebElement arriveCity;
	@FindBy(xpath = "")
	
	

}
