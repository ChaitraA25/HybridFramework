package com.demowebshop.automation.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Select 
{
      public static Select select_dropdown(WebElement drop)
      {
    	  Select sel = new Select(drop);
    	  return sel;
      }
}
