package com.qa.objectrepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

public class ReadProps {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium Practice\\RestAPITest\\SeleniumSessions\\src\\com\\qa\\objectrepo\\config.properties");
		
		property.load(fis);
		System.out.println(property.getProperty("Name"));
		
	}

}
