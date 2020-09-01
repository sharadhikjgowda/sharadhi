package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.basicOperations.BasicOperations;
import com.basicOperations.ExcelData;
import com.projectObjectModel.HomePage;

import junit.framework.Assert;

public class SearchTv  extends BasicOperations 
{
	@Test(priority=0)
	public static void tv() throws EncryptedDocumentException, IOException
	{
		String expected = driver.getTitle();
		String actual = "Onlin Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",title;
				
		//Assert.assertEquals(expected,actual);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		
		HomePage hp= new HomePage(driver);
		String search_value=ExcelData.excledata("HomeScreen",2,0);
		hp.searching(search_value);
		hp.searchbu();
		
		
	}
	
	@Test(priority=1)
	public static void tv1() throws EncryptedDocumentException, IOException
	{
		String expected = driver.getTitle();
		String actual = "Onlin Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",title;
				
		//Assert.assertEquals(expected,actual);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		
		HomePage hp= new HomePage(driver);
		String search_value=ExcelData.excledata("HomeScreen",2,0);
		hp.searching(search_value);
		hp.searchbu();
		
		
	}
	

}
