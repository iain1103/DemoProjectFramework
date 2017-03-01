package appModule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Tasks_And_Tools_Page;
import utility.*;

public class Methods_Tasks_And_Tools_Add_New_Item{
	
	//Declare variables
	private static String sTitle; 
	private static String sURL;
	private static String sURLDescription;
	private static String sTaskDescription;
	private static String sBackgroundColour;
	private static String sBackgroundImageURL;
	private static String sBackgroundImageDescription;
	private static Boolean bIsActive;
	private static String sBusiness;
	private static String sLocation;
	private static Boolean bIsHighlight;	
	private static String sHighlightTitle;
	private static String sTaskOrder;
	private static String sSaveOrCancel;
	
	/* **************************************************************************************************
	* Function: getTableValues
	* Author: Rory Cruickshank
	* Date: 12/05/2016
	* Purpose: This method gets values for all of the associated variables
	* Arguments: 
	* 			
	* Returns: 
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
		sTaskDescription = Utils.assignStringVariable("Task Description", iRow);
		sBackgroundColour = Utils.assignStringVariable("Background Colour", iRow);
		sBackgroundImageURL = Utils.assignStringVariable("Background Image URL", iRow);
		sBackgroundImageDescription = Utils.assignStringVariable("Background Image Description", iRow);
		bIsActive = Boolean.valueOf(Utils.assignStringVariable("Is Active", iRow));
		sBusiness = Utils.assignStringVariable("Business", iRow);
		sLocation = Utils.assignStringVariable("Location", iRow);
		bIsHighlight = Boolean.valueOf(Utils.assignStringVariable("Is Highlight", iRow));	
		sHighlightTitle = Utils.assignStringVariable("Highlight Title", iRow);
		sTaskOrder = Utils.assignIntVariable("Task Order", iRow).toString();
		sSaveOrCancel = Utils.assignStringVariable("Save Or Cancel", iRow);
	
	//END OF GET TABLE VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addDetails
	* Author: Rory Cruickshank
	* Date: 07/04/2016
	* Purpose: This method adds details to the Add New Item screen
	* Arguments: 
	* 			
	* Returns: 
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
		
		//Take a screenshot to show the prior state
		Utils.takeScreenshot(driver, sTestCaseName + "-addDetails-InitialState");
		
		//Check if we need to clear existing data
		if (sTestCaseName.contains("Edit") == true){
			Objects_Tasks_And_Tools_Page.New_Item.txt_Title(driver).clear();
			Objects_Tasks_And_Tools_Page.New_Item.txt_URL(driver).clear();	
			Objects_Tasks_And_Tools_Page.New_Item.txt_URL_Description(driver).clear();
			Objects_Tasks_And_Tools_Page.New_Item.txt_Task_Description(driver).clear();
			Objects_Tasks_And_Tools_Page.New_Item.txt_Background_Colour(driver).clear();
			Objects_Tasks_And_Tools_Page.New_Item.txt_Background_Image_URL(driver).clear();
			Objects_Tasks_And_Tools_Page.New_Item.txt_Background_Image_Description(driver).clear();
			Objects_Tasks_And_Tools_Page.New_Item.txt_Highlight_Title(driver).clear();
			Objects_Tasks_And_Tools_Page.New_Item.txt_Task_Order(driver).clear();
		}
		
		//Now handle the objects on the New Item page	
		Objects_Tasks_And_Tools_Page.New_Item.txt_Title(driver).sendKeys(sTitle);
		Log.info(sTestCaseName + " | " + sTitle + " entered in the Title text box");
		
		//Make sure that this one is clear before adding the URL to get rid of auto-populated "http://" 
		Objects_Tasks_And_Tools_Page.New_Item.txt_URL(driver).clear();
		Objects_Tasks_And_Tools_Page.New_Item.txt_URL(driver).sendKeys(sURL);
		Log.info(sTestCaseName + " | " + sURL + " entered in the URL text box");
		
		Objects_Tasks_And_Tools_Page.New_Item.txt_URL_Description(driver).sendKeys(sURLDescription);
		Log.info(sTestCaseName + " | " + sURLDescription + " entered in the URL Description text box");

		Objects_Tasks_And_Tools_Page.New_Item.txt_Task_Description(driver).click();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Tasks_And_Tools_Page.New_Item.txt_Task_Description(driver), sTaskDescription); 
		Log.info(sTestCaseName + " | " + sTaskDescription + " entered in the Task Description text box");	

		Objects_Tasks_And_Tools_Page.New_Item.txt_Background_Colour(driver).sendKeys(sBackgroundColour);
		Log.info(sTestCaseName + " | " + sBackgroundColour + " entered in the Background Colour text box");

		Objects_Tasks_And_Tools_Page.New_Item.txt_Background_Image_URL(driver).sendKeys(sBackgroundImageURL);
		Log.info(sTestCaseName + " | " + sBackgroundImageURL + " entered in the Background Image URL text box");

		Objects_Tasks_And_Tools_Page.New_Item.txt_Background_Image_Description(driver).sendKeys(sBackgroundImageDescription);
		Log.info(sTestCaseName + " | " + sBackgroundImageDescription + " entered in the Task Description text box");
		
		Utils.checkboxHandler(sTestCaseName + " | Is Active", Objects_Tasks_And_Tools_Page.New_Item.chk_Is_Active(driver), bIsActive);

		//Ensure that the textbox is clear before adding details
		Objects_Tasks_And_Tools_Page.New_Item.txt_Business(driver).click();
		Objects_Tasks_And_Tools_Page.New_Item.txt_Business(driver).clear();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Tasks_And_Tools_Page.New_Item.txt_Business(driver), sBusiness); 
		Log.info(sTestCaseName + " | " + sBusiness + " entered in the Business text box");	

		//Ensure that the textbox is clear before adding details
		Objects_Tasks_And_Tools_Page.New_Item.txt_Location(driver).click();
		Objects_Tasks_And_Tools_Page.New_Item.txt_Location(driver).clear();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Tasks_And_Tools_Page.New_Item.txt_Location(driver), sLocation); 
		Log.info(sTestCaseName + " | " + sLocation + " entered in the Location text box");	

		
		Utils.checkboxHandler(sTestCaseName + " | Is Highlight", Objects_Tasks_And_Tools_Page.New_Item.chk_Is_Highlight(driver), bIsHighlight);		

		Objects_Tasks_And_Tools_Page.New_Item.txt_Highlight_Title(driver).sendKeys(sHighlightTitle);
		Log.info(sTestCaseName + " | " + sHighlightTitle + " entered in the Highlight Title text box");		

		Objects_Tasks_And_Tools_Page.New_Item.txt_Task_Order(driver).sendKeys(sTaskOrder);
		Log.info(sTestCaseName + " | " + sTaskOrder + " entered in the Task Order text box");	

		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addDetails-EndState");
		
		//Now decide if we are saving or cancelling the task
		if (sSaveOrCancel.equals("Save")){
			//Check if we are editing the item
			if (sTestCaseName.contains("Edit") == true){
				//Use the save button from the ribbon
				Objects_Tasks_And_Tools_Page.optionsRibbon.btn_Save_Item(driver).click();
			}else{
				//Just use the regular old Save button
				Objects_Tasks_And_Tools_Page.New_Item.btn_Save(driver).click();
			}
			Log.info("Save button clicked");
		}else{
			Objects_Tasks_And_Tools_Page.New_Item.btn_Cancel(driver).click();
			Log.info("Cancel button clicked");				
		}
		
		//Now check to see if this has been placed
		Utils.checkTableAndClickEntryIfRequired(Objects_Tasks_And_Tools_Page.tbl_All_Items(driver), sTitle, "All items", false);
	
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-checkAddedTask");
		
	//END OF ADD DETAILS METHOD
	}
	
	/* **************************************************************************************************
	* Function: checkInvalidDetails
	* Author: Rory Cruickshank
	* Date: 08/04/2016
	* Purpose: This method inputs and checks invalid details on the Add New Item screen
	* Arguments: 
	* 			
	* Returns: 
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
		Objects_Tasks_And_Tools_Page.New_Item.btn_Save(driver).click();
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Tasks_And_Tools_Page.New_Item.wrn_Title_Cannot_Be_Blank(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Tasks_And_Tools_Page.New_Item.wrn_Task_Description_Cannot_Be_Blank(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Tasks_And_Tools_Page.New_Item.wrn_Business_Cannot_Be_Blank(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Tasks_And_Tools_Page.New_Item.wrn_Location_Cannot_Be_Blank(driver));
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-CannotBeBlank");
		
		//Now fill the fields with invalid details
		Objects_Tasks_And_Tools_Page.New_Item.txt_Business(driver).click();
		Objects_Tasks_And_Tools_Page.New_Item.txt_Business(driver).clear();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Tasks_And_Tools_Page.New_Item.txt_Business(driver), sBusiness); 
		Objects_Tasks_And_Tools_Page.New_Item.txt_Business(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Objects_Tasks_And_Tools_Page.New_Item.txt_Business(driver).sendKeys(Keys.TAB);

		Log.info(sTestCaseName + " | " + sBusiness + " entered in the Business text box");	

		Objects_Tasks_And_Tools_Page.New_Item.txt_Location(driver).click();
		Objects_Tasks_And_Tools_Page.New_Item.txt_Location(driver).clear();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Tasks_And_Tools_Page.New_Item.txt_Location(driver), sLocation); 
		Objects_Tasks_And_Tools_Page.New_Item.txt_Location(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Objects_Tasks_And_Tools_Page.New_Item.txt_Location(driver).sendKeys(Keys.TAB);
		Log.info(sTestCaseName + " | " + sLocation + " entered in the Location text box");	

		Objects_Tasks_And_Tools_Page.New_Item.txt_Task_Order(driver).sendKeys(sTaskOrder);
		Log.info(sTestCaseName + " | " + sTaskOrder + " entered in the Task Order text box");	
	
		//Click save again
		Objects_Tasks_And_Tools_Page.New_Item.btn_Save(driver).click();
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Tasks_And_Tools_Page.New_Item.wrn_Business_Not_Valid(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Tasks_And_Tools_Page.New_Item.wrn_Location_Not_Valid(driver));

		//Utils.checkForWarning(sTestCaseName + " | ", Tasks_And_Tools_Page.New_Item.wrn_Task_Order_Not_Valid(driver));
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-InputNotValid");
		
	//END OF CHECK INVALID DETAILS METHOD	
	}
//END OF METHODS
}