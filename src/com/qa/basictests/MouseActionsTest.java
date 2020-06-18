package com.qa.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Hot Meals")).click();

	}

}
