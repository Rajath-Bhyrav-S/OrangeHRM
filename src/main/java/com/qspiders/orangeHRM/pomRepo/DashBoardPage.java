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
	public WebElement getAddButton() {
		return AddButton;
	}
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement ProfileDropDown;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement LogoutButton;
	
	@FindBy(xpath = "//span[normalize-space()='PIM']")
	private WebElement Pim;
	
	@FindBy (xpath = "//div[@class='oxd-file-div oxd-file-div--active']")
	private WebElement ProfilePic;
	
	@FindBy (xpath = "//input[@placeholder='First Name']")
	private WebElement FirstNameTextField;
	
	@FindBy (xpath = "//input[@placeholder='Middle Name']")
	private WebElement MiddleNameTextField;
	
	@FindBy (xpath = "//input[@placeholder='Last Name']")
	private WebElement LastNameTextField;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement SaveButton;
	
	@FindBy (xpath = "//button[normalize-space()='Add']")
	private WebElement AddButton;

	public WebElement getProfilePic() {
		return ProfilePic;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getMiddleNameTextField() {
		return MiddleNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getPim() {
		return Pim;
	}

	public WebElement getProfileDropDown() {
		return ProfileDropDown;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	
	

}
