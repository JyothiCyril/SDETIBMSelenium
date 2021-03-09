package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.Pages.AmazonPages;

public class TC_AmazonSearchPOMDemo {
	
	
	@Test
	public void SeachItem() {	
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AmazonPages AmazonOR = new AmazonPages(driver);
		driver.get("https://www.amazon.in/");
		
		WebElement categoryFirstSelectedItem = AmazonOR.getCategoryFirstSelectedItem();
		System.out.println(categoryFirstSelectedItem.getText());
		
		AmazonOR.setCategoryInput("Books");
		
		AmazonOR.setSearchTextBoxInput("Da Vinci Code");
		
		
		boolean maginifierBtnEnabled = AmazonOR.getMaginifierBtnEnabled();
		if(maginifierBtnEnabled) {
			AmazonOR.setMaginifierBtnClick();
//			
//			WebDriverWait expWait = new WebDriverWait(driver,40);
//			expWait.until(ExpectedConditions.titleContains("Amazon.in : Da Vinci Code"));
			
			boolean contains = driver.getTitle().contains("Da Vinci Code");
			if(contains) {
				System.out.println("The page is loaded correctly");
				
				List<WebElement> itemNames = AmazonOR.getItemNames();
				for(WebElement item:itemNames) {
					System.out.println(item.getText());
				}
				
			}
		}
		
		
		driver.close();
		
	}
	
	
	

}
