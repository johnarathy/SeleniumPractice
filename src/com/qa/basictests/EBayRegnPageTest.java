package com.qa.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayRegnPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//geckodriver
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
				
				//1. xpath
				driver.findElement(By.xpath("//div[@class='form-group ']//child::input[1]")).sendKeys("123456");
				WebElement ele = driver.findElement(By.xpath("//div[@class=\"form-group \"]//parent::div//preceding-sibling::div"));
				System.out.println("value : "+ ele.getText());
				//2.id
				
//				driver.findElement(By.id("firstname")).click();
//				driver.findElement(By.id("firstname")).sendKeys("Thomas");
				
				//3. name
				driver.findElement(By.name("password")).sendKeys("testpdw@123");
				driver.findElement(By.name("mobile")).sendKeys("9876543210");
				
				//4.linktext
				
				driver.findElement(By.linkText("Login!")).click();
				
				//5.partial linktext - only used when linktest is very long
				
				driver.findElement(By.partialLinkText("Living")).click();
				
				//6.css selector
				// if id - #{id}
				// if class - .{class}
				
				//driver.findElement(By.className("#idpwd")).click();
				
				//7.class
				
				//driver.findElement(By.className("myntraweb-sprite desktop-logo sprites-headerLogo")).click();
				
				driver.quit();
	}

}
