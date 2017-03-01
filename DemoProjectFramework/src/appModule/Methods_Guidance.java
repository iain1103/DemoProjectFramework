package appModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Guidance_Page;
import pageObjectRepositories.Objects_Guidance_Item_Page;
import utility.Log;
import utility.Utils;

public class Methods_Guidance{
	
	//Declare variables 
	private static String sTitle; 
	private static String sArticleInformationHeader;
	private static String sArticleOwner;
	private static String sCreationDate;
	private static String sUpdatedDate;
	private static String sTagsHeader;
	private static String sSummaryAbstractHeader;
	private static String sFirstParagraph;
	private static String sHeader;
	private static String sSearchResults;
	private static String sSummaryAbstract;
	private static String sDetails;
	private static String sGuidanceLink;
	private static Boolean bFilter;
	private static String sPublishingDepartment;
	private static String sPublishingDepartmentCorporateComms;
	private static String sContentCategory;
	private static String sContentCategoryStandardPage;
	private static String sTags;
	private static String sTagsGuidance;
	private static String sDocumentType;
	private static String sDocumentTypeWebPage;
	private static String sOwner;
	private static String sOwnerPaulMcGonigle;	
	private static String sLastModified;
	
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
		sArticleInformationHeader = Utils.assignStringVariable("Article Information Header", iRow);
		sArticleOwner = Utils.assignStringVariable("Article Owner", iRow);
		sCreationDate = Utils.assignStringVariable("Creation Date", iRow);
		sUpdatedDate = Utils.assignStringVariable("Updated Date", iRow);
		sTagsHeader = Utils.assignStringVariable("Tags Header", iRow);
		sSummaryAbstractHeader = Utils.assignStringVariable("Summary Abstract Header", iRow);
		sFirstParagraph = Utils.assignStringVariable("First Paragraph", iRow);
		
	//END OF GET TABLE VALUES METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewItem
	* Author: Rory Cruickshank
	* Date: 13/06/2016
	* Purpose: This method checks that expected elements are present on a Guidance item
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
		
