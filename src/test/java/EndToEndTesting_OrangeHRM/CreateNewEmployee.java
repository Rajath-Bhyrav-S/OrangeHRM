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
		String FirstName = generateRandomString(5);
		dp.getFirstNameTextField().sendKeys(FirstName);
		System.out.println("The first name text field is entered");
		String MiddleName = generateRandomString(5);
		dp.getMiddleNameTextField().sendKeys(MiddleName);
		System.out.println("The middle name text field is entered");
		String LastName = generateRandomString(3);
		dp.getLastNameTextField().sendKeys(LastName);
		System.out.println("The last name text field has been entered ");
		dp.getEmployeeID().clear();
		dp.getEmployeeID().sendKeys(generateRandomString(4));
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

		//Now the operations for Dropdown button of nationality is selected 
		dp.getNationalityDropDown().click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//div"));
		System.out.println("No of options"+ options.size());
		for(WebElement product: options)
		{
			if(product.getText().equals("Indian"))
			{
				product.click();
				System.out.println("Country Option was selected");
				break;
			}
		}
		
		//Now the operations for drop down menu of maritial status begins 
		dp.getMaritialStatus().click();
		List<WebElement> MaritialOption = driver.findElements(By.xpath("//div[@role='listbox']//div"));
		for(WebElement MO: MaritialOption)
		{
			if(MO.getText().equals("Single"))
			{
				MO.click();
				System.out.println("Single option selected");
				break;
			}
		}
		
		//Now the operations for Date of birth has begun 
		dp.getDateOfBirth().click();
		String BirthDay = fileUtils.readCommonData("Birth_Date");
		String BirthMonth = fileUtils.readCommonData("Birth_Month");
		String BirthYear = fileUtils.readCommonData("Birth_Year");
		dp.getDateOfBirth().sendKeys(BirthYear+"-"+BirthMonth+"-"+BirthDay);
		System.out.println("Date of birth has been selected");
		
		//Now clicking on the gender
		dp.getGender().click();
		System.out.println("Male gender has been chosen");
		
		//Now clicking on save
		dp.getEmployeeListSaveButton().click();
		System.out.println("The save button has been clicked");
		
		//Now going back to pim
		dp.getPim().click();
		
		//Now search for employee
		dp.getEmployeeName().sendKeys(FirstName);
		Thread.sleep(2000);
		
		//Now click on search 
		dp.getSearchOfPIM().click();
		
		//Now click on the delete button and confirm delete
		dp.getDeleteEmployee().click();
		dp.getConfirmDelete().click();
		System.out.println("Last Element was clicked");
		
	}
}
		
		
		
			
		
	