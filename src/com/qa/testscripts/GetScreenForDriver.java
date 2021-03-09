package com.qa.testscripts;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenForDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		TakesScreenshot DSShot = (TakesScreenshot)driver;
		
		String DateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		File Src = DSShot.getScreenshotAs(OutputType.FILE);
		String Dest = System.getProperty("user.dir") + "/Screenshots/" + "AmazonDriver" + DateName +".png";
		try {
			FileUtils.copyFile(Src, new File(Dest));
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.close();
	}

}
