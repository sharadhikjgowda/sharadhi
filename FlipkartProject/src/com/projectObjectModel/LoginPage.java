package com.projectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
		@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
		private WebElement un;
		@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
		private WebElement pwd;
		@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
		private WebElement login;
		
		
		//initialization
		public LoginPage(WebDriver driver)
		{
		PageFactory.initElements(driver,this);
		}
		//utilization
		public void username(String uid)
		{
		un.sendKeys(uid);
		}
		public void password(String pswd)
		{
		pwd.sendKeys(pswd);
		}
		public void loginbu()
		{
			login.click();
		}

}
	
