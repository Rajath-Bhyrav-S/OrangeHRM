package com.qspiders.orangeHRM.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buzzPage 
{
	WebDriver driver;
	
	public buzzPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Share Photos']")
	private WebElement sharePhotosButton;
	
	@FindBy(xpath = "//div[@class='orangehrm-buzz-post-modal-header-text']//textarea[@placeholder=\"What's on your mind?\"]")
	private WebElement TextBoxInSharePhotosButton;
	
	@FindBy(xpath = "//div[@class='oxd-file-div oxd-file-div--active']")
	private WebElement UploadPhotoInSharePhotos;
	
	@FindBy(xpath = "//div[@class='oxd-form-actions orangehrm-buzz-post-modal-actions']//button[1]")
	private WebElement ShareButtonInSharePhotos;
	
	@FindBy(xpath = "((//button[@type='button'])[8]")
	private WebElement PostOptions;
	
	@FindBy(xpath = "//li[@class='--active']//li[1]")
	private WebElement DeleteOption;
	
	@FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
	private WebElement DeleteConfirm;

	public WebElement getPostOptions() {
		return PostOptions;
	}

	public WebElement getDeleteOption() {
		return DeleteOption;
	}

	public WebElement getDeleteConfirm() {
		return DeleteConfirm;
	}

	public WebElement getShareButtonInSharePhotos() {
		return ShareButtonInSharePhotos;
	}

	public WebElement getSharePhotosButton() {
		return sharePhotosButton;
	}

	public WebElement getTextBoxInSharePhotosButton() {
		return TextBoxInSharePhotosButton;
	}

	public WebElement getUploadPhotoInSharePhotos() {
		return UploadPhotoInSharePhotos;
	}
	
	

}
