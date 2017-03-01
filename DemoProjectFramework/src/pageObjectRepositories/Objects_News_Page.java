package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 31/03/2016
* Function: News_Page
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
 public class Objects_News_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_News_Page";
 
    public static class Sidebar{

    	public static WebElement chk_Filter_Results(WebDriver driver){
    	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/input"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_New_Item not found | Exception desc : "+e.getMessage());		
     		}
    	    return element;
    	}

    	public static WebElement btn_News_Category_Expander(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div/a/div"));
     		}catch(Exception e){
    			Log.error(sRepositoryName + " | lnk_New_Item not found | Exception desc : "+e.getMessage());		
     		} 
    	    return element;
    	}

    	public static WebElement btn_Modification_Date_Expander(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[4]/div/a/div[2]"));
    	    Log.info("Modification Date Expander arrow button element found"); 
    	    return element;
    	}
    	
    	public static WebElement sld_Modification_Date(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[4]/div/div/span/div[3]/div/div[1]"));
    	    Log.info("Modification Date slider element found"); 
    	    return element;
    	}

    	public static WebElement btn_Publishing_Department_Expander(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[5]/div/a/div[2]"));
    	    Log.info("Publishing Department Expander arrow button element found"); 
    	    return element;
    	}

    	public static WebElement btn_Tags(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[6]/div/a/div[2]"));
    	    Log.info("Tags Expander arrow button element found"); 
    	    return element;
    	}

    	public static WebElement btn_Owner(WebDriver driver){
	    	 
    		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[7]/div/a/div[2]"));
    	    Log.info("Owner arrow button element found"); 
    	    return element;
    	}
    	
    //END OF SIDEBAR METHODS	
    }
    
    public static class News_Items{
 
	    public static WebElement lbl_Header(WebDriver driver){	
    		
	    	try{
	    		element = driver.findElement(By.linkText("News"));
	    	}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Header not found | Exception desc : "+e.getMessage());		
			}
    		return element;
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
    	
    	public static WebElement lnk_Full_Year_Results(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.linkText("Full year Results 2015"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lnk_Full_Year_Results not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}
    	
       	
    //END OF NEWS ITEMS METHODS    	
    }

//END OF METHODS    
}
