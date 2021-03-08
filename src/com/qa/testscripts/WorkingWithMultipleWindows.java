package com.qa.testscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Pages.RediffPages;

public class WorkingWithMultipleWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // 1st window
		RediffPages RediffOR = new RediffPages(driver);
		
		
		driver.get("https://www.rediff.com/");
		
	
		RediffOR.setCreateAccountLinkClick();
		
		if(driver.getCurrentUrl().contains("register")) {
			System.out.println("User is on Registration page");
			
			RediffOR.settermsandconditionsLinkClick(); // 2nd window
			RediffOR.setprivacypolicyLinkClick(); // 3rd window
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			Iterator<String> iterator = windowHandles.iterator();
			
			while(iterator.hasNext()) {
				
				String WinID = iterator.next();
				
				WebDriver window = driver.switchTo().window(WinID);
				System.out.println("Title of " + WinID + "is : " + window.getTitle());
				
			}
			
			
		}
		
		driver.quit();
	}

}
