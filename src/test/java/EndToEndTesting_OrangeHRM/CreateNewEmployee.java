package EndToEndTesting_OrangeHRM;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.Month;
import java.util.Iterator;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
		/*dp.getEmployeeID().clear();
		dp.getEmployeeID().sendKeys(generateRandomNumber(5));*/
		dp.getProfilePic().click();
		Robot rb = new Robot();
		rb.delay(1000);
		// Now i am copying the path of the image which i need to upload 
		//StringSelection ss = new StringSelection("C:\\Users\\rajat\\eclipse-workspace\\Rajath\\src\\test\\sources\\iron_man_artwork_4k_2.jpg");
		StringSelection ss = new StringSelection("C:\\Users\\Lenovo\\eclipse-workspace\\OrangeHRM\\src\\test\\sources\\iron_man_artwork_4k_2.jpg");

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
		dp.getSaveButton().click();
		System.out.println("The profile has been saved");
		
		
		//Now click on the selecting the date of the license expire
		Thread.sleep(5000);
		dp.getExpieryDateBox().click();
		String Date = fileUtils.readCommonData("Expiry_Date");
		String Month = fileUtils.readCommonData("Expiry_Month");
		String Year = fileUtils.readCommonData("Expiry_Year");
		dp.getExpieryDateBox().sendKeys(Year+"-"+Month+"-"+Date);
		WebElement dpCountry = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		dpCountry.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']/div[@role='option']"));
		for (WebElement options1 : options) 
		{
			if(options1.equals("Afghan"))
			{
				options1.click();
				System.out.println("click action performed");
			}
			}
		Thread.sleep(2000);
	}
}
		
		
		
			
		
	