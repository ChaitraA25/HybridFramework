package com.demowebshop.automation.generics;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListernersClass  extends Base_Class implements ITestListener 
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test case Pass "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test case Failed "+ result.getName());
		try 
		{ 
			test.log(Status.FAIL,"failed");
			test.addScreenCaptureFromPath(TakeScreenshot.getScreenshot(driver,result));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test case Skipped "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("failed with success % "+ result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		System.out.println("Failed with timeout "+ result.getName());
	}
}
