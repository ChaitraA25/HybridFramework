package com.demowebshop.automation.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDatafor_PropertyFile implements FrameWork_Constant
{
	public static String getDatafromPropFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(PROPERTY);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
