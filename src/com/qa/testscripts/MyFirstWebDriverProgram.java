package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyFirstWebDriverProgram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		//System.setProperty("webdriver.edge.driver", "D:\\Selenium Software\\Drivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
//		System.setProperty("webdriver.ie.driver", "D:\\Selenium Software\\Drivers\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
//		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Software\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.close();	

	}

}
