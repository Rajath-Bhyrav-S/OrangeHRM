package OrangeHRMTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.DashBoardPage;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class Test_Id_002_LoginPageDDT extends BaseClass
{
	
	loginPage lp= new loginPage(driver);
	DashBoardPage db = new DashBoardPage(driver);
	@Test(dataProvider = "LoginData")
	//Maybe Problem 
	public void loginTest(String user, String pwd, String exp)
	{
		lp.getEmailIdTextField().sendKeys(user);
		lp.getPasswordTextField().sendKeys(pwd);
		lp.getLoginButton().click();
		
		String expected_URL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String Actual_URL= driver.getCurrentUrl();
		System.out.println(Actual_URL);
		
		if(exp.equals("Valid"))
		{
			if(expected_URL.equals(Actual_URL))
			{
				db.getProfileDropDown().click();
				db.getLogoutButton().click();
				Assert.assertTrue(true);
			}
			else 
			{
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Valid"))
		{
			if(expected_URL.equals(Actual_URL))
			{
				db.getProfileDropDown().click();
				db.getLogoutButton().click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
			
			
		}
	}
	
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String loginData[][]= {
				{"Admin", "admin123", "Valid"},
				{"deepak", "deepak123", "InValid"},
				{"Suraj", "deepak123", "InValid"}
		};
		
		return loginData;
	}
	


}

