package com.qa.testscripts;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String DateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		
		
		AShot Screen = new AShot();
		
		Screenshot SShot = Screen.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(driver);
		
		String Dest = System.getProperty("user.dir") + "/Screenshots/" + "FullPage" + DateName + ".jpg";
		try {
			ImageIO.write(SShot.getImage(), "jpg", new File(Dest));	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		driver.close();
		
		
		
	}

}
