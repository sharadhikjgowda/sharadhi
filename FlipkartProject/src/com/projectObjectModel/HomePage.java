package com.projectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	@FindBy(xpath="//button[@class='vh79eN']")
	private WebElement ssbu;
	
	@FindBy(xpath="//span[text()='cart']")
	private WebElement cartt;
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	

}
	
	//utilization
	public void searching(String Value)
	{
		search.sendKeys(Value);
	}
	public void carting()
	{
	cartt.click();
}
	public void searchbu()
	{
		 ssbu.click();
	}

		

}
