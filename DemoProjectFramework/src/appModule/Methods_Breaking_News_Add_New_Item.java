package appModule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Breaking_News_Page;
import utility.Log;
import utility.Utils;

public class Methods_Breaking_News_Add_New_Item{
	
	//Declare variables 
	private static String sTitle; 
	private static String sURL;
	private static String sURLDescription;
	private static Boolean bIsActive;
	private static String sEndDate;
	private static String sEndTimeHours;
	private static String sEndTimeMinutes;
	private static String sAudienceArea;
	private static String sLocation;
	private static String sSaveOrCancel;

	/* **************************************************************************************************
	* Function: getTableValues
	* Author: Rory Cruickshank
	* Date: 12/05/2016
	* Purpose: This method gets values for all of the associated variables
	* Arguments: iRow
	* 			
	* Returns: void
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void getTableValues(int iRow) {
		
		sTitle = Utils.assignUniqueVariable("Title", iRow); 
		sURL = Utils.assignStringVariable("URL", iRow);
		sURLDescription = Utils.assignStringVariable("URL Description", iRow);
		bIsActive = Boolean.valueOf(Utils.assignStringVariable("Is Active", iRow));
		sEndDate = Utils.assignStringVariable("End Date", iRow);
		sEndTimeHours = Utils.attachLeadingZero(Utils.assignIntVariable("End Time Hours", iRow));
		sEndTimeMinutes = Utils.attachLeadingZero(Utils.assignIntVariable("End Time Minutes", iRow));
		sAudienceArea = Utils.assignStringVariable("Audience Area", iRow);
		sLocation = Utils.assignStringVariable("Location", iRow);
		sSaveOrCancel = Utils.assignStringVariable("Save Or Cancel", iRow);
		
	//END OF GET TABLE VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addDetails
	* Author: Rory Cruickshank
	* Date: 04/04/2016
	* Purpose: This method adds details to the Add New Item screen
	* Arguments: driver
	* 			sTestCaseName
	* 			iRow
	* 
	* Returns: void
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addDetails(WebDriver driver, String sTestCaseName, int iRow) throws Exception{
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		getTableValues(iRow);
		
		//Now handle the objects on the New Item page
		Objects_Breaking_News_Page.New_Item.txt_Title(driver).sendKeys(sTitle);
		Log.info(sTestCaseName + " | " + sTitle + " entered in the Title text box");
		
		//Clear theURL textbox before adding new data
		Objects_Breaking_News_Page.New_Item.txt_URL(driver).clear();
		
		Objects_Breaking_News_Page.New_Item.txt_URL(driver).sendKeys(sURL);
		Log.info(sTestCaseName + " | " + sURL + " entered in the URL text box");
		
		Objects_Breaking_News_Page.New_Item.txt_URL_Description(driver).sendKeys(sURLDescription);
		Log.info(sTestCaseName + " | " + sURLDescription + " entered in the URL Description text box");
		
		Utils.checkboxHandler("Is Active", Objects_Breaking_News_Page.New_Item.chk_Is_Active(driver), bIsActive);
		
		Objects_Breaking_News_Page.New_Item.txt_End_Date(driver).sendKeys(sEndDate);
		Log.info(sTestCaseName + " | " + sEndDate + " entered in the End Date text box");
			
		Objects_Breaking_News_Page.New_Item.cbx_End_Time_Hours(driver).sendKeys(sEndTimeHours); 
		Log.info(sTestCaseName + " | " + sEndTimeHours + " entered in the End Time Hours combobox");		

		Objects_Breaking_News_Page.New_Item.cbx_End_Time_Minutes(driver).sendKeys(sEndTimeMinutes); 
		Log.info(sTestCaseName + " | " + sEndTimeMinutes + " entered in the End Time Minutes combobox");		
		
		Objects_Breaking_News_Page.New_Item.txt_Audience_Area(driver).click();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Breaking_News_Page.New_Item.txt_Audience_Area(driver),sAudienceArea);
		Objects_Breaking_News_Page.New_Item.txt_Audience_Area(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Objects_Breaking_News_Page.New_Item.txt_Audience_Area(driver).sendKeys(Keys.TAB);
		Log.info(sTestCaseName + " | " + sAudienceArea + " entered in the Audience Area text box");		

		Objects_Breaking_News_Page.New_Item.txt_Location(driver).click();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Breaking_News_Page.New_Item.txt_Location(driver), sLocation); 
		Objects_Breaking_News_Page.New_Item.txt_Location(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Objects_Breaking_News_Page.New_Item.txt_Location(driver).sendKeys(Keys.TAB);
		Log.info(sTestCaseName + " | " + sLocation + " entered in the Location text box");	
					
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addDetails");
		
		if (sSaveOrCancel.equals("Save")){
			Objects_Breaking_News_Page.New_Item.btn_Save(driver).click();
			Log.info(sTestCaseName + " | Save button clicked");
		}else{
			Objects_Breaking_News_Page.New_Item.btn_Cancel(driver).click();
			Log.info(sTestCaseName + " | Cancel button clicked");				
		}
		
		//Now check to see if this has been placed
		Utils.checkTableAndClickEntryIfRequired(Objects_Breaking_News_Page.tbl_All_Items(driver), sTitle, "All items", false);
	
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-checkAddedTask");
		
	//END OF ADD DETAILS METHOD
	}
	
	/* **************************************************************************************************
	* Function: checkInvalidDetails
	* Author: Rory Cruickshank
	* Date: 05/04/2016
	* Purpose: This method adds and checks invalid details on the Add New Item screen
	* Arguments: driver
	* 			sTestCaseName
	* 			iRow
	* 
	* Returns: void
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void checkInvalidDetails(WebDriver driver, String sTestCaseName, int iRow) throws Exception{
	
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		getTableValues(iRow);
		
		//First click save and check that warnings are shown for blank fields
		Objects_Breaking_News_Page.New_Item.btn_Save(driver).click();
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Breaking_News_Page.New_Item.wrn_Title_Cannot_Be_Blank(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Breaking_News_Page.New_Item.wrn_End_Date_Not_Valid(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Breaking_News_Page.New_Item.wrn_Audience_Area_Cannot_Be_Blank(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Breaking_News_Page.New_Item.wrn_Location_Cannot_Be_Blank(driver));
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-CannotBeBlank");
		
		//Now fill the fields with invalid details
		Objects_Breaking_News_Page.New_Item.txt_Audience_Area(driver).click();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Breaking_News_Page.New_Item.txt_Audience_Area(driver),sAudienceArea);
		Objects_Breaking_News_Page.New_Item.txt_Audience_Area(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Objects_Breaking_News_Page.New_Item.txt_Audience_Area(driver).sendKeys(Keys.TAB);
		Log.info(sTestCaseName + " | " + sAudienceArea + " entered in the Audience Area text box");		

		Objects_Breaking_News_Page.New_Item.txt_Location(driver).click();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Breaking_News_Page.New_Item.txt_Location(driver), sLocation); 
		Objects_Breaking_News_Page.New_Item.txt_Location(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Objects_Breaking_News_Page.New_Item.txt_Location(driver).sendKeys(Keys.TAB);
		Log.info(sTestCaseName + " | " + sLocation + " entered in the Location text box");	

		//Click save again
		Objects_Breaking_News_Page.New_Item.btn_Save(driver).click();
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Breaking_News_Page.New_Item.wrn_Audience_Area_Not_Valid(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Breaking_News_Page.New_Item.wrn_Location_Not_Valid(driver));
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-InputNotValid");
		
	//END OF CHECK INVALID DETAILS METHOD	
	}
//END OF METHODS
}