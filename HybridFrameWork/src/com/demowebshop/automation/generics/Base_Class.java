
 
package com.demowebshop.automation.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_Class implements FrameWork_Constant
{ 
	public ExtentTest test;
	public ExtentReports report;
	@BeforeClass
	public void extentReport()
	{
		ExtentHtmlReporter ehtml = new ExtentHtmlReporter("./Report/extent.html");
		report = new ExtentReports();
		report.attachReporter(ehtml);
		test = report.createTest("Extent Report");
	}
	public static WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod
	
	public void openapp(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TIME,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://demowebshop.tricentis.com");
		}
		else
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TIME,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://demowebshop.tricentis.com");
		}
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	@AfterClass
	public void closeReport()
	{
		report.flush();
	}
}
