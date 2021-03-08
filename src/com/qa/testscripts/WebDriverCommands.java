package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// WebDriver interface has 11 abstract methods in addtion to it 2 abstract methods 
		// are extend from the searchcontext interface
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/"); // Launch a URL, Input as String


		driver.navigate().to("https://www.google.com/");

		//driver.switchTo(); --> New Tab/ window /Pop up / Frame

		//driver.findElement(); // Is extended from SearchContext interface

		//Return WebElement ( another interface that extends SearchContext...)

		// Define what action / user event to be performed on the element Type,click,select etc..

		//driver.findElements(null) // return group of WebElement that belongs to ssame category...


		//Returns the Window ID of the browser page

		String windowHandle = driver.getWindowHandle(); // Current Browser / single window --> String
		// System.out.println(windowHandle);
		//driver.getWindowHandles(); // All the windows / tag that are opened --> Returns String in collections Set

		// getter methods

		//		String title = driver.getTitle(); // Fetch the title of the page and return the String
		//		System.out.println(title);
		//		if(title.contains("Amazon")) {
		//			System.out.println("Title has amazon word");
		//		}else {
		//			System.out.println("Title do not have amazon word");
		//		}
		//		
		//		
		//		String currentUrl = driver.getCurrentUrl(); // Return String : Fetch URL on the page and return the output
		//		
		//		System.out.println(currentUrl);
		//		if(currentUrl.contains("amazon")) {
		//			System.out.println("User is landed on the amazon page");
		//		}
		//		

		//	System.out.println(driver.getPageSource()); // get the page source of the HTML DOM structure, returns String


		driver.close(); // last line -> Browser instance opened by Selenium will be closed.
		driver.quit(); // last line --> The parent browser along with child browser (pop up & new tabs opened etc..)


	}

}
