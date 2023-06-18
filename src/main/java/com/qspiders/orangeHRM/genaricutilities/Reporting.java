package com.qspiders.orangeHRM.genaricutilities;
import com.aventstack.extentreports.ExtentReports;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting  extends TestListenerAdapter
{
	public ExtentSparkReporter htmlReportor;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onStart(ITestContext testContext)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-Report-"+timeStamp+".html";
		htmlReportor = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
		try {
			htmlReportor.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		extent= new ExtentReports();
		
		extent.attachReporter(htmlReportor);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Enviornment", "QA");
		extent.setSystemInfo("user", "Rajath");
		
		htmlReportor.config().setDocumentTitle("Rajath");
		htmlReportor.config().setReportName("Functional testing report");
		htmlReportor.config().setTheme(Theme.DARK);
		
		
		}
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		}
	
	public void onTestFailure(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.FAIL,  MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		
		String screenShotPath = System.getProperty("user.dir")+"\\Screenshot\\"+tr.getName()+".png";
		
		File f= new File(screenShotPath);
		
				if(f.exists())
				{
					logger.fail("ScreenShot is below:"+ logger.addScreenCaptureFromPath(screenShotPath)); 
						
					
				}
	}
	
	public void onTestCaseSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.SKIP,  MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));	
		}
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
}
