package appModule;

import java.util.Objects;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjectRepositories.Objects_Navigation_Bar;
import pageObjectRepositories.Objects_Policies_Item_Page;
import pageObjectRepositories.Objects_Policies_Page;
import utility.Log;
import utility.Utils;

public class Methods_Policies{
	
	//Declare variables 
	private static String sTitle; 
	private static String sArticleInformationHeader;
	private static String sArticleOwner;
	private static String sCreationDate;
	private static String sUpdatedDate;
	private static String sTagsHeader;
	private static String sPageRating;
	private static String sCommentsHeader;
	private static String sCommentInput;
	private static Boolean bPostComment;
	private static String sCheckComment;
	private static String sUserName;
	private static String sCommentDate;
	private static String sUserComment;
	private static Boolean bDeleteComment;
	private static String sEditedComment;
	private static String sHeader;
	private static String sSearchResults;
	private static String sSummaryAbstract;
	private static String sDetails;
	private static String sPolicyLink;
	private static Boolean bFilter;
	private static String sPublishingDepartment;
	private static String sPublishingDepartmentPeopleOnline;
	private static String sPublishingDepartmentRisk;
	private static String sContentCategory;
	private static String sContentCategoryStandardPage;
	private static String sTags;
	private static String sTagsPolicy;
	private static String sTagsLearningAndDevelopment;
	private static String sDocumentType;
	private static String sDocumentTypeWebPage;
	private static String sLastModified;
	
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
		
		sTitle = Utils.assignStringVariable("Title", iRow); 
		sArticleInformationHeader = Utils.assignStringVariable("Article Information Header", iRow);
		sArticleOwner = Utils.assignStringVariable("Article Owner", iRow);
		sCreationDate = Utils.assignStringVariable("Creation Date", iRow);
		sUpdatedDate = Utils.assignStringVariable("Updated Date", iRow);
		sTagsHeader = Utils.assignStringVariable("Tags Header", iRow);
		sPageRating = Utils.assignStringVariable("Page Rating", iRow);
		sCommentsHeader = Utils.assignStringVariable("Comments Header", iRow);
		sCommentInput = Utils.assignStringVariable("Comment Input", iRow);
		if (sCommentInput.length() > 0){
			sCommentInput = Utils.assignUniqueVariable("Comment Input", iRow);
		}
		bPostComment = Boolean.valueOf(Utils.assignStringVariable("Post Comment", iRow));
		sUserName = Utils.assignStringVariable("User Name", iRow);
		sCommentDate = Utils.assignStringVariable("Comment Date", iRow);
		sUserComment = Utils.assignStringVariable("User Comment", iRow);
		bDeleteComment = Boolean.valueOf(Utils.assignStringVariable("Delete Comment", iRow));
		sEditedComment = Utils.assignStringVariable("Edited Comment", iRow);
		if (sEditedComment.length() > 0){
			sEditedComment = Utils.assignUniqueVariable("Edited Comment", iRow);
		}
				
