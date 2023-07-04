package TestScript_OrangeHRM;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.qspiders.orangeHRM.genaricutilities.BaseClass;
import com.qspiders.orangeHRM.pomRepo.DashBoardPage;
import com.qspiders.orangeHRM.pomRepo.SideBar;
import com.qspiders.orangeHRM.pomRepo.buzzPage;
import com.qspiders.orangeHRM.pomRepo.loginPage;

public class uploadAndDeleteAPost extends BaseClass
{
	@Test
	public void createAndDeleteAPost() throws Throwable
	{
		loginPage lp = new loginPage(driver);
		SideBar sb = new SideBar(driver);
		buzzPage bz = new buzzPage(driver);
		DashBoardPage db = new DashBoardPage(driver);
		
		lp.getEmailIdTextField().sendKeys(fileUtils.readCommonData("username"));
		lp.getPasswordTextField().sendKeys(fileUtils.readCommonData("password"));
		lp.getLoginButton().click();
		System.out.println("The login has been sucessfull.....");
		
		//Go to the side bar and click on buzz to upload a photo 
		sb.getBuzzPageLink().click();
		System.out.println("The Buzz page has been opened....");
		
		
		//Click on photos and upload the share photos and uplaod the photo
		bz.getSharePhotosButton().click();
		System.out.println("The share button was clicked...");
		bz.getTextBoxInSharePhotosButton().sendKeys(generateRandomString(200));
		System.out.println("The text was updated");
		bz.getUploadPhotoInSharePhotos().click();
		Thread.sleep(1000);
		System.out.println("The photo share button was clicked");
		
		//Now importing robot class for further progress 
		 Robot rb = new Robot();
		 rb.delay(1000);
		 String picRoot = fileUtils.readCommonData("Laptop_Pic_Root");
		 StringSelection ss = new StringSelection(picRoot);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		 //Now Performing the operation on the poppedupwindow
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 System.out.println("The Copy function has been performed");
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 System.out.println("The paste function is completed...");
		 
		 //Now the robot class is clicking on the enter button 
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 rb.delay(2000);
		 
		 
		 //Now the control is back with webdriver
		 bz.getShareButtonInSharePhotos().click();
		 webDriverUtils.implicitWait(driver);
		 
		 //Now deleting the function
		 bz.getPostOptions().click();
		 System.out.println("The post has been found the options for the post was clicked...");
		 bz.getDeleteOption().click();
		 bz.getDeleteConfirm().click();
		 System.out.println("The Post has been deleted");
		 db.getProfileDropDown().click();
		 db.getLogoutButton().click();
		 
		 
		 
	}

}
