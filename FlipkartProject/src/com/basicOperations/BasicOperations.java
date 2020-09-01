package com.basicOperations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.projectObjectModel.LoginPage;

public class BasicOperations implements constantValues
{
	public static WebDriver driver;
	@BeforeMethod
	public static void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		LoginPage l1=new LoginPage(driver);
		String un=ExcelData.excledata("Login",1,0);
		String pwd=ExcelData.excledata("Login",1,1);
		
		l1.username(un);
		l1.password(pwd);
		l1.loginbu();
		Thread.sleep(5000);
		}
	
	@AfterMethod
	public static void logout() throws IOException
	{
		TakeScreenShot.screenshot();
		driver.quit();
		
	}
}