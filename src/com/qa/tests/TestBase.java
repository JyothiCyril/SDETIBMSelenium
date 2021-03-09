package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.Pages.AmazonPages;

public class TestBase {
	//	1. Open the Browser
	//	2. Run the URL
	WebDriver driver;
	AmazonPages AmazonOR;
	

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		AmazonOR = new AmazonPages(driver);
		driver.get("https://www.amazon.in/");
	}


	
	//7. Close the browser
	@AfterClass
	public void tearDown() {
		driver.close();

	}


}
