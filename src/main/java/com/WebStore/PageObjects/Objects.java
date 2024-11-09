package com.WebStore.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objects {

	
	@FindBy(xpath="//*[@title='Log in to your customer account']")
	public WebElement signIn;
	public WebDriver driver;
	
	@FindBy(id="email")public WebElement email;
	@FindBy(id="passwd")public WebElement pass;
	@FindBy(id="SubmitLogin")public WebElement submit;
    @FindBy(xpath="//div/ol/li")public WebElement resultFail;

	 public Objects(WebDriver driver) {
	        //this.driver = driver;
	        PageFactory.initElements(driver, this);  // This initializes all @FindBy elements
	    }


	 
	 
	 
	
}


