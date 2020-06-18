package com.qa.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		driver.quit();
	}

}
