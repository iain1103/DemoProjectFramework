/* ******************************************************************************************************
* Test Case Name: Policies_Page_Edit_Other_Comment_Firefox_Visitor
* Author: Rory Cruickshank
* Date: 28/06/2016
* Purpose: This test adds a comment on a Policy item for a Content Author and then tries to edit using 
* 			an Visitor in Firefox
*
*********************************************************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
********************************************************************************************************/	

package automationTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import appModule.*;
import pageObjectRepositories.Objects_Navigation_Bar;

public class Policies_Page_Edit_Other_Comment_Firefox_Visitor {

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
	
		Methods_Policies.navigateToPolicyItem(driver, sTestCaseName);
		
		Methods_Policies.viewItem(driver, sTestCaseName, "Edit", 1);
		
		//Log out so we can log back in as a Visitor
		driver.quit();
		
		//Now log in as an Visitor
	    driver = Utils.openBrowser(2);

		Methods_Policies.navigateToPolicyItem(driver, sTestCaseName);
		
		Methods_Policies.editOrDeleteOtherComment(driver, sTestCaseName, "Edit");
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

