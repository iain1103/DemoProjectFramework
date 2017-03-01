/* *******************************************************************
* Test Case Name: Tasks_And_Tools_Add_New_Task_Invalid_Data_Firefox_Administrator
* Author: Rory Cruickshank
* Date: 23/06/2016
* Purpose: This test attempts to create a new Tasks and Tools task using invalid input for an Administrator
* 			in Firefox
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import appModule.*;
import pageObjectRepositories.Objects_Navigation_Bar;
import pageObjectRepositories.Objects_Site_Contents_Page;
import pageObjectRepositories.Objects_Tasks_And_Tools_Page;

public class Tasks_And_Tools_Add_New_Task_Invalid_Data_Firefox_Administrator {

	//Declare our test variables
	public WebDriver driver;	
	private String sTestCaseName;
	private int iTestCaseRow;
	private Boolean bAddAnAppExists;
	
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
	
		Objects_Navigation_Bar.Settings.btn_Settings(driver).click();
		
		Objects_Navigation_Bar.Settings.lnk_Site_Contents_Administrator(driver).click();
	
		//Verify that we are on the correct page
		Objects_Site_Contents_Page.lbl_Header(driver).isDisplayed();
		Log.info("Site Contents page displayed");
		
		//Confirm that the Add An App option is displayed
		bAddAnAppExists = driver.findElements(By.id("appadd-link")).size() != 0;
		if(bAddAnAppExists == true){
			Log.info("Add an App link displayed as expected for Administrator");
		}else{
			Log.error("Add an App link not displayed but expected for Administrator");
		}
		
		Objects_Site_Contents_Page.lnk_Tasks_And_Tools(driver).click();
		Log.info("Tasks And Tools link clicked");
		
		Objects_Tasks_And_Tools_Page.lnk_New_Item(driver).click();
		Log.info("New Item link clicked");
		
		//Call the method to set Add New Item screen with invalid details
		Methods_Tasks_And_Tools_Add_New_Item.checkInvalidDetails(driver, sTestCaseName, 1);
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

