package com.qa.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions actions = new Actions(driver);
		WebElement clickandmove = driver.findElement(By.id("draggable"));
		WebElement dropEle = driver.findElement(By.id("droppable"));
		actions.clickAndHold(clickandmove).moveToElement(dropEle).release().build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
