package appModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Find_A_Colleague_Page;
import pageObjectRepositories.Objects_Forms_Page;
import pageObjectRepositories.Objects_Guidance_Page;
import pageObjectRepositories.Objects_Home_Page;
import pageObjectRepositories.Objects_Meeting_Rooms_Page;
import pageObjectRepositories.Objects_Navigation_Bar;
import pageObjectRepositories.Objects_News_Page;
import pageObjectRepositories.Objects_Offices_Page;
import pageObjectRepositories.Objects_Policies_Page;
import pageObjectRepositories.Objects_Procedures_Page;
import pageObjectRepositories.Objects_Resources_Subsite_Page;
import pageObjectRepositories.Objects_Strategies_Page;
import utility.Log;
import utility.Utils;

public class Methods_Navigation_Bar_Handler{
	
	//Declare variables 
	private static String sHomeClick; 
	private static String sNewsClick;
	private static String sResourcesClick;
	private static String sResourcesSubSiteClick;
	private static String sOfficesClick;
	private static String sOfficesEdinburghClick;
	private static String sFindAColleagueClick;
	private static String sQuickFindClick;
	private static String sQuickFindPoliciesClick;
	private static String sQuickFindFormsClick;
	private static String sQuickFindMeetingRoomsClick;
	private static String sQuickFindProceduresClick;
	private static String sQuickFindGuidanceClick;
	private static String sQuickFindStrategiesClick;
	private static String sChangeAreaOfBusinessClick;
	private static String sChangeLocationClick;
	
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
		
		sHomeClick = Utils.assignStringVariable("Home", iRow); 
		sNewsClick = Utils.assignStringVariable("News", iRow);
		sResourcesClick = Utils.assignStringVariable("Resources", iRow);
		sResourcesSubSiteClick = Utils.assignStringVariable("Resources Sub-Site", iRow);
		sOfficesClick = Utils.assignStringVariable("Offices", iRow);
		sOfficesEdinburghClick = Utils.assignStringVariable("Offices Edinburgh", iRow);
		sFindAColleagueClick = Utils.assignStringVariable("Find A Colleague", iRow);
		sQuickFindClick = Utils.assignStringVariable("Quick Find", iRow);
		sQuickFindPoliciesClick = Utils.assignStringVariable("Quick Find Policies", iRow);
		sQuickFindFormsClick = Utils.assignStringVariable("Quick Find Forms", iRow);
		sQuickFindMeetingRoomsClick = Utils.assignStringVariable("Quick Find Meeting Rooms", iRow);
		sQuickFindProceduresClick = Utils.assignStringVariable("Quick Find Procedures", iRow);
		sQuickFindGuidanceClick = Utils.assignStringVariable("Quick Find Guidance", iRow);
		sQuickFindStrategiesClick = Utils.assignStringVariable("Quick Find Strategies", iRow);
		sChangeAreaOfBusinessClick = Utils.assignStringVariable("Change Area of Business", iRow);
		sChangeLocationClick = Utils.assignStringVariable("Change Location", iRow);

	//END OF GET TABLE VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: navigateThroughBar
	* Author: Rory Cruickshank
	* Date: 07/04/2016
	* Purpose: This method handles the navigation bar depending on which variables are selected 
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
	public static void navigateThroughBar(WebDriver driver, String sTestCaseName, String sClickOrViewLinks, int iRow) throws Exception{
	
		//Currently only require values if we are checking which links are clickable, although this may change if users get different available links
		if (sClickOrViewLinks == "Click"){
			getTableValues(iRow);
		}
		
		//Now handle the objects on the Navigation bar
		if (sClickOrViewLinks == "Click"){
			if (sHomeClick.equals("Yes") == true){
				Objects_Navigation_Bar.lnk_Home(driver).click();
	 			//Check that we have found the correct page
				Utils.checkNewPage("Home", Objects_Home_Page.Tasks_And_Tools.lnk_Travel_And_Expenses(driver));
			}
		}else{
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Home(driver).getText() + "\" displayed as Home link text");		
		}
		
