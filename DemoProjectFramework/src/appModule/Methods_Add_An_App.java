package appModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Add_An_App_Page;
import utility.Log;
import utility.Utils;

public class Methods_Add_An_App{
	
	//Declare variables 
	private static String sDocumentLibrary; 
	private static String sFormLibrary; 
	private static String sWikiPageLibrary; 
	private static String sPictureLibrary; 
	private static String sLinks; 
	private static String sAnnouncements; 
	private static String sContacts; 
	private static String sCalendar; 
	private static String sPromotedLinks; 
	private static String sDiscussionBoard; 
	private static String sTasks; 
	private static String sCustomList; 
	private static String sCustomListInDatasheetView; 
	private static String sExternalList; 
	private static String sSurvey; 
	private static String sAssetLibrary; 
	private static String sAccessApp; 
	private static String sImportSpreadsheet;
	
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
		
		sDocumentLibrary = Utils.assignStringVariable("Document Library", iRow); 
		sFormLibrary = Utils.assignStringVariable("Form Library", iRow);
		sWikiPageLibrary = Utils.assignStringVariable("Wiki Page Library", iRow);
		sPictureLibrary = Utils.assignStringVariable("Picture Library", iRow);
		sLinks = Utils.assignStringVariable("Links", iRow);
		sAnnouncements = Utils.assignStringVariable("Announcements", iRow);
		sContacts = Utils.assignStringVariable("Contacts", iRow);
		sCalendar = Utils.assignStringVariable("Calendar", iRow);
		sPromotedLinks = Utils.assignStringVariable("Promoted Links", iRow);
		sDiscussionBoard = Utils.assignStringVariable("Discussion Board", iRow);
		sTasks = Utils.assignStringVariable("Tasks", iRow);
		sCustomList = Utils.assignStringVariable("Custom List", iRow);
		sCustomListInDatasheetView = Utils.assignStringVariable("Custom List in Datasheet View", iRow);
		sExternalList = Utils.assignStringVariable("External List", iRow);
		sSurvey = Utils.assignStringVariable("Survey", iRow);
		sAssetLibrary = Utils.assignStringVariable("Asset Library", iRow);
		sAccessApp = Utils.assignStringVariable("Access App", iRow);
		sImportSpreadsheet = Utils.assignStringVariable("Import Spreadsheet", iRow);
				
	//END OF GET TABLE VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewItem
	* Author: Rory Cruickshank
	* Date: 10/06/2016
	* Purpose: This method checks that expected elements are present on an app item
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
	public static void viewItem(WebDriver driver, String sTestCaseName, String sAction, int iRow) throws Exception{
		
		//Declare our variables and instantiate 
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		
		getTableValues(iRow);
		
		//Check that all of the elements of a the item are displayed
		sDocumentLibrary = Objects_Add_An_App_Page.lnk_Document_Library(driver).getText();
		Log.info(sTestCaseName + " | \"" + sDocumentLibrary + "\" displayed as Document Library linktext");
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName);
		
