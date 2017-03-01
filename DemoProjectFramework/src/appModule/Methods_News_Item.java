package appModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_News_Item_Page;
import utility.Log;
import utility.Utils;

public class Methods_News_Item{
	
	//Declare variables 
	private static String sTitle; 
	private static String sArticleInformationHeader;
	private static String sArticleOwner;
	private static String sCreationDate;
	private static String sUpdatedDate;
	private static String sTagsHeader;
	private static String sDateHeader;
	private static String sFirstParagraph;
	private static String sPageRating;
	private static String sCommentsHeader;
	private static String sCommentInput;
	private static Boolean bPostComment;
	private static String sUserName;
	private static String sCommentDate;
	private static String sUserComment;
	
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
		
		sTitle = Utils.assignStringVariable("Title", iRow); 
		sArticleInformationHeader = Utils.assignStringVariable("URL", iRow);
		sArticleOwner = Utils.assignStringVariable("Article Information Header", iRow);
		sCreationDate = Utils.assignStringVariable("Creation Date", iRow);
		sUpdatedDate = Utils.assignStringVariable("Updated Date", iRow);
		sTagsHeader = Utils.assignStringVariable("Tags Header", iRow);
		sDateHeader = Utils.assignStringVariable("Date Header", iRow);
		sFirstParagraph = Utils.assignStringVariable("First Paragraph", iRow);
		sPageRating = Utils.assignStringVariable("Page Rating", iRow);
		sCommentsHeader = Utils.assignStringVariable("Comments Header", iRow);
		sCommentInput = Utils.assignStringVariable("Comment Input", iRow);
		bPostComment = Boolean.valueOf(Utils.assignStringVariable("Post Comment", iRow));
		sUserName = Utils.assignStringVariable("User Name", iRow);
		sCommentDate = Utils.assignStringVariable("Comment Date", iRow);
		sUserComment = Utils.assignStringVariable("User Comment", iRow);
		
	//END OF GET TABLE VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewItem
	* Author: Rory Cruickshank
	* Date: 09/06/2016
	* Purpose: This method checks that expected elements are present on a news item
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
	public static void viewItem(WebDriver driver, String sTestCaseName) throws Exception{
		
		//Set our initial variables
		bPostComment = false;
		
		//Check that all of the elements of a the item are displayed
		sTitle = Objects_News_Item_Page.News_Item.lbl_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTitle + "\" displayed as Title");
		
		sArticleInformationHeader = Objects_News_Item_Page.News_Item.lbl_Article_Information(driver).getText();
		Log.info(sTestCaseName + " | \"" + sArticleInformationHeader + "\" displayed as Article Information Header");
		
		sArticleOwner = Objects_News_Item_Page.News_Item.lbl_Owner(driver).getText();
		Log.info(sTestCaseName + " | \"" + sArticleOwner + "\" displayed as Article Owner");		
		
		sCreationDate = Objects_News_Item_Page.News_Item.lbl_Created(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCreationDate + "\" displayed as Creation Date");
		
		sUpdatedDate = Objects_News_Item_Page.News_Item.lbl_Updated(driver).getText();
		Log.info(sTestCaseName + " | \"" + sUpdatedDate + "\" displayed as Updated Date");
		
		sTagsHeader = Objects_News_Item_Page.News_Item.lbl_Tags_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTagsHeader + "\" displayed as Tags Header");
		
		sDateHeader = Objects_News_Item_Page.News_Item.lbl_Date_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sDateHeader + "\" displayed as Date Header");
		
		sFirstParagraph = Objects_News_Item_Page.News_Item.lbl_First_Paragraph(driver).getText();
		if(sFirstParagraph.length() > 200){
			sFirstParagraph = sFirstParagraph.substring(0, 197) + "...";
		}
		Log.info(sTestCaseName + " | \"" + sFirstParagraph + "\" displayed as First Paragraph");
		
		sPageRating = Objects_News_Item_Page.News_Item.lbl_Page_Rating(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPageRating + "\" displayed as Page Rating Header");
		
		sCommentsHeader = Objects_News_Item_Page.News_Item.lbl_Comments_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCommentsHeader + "\" displayed as Comments Header");
		
		sCommentInput = Objects_News_Item_Page.News_Item.txt_Comments_Input(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCommentInput + "\" displayed as Comment Input");
		
		if(bPostComment == true){
			Objects_News_Item_Page.News_Item.btn_Comments_Post(driver).click();
			Log.info(sTestCaseName + " | Post button clicked");
		}
		
		sUserName = Objects_News_Item_Page.News_Item.lnk_User_Name(driver).getText();
		Log.info(sTestCaseName + " | \"" + sUserName + "\" displayed as User Name");
		
		sCommentDate = Objects_News_Item_Page.News_Item.lbl_Comment_Date(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCommentDate + "\" displayed as Comment Date");
		
		sUserComment = Objects_News_Item_Page.News_Item.lbl_User_Comment(driver).getText();
		Log.info(sTestCaseName + " | \"" + sUserComment + "\" displayed as User Comment");
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName);
		
	//END OF ADD DETAILS METHOD
	}
	
	/* **************************************************************************************************
	* Function: checkInvalidDetails
	* Author: Rory Cruickshank
	* Date: 05/04/2016
	* Purpose: This method adds and checks invalid details on the Add New Item screen
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
	/*public static void checkInvalidDetails(WebDriver driver, String sTestCaseName) throws Exception{
	
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		getTableValues();
		
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
	}*/
//END OF METHODS
}