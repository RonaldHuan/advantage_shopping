package br.com.advantage.core.webdriver.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	private static WebDriver driver;
	
	private static WebDriver setUp() {
		System.setProperty("webdriver.chrome.driver",
				"./chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver getDriver() {
		if(driver != null) {
			return driver;
		}
		
		WebDriver driver = setUp();
		return driver;
	}
	
	public static void finish() {
		tirarScreenShot();
		driver.quit();
		driver = null;
	}
	
	public static void tirarScreenShot() {
		File screenShot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("./evidencias/advantage_shopping.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
