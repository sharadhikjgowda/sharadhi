package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.basicOperations.BasicOperations;
import com.basicOperations.ExcelData;
import com.projectObjectModel.HomePage;

public class SearchingMethod extends BasicOperations

{
  @Test
  public static void mobile() throws EncryptedDocumentException, IOException
  {
	  HomePage hp=new HomePage(driver);
	String search_value = ExcelData.excledata("HomeScreen",1,0);
	hp.searching(search_value);
	hp.searchbu();
	
	
  }
	
	

}
