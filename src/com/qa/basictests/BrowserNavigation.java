package com.qa.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		//While driver.navigate.to() method navigates to an URL and It will not wait till the whole page gets loaded.
		//It maintains the browser history and cookies, so we can use forward and backward button to navigate between
		//the pages during the coding of Testcase.
		driver.navigate().to("https://www.amazon.com/");
		//driver.get("https://www.amazon.com/");
		
		//navigate
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.quit();
		
	}

}
