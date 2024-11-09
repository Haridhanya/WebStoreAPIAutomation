package com.WebStore.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	 public static Properties prop;
	 public static WebDriver driver;
	public Properties loadprop() throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Hari\\eclipse-workspace\\WebStore\\config.properties");
		
		prop=new Properties();
		prop.load(file);
		return prop;
		
	}
	@BeforeTest
	public void launchBrowser() throws IOException
	{
		loadprop();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
