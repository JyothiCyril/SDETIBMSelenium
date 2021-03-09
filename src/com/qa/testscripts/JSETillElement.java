package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Pages.AmazonPages;

public class JSETillElement {
// scroll till the presence of element
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AmazonPages AmazonOR = new AmazonPages(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement careersLink = AmazonOR.getCareersLink();
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript("arguments[0].scrollIntoView", careersLink);
		
		String text = careersLink.getText();
		System.out.println(text);

		careersLink.click();
		
		if(driver.getCurrentUrl().contains("jobs")) {
			System.out.println("Amazon career page is opened");
		}
		
		driver.close();
		
	}

}
