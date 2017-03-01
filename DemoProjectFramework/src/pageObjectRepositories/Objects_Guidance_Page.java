package pageObjectRepositories;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 07/04/2016
* Function: Guidance_Page
* Purpose: This class contains all of the elements on the Guidance page
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
 public class Objects_Guidance_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Guidance_Page";
 
    public static class Sidebar{

      	public static WebElement chk_Filter_Results(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/input"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | chk_Filter_Results not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}

    	public static WebElement btn_Publishing_Department_Expander(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[3]/div/a/div[1]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Publishing_Department_Expander not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement lnk_Publishing_Department_Corporate_Comms(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div[1]/a/div"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Publishing_Department_Corporate_Comms not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	    	
    	public static WebElement btn_Content_Category_Expander(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[4]/div/a/div[1]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Content_Category_Expander not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement lnk_Content_Category_Standard_Page(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div/a/div"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Content_Category_Standard_Page not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement btn_Tags_Expander(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[5]/div/a/div[1]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Tags_Expander not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement lnk_Tags_Guidance(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[5]/div/div[2]/div/div/a/div"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Tags_Guidance not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	   	
    	public static WebElement btn_Document_Type_Expander(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[6]/div/a/div[1]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Document_Type_Expander not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}

    	public static WebElement lnk_Document_Type_Web_Page(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[6]/div/div[2]/div/div/a/div"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Document_Type_Web_Page not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement btn_Owner_Expander(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[7]/div/a/div[1]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Owner_Expander not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	public static WebElement lnk_Owner_Paul_McGonigle(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[7]/div/div[2]/div/div/a/div"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Owner_Paul_McGonigle not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement btn_Last_Modified_Expander(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[8]/div/a/div[1]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Last_Modified_Expander not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement lnk_Last_Modified_Histogram(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[8]/div/div/span/div[1]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | btn_Last_Modified_Expander not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}

    	public static WebElement lnk_Last_Modified_Slider(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[8]/div/div/span/div[3]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Last_Modified_Slider not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
	
    //END OF SIDEBAR METHODS	
    }
    
    public static class Guidance{

   	public static WebElement lbl_Search_Results(WebDriver driver){
    		
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/h1"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Search_Results not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
     	public static String txt_Guidance_Search(WebDriver driver){
	    	 
     		String sCheckedValue = Guidance.txt_Search_Input(driver).getAttribute("value");
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

    	public static WebElement lbl_Results_Count(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[1]/div"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Results_Count not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement lnk_Investment_News(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.linkText("Investment News"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Investment_News not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement lbl_Summary_Abstract(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Summary_Abstract not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement lbl_Details(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lbl_Details not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}
    	
    	public static WebElement lnk_Guidance_Link(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[3]/a"));
    		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_Guidance_Link not found | Exception desc : "+e.getMessage());		
    		}
    	    return element;
    	}    	
       	
    //END OF GUIDANCE METHODS    	
    }

//END OF METHODS    
}