	//END OF VIEW ITEM METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewSidebar
	* Author: Rory Cruickshank
	* Date: 20/06/2016
	* Purpose: This method checks the sidebar elements on the Add An App page
	* Arguments: driver
	* 			sTestCaseName
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
	public static void viewSidebar(WebDriver driver, String sTestCaseName) throws Exception{
			
		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.Sidebar.lnk_Your_Apps(driver).getText() + "\" displayed as Your Apps linktext");
		
		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.Sidebar.lnk_Apps_You_Can_Add(driver).getText() + "\" displayed as Apps You Can Add linktext");
		
		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.Sidebar.lnk_Manage_Licenses(driver).getText() + "\" displayed as Manage Licenses linktext");

		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.Sidebar.lnk_Your_Requests(driver).getText() + "\" displayed as Your Requests linktext");
		
		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.Sidebar.lnk_Sharepoint_Store(driver).getText() + "\" displayed as Sharepoint Store linktext");
		
		//Take a screenshot to show what we've found
		Utils.takeScreenshot(driver, sTestCaseName + "-ViewSidebar");
		
	//END OF VIEW SIDEBAR METHOD	
	}
	
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Rory Cruickshank
	* Date: 20/06/2016
	* Purpose: This method checks the main page elements on the Add An App page
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
	public static void viewPage(WebDriver driver, String sTestCaseName, int iRow) throws Exception{
	
		//Declare our variables and instantiate 
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		
		getTableValues(iRow);
		
		//Check that all of the elements of that are expected are displayed
		if(Objects_Add_An_App_Page.txt_Find_An_App(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Find An App search box displayed as expected");
		}

		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.lbl_Noteworthy_Header(driver).getText() + "\" displayed as Noteworthy header");
		
		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.lbl_Apps_You_Can_Add_Header(driver).getText() + "\" displayed as Apps You Can Add header");

		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.btn_Select_By_Newest(driver).getText() + "\" displayed as Select By Newest selector");

		Log.info(sTestCaseName + " | \"" + Objects_Add_An_App_Page.btn_Select_By_Name(driver).getText() + "\" displayed as Select By Name selector");

		if (sDocumentLibrary.length() > 0){
			sDocumentLibrary = Objects_Add_An_App_Page.lnk_Document_Library(driver).getText();
			Log.info(sTestCaseName + " | \"" + sDocumentLibrary + "\" displayed as Document Library linktext");
		}
		
		if (sFormLibrary.length() > 0){
			sFormLibrary = Objects_Add_An_App_Page.lnk_Form_Library(driver).getText();
			Log.info(sTestCaseName + " | \"" + sFormLibrary + "\" displayed as Form Library linktext");
		}
		
		if (sWikiPageLibrary.length() > 0){
			sWikiPageLibrary = Objects_Add_An_App_Page.lnk_Wiki_Page_Library(driver).getText();
			Log.info(sTestCaseName + " | \"" + sWikiPageLibrary + "\" displayed as Wiki Page Library linktext");
		}
		
		if (sPictureLibrary.length() > 0){
			sPictureLibrary = Objects_Add_An_App_Page.lnk_Picture_Library(driver).getText();
			Log.info(sTestCaseName + " | \"" + sPictureLibrary + "\" displayed as Picture Library linktext");
		}
		
		if (sLinks.length() > 0){
			sLinks = Objects_Add_An_App_Page.lnk_Links(driver).getText();
			Log.info(sTestCaseName + " | \"" + sLinks + "\" displayed as Links linktext");
		}
		
		if (sAnnouncements.length() > 0){
			sAnnouncements = Objects_Add_An_App_Page.lnk_Announcements(driver).getText();
			Log.info(sTestCaseName + " | \"" + sAnnouncements + "\" displayed as Announcements linktext");
		}
		
		if (sContacts.length() > 0){
			sContacts = Objects_Add_An_App_Page.lnk_Contacts(driver).getText();
			Log.info(sTestCaseName + " | \"" + sContacts + "\" displayed as Contacts linktext");
		}
		
		if (sCalendar.length() > 0){
			sCalendar = Objects_Add_An_App_Page.lnk_Calendar(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCalendar + "\" displayed as Calendar linktext");
		}
		
		if (sPromotedLinks.length() > 0){
			sPromotedLinks = Objects_Add_An_App_Page.lnk_Promoted_Links(driver).getText();
			Log.info(sTestCaseName + " | \"" + sPromotedLinks + "\" displayed as Promoted Links linktext");
		}
		
		if (sDiscussionBoard.length() > 0){
			sDiscussionBoard = Objects_Add_An_App_Page.lnk_Discussion_Board(driver).getText();
			Log.info(sTestCaseName + " | \"" + sDiscussionBoard + "\" displayed as Discussion Board linktext");
		}
		
		if (sTasks.length() > 0){
			sTasks = Objects_Add_An_App_Page.lnk_Tasks(driver).getText();
			Log.info(sTestCaseName + " | \"" + sTasks + "\" displayed as Tasks linktext");
		}
		 
		if (sCustomList.length() > 0){
			sCustomList = Objects_Add_An_App_Page.lnk_Custom_List(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCustomList + "\" displayed as Custom List linktext");
		}
		 
		if (sCustomListInDatasheetView.length() > 0){
			sCustomListInDatasheetView = Objects_Add_An_App_Page.lnk_Custom_List_In_Datasheet_View(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCustomListInDatasheetView + "\" displayed as Custom List in Datasheet View linktext");
		}
		 
		if (sExternalList.length() > 0){
			sExternalList = Objects_Add_An_App_Page.lnk_External_List(driver).getText();
			Log.info(sTestCaseName + " | \"" + sExternalList + "\" displayed as External List linktext");
		}
		
		if (sSurvey.length() > 0){
			sSurvey = Objects_Add_An_App_Page.lnk_Survey(driver).getText();
			Log.info(sTestCaseName + " | \"" + sSurvey + "\" displayed as Document Library linktext");
		}
		
		if (sAssetLibrary.length() > 0){
			sAssetLibrary = Objects_Add_An_App_Page.lnk_Asset_Library(driver).getText();
			Log.info(sTestCaseName + " | \"" + sAssetLibrary + "\" displayed as Survey linktext");
		}
		
		if (sAccessApp.length() > 0){
			sAccessApp = Objects_Add_An_App_Page.lnk_Access_App(driver).getText();
			Log.info(sTestCaseName + " | \"" + sAccessApp + "\" displayed as Access App linktext");
		}
		
		if (sImportSpreadsheet.length() > 0){
			sImportSpreadsheet = Objects_Add_An_App_Page.lnk_Import_Spreadsheet(driver).getText();
			Log.info(sTestCaseName + " | \"" + sImportSpreadsheet + "\" displayed as Import Spreadsheet linktext");
		}		
		
		//Screenshot time
		Utils.takeScreenshot(driver, sTestCaseName + "-ViewPage");
		
	//END OF VIEW PAGE METHOD
	}
//END OF METHODS
}