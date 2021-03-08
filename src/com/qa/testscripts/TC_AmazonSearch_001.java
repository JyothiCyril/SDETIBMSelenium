package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_AmazonSearch_001 {


	//	1. Open browser  & launch URL	http:www.amazon.in/
	//	2. Select category	Books
	//	3. Enter the item name	Da vinci code
	//	4. click on submit	
	//	5. check the title	
	//	6. Close the browser	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		//		2. Select category	Books
		Select Category = new Select(driver.findElement(By.name("url")));
		// get the Default selected value
		System.out.println(Category.getFirstSelectedOption().getText());

		// fetch all the option from the select 
		List<WebElement> options = Category.getOptions();

		System.out.println("Total no. of options in the category list box are : " + options.size());

		// fetches all the items and print the name of items
		for(WebElement option : options) {
			System.out.println(option.getText());
		}

		// Select "Books" options
		Category.selectByVisibleText("Books");


		//3. Enter the item name	Da vinci code
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Da Vinci Code");


		boolean enabled = driver.findElement(By.id("nav-search-submit-button")).isEnabled();

		if(enabled) {

			//4. click on submit	
			driver.findElement(By.id("nav-search-submit-button")).click();
			String title = driver.getTitle();

			if(title.contains("Da Vinci Code")) {
				System.out.println("The page title has changes as per the item searched");
				
				
				List<WebElement> ItemNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
				
				System.out.println("Total no. of items loaded are : " + ItemNames.size());
				
				for(WebElement item:ItemNames) {
					System.out.println(item.getText());
				}
				
				
				
			}else {
				System.out.println("The page title is not changed as per the item searched");
			}


		}else {
			System.out.println("Maginfier button is not enabled");
		}



		driver.close();
	}

}
