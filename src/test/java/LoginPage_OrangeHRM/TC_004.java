package LoginPage_OrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class TC_004 extends BaseClass 
{
	@Test
	public void EnterInvalidUserName() throws Throwable
	{
		loginPage lp = new loginPage(driver);
		lp.getEmailIdTextField().sendKeys(fileUtils.readCommonData("InvalidUsername"));
		Thread.sleep(2000);
		lp.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		Thread.sleep(2000);
		lp.getLoginButton().click();
		String ActualText =lp.getInvalidCredentials().getText();
		Assert.assertEquals(ActualText, "Invalid credentials");
		System.out.println("The invalid username is not accepted");
	}


}
