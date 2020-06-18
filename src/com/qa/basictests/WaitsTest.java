package com.qa.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//dynamic waits - if the page loads in 10 second, then rest 30 seconds will be ignored
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("after timeout");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
	}

}
