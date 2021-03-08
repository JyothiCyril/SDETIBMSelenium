package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		
		
		//SwitchTo frame By Element
		
//		WebElement Frame = driver.findElement(By.name("packageListFrame"));
//		String attribute = Frame.getAttribute("title");
//		List<WebElement> ele = driver.switchTo().frame(Frame).findElements(By.tagName("a"));
//		System.out.println("Total no. of links present in the frame " + attribute + " are :" + ele.size());
//		
		//SwitchTo frame by name
		
		//WebElement Frame = driver.findElement(By.name("packageListFrame"));
		
//		String nameofFrame = Frame.getAttribute("name");
//		
//		List<WebElement> ele = driver.switchTo().frame(nameofFrame).findElements(By.tagName("a"));
//		System.out.println("Total no. of links present in the frame " + nameofFrame + "are :" + ele.size());
//		
		//switch to framebyIndex
//		List<WebElement> Frames = driver.findElements(By.tagName("frame"));
//		int Count = Frames.size();
//		
//		System.out.println("Total no. of frames present are : " + Count);
//		
//		for(int i=0 ; i<Count ; i++) {
//			WebDriver frame = driver.switchTo().frame(i);
//			System.out.println(frame.getTitle());
//			
//			List<WebElement> AllLinks = frame.findElements(By.tagName("a"));
//			System.out.println("Total no. of links present in the frame " + i + "are :" + AllLinks.size());
//			
//			driver.switchTo().defaultContent();
//		}
//		
		
		driver.close();
	}

}
