package appModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Meeting_Rooms_Page;
import utility.Log;
import utility.Utils;

public class Methods_Meeting_Rooms{
	
	//Declare variables 
	private static String sHeader;
	private static String sNoMatches;
	private static Boolean bFilter;
	private static String sNoRefiners;
		
	/* **************************************************************************************************
	* Function: getTableValues
	* Author: Rory Cruickshank
	* Date: 14/06/2016
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
	public static void getTableValues() {
		
		/*sTitle = Utils.assignStringVariable("Title", 1, 3); 
		sArticleInformationHeader = Utils.assignStringVariable("Article Information Header", 1, 4);
		sArticleOwner = Utils.assignStringVariable("Article Owner", 1, 5);
		sCreationDate = Utils.assignStringVariable("Creation Date", 1, 6);
		sUpdatedDate = Utils.assignStringVariable("Updated Date", 1, 7);
		sTagsHeader = Utils.assignStringVariable("Tags Header", 1, 8);
		sSummaryAbstractHeader = Utils.assignStringVariable("Summary Abstract Header", 1, 9);
		sFirstParagraph = Utils.assignStringVariable("First Paragraph", 1, 10);*/
		
	//END OF GET TABLE VALUES METHOD
	}
		
	/* **************************************************************************************************
	* Function: viewSidebar
	* Author: Rory Cruickshank
	* Date: 14/06/2016
	* Purpose: This method checks the sidebar elements on the Guidance page
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
	public static void viewSidebar(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Set the variable for filter
		bFilter = true;
		
		Utils.checkboxHandler("Filter Results by Location", Objects_Meeting_Rooms_Page.Sidebar.chk_Filter_Results(driver), bFilter);

		sNoRefiners = Objects_Meeting_Rooms_Page.Sidebar.lbl_No_Refiners(driver).getText();
		Log.info(sTestCaseName + " | \"" + sNoRefiners + "\" displayed as Filter text");
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewSidebar");
		
	//END OF VIEW SIDEBAR METHOD	
	}
	
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Rory Cruickshank
	* Date: 14/06/2016
	* Purpose: This method checks the main page elements on the Forms page
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
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that the Publishing Department elements are shown
		sHeader = Objects_Meeting_Rooms_Page.Meeting_Rooms.lbl_Search_Results(driver).getText();
		Log.info(sTestCaseName + " | \"" + sHeader + "\" displayed as Header");
		
		if (Objects_Meeting_Rooms_Page.Meeting_Rooms.btn_Search(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Search button displayed");		
		}
		
		sNoMatches = Objects_Meeting_Rooms_Page.Meeting_Rooms.lbl_No_Matches(driver).getText();
		if(sNoMatches.length() > 200){
			sNoMatches = sNoMatches.substring(0, 197) + "...";
		}
		Log.info(sTestCaseName + " | \"" + sNoMatches + "\" displayed as Search Results");
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewMainPage");
		
	//END OF VIEW PAGE METHOD
	}
//END OF METHODS
}