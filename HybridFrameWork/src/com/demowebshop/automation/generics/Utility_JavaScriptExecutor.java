package com.demowebshop.automation.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utility_JavaScriptExecutor 
{
	public static JavascriptExecutor executeJS(WebDriver driver)
	{
       JavascriptExecutor js = (JavascriptExecutor)driver;
	   return js;
	}
}
