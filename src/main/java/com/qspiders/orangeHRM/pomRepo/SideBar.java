package com.qspiders.orangeHRM.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBar 
{
	WebDriver driver;
	
	public SideBar(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchButton;
	
	@FindBy(xpath = "//span[normalize-space()='Admin']")
	private WebElement AdminPageLink;
	
	@FindBy(xpath = "//span[normalize-space()='PIM']")
	private WebElement PIMPageLink;
	
	@FindBy(xpath = "//span[normalize-space()='Leave']")
	private WebElement LeavePageLink;
	
	@FindBy(xpath = "//span[normalize-space()='Time']")
	private WebElement TimePageLink;
	
	@FindBy(xpath = "//span[normalize-space()='Recruitment']")
	private WebElement RecruitmentPageLink;
	
	@FindBy(xpath = "//span[normalize-space()='My Info']")
	private WebElement MyInfoPageLink;
	
	@FindBy(xpath = "//span[normalize-space()='Performance']")
	private WebElement PerformancePageLink;
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	private WebElement DashBaordPageLink;
	
	@FindBy(xpath = "//span[normalize-space()='Directory']")
	private WebElement DirectoryPageLink;
	
	@FindBy(xpath = "//span[normalize-space()='Maintenance']")
	private WebElement MaintenancePageLink;
	
	@FindBy(xpath = "//span[normalize-space()='Buzz']")
	private WebElement BuzzPageLink;

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getAdminPageLink() {
		return AdminPageLink;
	}

	public WebElement getPIMPageLink() {
		return PIMPageLink;
	}

	public WebElement getLeavePageLink() {
		return LeavePageLink;
	}

	public WebElement getTimePageLink() {
		return TimePageLink;
	}

	public WebElement getRecruitmentPageLink() {
		return RecruitmentPageLink;
	}

	public WebElement getMyInfoPageLink() {
		return MyInfoPageLink;
	}

	public WebElement getPerformancePageLink() {
		return PerformancePageLink;
	}

	public WebElement getDashBaordPageLink() {
		return DashBaordPageLink;
	}

	public WebElement getDirectoryPageLink() {
		return DirectoryPageLink;
	}

	public WebElement getMaintenancePageLink() {
		return MaintenancePageLink;
	}

	public WebElement getBuzzPageLink() {
		return BuzzPageLink;
	}
	

}
