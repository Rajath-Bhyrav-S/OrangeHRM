package com.qspiders.orangeHRM.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage 
{
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement ProfileDropDown;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement LogoutButton;

	public WebElement getProfileDropDown() {
		return ProfileDropDown;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	
	

}
