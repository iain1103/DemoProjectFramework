package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 28/04/2016
* Function: Objects_Noticeboard_Page
* Purpose: This class contains all of the elements on the Noticeboard Item window
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
 public class Objects_Noticeboard_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Noticeboard_Item";
 
	public static WebElement lbl_Header(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/h1"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Header not found | Exception desc : "+e.getMessage());		
		} 
	    return element;
	}
    
	public static WebElement chk_Filter_By_Location(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/input"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | chk_Filter_By_Location not found | Exception desc : "+e.getMessage());		
		} 
	    return element;
	}	  
	
	public static WebElement tbl_Noticeboard_Items(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div[2]"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | tbl_Noticeboard_Items not found | Exception desc : "+e.getMessage());		
		} 
	    return element;
	}	
	
    
    public static class New_Item {
    	
		public static WebElement txt_Title(WebDriver driver){
			   	 
			try{
				element = driver.findElement(By.id("ctl00_ctl47_g_68fc5ce9_401c_4f71_a174_932ac83629e1_ff11_ctl00_ctl00_TextField"));//.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[1]/div[3]/span[1]/input"));
			}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Title not found | Exception desc : "+e.getMessage());		
			} 
		    return element;
		}		
	
		public static WebElement wrn_Title_Cannot_Be_Blank(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[1]/div[3]/span[2]/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Title_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement txt_Body(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[2]/div[2]/span[1]/div/div[2]"));
			}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Body not found | Exception desc : "+e.getMessage());		
			} 
		    return element;
		}		
	
		public static WebElement wrn_Body_Cannot_Be_Blank(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[2]/div[2]/span[2]/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Body_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement lnk_Insert_Sharepoint_Image(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[3]/div[2]/div[2]/span/div/span/span[1]/div/a[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lnk_Insert_Sharepoint_Image not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement lnk_Insert_Local_Image(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[3]/div[2]/div[2]/span/div/span/span[1]/div/a[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lnk_Insert_Local_Image not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement cbx_Category(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[4]/div[3]/span[1]/select"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | cbx_Category not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement txt_End_Date(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[5]/div[3]/span[1]/table/tbody/tr/td[1]/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_End_Date not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_End_Date_Cannot_Be_Blank(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[5]/div[3]/span[2]/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_End_Date_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_End_Date_Not_Valid(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[5]/div[3]/span[3]/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_End_Date_Not_Valid not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement lnk_Add_Attachment(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[6]/div[2]/table/tbody/tr/td[2]/a[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | lnk_Add_Attachment not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement txt_Location(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[7]/div[3]/span[1]/span/div/div[1]/div/div"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Location not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_Location_Cannot_Be_Blank(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[2]/td/div[7]/div[3]/span[2]/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Location_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement btn_Save(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_Save not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement btn_Cancel(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/div[1]/span[1]/table/tbody/tr[3]/td/table/tbody/tr/td[4]/table/tbody/tr/td/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_Cancel not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
	
    }
		
//END OF METHODS    
}
