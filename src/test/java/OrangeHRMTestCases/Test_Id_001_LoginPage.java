package OrangeHRMTestCases;

import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.DashBoardPage;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class Test_Id_001_LoginPage extends BaseClass{
	@Test
	public void EnterValuesToHomePage() throws Throwable
	{
		webDriverUtils.implicitWait(driver);
		loginPage homePage = new loginPage(driver);
		homePage.getEmailIdTextField().sendKeys(fileUtils.readCommonData("username"));
		homePage.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		homePage.getLoginButton().click();
		Thread.sleep(3000);
		DashBoardPage Dashboard = new DashBoardPage(driver);
		Dashboard.getProfileDropDown().click();
		Thread.sleep(3000);
		Dashboard.getLogoutButton().click();
	}

}
