package com.demowebshop.automation.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.demowebshop.automation.generics.Base_Class;
import com.demowebshop.automation.generics.ConversionToDouble;
import com.demowebshop.automation.generics.DataProviderClass;
import com.demowebshop.automation.generics.ReadDataFrom_Excel;
import com.demowebshop.automation.generics.ReadDatafor_PropertyFile;
import com.demowebshop.automation.generics.Utility_JavaScriptExecutor;
import com.demowebshop.automation.generics.Utility_Select;
import com.demowebshop.automation.pom.POM_EndToEnd;
@Listeners(com.demowebshop.automation.generics.ListernersClass.class)
public class TS_EndtoEndflow extends Base_Class
{
	@Test(dataProvider = "testdata",dataProviderClass = DataProviderClass.class)
	public void script(String user, String pass) throws InterruptedException, EncryptedDocumentException, IOException
	{
		POM_EndToEnd p = new POM_EndToEnd(driver);
		p.login_link().click();
		p.email().sendKeys(user);
		p.Pass().sendKeys(pass);
		p.Chk_box().click();
		p.Login_btn().click();
		Thread.sleep(2000);
		p.Books_tab().click();
		Utility_Select.select_dropdown(p.Sort_by()).selectByVisibleText(ReadDataFrom_Excel.getSingleData("Sheet2", 0, 0));
		Utility_Select.select_dropdown(p.Page_size()).selectByVisibleText(ReadDatafor_PropertyFile.getDatafromPropFile("option1"));
		Utility_Select.select_dropdown(p.Viewmode()).selectByVisibleText(ReadDatafor_PropertyFile.getDatafromPropFile("option2"));
		Thread.sleep(2000);
		p.Computing_int().click();
		Thread.sleep(2000);
		Utility_JavaScriptExecutor.executeJS(driver).executeScript("arguments[0].scrollIntoView()",p.Fictionbook());
		Thread.sleep(2000);
		p.Fiction().click();
		Thread.sleep(2000);
		p.Healthbook().click();
		Thread.sleep(2000);
		p.Close().click();
		Thread.sleep(2000);
		Utility_JavaScriptExecutor.executeJS(driver).executeScript("arguments[0].scrollIntoView()",p.Cart_link());
		Thread.sleep(2000);
		
		p.Cart_link().click();
		Thread.sleep(2000);
		double c_price = ConversionToDouble.convert(p.Cprice().getText());
		double f_price = ConversionToDouble.convert(p.Fprice().getText());
		double h_price = ConversionToDouble.convert(p.Hprice().getText());
		if(c_price>f_price   && c_price>h_price)
		{
			p.Comp_cbox().click();
			p.Update_cart_btn().click();
			Thread.sleep(2000);
			Assert.fail();
		}
		else if(f_price>h_price)
		{
			p.Fic_cbox().click();
			p.Update_cart_btn().click();
			Thread.sleep(2000);
			Assert.fail();
		}
		else
		{
			p.Health_cbox().click();
			p.Update_cart_btn().click();
			Thread.sleep(2000);
			Assert.fail();

		}
	}
}
