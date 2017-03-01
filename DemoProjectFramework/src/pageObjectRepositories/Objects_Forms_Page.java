package pageObjectRepositories;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 14/06/2016
* Function: Objects_Forms_Page
* Purpose: This class contains all of the elements on the Forms page
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
 public class Objects_Forms_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Forms_Page";
 
    public static class Sidebar{

      	public static WebElement chk_Filter_Results(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/input"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | chk_Filter_Results not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
      	
      	public static WebElement lbl_No_Refiners(WebDriver driver){
	    	 
     		try{
     			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[9]"));
     		}catch(Exception e){
     			Log.error(sRepositoryName + " | lbl_No_Refiners not found | Exception desc : "+e.getMessage());		
     		}
     	    return element;
     	}
	
    //END OF SIDEBAR METHODS	
    }
    
    public static class Forms{

    	public static WebElement lbl_Search_Results(WebDriver driver){
    		
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/h1"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Search_Results not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
     	public static String txt_Forms_Search(WebDriver driver){
	    	 
     		String sCheckedValue = Forms.txt_Search_Input(driver).getAttribute("value");
     		return sCheckedValue;
    	}
    	
    	public static WebElement txt_Search_Input(WebDriver driver){
    		
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/input"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | txt_Search_Input not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
   	
    	public static WebElement btn_Search(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/a"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Search not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}

    	public static WebElement lbl_No_Matches(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_No_Matches not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	} 	
       	
    //END OF FORMS METHODS    	
    }

//END OF METHODS    
}
