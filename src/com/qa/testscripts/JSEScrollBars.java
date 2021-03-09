package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEScrollBars {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		// top to bottom
		
		
		for(int i=0; i<5 ; i++) {
			
			//x --> Horizontal , Y--> Vertical
			Js.executeScript("window.scrollBy(0,500)"); // vertical scroll bar --> top to down
			
			//Js.executeScript("window.scrollBy(500,0)"); // Horizontal scroll bar --> top to down
			
		}
		
		Thread.sleep(3000);
		for(int i=5 ; i>=1 ; i--) {
			Js.executeScript("window.scrollBy(0,-500)");
		}
		
		driver.close();
	}
	

}
