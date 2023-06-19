package EndToEndTesting_OrangeHRM;

import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.DashBoardPage;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class CreateNewEmployee extends BaseClass 
{
	loginPage lp = new loginPage(driver);
	DashBoardPage dp = new DashBoardPage(driver);
	
	@Test
	public void createAnEmployee() throws Throwable
	{
		
		//Adding the valid ID and password
		lp.getEmailIdTextField().sendKeys(fileUtils.readCommonData("username"));
		lp.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		lp.getLoginButton().submit();
		dp.getPim().click();
		
	}

}
