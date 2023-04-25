package com.demowebshop.automation.generics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class TakeScreenshot 
{
	public static String getScreenshot(WebDriver driver, ITestResult result )
	{
		Date d = new Date();
		String date = d.toString().replace('/',':');
		String path="./Screenshots/"+date+".jpeg";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try 
		{
			FileHandler.copy(src, dest);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "."+path;
	}
}
