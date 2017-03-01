package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 07/04/2016
* Function: Resources_Subsite_Page
* Purpose: This class contains all of the elements on the Resources Subsite page
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
 public class Objects_Resources_Subsite_Page {
 
    private static WebElement element = null;
 
    public static class Sidebar{

    	public static WebElement chk_Filter_Results(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/input"));
    	    Log.info("Filter Results checkbox element found"); 
    	    return element;
    	}
	
    //END OF SIDEBAR METHODS	
    }
    
    public static class Home{

    	public static WebElement lbl_HomePage_Header(WebDriver driver){
	    	 
    		element = driver.findElement(By.linkText("Home"));
    	    Log.info("HomePage header element found"); 
    	    return element;
    	}
    	
    	public static WebElement txt_Search_Input(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/input"));
    	    Log.info("Search textbox element found"); 
    	    return element;
    	}

    	public static WebElement btn_Search(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/a"));
    	    Log.info("Search button element found"); 
    	    return element;
    	}    	
       	
    //END OF PROCEDURES METHODS    	
    }

//END OF METHODS    
}
