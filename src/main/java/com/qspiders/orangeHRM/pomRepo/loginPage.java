package com.qspiders.orangeHRM.pomRepo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement EmailIdTextField;
	
	@FindBy(name="password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	private WebElement ForgotPassword;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement InvalidCredentials;
	
	

	public WebElement getInvalidCredentials() {
		return InvalidCredentials;
	}

	public WebElement getLoginButton() 
	{
		return LoginButton;
	}

	public void setEmailIdTextField(String emailIdTextField) {
		EmailIdTextField = EmailIdTextField;
	}

	public void setPasswordTextField(String passwordTextField) {
		PasswordTextField = PasswordTextField;
	}

	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}

	public WebElement getEmailIdTextField() {
		return EmailIdTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getForgotPassword() {
		return ForgotPassword;
	}

	
	

	
	
	

}