	//END OF GET TABLE VALUES METHOD
	}

	/* **************************************************************************************************
	* Function: navigateToPolicyItem
	* Author: Rory Cruickshank
	* Date: 23/06/2016
	* Purpose: This method navigates to a policy item
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
	public static void navigateToPolicyItem(WebDriver driver, String sTestCaseName){
		
		Objects_Navigation_Bar.lnk_Quick_Find(driver).click();
		Objects_Navigation_Bar.lnk_Policies(driver).click();
		
		//Verify that we are on the correct page
		Utils.checkSearchFilter("ContentTags:Policy", Objects_Policies_Page.Policies.txt_Policies_Search(driver));
		
		//Set the checkbox to remove all filters
		Utils.checkboxHandler("Filter Results by Location", Objects_Policies_Page.Sidebar.chk_Filter_Results(driver), false);
	
		//Need a pause to wait for the expected item to appear, has to be a sleep to avoid stale element exception
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			//Catch as required
			Log.error(sTestCaseName + " | Thread.sleep unsuccessful | Exception desc : "+e.getMessage());	
		}	
		
		//Navigate to the UK Maternity Policy policy item
		Objects_Policies_Page.Policies.lnk_UK_Maternity_Policy(driver).click();
	
	//END OF NAVIGATE TO POLICY ITEM METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewItem
	* Author: Rory Cruickshank
	* Date: 10/06/2016
	* Purpose: This method checks that expected elements are present on a policies item and adds, edits
	* 			or deletes comments accordingly
	* Arguments: driver
	* 			sTestCaseName
	* 			sAction
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
	*****************************************************************************************************/	
	public static void viewItem(WebDriver driver, String sTestCaseName, String sAction, int iRow) throws Exception{
		
		//Declare our variables and instantiate 
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 5);

		getTableValues(iRow);

		//Check that all of the elements of the item are displayed
		sTitle = Objects_Policies_Item_Page.Policies_Item.lbl_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTitle + "\" displayed as Title");
		
		sArticleInformationHeader = Objects_Policies_Item_Page.Policies_Item.lbl_Article_Information(driver).getText();
		Log.info(sTestCaseName + " | \"" + sArticleInformationHeader + "\" displayed as Article Information Header");
		
		sArticleOwner = Objects_Policies_Item_Page.Policies_Item.lbl_Owner(driver).getText();
		Log.info(sTestCaseName + " | \"" + sArticleOwner + "\" displayed as Article Owner");		
		
		sCreationDate = Objects_Policies_Item_Page.Policies_Item.lbl_Created(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCreationDate + "\" displayed as Creation Date");
		
		sUpdatedDate = Objects_Policies_Item_Page.Policies_Item.lbl_Updated(driver).getText();
		Log.info(sTestCaseName + " | \"" + sUpdatedDate + "\" displayed as Updated Date");
		
		sTagsHeader = Objects_Policies_Item_Page.Policies_Item.lbl_Tags_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTagsHeader + "\" displayed as Tags Header");
		
		sPageRating = Objects_Policies_Item_Page.Policies_Item.lbl_Page_Rating(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPageRating + "\" displayed as Page Rating Header");
		
		sCommentsHeader = Objects_Policies_Item_Page.Policies_Item.lbl_Comments_Header(driver).getText();
		Log.info(sTestCaseName + " | \"" + sCommentsHeader + "\" displayed as Comments Header");
		
		//Are we inputting a comment or checking the existing one?
		if (sCommentInput.length() > 0){
			//Clear the textbox and then add our comment
			Objects_Policies_Item_Page.Policies_Item.txt_Comments_Input(driver).clear();
			executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Policies_Item_Page.Policies_Item.txt_Comments_Input(driver), sCommentInput);
			//Objects_Policies_Item_Page.Policies_Item.txt_Comments_Input(driver).sendKeys(sCommentInput);
		}else{
			sCommentInput = Objects_Policies_Item_Page.Policies_Item.txt_Comments_Input(driver).getText();
		}
		Log.info(sTestCaseName + " | \"" + sCommentInput + "\" displayed as Comment Input");
		
		if(bPostComment == true){
			Objects_Policies_Item_Page.Policies_Item.btn_Comments_Post(driver).click();
			Log.info(sTestCaseName + " | Post button clicked");
		}
		
		//Little pause here before we continue to let the system catch up
		Thread.sleep(2000);
		
		//Check if we are viewing the page or adding a comment
		if (sAction == "Edit"){
			wait.until(ExpectedConditions.textToBePresentInElement(Objects_Policies_Item_Page.Policies_Item.lbl_User_Comment(driver), sCommentInput));
			sCheckComment = Objects_Policies_Item_Page.Policies_Item.lbl_User_Comment(driver).getText();
			if (Objects.equals(sCheckComment, sCommentInput)){
				Log.info(sTestCaseName + " | \"" + sCommentInput + "\" located as Comment");
			}else{
	    		Log.error(sTestCaseName + " | Comment not found. Expected \"" + sCommentInput + "\" but found \"" + sCheckComment + "\"");
			}
		}else if(sAction == "View"){
			//We're viewing, so check that all fields are displayed
			sUserName = Objects_Policies_Item_Page.Policies_Item.lnk_User_Name(driver).getText();
			Log.info(sTestCaseName + " | \"" + sUserName + "\" displayed as User Name");
			
			sCommentDate = Objects_Policies_Item_Page.Policies_Item.lbl_Comment_Date(driver).getText();
			Log.info(sTestCaseName + " | \"" + sCommentDate + "\" displayed as Comment Date");
			
			sUserComment = Objects_Policies_Item_Page.Policies_Item.lbl_User_Comment(driver).getText();
			Log.info(sTestCaseName + " | \"" + sUserComment + "\" displayed as User Comment");
		}else{
			Log.warn(sTestCaseName + " | \"" + sAction + "\" given as sAction value. Unable to proceed");
		}
		
		//Check if we are deleting a comment
		if(bDeleteComment == true){
			wait.until(ExpectedConditions.elementToBeClickable(Objects_Policies_Item_Page.Policies_Item.btn_Delete_Comment(driver)));
			Objects_Policies_Item_Page.Policies_Item.btn_Delete_Comment(driver).click();
		    try {
		    	//Select OK from the Alert popup
		        Alert alert = driver.switchTo().alert();
		        Thread.sleep(2000);
		        alert.accept();
				Thread.sleep(2000);
		        //Check that the comment has been deleted
				sCheckComment = Objects_Policies_Item_Page.Policies_Item.lbl_User_Comment(driver).getText();
				if (Objects.equals(sCheckComment, sCommentInput)){
					//Unexpected true result, so flag that as an error
		    		Log.error(sTestCaseName + " | Comment not deleted as expected. Comments section still shows \"" + sCheckComment + "\"");
				}else{
					//We expect it to be false and the item to have disappeared, so this would be a pass
		    		Log.info(sTestCaseName + " | Comment \"" + sCommentInput + "\" not found after deletion");
				}
		    }catch(Exception e){
		   		Log.error(sTestCaseName + " | Unexpected exception occurred on deleting comment | Exception desc : "+e.getMessage());		   		
		    }
		}
		
		//Check if we are editing a comment
		if(sEditedComment.length() > 0){
			wait.until(ExpectedConditions.elementToBeClickable(Objects_Policies_Item_Page.Policies_Item.btn_Edit_Comment(driver)));
			Objects_Policies_Item_Page.Policies_Item.btn_Edit_Comment(driver).click();
		    try {
		    	//Clear the current comment and post our new one
		    	Objects_Policies_Item_Page.Policies_Item.txt_Edit_Comment(driver).clear();
				//Objects_Policies_Item_Page.Policies_Item.txt_Edit_Comment(driver).sendKeys(sEditedComment);
				executor.executeScript("arguments[0].textContent= arguments[1];", Objects_Policies_Item_Page.Policies_Item.txt_Edit_Comment(driver), sEditedComment);
				Objects_Policies_Item_Page.Policies_Item.btn_Post_Edited_Comment(driver).click();
				Thread.sleep(5000);
				sCheckComment = Objects_Policies_Item_Page.Policies_Item.lbl_User_Comment(driver).getText();
				if (Objects.equals(sCheckComment, sEditedComment)){
					Log.info(sTestCaseName + " | \"" + sEditedComment + "\" located as Edited Comment");
				}else{
		    		Log.error(sTestCaseName + " | Comment not found. Expected \"" + sEditedComment + "\" but found \"" + sCheckComment + "\"");
				}
		    }catch(Exception e){
		   		Log.error(sTestCaseName + " | Unexpected exception occurred on editing comment | Exception desc : "+e.getMessage());		   		
		    }
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName);
		
	//END OF VIEW ITEM METHOD
	}
	
	/* **************************************************************************************************
	* Function: viewSidebar
	* Author: Rory Cruickshank
	* Date: 10/06/2016
	* Purpose: This method checks the sidebar elements on the Policies page
	* Arguments: driver
	*			sTestCaseName		
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
	
		//Set the variable for filter
		bFilter = true;
		
		Utils.checkboxHandler("Filter Results by Location", Objects_Policies_Page.Sidebar.chk_Filter_Results(driver), bFilter);
		
		//Check that the Publishing Department elements are shown
		sPublishingDepartment = Objects_Policies_Page.Sidebar.btn_Publishing_Department_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPublishingDepartment + "\" displayed as Publishing Department");
		
		sPublishingDepartmentPeopleOnline = Objects_Policies_Page.Sidebar.lnk_Publishing_Department_People_Online(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPublishingDepartmentPeopleOnline + "\" displayed as Publishing Department People Online");
		
		sPublishingDepartmentRisk = Objects_Policies_Page.Sidebar.lnk_Publishing_Department_Risk(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPublishingDepartmentRisk + "\" displayed as Publishing Department Risk");
		
		//Check that the Content Category elements are shown
		sContentCategory = Objects_Policies_Page.Sidebar.btn_Content_Category_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sContentCategory + "\" displayed as Content Category");
		
		sContentCategoryStandardPage = Objects_Policies_Page.Sidebar.lnk_Content_Category_Standard_Page(driver).getText();
		Log.info(sTestCaseName + " | \"" + sContentCategoryStandardPage + "\" displayed as Content Category Standard Page");
		
		//Check that the Tags elements are shown
		sTags = Objects_Policies_Page.Sidebar.btn_Tags_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTags + "\" displayed as Tags");
		
		sTagsPolicy = Objects_Policies_Page.Sidebar.lnk_Tags_Policy(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTagsPolicy + "\" displayed as Tags Policy");
		
		sTagsLearningAndDevelopment = Objects_Policies_Page.Sidebar.lnk_Tags_Learning_And_Development(driver).getText();
		Log.info(sTestCaseName + " | \"" + sTagsLearningAndDevelopment + "\" displayed as Tags Learning and Development");
		
		//Check that the Document Type elements are shown
		sDocumentType = Objects_Policies_Page.Sidebar.btn_Document_Type_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sDocumentType + "\" displayed as Document Type");
		
		sDocumentTypeWebPage = Objects_Policies_Page.Sidebar.lnk_Document_Type_Web_Page(driver).getText();
		Log.info(sTestCaseName + " | \"" + sDocumentTypeWebPage + "\" displayed as Document Type Web Page");
		
		//Check that the Last Modified elements are shown
		sLastModified = Objects_Policies_Page.Sidebar.btn_Last_Modified_Expander(driver).getText();
		Log.info(sTestCaseName + " | \"" + sLastModified + "\" displayed as Last Modified");
		
		if (Objects_Policies_Page.Sidebar.lnk_Last_Modified_Histogram(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Last Modified Histogram displayed");		
		}
		
		if (Objects_Policies_Page.Sidebar.lnk_Last_Modified_Slider(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Last Modified Slider displayed");		
		}

	//END OF VIEW SIDEBAR METHOD	
	}
	
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Rory Cruickshank
	* Date: 10/06/2016
	* Purpose: This method views the elements on the main Policies page
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
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that the Publishing Department elements are shown
		sHeader = Objects_Policies_Page.Policies.lbl_Search_Results(driver).getText();
		Log.info(sTestCaseName + " | \"" + sHeader + "\" displayed as Header");
		
		if (Objects_Policies_Page.Policies.btn_Search(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | Search button displayed");		
		}
		
		sSearchResults = Objects_Policies_Page.Policies.lbl_Search_Results(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSearchResults + "\" displayed as Search Results");

		if (Objects_Policies_Page.Policies.lnk_UK_Maternity_Policy(driver).isDisplayed() == true){
			Log.info(sTestCaseName + " | UK Maternity Policy link displayed");		
		}
		
		sSummaryAbstract = Objects_Policies_Page.Policies.lbl_Summary_Abstract(driver).getText();
		Log.info(sTestCaseName + " | \"" + sSummaryAbstract + "\" displayed as Summary Abstract");

		sDetails = Objects_Policies_Page.Policies.lbl_Details(driver).getText();
		Log.info(sTestCaseName + " | \"" + sDetails + "\" displayed as Details");
		
		sPolicyLink = Objects_Policies_Page.Policies.lnk_Policy_Link(driver).getText();
		Log.info(sTestCaseName + " | \"" + sPolicyLink + "\" displayed as Policy Link");
		
		
	//END OF VIEW PAGE METHOD
	}

	/* **************************************************************************************************
	* Function: editOrDeleteOtherComment
	* Author: Rory Cruickshank
	* Date: 27/06/2016
	* Purpose: This method attempts to edit or delete a comment placed by another user
	* 			on the Policies page
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
	public static void editOrDeleteOtherComment(WebDriver driver, String sTestCaseName, String sAction){
	
		Boolean exist = false;
		
		//First check that we have found the correct comment
		sCheckComment = Objects_Policies_Item_Page.Policies_Item.lbl_User_Comment(driver).getText();
		if (Objects.equals(sCheckComment, sCommentInput)){
			Log.info(sTestCaseName + " | \"" + sCommentInput + "\" located as Comment");
		}else{
    		Log.error(sTestCaseName + " | Comment not found. Expected \"" + sCommentInput + "\" but found \"" + sCheckComment + "\"");
    		//No point continuing without the valid comment
    		return;
		}
		
		//Try to take a screenshot to show the initial state
		try {
			Utils.takeScreenshot(driver, sTestCaseName + "-InitialState");
		} catch (Exception e) {
			//Catch as required
			Log.error(sTestCaseName + " | takeScreenshot unsuccessful | Exception desc : "+e.getMessage());
		}
		
		//Check if we're deleting or editing
		if(sAction.contentEquals("Delete")){
			//Check which user we are expecting
			if(sTestCaseName.contains("_Administrator")){
				//We only expect Delete to be there for Administrators 
				Objects_Policies_Item_Page.Policies_Item.btn_Delete_Comment(driver).click();
			    try {
			    	//Select OK from the Alert popup
			        Alert alert = driver.switchTo().alert();
			        Thread.sleep(2000);
			        alert.accept();
					Thread.sleep(2000);
			        //Check that the comment has been deleted
					sCheckComment = Objects_Policies_Item_Page.Policies_Item.lbl_User_Comment(driver).getText();
					if (Objects.equals(sCheckComment, sCommentInput)){
						//Unexpected true result, so flag that as an error
			    		Log.error(sTestCaseName + " | Comment not deleted as expected. Comments section still shows \"" + sCheckComment + "\"");
					}else{
						//We expect it to be false and the item to have disappeared, so this would be a pass
			    		Log.info(sTestCaseName + " | Comment \"" + sCommentInput + "\" not found after deletion");
					}
			    }catch(Exception e){
			   		Log.error(sTestCaseName + " | Unexpected exception occurred on deleting comment | Exception desc : "+e.getMessage());		   		
			    }
			}else if (sTestCaseName.contains("_Visitor") || sTestCaseName.contains("_Content_Author")){
				//We don't expect the delete button to be there
				exist = driver.findElements(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_socomDelBtn0")).size() == 0;
				if(exist == true){
					Log.info(sTestCaseName + " | Delete button not found as expected for this user.");
				}else{
					Log.error(sTestCaseName + " | Delete button found but not expected for this user.");
				}
			}else{
				//Something has gone wrong. It has not returned one of the expected user types
				Log.error(sTestCaseName + " | Valid user not found in test name. Expected \"Visitor\" or \"Content_Author\" or \"Administrator\" in test case name.");		
			}
		}else if(sAction.contentEquals("Edit")){
			//Edit should not be available for any user
			exist = driver.findElements(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_socomEditBtn0")).size() == 0;
			if(exist == true){
				Log.info(sTestCaseName + " | Edit button not found as expected for this user.");
			}else{
				Log.error(sTestCaseName + " | Edit button found but not expected for this user.");
			}
		}else{
			//Something has gone wrong. We have an unexpected action type
			Log.error(sTestCaseName + " | Valid action not found. Expected \"Delete\" or \"Edit\" but found \"" + sAction + "\"");
		}
		
		//Try to take a screenshot to show the final state
		try {
			Utils.takeScreenshot(driver, sTestCaseName + "-FinalState");
		} catch (Exception e) {
			//Catch as required
			Log.error(sTestCaseName + " | takeScreenshot unsuccessful | Exception desc : "+e.getMessage());
		}
	

	}
	
//END OF METHODS
}