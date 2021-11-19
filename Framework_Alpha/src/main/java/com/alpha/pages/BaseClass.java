package com.alpha.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.alpha.utilities.BrowserStartup;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	
	public WebDriver driver;
	public static ExtentReports report;
	public ExtentTest logger;
	
	/*@BeforeSuite
	public static void setUpSuite()
	{
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+  ))
	}
	*/	
	
	@BeforeClass
	public void setup()
	{
		driver = BrowserStartup.startApplication(driver, "Firefox", "https://book.spicejet.com/search.aspx");
	}
}
