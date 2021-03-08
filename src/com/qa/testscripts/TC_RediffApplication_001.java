package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RediffApplication_001 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		boolean displayed = driver.findElement(By.linkText("Sign in")).isDisplayed();

		if(displayed) {

			driver.findElement(By.linkText("Sign in")).click();

			String currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains("login")) {
				System.out.println("The user is landed on the Login page");

				driver.findElement(By.id("login1")).sendKeys("test@test.com");
				driver.findElement(By.id("password")).sendKeys("Mercury");

				WebElement StaySignInChkBox = driver.findElement(By.id("remember"));
				System.out.println(StaySignInChkBox.isSelected());
				StaySignInChkBox.click(); // de-selected


				WebElement SignInBtn = driver.findElement(By.name("proceed"));

				if(SignInBtn.isEnabled()) {
					SignInBtn.click();
				}

			}else {
				System.out.println("Incorrect page loaded");
			}


		}else {
			System.out.println("Element no found on the page");
		}

	}

}
