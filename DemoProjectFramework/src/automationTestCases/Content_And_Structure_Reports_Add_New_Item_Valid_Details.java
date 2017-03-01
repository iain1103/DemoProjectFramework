package automationTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import appModule.*;
import pageObjectRepositories.Objects_Breaking_News_Page;
import pageObjectRepositories.Objects_Navigation_Bar;
import pageObjectRepositories.Objects_Site_Contents_Page;

public class Content_And_Structure_Reports_Add_New_Item_Valid_Details {

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
	
	    ExcelUtils.setExcelFile(Constant.Path_TestData + "Breaking_News_Add_New_Item_Valid_Details.xlsx","Sheet1");
	
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
		Objects_Site_Contents_Page.lnk_Add_An_App(driver).isDisplayed();
		Log.info("Site Contents page displayed");
		
		Objects_Site_Contents_Page.lnk_Breaking_News(driver).click();
		Log.info("Breaking News link clicked");
		
		Objects_Breaking_News_Page.lnk_New_Item(driver).click();
		Log.info("New Item link clicked");
		
		//Call the method to set Add New Item screen with valid details
		Methods_Breaking_News_Add_New_Item.addDetails(driver, sTestCaseName, 1);
				
	}
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

