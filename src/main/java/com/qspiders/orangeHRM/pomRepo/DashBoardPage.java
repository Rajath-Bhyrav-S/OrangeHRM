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
	
	@FindBy (xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement ExpieryDate;
	
	@FindBy (xpath = "//p[normalize-space()='June']")
	private WebElement ExpieryMonth;
	
	@FindBy (xpath = "//li[@class='oxd-calendar-selector-year']//p[1]")
	private WebElement ExpieryYear;
	
	@FindBy (xpath = "//li[@class='oxd-calendar-selector-year']//p[1]")
	private WebElement PreviousButton;
	
	@FindBy (xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]/i[1]")
	private WebElement NextButton;
	
	@FindBy (xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	private WebElement NationalityDropDown;
	
	@FindBy (xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement EmployeeID;
	
	@FindBy (xpath = "//div[@role='listbox']//div")
	private WebElement CountryList;
	
	@FindBy (xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")
	private WebElement SaveButton1;
	
	@FindBy (xpath = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
	private WebElement MaritialStatus;
	
	@FindBy (xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
	private WebElement DateOfBirth;
	
	@FindBy (xpath = "//label[normalize-space()='Male']")
	private WebElement Gender;
	
	@FindBy (xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement EmployeeName;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement SearchOfPIM;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private WebElement DeleteEmployee;
	
	@FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
	private WebElement ConfirmDelete;

	public WebElement getEmployeeName() {
		return EmployeeName;
	}
	public WebElement getSearchOfPIM() {
		return SearchOfPIM;
	}
	public WebElement getDeleteEmployee() {
		return DeleteEmployee;
	}
	public WebElement getConfirmDelete() {
		return ConfirmDelete;
	}
	public WebElement getSaveButton1() {
		return SaveButton1;
	}
	public WebElement getMaritialStatus() {
		return MaritialStatus;
	}
	public WebElement getDateOfBirth() {
		return DateOfBirth;
	}
	public WebElement getGender() {
		return Gender;
	}
	public WebElement getEmployeeListSaveButton() {
		return SaveButton1;
	}
	public WebElement getCountryList() {
		return CountryList;
	}
	public WebElement getExpieryDate() {
		return ExpieryDate;
	}
	public WebElement getEmployeeID() {
		return EmployeeID;
	}
	public WebElement getNationalityDropDown() {
		return NationalityDropDown;
	}
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
	public WebElement getExpieryDateBox() {
		return ExpieryDate;
	}
	public WebElement getExpieryMonth() {
		return ExpieryMonth;
	}
	public WebElement getExpieryYear() {
		return ExpieryYear;
	}
	public WebElement getPreviousButton() {
		return PreviousButton;
	}
	public WebElement getNextButton() {
		return NextButton;
	}
	
	
	
	

}
