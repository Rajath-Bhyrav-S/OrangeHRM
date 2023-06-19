package EndToEndTesting_OrangeHRM;

import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.DashBoardPage;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class CreateNewEmployee extends BaseClass 
{
	@Test
	public void createAnEmployee() throws Throwable
	{
		loginPage lp = new loginPage(driver);
		DashBoardPage dp = new DashBoardPage(driver);
		//Adding the valid ID and password
		lp.getEmailIdTextField().sendKeys(fileUtils.readCommonData("username"));
		lp.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		lp.getLoginButton().submit();
		dp.getPim().click();
		System.out.println("Pim page has been opened");
		dp.getAddButton().click();
		System.out.println("Add button has been clicked");
		dp.getFirstNameTextField().sendKeys(generateRandomString(5));
		Thread.sleep(2000);
		
	}

}
