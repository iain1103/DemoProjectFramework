/* *******************************************************************
* Test Case Name: Add_An_App_Check_Links_IE_Administrator
* Author: Rory Cruickshank
* Date: 23/06/2016
* Purpose: This test views all of the elements on the main Add An App page for an Administrator in IE
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
import pageObjectRepositories.Objects_Add_An_App_Page;
import pageObjectRepositories.Objects_Navigation_Bar;

public class Add_An_App_Check_Links_IE_Administrator {

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
			
		Objects_Navigation_Bar.Settings.btn_Settings(driver).click();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Objects_Navigation_Bar.Settings.lnk_Add_An_App(driver));
		
		//Check that we are on the correct page
		Objects_Add_An_App_Page.Sidebar.lnk_Your_Apps(driver).isDisplayed();
		Log.info("Your Apps page displayed as expected");
		
		Methods_Add_An_App.viewSidebar(driver, sTestCaseName);
				
		Methods_Add_An_App.viewPage(driver, sTestCaseName, 1);
	
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

