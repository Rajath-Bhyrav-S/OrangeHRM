package com.qspiders.orangeHRM.pomRepo;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class adminPage 
{
	WebDriver driver;
	
	public adminPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBys(XPath = "(//div[@class='oxd-table-card'])")
	private WebElement NationalityList;

	public WebElement getNationalityList() {
		return NationalityList;
	}
	
		
	

}
