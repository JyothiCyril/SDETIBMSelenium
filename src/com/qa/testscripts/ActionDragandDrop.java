package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement eleToDrap = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement TagetEle = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act = new Actions(driver);
		act.clickAndHold(eleToDrap).moveToElement(TagetEle).release().build().perform();
		
		//act.dragAndDrop(eleToDrap, TagetEle).build().perform();
		
		Thread.sleep(2000);
		driver.close();
	}

}
