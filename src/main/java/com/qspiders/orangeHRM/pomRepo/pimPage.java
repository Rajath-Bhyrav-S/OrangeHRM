package com.qspiders.orangeHRM.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pimPage 
{
	WebDriver driver;
	
	public pimPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement AddButton;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement FirstNameTextField;
	
	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	private WebElement MiddleNameTextField;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement LastNameTextField;
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement CreateLoginButtonToggle;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement SaveButton;
	
	

}
