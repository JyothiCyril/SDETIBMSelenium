package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int count = rows.size();
		System.out.println(count);
		
		
		
		List<WebElement> data = driver.findElements(By.tagName("td"));
		int count1 = data.size();
		System.out.println(count1);
		
		for(WebElement d:data) {
			System.out.println(d.getText());
		}
		
		driver.close();
				
		
		
		
	}

}
