package com.demowebshop.automation.generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFrom_Excel implements FrameWork_Constant
{
     public static Object[][] getMultipleData() throws EncryptedDocumentException, IOException
     {
    	 FileInputStream fis = new FileInputStream(EXCEL);
         Sheet sheet = WorkbookFactory.create(fis).getSheet(SHEET);
         int rows=sheet.getPhysicalNumberOfRows();
         int cells=sheet.getRow(0).getPhysicalNumberOfCells();
         Object[][] arr = new Object[rows-1][cells];
         for (int i = 0; i < rows-1; i++) 
         {
			for (int j = 0; j < cells; j++) 
			{
				arr[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		 }
         return arr;
     }
     public static String getSingleData(String sheet,int row ,int cell) throws EncryptedDocumentException, IOException
     {
    	 FileInputStream fis = new FileInputStream(EXCEL);
         String data= WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).toString();
         return data;
     }
}
