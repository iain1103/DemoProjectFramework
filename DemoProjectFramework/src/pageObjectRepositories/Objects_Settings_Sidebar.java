package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 04/04/2016
* Function: Settings_Sidebar
* Purpose: This class contains all of the elements on the Settings sidebar
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
 public class Objects_Settings_Sidebar {
 
    private static WebElement element = null;
 
	public static WebElement lnk_Sidebar_Header(WebDriver driver){
   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[3]/a"));
	    Log.info("Sidebar Header link element found"); 
	    return element;
	}

	public static WebElement lnk_Businesses(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[4]/div[2]/ul/li[1]/a/span/span"));
	    Log.info("Businesses link element found"); 
	    return element;
	}

	public static WebElement lnk_Offices(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[4]/div[2]/ul/li[2]/a/span/span"));
	    Log.info("Offices link element found"); 
	    return element;
	}
	
	public static WebElement lnk_People_Online(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[4]/div[2]/ul/li[3]/a/span/span"));
	    Log.info("Offices link element found"); 
	    return element;
	}

	public static WebElement lnk_Search_Results(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[4]/div[2]/ul/li[4]/a/span/span"));
	    Log.info("Search Results link element found"); 
	    return element;
	}
	
	public static WebElement lnk_Test_News(WebDriver driver){
	   	 
		element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[4]/div[2]/ul/li[5]/a/span/span"));
	    Log.info("Test News link element found"); 
	    return element;
	}
	
//END OF METHODS    
}
