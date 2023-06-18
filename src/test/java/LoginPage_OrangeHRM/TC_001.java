package LoginPage_OrangeHRM;

import org.testng.annotations.Test;


import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class TC_001 extends BaseClass
{
	@Test
	public void ClickOnTheLoginAndPasswordTextField()
	{
		webDriverUtils.implicitWait(driver);
		loginPage loginPage = new loginPage(driver);
		loginPage.getEmailIdTextField().click();
		loginPage.getPasswordTextField().click();
	}

}
