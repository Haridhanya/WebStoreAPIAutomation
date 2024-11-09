package com.WebStore.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.WebStore.BaseClass.BaseClass;
import com.WebStore.PageObjects.Objects;
import com.WebStore.Utility.RetryAnalyzer;
import com.WebStore.Utility.TestListener;

@Listeners(TestListener.class)
public class TestCase extends BaseClass{
	
	Objects o;

	
	@Test (priority=1)
	public void GotoUrl()
	{
		String URL=prop.getProperty("url");
		driver.get(URL);
		driver.manage().window().maximize();
		String titleE="404 Not Found";
		Assert.assertEquals(titleE, driver.getTitle());
	}
	
	@Test (priority=2)
	public void clickSignin()
	{		
		o=new Objects(driver);
			o.signIn.click();
}
	
	@Test(priority=3)
	public void EnterLoginCredentials()
	{
		o.email.sendKeys(prop.getProperty("email"));
		o.pass.sendKeys(prop.getProperty("password"));
		o.submit.click();
	}
	
	@Test(priority=4)
	public void getResult()
	{
		
		if(o.resultFail.isDisplayed())
		{
			String result=o.resultFail.getText();
			System.out.println(result);
			
			
		}
		else
		{
			System.out.println("element not found");
		}
	}
	
}