		if (sClickOrViewLinks == "Click"){
			if (sNewsClick.contains("Yes") == true){
				Objects_Navigation_Bar.lnk_News(driver).click();
				Utils.checkNewPage("News", Objects_News_Page.News_Items.btn_Search(driver));
			}
		}else{
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_News(driver).getText() + "\" displayed as News link text");		
		}
			
		if (sClickOrViewLinks == "Click"){
			if (sResourcesClick.equals("Yes") == true){
				Objects_Navigation_Bar.lnk_Resources(driver).click();
				Utils.checkNewPage("Resources", Objects_News_Page.News_Items.btn_Search(driver));
			}
		}else{
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Resources(driver).getText() + "\" displayed as Resources link text");		
		}
		
		if (sClickOrViewLinks == "Click"){
			if (sResourcesSubSiteClick.equals("Yes") == true){
				Objects_Navigation_Bar.lnk_Resources(driver).click();
				Objects_Navigation_Bar.lnk_Resources_Subsite(driver).click();
				Utils.checkNewPage("Resources Subsite", Objects_Resources_Subsite_Page.Home.lbl_HomePage_Header(driver));
			}
		}else{
			Objects_Navigation_Bar.lnk_Resources(driver).click();
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Resources_Subsite(driver).getText() + "\" displayed as Resources Subsite link text");		
		}
		
		if (sClickOrViewLinks == "Click"){
			if (sOfficesClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Offices(driver).click();
				Utils.checkNewPage("Offices", Objects_Navigation_Bar.lnk_Offices_Edinburgh(driver));
			}
		}else{
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Offices(driver).getText() + "\" displayed as Offices link text");		
		}
		
		if (sClickOrViewLinks == "Click"){		
			if (sOfficesEdinburghClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Offices(driver).click();
				Objects_Navigation_Bar.lnk_Offices_Edinburgh(driver).click();
				Utils.checkNewPage("Offices - Edinburgh", Objects_Offices_Page.Edinburgh.lbl_Offices_Edinburgh(driver));
			}
		}else{
			Objects_Navigation_Bar.lnk_Offices(driver).click();
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Offices_Edinburgh(driver).getText() + "\" displayed as Offices Edinburgh link text");		
		}
		
		if (sClickOrViewLinks == "Click"){	
			if (sFindAColleagueClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Find_A_Colleague(driver).click();
				Utils.checkNewPage("Find A Colleague", Objects_Find_A_Colleague_Page.Colleague_Search.txt_Search_Input(driver));
			}
		}else{
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Find_A_Colleague(driver).getText() + "\" displayed as Find A Colleague link text");		
		}
		
		if (sClickOrViewLinks == "Click"){		
			if (sQuickFindClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
				Utils.checkNewPage("Quick Find", Objects_Navigation_Bar.lnk_Policies(driver));
			}
		}else{
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Quick_Find(driver).getText() + "\" displayed as Quick Find link text");		
		}
		
		if (sClickOrViewLinks == "Click"){	
			if (sQuickFindPoliciesClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
				Objects_Navigation_Bar.lnk_Policies(driver).click();
				Utils.checkSearchFilter("ContentTags:Policies", Objects_Policies_Page.Policies.txt_Policies_Search(driver));
			}
		}else{
			Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Policies(driver).getText() + "\" displayed as Policies link text");		
		}

		if (sClickOrViewLinks == "Click"){
			if (sQuickFindFormsClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
				Objects_Navigation_Bar.lnk_Forms(driver).click();
				Utils.checkSearchFilter("ContentTags:Forms", Objects_Forms_Page.Forms.txt_Forms_Search(driver));
			}
		}else{
			Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Forms(driver).getText() + "\" displayed as Forms link text");		
		}
		
		if (sClickOrViewLinks == "Click"){
			if (sQuickFindMeetingRoomsClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
				Objects_Navigation_Bar.lnk_Meeting_Rooms(driver).click();
				Utils.checkSearchFilter("ContentTags:Meeting Room", Objects_Meeting_Rooms_Page.Meeting_Rooms.txt_Meeting_Rooms_Search(driver));
			}
		}else{
			Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Meeting_Rooms(driver).getText() + "\" displayed as Meeting Rooms link text");		
		}
		
		if (sClickOrViewLinks == "Click"){
			if (sQuickFindProceduresClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
				Objects_Navigation_Bar.lnk_Procedures(driver).click();
				Utils.checkSearchFilter("ContentTags:Procedure", Objects_Procedures_Page.Procedures.txt_Procedures_Search(driver));
			}
		}else{
			Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Procedures(driver).getText() + "\" displayed as Procedures link text");		
		}
		
		if (sClickOrViewLinks == "Click"){		
			if (sQuickFindGuidanceClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
				Objects_Navigation_Bar.lnk_Guidance(driver).click();
				Utils.checkSearchFilter("ContentTags:Guidance", Objects_Guidance_Page.Guidance.txt_Guidance_Search(driver));
			}
		}else{
			Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Guidance(driver).getText() + "\" displayed as Guidance link text");		
		}
		
		if (sClickOrViewLinks == "Click"){
			if (sQuickFindStrategiesClick.equals("Yes") == true){			
				Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
				Objects_Navigation_Bar.lnk_Strategies(driver).click();
				Utils.checkSearchFilter("ContentTags:Strategy", Objects_Strategies_Page.Strategies.txt_Strategies_Search(driver));
			}
		}else{
			Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lnk_Strategies(driver).getText() + "\" displayed as Strategies link text");		
		}

		//Can't set the share price from here, so just view it
		Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.lbl_Share_Price(driver).getText() + "\" displayed as Share Price text");		
		
		if (sClickOrViewLinks == "Click"){
			if (sChangeAreaOfBusinessClick.equals("Yes") == true){			
				Objects_Navigation_Bar.btn_Current_Area_Of_Business(driver).click(); 
				Utils.checkNewPage("Change AoB", Objects_Navigation_Bar.Change_Location.lbl_Europe(driver));
			}
		}else{
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.btn_Current_Area_Of_Business(driver).getText() + "\" displayed as Area of Business link text");		
		}
		
		if (sClickOrViewLinks == "Click"){
			if (sChangeLocationClick.equals("Yes") == true){			
				Objects_Navigation_Bar.btn_Current_Location(driver).click(); 
				Utils.checkNewPage("Change Location", Objects_Navigation_Bar.Change_Location.lbl_Europe(driver));
			}
		}else{
			Log.info(sTestCaseName + " | \"" + Objects_Navigation_Bar.btn_Current_Location(driver).getText() + "\" displayed as Location link text");		
		}
		
	//END OF NAVIGATE THROUGH BAR METHOD
	}
	
//END OF METHODS
}