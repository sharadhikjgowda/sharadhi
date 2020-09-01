package com.basicOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements constantValues
{
	public static String excledata(String sheet_name,int row_no,int column_num) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(Excel_path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(sheet_name);
		Row r=s.getRow(row_no);
		Cell c=r.getCell(column_num);
		String val=c.getStringCellValue();
		System.out.println(val);
		return val;
	
	}
}


