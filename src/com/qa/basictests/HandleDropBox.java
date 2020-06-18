package com.qa.basictests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
		select.selectByVisibleText("Automotive");
		Thread.sleep(2000);
		select.selectByIndex(9);
		
		//isMultiple lets us know if we can select multiple items in the element
		System.out.println(select.isMultiple());
		
		//to count the number of options available in the dropdown
		List<WebElement> selectOptions = select.getOptions();
		System.out.println(selectOptions.size());
		
		driver.quit();
	}

}
