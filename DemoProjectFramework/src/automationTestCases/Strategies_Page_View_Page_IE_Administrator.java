/* *******************************************************************
* Test Case Name: Strategies_Page_View_Page_IE_Administrator
* Author: Rory Cruickshank
* Date: 23/06/2016
* Purpose: This test views all of the elements on the main Strategies page for an Administrator in IE
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
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import appModule.Methods_Strategies;
import pageObjectRepositories.Objects_Navigation_Bar;
import pageObjectRepositories.Objects_Strategies_Page;

public class Strategies_Page_View_Page_IE_Administrator {

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
	
		Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
		Objects_Navigation_Bar.lnk_Strategies(driver).click();
		
		//Verify that we are on the correct page
		Utils.checkSearchFilter("ContentTags:Strategy", Objects_Strategies_Page.Strategies.txt_Strategies_Search(driver));

		//Call the method to check the main page
		Methods_Strategies.viewPage(driver, sTestCaseName);
		
		//Call the method to check the Policies sidebar
		Methods_Strategies.viewSidebar(driver, sTestCaseName);		
				
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

