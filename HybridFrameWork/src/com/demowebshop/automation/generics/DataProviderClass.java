package com.demowebshop.automation.generics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name ="testdata")
    public Object[][] getMultipleData() throws EncryptedDocumentException, IOException
    {
    	Object[][] data=ReadDataFrom_Excel.getMultipleData();
    	return data;
    }
}
