package LoginPage_OrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class TC_003 extends BaseClass
{
	@Test
	public void EnterTheValidDetailsInTheLoginPage() throws Throwable
	{
		webDriverUtils.implicitWait(driver);
		loginPage loginpage = new loginPage(driver);
		loginpage.getEmailIdTextField().sendKeys(fileUtils.readCommonData("username"));
		Thread.sleep(2000);
		loginpage.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		Thread.sleep(2000);
		loginpage.getLoginButton().click();
		Thread.sleep(2000);
		String CurrentURL = driver.getCurrentUrl();
		String ExpectedURL = fileUtils.readCommonData("DashBaordPage");
		Assert.assertEquals(CurrentURL, ExpectedURL);
		System.out.println("The Dashbaord page has been reached");
		
	}

}
