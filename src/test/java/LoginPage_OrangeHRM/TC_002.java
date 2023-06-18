package LoginPage_OrangeHRM;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class TC_002 extends BaseClass
{
	@Test
	public void ClickOnTheForgotPassword() throws IOException
	{
		webDriverUtils.implicitWait(driver);
		loginPage loginpage = new loginPage(driver);
		loginpage.getForgotPassword().click();
		String CurrentURL = driver.getCurrentUrl();
		//Assert.assertEquals(fileUtils.readCommonData("ForgotPasswordURL")),CurrentURL );
		String ExpectedURL = fileUtils.readCommonData("ForgotPasswordURL");
		Assert.assertEquals(CurrentURL, ExpectedURL);
		System.out.println("The Forgotten password page reached");
	}

}
