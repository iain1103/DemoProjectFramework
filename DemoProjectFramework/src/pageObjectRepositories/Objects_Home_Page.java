package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 31/03/2016
* Function: Home_Page
* Purpose: This class contains all of the elements on the Home page
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
 public class Objects_Home_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Home_Page";
 
	public static WebElement lnk_External_Video(WebDriver driver){
   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div[1]/div/a[2]"));
	    Log.info("External Video link element found"); 
	    return element;
	}

	public static WebElement lnk_Pension_Changes_Revealed(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/a[2]"));
	    Log.info("Pension Changes Revealed link element found"); 
	    return element;
	}
	
	public static WebElement lnk_Time_To_Book(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div[3]/div/a[2]"));
	    Log.info("Time To Book Your Leave link element found"); 
	    return element;
	}
	
	public static WebElement lbl_Logo(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div[3]/div/a[2]"));
	    Log.info("Time To Book Your Leave link element found"); 
	    return element;
	}
	
	public static WebElement btn_Legal_Information(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[3]/div/div[4]/span"));
	    Log.info("Legal Information button element found"); 
	    return element;
	}
	
	
    public static class Tasks_And_Tools{

    	public static WebElement lnk_IT_Help_And_Support(WebDriver driver){
    	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[1]/div[1]/div[2]/div/div[1]/div/a/div"));
    	    Log.info("IT Help And Support link element found"); 
    	    return element;
    	}

    	public static WebElement lnk_Find_A_Meeting_Room(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div/a/div"));
    	    Log.info("Find A Meeting Room link element found"); 
    	    return element;
    	}

    	public static WebElement lnk_Share_Price(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[1]/div[1]/div[4]/div/div[1]/div/a/div"));
    	    Log.info("Share Price link element found"); 
    	    return element;
    	}

    	public static WebElement lnk_Travel_And_Expenses(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[1]/div[1]/div[1]/div/div[1]/div/a"));
    	    Log.info("Travel And Expenses link element found"); 
    	    return element;
    	}

    	public static WebElement lnk_See_All_Tasks_And_Tools(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[2]/a"));
    	    Log.info("See All Tasks And Tools link element found"); 
    	    return element;
    	}
  	
    //END OF TASKS AND TOOLS METHODS	
    }
    
    public static class Notice_Board{
 
    	public static WebElement lnk_See_All_Tasks_And_Tools(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[2]/a"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_See_All_Tasks_And_Tools not found | Exception desc : "+e.getMessage());		
     		}
    	    return element;
    	}

    	public static WebElement lnk_Announcements(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[1]/a"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Announcements not found | Exception desc : "+e.getMessage());		
     		}
    	    return element;
    	}
    	
    	public static WebElement lnk_First_Announcement(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div/div/div[2]/a"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_First_Announcement not found | Exception desc : "+e.getMessage());		
     		}
    	    return element;
    	}  
    	
    	public static WebElement lnk_Add_A_Noticeboard_Item(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[1]/a"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Add_A_Noticeboard_Item not found | Exception desc : "+e.getMessage());		
     		}
    	    return element;
    	}

    	public static WebElement lnk_Show_All_Noticeboard_Items(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[3]/a"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Show_All_Noticeboard_Items not found | Exception desc : "+e.getMessage());		
     		}
    	    return element;
    	}
    	
    //END OF NOTICE BOARD METHODS
    }
    
    public static class Activity_Feed{

       	public static WebElement lbl_Activity_Feed(WebDriver driver){
	    	 
    		element = driver.findElement(By.linkText("Activity Feed"));
    	    Log.info("Activity Feed header element found"); 
    	    return element;
    	}
    	
       	public static WebElement lnk_Read_The_Guidelines(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/span[1]/a"));
    	    Log.info("Read The Guidelines link element found"); 
    	    return element;
    	}

       	public static WebElement lnk_Share_With(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/label/span/span/a"));
    	    Log.info("Share With link element found"); 
    	    return element;
    	}

       	public static WebElement txt_Activity_Details(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]/div[1]/div[3]/textarea"));
    	    Log.info("Activity Details textbox element found"); 
    	    return element;
    	}

       	public static WebElement btn_Post(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]/div[1]/span/button"));
    	    Log.info("Post button element found"); 
    	    return element;
    	}
       	
       	public static WebElement lnk_Following(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[1]/span/a[1]"));
    	    Log.info("Following link element found"); 
    	    return element;
    	}
       	
       	public static WebElement lnk_Everyone(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[1]/span/a[2]"));
    	    Log.info("Everyone link element found"); 
    	    return element;
    	}
       	
       	public static WebElement lnk_Mentions(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div/div[1]/span/a[3]"));
    	    Log.info("Mentions link element found"); 
    	    return element;
    	}
       	
    //END OF ACTIVITY FEED METHODS    	
    }

//END OF METHODS    
}
