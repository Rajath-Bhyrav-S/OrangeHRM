package com.qspiders.orangeHRM.genaricutilities;

import java.io.File;


import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	public FileUtility fileUtils = new FileUtility();
	public XLUtils excelutils = new XLUtils(null);
	public JavaUtlity javaUtils = new JavaUtlity();
	public WebDriverUtlities webDriverUtils = new WebDriverUtlities();

	@BeforeClass
	public void configBeforeMethod() throws IOException {
		String browserName = fileUtils.readCommonData("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtils.readCommonData("url"));
		webDriverUtils.implicitWait(driver);
	}

	@AfterClass
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
	public void captureScreenShot(WebDriver driver, String tname) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir")+"/Screenshots/"+ tname+ ".png");
	FileUtils.copyFile(source,target);
	}


}
