/* *******************************************************************
* Test Case Name: Settings_Cannot_Be_Amended_Firefox_Visitor
* Author: Rory Cruickshank
* Date: 23/06/2016
* Purpose: This test checks that the Settings options are not available for a Visitor in Firefox
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
import pageObjectRepositories.Objects_Navigation_Bar;

public class Settings_Cannot_Be_Amended_Firefox_Visitor {

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
	
		//Check that the Settings button does not exist for this user
		Boolean exist = driver.findElements(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div[2]/span[1]/span[2]/a/span[1]/img")).size() == 0;
		
		if(exist == true){
			Log.info(sTestCaseName + " | Settings button not found as expected for this user.");
		}else{
			Log.error(sTestCaseName + " | Settings button found but not expected for this user.");
		}
		
		//Either way, take a screenshot to prove what we've discovered
		Utils.takeScreenshot(driver, sTestCaseName);
		
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

