package TestScript_OrangeHRM;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.SideBar;
import com.qspiders.orangeHRM.pomRepo.adminPage;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class deleteANationality extends BaseClass
{
	@Test
	public void DeleteANationality() throws Throwable
	{
		loginPage lp = new loginPage(driver);
		SideBar sb = new SideBar(driver);
		adminPage ap = new adminPage(driver);
		
		//Login page procedure 
		lp.getEmailIdTextField().sendKeys(fileUtils.readCommonData("username"));
		lp.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		lp.getLoginButton().click();
		System.out.println("The Login of the page has been sucessfull");
		
		//Go to the side bar and click on the Admin page 
		sb.getAdminPageLink().click();
		System.out.println("The admin page button has been clicked.....");
		
		//Go to the admin page 
		@find
		
	}
	

}
