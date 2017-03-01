package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 31/03/2016
* Function: Find_A_Colleague_Page
* Purpose: This class contains all of the elements on the News page
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
 public class Objects_Offices_Page {
 
    private static WebElement element = null;
 
    public static class Sidebar{

    	public static WebElement btn_Department_Expander(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div/a/div[2]"));
    	    Log.info("Department Expander arrow button element found"); 
    	    return element;
    	}

    	public static WebElement btn_Skills_Expander(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div/div/div[2]/div/div[4]/div/a/div[2]"));
    	    Log.info("Skills Expander arrow button element found"); 
    	    return element;
    	}
    	
    	public static WebElement btn_Past_Projects_Expander(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div/div/div[2]/div/div[5]/div/a/div[2]"));
    	    Log.info("Past Projects Expander arrow button element found"); 
    	    return element;
    	}
   	
    //END OF SIDEBAR METHODS	
    }
    
    public static class Edinburgh{
    	
    	public static WebElement lbl_Offices_Edinburgh(WebDriver driver){
	    	 
    		element = driver.findElement(By.linkText("Edinburgh"));
    	    Log.info("Offices - Edinburgh header element found"); 
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
    	
       	
    //END OF NEWS ITEMS METHODS    	
    }

//END OF METHODS    
}
