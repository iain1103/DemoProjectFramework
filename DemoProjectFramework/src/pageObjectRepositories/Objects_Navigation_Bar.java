package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Rory Cruickshank
* Date: 30/03/2016
* Function: Navigation_Bar
* Purpose: This class contains all of the elements on the Navigation bar
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

public class Objects_Navigation_Bar {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Navigation_Bar";
	
	public static WebElement lnk_Stan_Home(WebDriver driver){
	      	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[1]/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Stan_Home not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	    
	public static WebElement lnk_Home(WebDriver driver){
	    	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[6]/ul/li/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Home not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	 
	public static WebElement lnk_News(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[6]/div/ul/li[2]/a/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_News not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}

	public static WebElement lnk_Resources(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[6]/div/ul/li[3]/a/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Resources not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	
	public static WebElement lnk_Resources_Subsite(WebDriver driver){
	      	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[6]/div/ul/li[3]/div/ul/li/a/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Resources_Subsite not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	    
	public static WebElement lnk_Offices(WebDriver driver){
	     	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[6]/div/ul/li[4]/a/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Offices not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}

	public static WebElement lnk_Offices_Edinburgh(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[6]/div/ul/li[4]/div/ul/li[1]/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Offices_Edinburgh not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	
	public static WebElement lnk_Find_A_Colleague(WebDriver driver){
	     	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[6]/div/ul/li[5]/a/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Find_A_Colleague not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	    
	public static WebElement lnk_Quick_Find(WebDriver driver){
	     	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[6]/div/ul/li[6]/a/span[1]/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Quick_Find not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lnk_Policies(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.linkText("Policies"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Policies not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Forms(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.linkText("Forms"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Forms not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lnk_Procedures(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Procedures"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Procedures not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}	
	
	public static WebElement lnk_Guidance(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.linkText("Guidance"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Guidance not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}	
	
	public static WebElement lnk_Meeting_Rooms(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Meeting Rooms"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Meeting_Rooms not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement lnk_Strategies(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText("Strategies"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Strategies not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	
	public static WebElement txt_Search_This_Site(WebDriver driver){
	     	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[5]/div/div[1]/div/div/div/div[1]/div/div/input"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Search_This_Site not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	    
	public static WebElement rab_Content(WebDriver driver){
	     	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[5]/div/div[2]/table/tbody/tr[1]/td/span/input"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | rab_Content not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	    
	public static WebElement rab_People(WebDriver driver){
	     	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[1]/div[5]/div/div[2]/table/tbody/tr[2]/td/span/input"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | rab_People not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	} 

	public static WebElement btn_Logged_In_User(WebDriver driver){
	     	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div[1]/span[2]/a"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Logged_In_User not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	
	public static WebElement btn_User_Sign_Out(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div[1]/span[2]/div/ul/li[2]/a/div[2]/span[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_User_Sign_Out not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}	
	
	public static WebElement lnk_Departments(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[3]/div[1]/div[1]/div/ul/li[5]/ul/li[2]/a/span/span[1]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Departments not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	
	public static WebElement lnk_Global_Wealth(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[1]/div[1]/div[3]/div[1]/div[1]/div/ul/li[5]/ul/li[3]/a/span/span"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Global_Wealth not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}

	public static WebElement lbl_Share_Price(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("shareprice"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Share_Price not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
	public static WebElement btn_Current_Area_Of_Business(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("aobCurrent"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Current_Area_Of_Business not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	
	public static WebElement btn_Current_Location(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("locationCurrent"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Current_Location not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	
	public static class Change_Location{
		
		public static WebElement lbl_Europe(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.linkText("Europe"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | Change_Location not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
	//END OF CHANGE LOCATION METHODS
	}
	
	public static class User{
		
		public static WebElement btn_User(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div[1]/span[2]/span[2]/img"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_User not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}		
		
	//END OF USER METHODS
	}
	
	public static class Settings{
		
		public static WebElement btn_Settings(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div[2]/span[1]/span[2]/a"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_Settings not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement lnk_Shared_With(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div[2]/span[1]/span[2]/div/ul/li[1]/a/div[2]/span[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lnk_Shared_With not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement lnk_Add_A_Page(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.linkText("Add a page"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lnk_Add_A_Page not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement lnk_Add_An_App(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.linkText("Add an app"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lnk_Add_An_App not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}

		public static WebElement lnk_Site_Contents_Administrator(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div[2]/span[1]/span[2]/div/ul/li[6]/a"));//div[2]/span[1]"));
			}catch(Exception e){
				Log.error(sRepositoryName + " | lnk_Site_Contents not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement lnk_Site_Contents_Content_Author(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[2]/div/div[2]/span[1]/span[2]/div/ul/li[5]/a"));//div[2]/span[1]"));
			}catch(Exception e){
				Log.error(sRepositoryName + " | lnk_Site_Contents not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
	//END OF SETTINGS METHODS	
	}
	
//END OF METHODS	    
}
