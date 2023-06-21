package EndToEndTesting_OrangeHRM;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Month;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		System.out.println("The first name text field is entered");
		dp.getMiddleNameTextField().sendKeys(generateRandomString(6));
		System.out.println("The middle name text field is entered");
		dp.getLastNameTextField().sendKeys(generateRandomString(2));
		System.out.println("The last name text field has been entered ");
		dp.getProfilePic().click();
		Robot rb = new Robot();
		rb.delay(1000);
		// Now i am copying the path of the image which i need to upload 
		StringSelection ss = new StringSelection("C:\\Users\\rajat\\eclipse-workspace\\Rajath\\src\\test\\sources\\iron_man_artwork_4k_2.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		//Now i am performing the CTRL + V function on the keyboard 
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		System.out.println("The copy function is performed");
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		System.out.println("The enter fucntion is completed");
		
		//Now i am performing the enter key operation 
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);		
		System.out.println("The enter function is done");
		dp.getSaveButton().submit();
		System.out.println("The profile has been saved");
		
		
		//Now click on the selecting the date of the lisence expiery 
		dp.getExpieryDateBox().click();
		System.out.println("The date text box has been clicked");
		while(true)
		{
			String mon = dp.getExpieryMonth().getText();
			String yr = dp.getExpieryYear().getText();
			 String Year = fileUtils.readCommonData("Expiry_Year");
			 String Month = fileUtils.readCommonData("Expiry_Month");
			 String Date= fileUtils.readCommonData("Expiry_Date");
			if(mon.equalsIgnoreCase(Month)&& yr.equals(Year))
			{
				break;
			}
			else 
			{
				dp.getNextButton().click();
			}
			//Date selection 
			List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='oxd-calendar-dates-grid']/div"));
			for(WebElement ele:allDates)
			{
				String dt =ele.getText();
				if(dt.equals(Date))
				{
					ele.click();
					break;
				}
			}
				
			
		}
		
	}

}