		//Check that all of the elements of a the item are displayed
		sTitle = Objects_Guidance_Item_Page.Guidance_Item.lbl_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTitle + "\" displayed as Title");
		
		sArticleInformationHeader = Objects_Guidance_Item_Page.Guidance_Item.lbl_Article_Information(driver).getText();
		Log.info(sTestCaseName + " | \"" + sArticleInformationHeader + "\" displayed as Article Information Header");
		
		sArticleOwner = Objects_Guidance_Item_Page.Guidance_Item.lbl_Owner(driver).getText();
		Log.info(sTestCaseName + " | \"" + sArticleOwner + "\" displayed as Article Owner");		
		
		sCreationDate = Objects_Guidance_Item_Page.Guidance_Item.lbl_Created(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCreationDate + "\" displayed as Creation Date");
		
		sUpdatedDate = Objects_Guidance_Item_Page.Guidance_Item.lbl_Updated(driver).getText();
		Log.info(sTestCaseName + " | \"" + sUpdatedDate + "\" displayed as Updated Date");
		
		sTagsHeader = Objects_Guidance_Item_Page.Guidance_Item.lbl_Tags_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTagsHeader + "\" displayed as Tags Header");
		
		sSummaryAbstractHeader = Objects_Guidance_Item_Page.Guidance_Item.lbl_Summary_Abstract_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSummaryAbstractHeader + "\" displayed as Summary Abstract Header");
		
		sFirstParagraph = Objects_Guidance_Item_Page.Guidance_Item.lbl_First_Paragraph(driver).getText();
		if(sFirstParagraph.length() > 200){
			sFirstParagraph = sFirstParagraph.substring(0, 197) + "...";
		}
		Log.info(sTestCaseName + " | \"" + sFirstParagraph + "\" displayed as First Paragraph");
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName);
		
	//END OF VIEW ITEM METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewSidebar
	* Author: Rory Cruickshank
	* Date: 13/06/2016
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
		
		Utils.checkboxHandler("Filter Results by Location", Objects_Guidance_Page.Sidebar.chk_Filter_Results(driver), bFilter);
		
		//Check that the Publishing Department elements are shown
		sPublishingDepartment = Objects_Guidance_Page.Sidebar.btn_Publishing_Department_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPublishingDepartment + "\" displayed as Publishing Department");
		
		sPublishingDepartmentCorporateComms = Objects_Guidance_Page.Sidebar.lnk_Publishing_Department_Corporate_Comms(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPublishingDepartmentCorporateComms + "\" displayed as Publishing Department Corporate Comms");
			
		//Check that the Content Category elements are shown
		sContentCategory = Objects_Guidance_Page.Sidebar.btn_Content_Category_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sContentCategory + "\" displayed as Content Category");
		
		sContentCategoryStandardPage = Objects_Guidance_Page.Sidebar.lnk_Content_Category_Standard_Page(driver).getText();
		Log.info(sTestCaseName + " | \"" + sContentCategoryStandardPage + "\" displayed as Content Category Standard Page");
		
		//Check that the Tags elements are shown
		sTags = Objects_Guidance_Page.Sidebar.btn_Tags_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTags + "\" displayed as Tags");
		
		sTagsGuidance = Objects_Guidance_Page.Sidebar.lnk_Tags_Guidance(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTagsGuidance + "\" displayed as Tags Guidance");
		
		//Check that the Document Type elements are shown
		sDocumentType = Objects_Guidance_Page.Sidebar.btn_Document_Type_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sDocumentType + "\" displayed as Document Type");
		
		sDocumentTypeWebPage = Objects_Guidance_Page.Sidebar.lnk_Document_Type_Web_Page(driver).getText();
		Log.info(sTestCaseName + " | \"" + sDocumentTypeWebPage + "\" displayed as Document Type Web Page");
		
		//Check that the Owner elements are shown
		sOwner = Objects_Guidance_Page.Sidebar.btn_Owner_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sOwner + "\" displayed as Owner");

		sOwnerPaulMcGonigle = Objects_Guidance_Page.Sidebar.lnk_Owner_Paul_McGonigle(driver).getText();
		Log.info(sTestCaseName + " | \"" + sOwnerPaulMcGonigle + "\" displayed as Owner Paul McGonigle");
		
		//Check that the Last Modified elements are shown
		sLastModified = Objects_Guidance_Page.Sidebar.btn_Last_Modified_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sLastModified + "\" displayed as Last Modified");

		
		if (Objects_Guidance_Page.Sidebar.lnk_Last_Modified_Histogram(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Last Modified Histogram displayed");		
		}
		
		if (Objects_Guidance_Page.Sidebar.lnk_Last_Modified_Slider(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Last Modified Slider displayed");		
		}

		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewSidebar");
		
	//END OF VIEW SIDEBAR METHOD	
	}
	
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Rory Cruickshank
	* Date: 13/06/2016
	* Purpose: This method checks the main page elements on the Guidance page
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
		sHeader = Objects_Guidance_Page.Guidance.lbl_Search_Results(driver).getText();
		Log.info(sTestCaseName + " | \"" + sHeader + "\" displayed as Header");
		
		if (Objects_Guidance_Page.Guidance.btn_Search(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Search button displayed");		
		}
		
		sSearchResults = Objects_Guidance_Page.Guidance.lbl_Search_Results(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSearchResults + "\" displayed as Search Results");

		if (Objects_Guidance_Page.Guidance.lnk_Investment_News(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Investment News link displayed");		
		}
		
		sSummaryAbstract = Objects_Guidance_Page.Guidance.lbl_Summary_Abstract(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSummaryAbstract + "\" displayed as Summary Abstract");

		sDetails = Objects_Guidance_Page.Guidance.lbl_Details(driver).getText();
		Log.info(sTestCaseName + " | \"" + sDetails + "\" displayed as Details");
		
		sGuidanceLink = Objects_Guidance_Page.Guidance.lnk_Guidance_Link(driver).getText();
		Log.info(sTestCaseName + " | \"" + sGuidanceLink + "\" displayed as Policy Link");
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewMainPage");
		
	//END OF VIEW PAGE METHOD
	}
//END OF METHODS
}