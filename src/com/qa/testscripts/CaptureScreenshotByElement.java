package com.qa.testscripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Pages.AmazonPages;

public class CaptureScreenshotByElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AmazonPages AmazonOR = new AmazonPages(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String DateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		File Src = AmazonOR.getAmazonLogo().getScreenshotAs(OutputType.FILE);
		// to copied to a local drive..
		
		//FileUtils.copyFile(Src, new File("D:\\Devlabs\\Batch 2\\BroadridgeBatch2\\SDETIBMSelenium\\Screenshots\\SShot.png"));
		 // to copy the file into the current project folder
		
		String Destination = System.getProperty("user.dir") + "/Screenshots/" + "amazonlogo" + DateName + ".png";
		FileUtils.copyFile(Src, new File(Destination));
	
		driver.close();
	}

}
