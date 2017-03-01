package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 04/04/2016
* Function: Site_Contents_Page
* Purpose: This class contains all of the elements on the Site Contents page
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
 public class Objects_Site_Contents_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Site_Contents_Page";
 
	public static WebElement lbl_Header(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/span/h2/span"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Header not found | Exception desc : "+e.getMessage());		
		}
		return element;
	}

	public static WebElement lnk_Add_An_App(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.linkText(" add an app "));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Add_An_App not found | Exception desc : "+e.getMessage());		
		}
		return element;
	}

	public static WebElement lnk_Breaking_News(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("//*[@id=\"viewlist64405b2a-2346-4f31-8ad6-08b1350cf961\"]"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Breaking_News not found | Exception desc : "+e.getMessage());		
		}
		return element;
	}

	public static WebElement lnk_Contents_And_Structure_Reports(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/table/tbody/tr[2]/td/div/div[3]/div[2]/div[1]/div/a"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Contents_And_Structure_Reports not found | Exception desc : "+e.getMessage());		
		}
		return element;
	}
	
	public static WebElement lnk_Documents(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/table/tbody/tr[2]/td/div/div[4]/div[2]/div[1]/div/a"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Documents not found | Exception desc : "+e.getMessage());		
		}
		return element;
	}

	public static WebElement lnk_Tasks_And_Tools(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("//*[@id=\"viewlista66f4241-6b8e-4a20-8abe-1161c0e98260\"]"));//html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/table/tbody/tr[2]/td/div/div[19]/div[2]/div[1]/div/a"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_Tasks_And_Tools not found | Exception desc : "+e.getMessage());		
		}
		return element;
	}
	
	public static WebElement lnk_New_Subsite(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("createnewsite"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_New_Subsite not found | Exception desc : "+e.getMessage());		
		}
		return element;
	}
	
//END OF METHODS    
}
