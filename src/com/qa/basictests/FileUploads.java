package com.qa.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		//Selenium cannot handle window popups - like to browse and upload files. So we should not click on the browse buttons
		//we need to send the file path as send keys and it get uploaded
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("D:\\Selenium Practice\\RestAPITest\\Trial.txt");
		driver.quit();
	}

}
