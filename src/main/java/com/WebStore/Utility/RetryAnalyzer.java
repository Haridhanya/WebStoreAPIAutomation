package com.WebStore.Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	 private int retryCount = 0;
	    private static final int maxRetryCount = 3;  // Number of times to retry

	    @Override
	    public boolean retry(ITestResult result) {
	        if (retryCount < maxRetryCount) {
	            retryCount++;
	            System.out.println("Retrying test " + result.getName() + " for the " + retryCount + " time(s).");
	         
	        }
	        return false;
	      
	    }

	    
	}

