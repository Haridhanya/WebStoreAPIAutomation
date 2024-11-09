package com.WebStore.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
////		WebElement ele=driver.findElement(By.name("q"));
////		ele.sendKeys("Haridhanya");
		driver.get("https://www.google.com/search?q=Haridhanya");
	//iver.findElement(By.className("QCzoEc z1asCe MZy1Rb")).click();
	WebElement e=driver.findElement(By.xpath("//*[text()='Haridhanya A - Bengaluru, Karnataka, India']"));
	String text=e.getText();
	System.out.println(text);
	Assert.assertEquals(e.getText(),"Haridhanya A - Bengaluru, Karnataka, India");
	
	
	
	driver.close();
	
		
		
	}

}
