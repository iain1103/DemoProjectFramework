package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Home_Page;
import pageObjectRepositories.Objects_Navigation_Bar;
import pageObjectRepositories.Objects_Noticeboard_Page;
import utility.Log;
import utility.Utils;
public class Methods_Noticeboard_Add_New_Item{
	
	//Declare variables 
	private static String sTitle; 
	private static String sBody;
	private static String sInsertSharepointImage;
	private static String sInsertLocalImage;
	private static String sCategory;
	private static String sEndDate;
	private static String sAddAttachment;
	private static String sLocation;
	private static String sSaveOrCancel;
	private static Boolean bFilterByLocation;
	private static Integer iCount;
	
	/* **************************************************************************************************
	* Function: getTableValues
	* Author: Rory Cruickshank
	* Date: 12/05/2016
	* Purpose: This method gets values for all of the associated variables from the relevant spreadsheet
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
		sBody = Utils.assignStringVariable("Body", iRow);
		sInsertSharepointImage = Utils.assignStringVariable("Insert Sharepoint Image", iRow);
		sInsertLocalImage = Utils.assignStringVariable("Insert Local Image", iRow);
		sCategory = Utils.assignStringVariable("Category", iRow);
		sEndDate = Utils.assignStringVariable("End Date", iRow);
		sAddAttachment = Utils.assignStringVariable("Add Attachment", iRow);
		sLocation = Utils.assignStringVariable("Location", iRow);
		sSaveOrCancel = Utils.assignStringVariable("Save Or Cancel", iRow);
		bFilterByLocation = Boolean.valueOf(Utils.assignStringVariable("Filter By Location", iRow));
	
	//END OF GET TABLE VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: addNoticeboardItem
	* Author: Rory Cruickshank
	* Date: 29/04/2016
	* Purpose: This method adds details to the Add Noticeboard Item popup
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
	public static void addNoticeboardItem(WebDriver driver, String sTestCaseName, int iRow) throws Exception{
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		getTableValues(iRow);
		
		//Now handle the objects on the New Item page
		Objects_Noticeboard_Page.New_Item.txt_Title(driver).sendKeys(sTitle);
		Log.info(sTestCaseName + " | " + sTitle + " entered in the Title text box");
		
		Objects_Noticeboard_Page.New_Item.txt_Body(driver).click();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Noticeboard_Page.New_Item.txt_Body(driver), sBody); 
		Objects_Noticeboard_Page.New_Item.txt_Body(driver).sendKeys(Keys.TAB);
		Log.info(sTestCaseName + " | " + sBody + " entered in the Body text box");
		
		if (sInsertSharepointImage.length() > 0){
			Objects_Noticeboard_Page.New_Item.lnk_Insert_Sharepoint_Image(driver).click();
			Log.info(sTestCaseName + " | " + sInsertSharepointImage + " selected for Insert Sharepoint Image");
			Methods_Noticeboard_Add_New_Item.addImageDetails(driver, sTestCaseName);
		}
		
		if (sInsertLocalImage.length() > 0){
			Objects_Noticeboard_Page.New_Item.lnk_Insert_Local_Image(driver).click();
			Log.info(sTestCaseName + " | " + sInsertLocalImage + " selected for Insert Local Image");
			Methods_Noticeboard_Add_New_Item.addImageDetails(driver, sTestCaseName);
		}
					
		Objects_Noticeboard_Page.New_Item.cbx_Category(driver).sendKeys(sCategory);
		Log.info(sTestCaseName + " | " + sCategory + " entered in the Category combobox");		

		Objects_Noticeboard_Page.New_Item.txt_End_Date(driver).sendKeys(sEndDate);
		Log.info(sTestCaseName + " | " + sEndDate + " entered in the End Date text box");

		if (sAddAttachment.length() > 0){
			Objects_Noticeboard_Page.New_Item.lnk_Add_Attachment(driver).click();
			Log.info(sTestCaseName + " | " + sAddAttachment + " selected to be added as an attachment");
			//To be completed
		}
		
		Objects_Noticeboard_Page.New_Item.txt_Location(driver).click();
		executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Noticeboard_Page.New_Item.txt_Location(driver), sLocation); 
		Objects_Noticeboard_Page.New_Item.txt_Location(driver).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Objects_Noticeboard_Page.New_Item.txt_Location(driver).sendKeys(Keys.TAB);
		Log.info(sTestCaseName + " | " + sLocation + " entered in the Location text box");	
					
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addDetails");
		
		if (sSaveOrCancel.equals("Save")){
			//Objects_Noticeboard_Page.New_Item.btn_Save(driver).click();
			executor.executeScript("arguments[0].click();", Objects_Noticeboard_Page.New_Item.btn_Save(driver));
			Log.info(sTestCaseName + " | Save button clicked");
		}else{
			Objects_Noticeboard_Page.New_Item.btn_Cancel(driver).click();
			Log.info(sTestCaseName + " | Cancel button clicked");				
		}
		
		//Now check to see if this has been placed. First switch back to the default frame
		driver.switchTo().defaultContent();
		//Verify that we are on the correct page
		Objects_Navigation_Bar.lnk_Stan_Home(driver).isDisplayed();
		//Now navigate to the noticeboard page
		Objects_Home_Page.Notice_Board.lnk_Show_All_Noticeboard_Items(driver).click();
		
		//Check we are on the correct page
		Objects_Noticeboard_Page.lbl_Header(driver).isDisplayed();
		Log.info(sTestCaseName + " | Noticeboard page displayed");
		
		//Apparently this needs a few minutes to populate
		//Thread.sleep(360000);
		
		//Now remove the filter if required
		Utils.checkboxHandler("Filter by location", Objects_Noticeboard_Page.chk_Filter_By_Location(driver), bFilterByLocation);	

		//Initialise the local variables we are going to use for checking
		iCount = 0;
		boolean exists = false;
		
		//Now let's start our loop
		while(iCount <= 360){
			exists = driver.findElements(By.linkText(sTitle)).size() != 0;
			if(exists == true){
				Log.info(sTestCaseName + " | Noticeboard entry " + sTitle + " found after " + iCount + " seconds.");
				break;
			}else{
				//Check that the filter is set to false
				if (Objects_Noticeboard_Page.chk_Filter_By_Location(driver).isSelected() == false){
					//Cool, set it to true
					Objects_Noticeboard_Page.chk_Filter_By_Location(driver).click();
				}
				//Either way, set it to false and increment the counter
				Objects_Noticeboard_Page.chk_Filter_By_Location(driver).click();
				iCount = iCount + 20;
			}
		}
		
		//Has it been found yet? If not, better throw an error
		if (exists == false){
			Log.error(sTestCaseName + " | Noticeboard entry " + sTitle + " not found after " + iCount + " seconds");
		}
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-checkAddedItem");
	
	//END OF ADD DETAILS METHOD
	}
	
	/* **************************************************************************************************
	* Author: Rory Cruickshank
	* Date: 29/04/2016
	* Function: checkInvalidDetails
	* Purpose: This method inputs and checks invalid details on the Add Noticeboard Item popup
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

		getTableValues(iRow);
		
		//First click save and check that warnings are shown for blank fields
		Objects_Noticeboard_Page.New_Item.btn_Save(driver).click();
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Noticeboard_Page.New_Item.wrn_Title_Cannot_Be_Blank(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Noticeboard_Page.New_Item.wrn_Body_Cannot_Be_Blank(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Noticeboard_Page.New_Item.wrn_End_Date_Cannot_Be_Blank(driver));
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Noticeboard_Page.New_Item.wrn_Location_Cannot_Be_Blank(driver));
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-CannotBeBlank");
		
		Objects_Noticeboard_Page.New_Item.txt_End_Date(driver).sendKeys(sEndDate);
		Log.info(sTestCaseName + " | " + sEndDate + " entered in the End Date text box");	
		
		//Click save again
		Objects_Noticeboard_Page.New_Item.btn_Save(driver).click();
		
		Utils.checkForWarning(sTestCaseName + " | ", Objects_Noticeboard_Page.New_Item.wrn_End_Date_Not_Valid(driver));
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-InputNotValid");
		
	//END OF CHECK INVALID DETAILS METHOD	
	}
	
	/* **************************************************************************************************
	* Function: addImageDetails
	* Author: Rory Cruickshank
	* Date: 04/05/2016
	* Purpose: This method adds details on the Image popup
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
	public static void addImageDetails(WebDriver driver, String sTestCaseName) throws Exception{

		//To be completed
		
	//END OF ADD IMAGE DETAILS METHOD
	}
		
//END OF METHODS
}