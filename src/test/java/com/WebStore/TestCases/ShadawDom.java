package com.WebStore.TestCases;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadawDom {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(null);
		WebElement ShadowHost=driver.findElement(By.id("customizeButtons"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ShadowRoot=(WebElement) js.executeScript("return arguments[0].shadowRoot", ShadowHost);
		WebElement target=ShadowRoot.findElement(By.id("customizeButton"));
		System.out.println(target.getText()); 
		target.click();
		
		
		
		
	}

}
