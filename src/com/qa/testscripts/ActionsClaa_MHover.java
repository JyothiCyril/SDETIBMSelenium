package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClaa_MHover {

	public static void main(String[] args) {


		//
		//1. Open URL	http:www.amazon.in/
		//2. Mouseover on  the Account & list button	
		//3. click new user link	
		//4. Check if user is navigated to registration page	
		//5. Enter the details of user	Mobile number / email
		//		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement ele = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform(); // MHover on the ele
		
		driver.findElement(By.linkText("Start here.")).click();
		
		boolean contains = driver.getTitle().contains("Registration");
		if(contains) {
			System.out.println("User is on Registration page");
		}
		
		driver.close();

	}

}
