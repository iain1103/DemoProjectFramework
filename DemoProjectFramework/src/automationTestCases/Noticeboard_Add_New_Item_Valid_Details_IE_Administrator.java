/* *******************************************************************
* Test Case Name: Noticeboard_Add_New_Item_Valid_Details_IE_Administrator
* Author: Rory Cruickshank
* Date: 23/06/2016
* Purpose: This test attempts to create a Noticeboard item using valid input for an Administrator in IE
*
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

package automationTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import appModule.*;
import pageObjectRepositories.Objects_Home_Page;
import pageObjectRepositories.Objects_Navigation_Bar;
import pageObjectRepositories.Objects_Noticeboard_Page;

public class Noticeboard_Add_New_Item_Valid_Details_IE_Administrator {

	//Declare our test variables
	public WebDriver driver;	
	private String sTestCaseName;
	private int iTestCaseRow;
	
	//Get data and open the browser
	@BeforeMethod
	public void beforeMethod() throws Exception {
	
		DOMConfigurator.configure("log4j.xml");
	
	    sTestCaseName = this.toString();
	
	    sTestCaseName = Utils.getTestCaseName(this.toString());
	
	    Log.startTestCase(sTestCaseName);
	
	    ExcelUtils.setExcelFile(Constant.Path_TestData + sTestCaseName + ".xlsx","Sheet1");
	
	    iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
	
	    driver = Utils.openBrowser(iTestCaseRow);
	    
		//Verify that we are on the correct page
		Objects_Navigation_Bar.lnk_Stan_Home(driver).isDisplayed();
		Log.info("Home button displayed");
	
	}
	
	//Run the test
	@Test
	public void main() throws Exception {
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Objects_Home_Page.Notice_Board.lnk_Add_A_Noticeboard_Item(driver));
		
		//Need a little pause to wait for the new window to appear
		Thread.sleep(3000);
		driver.switchTo().frame(1);
       
		//Verify that we are on the correct page
		Objects_Noticeboard_Page.New_Item.txt_Title(driver).isDisplayed();
		Log.info(sTestCaseName + " | New Noticeboard Item popup displayed");
				
		//Call the method to set Add New Item screen with valid details
		Methods_Noticeboard_Add_New_Item.addNoticeboardItem(driver, sTestCaseName, 1);
				
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

