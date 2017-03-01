package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Rory Cruickshank
* Date: 20/06/2016
* Function: Objects_Add_An_App_Page
* Purpose: This class contains all of the elements on the Add An App page
* Arguments: 
* 			
* Returns: 
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

public class Objects_Add_An_App_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Add_An_App_Page";

    public static class Sidebar{
    	
    	public static WebElement lnk_Your_Apps(WebDriver driver){
        	 
    		try{
    			element = driver.findElement(By.linkText("Your Apps"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Your_Apps not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}	

    	public static WebElement lnk_Apps_You_Can_Add(WebDriver driver){
       	 
    		try{
    			element = driver.findElement(By.linkText("Apps You Can Add"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Apps_You_Can_Add not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}	

    	public static WebElement lnk_Manage_Licenses(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.linkText("Manage Licenses"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Manage_Licenses not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}

    	public static WebElement lnk_Your_Requests(WebDriver driver){
         	 
    		try{
    			element = driver.findElement(By.linkText("Your Requests"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Your_Requests not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
    	
    	public static WebElement lnk_Sharepoint_Store(WebDriver driver){
          	 
    		try{
    			element = driver.findElement(By.linkText("SharePoint Store"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Sharepoint_Store not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}
    	
    //END OF SIDEBAR METHODS
    }

	public static WebElement txt_Find_An_App(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("idStorefrontSearchBox"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Find_An_App not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lbl_Noteworthy_Header(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Noteworthy_Header not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lbl_Apps_You_Can_Add_Header(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Apps_You_Can_Add_Header not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Select_By_Newest(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Newest_Selector not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Select_By_Name(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div/ul/li[2]/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Select_By_Name not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
	public static WebElement lnk_Document_Library(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.linkText("Document Library"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Document_Library not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lnk_Form_Library(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.linkText("Form Library"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Form_Library not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Wiki_Page_Library(WebDriver driver){
	      	 
		try{
			element = driver.findElement(By.linkText("Wiki Page Library"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Wiki_Page_Library not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Picture_Library(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.linkText("Picture Library"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Picture_Library not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Links(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.linkText("Links"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Links not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Announcements(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.linkText("Announcements"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Announcements not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Contacts(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Contacts"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Contacts not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Calendar(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Calendar"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Calendar not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Promoted_Links(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Promoted Links"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Promoted_Links not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Discussion_Board(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Discussion Board"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Discussion_Board not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Tasks(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Tasks"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Tasks not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Custom_List(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Custom List"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Custom_List not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Custom_List_In_Datasheet_View(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Custom List in Datasheet View"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Custom_List_In_Datasheet_View not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_External_List(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("External List"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_External_List not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Survey(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Survey"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Survey not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Asset_Library(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Asset Library"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Asset_Library not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Access_App(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Access App"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Access_App not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
			
	public static WebElement lnk_Import_Spreadsheet(WebDriver driver){
		   	 
		try{
			element = driver.findElement(By.linkText("Import Spreadsheet"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Import_Spreadsheet not found | Exception desc : "+e.getMessage());		
	 	} 
	    return element;
	}
		

	
//END OF METHODS	    
}
