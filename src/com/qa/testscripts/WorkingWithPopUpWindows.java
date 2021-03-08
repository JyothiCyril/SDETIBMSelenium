package com.qa.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.qa.Pages.RediffPages;

public class WorkingWithPopUpWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // 1st window

//		System.setProperty("webdriver.edge.driver", "D:\\Selenium Software\\Drivers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
		RediffPages RediffOR = new RediffPages(driver);
		driver.get("https://www.rediff.com/");
		
		RediffOR.setSignInLinkClick();
		
		RediffOR.setSignInBtnClick();
		
		
		System.out.println(driver.getTitle());
		
	
		
			
//		RediffOR.setCreateAccountLinkClick();
//		
//		RediffOR.setFullNameTextBoxInput("1234"); // pop up will be generated
//		
//		Alert JSAlert = driver.switchTo().alert();
//		System.out.println(JSAlert.getText());		
//		JSAlert.accept();	
//				
//		RediffOR.setEmailIDTextBox("test@test.com");
		

	}

}
