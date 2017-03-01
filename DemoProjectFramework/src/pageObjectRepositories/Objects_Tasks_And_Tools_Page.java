package pageObjectRepositories;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 07/04/2016
* Function: Tasks_And_Tools_Page
* Purpose: This class contains all of the elements on the Tasks AndTools page
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
 public class Objects_Tasks_And_Tools_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Tasks_And_Tools_Page";
    
	public static WebElement lnk_New_Item(WebDriver driver){
   	
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div/div/table/tbody/tr/td/table[1]/tbody/tr/td/a[1]/span[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lnk_New_Item not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}

	public static WebElement btn_Edit(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div/div/table/tbody/tr/td/table[1]/tbody/tr/td/a[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Edit not found | Exception desc : "+e.getMessage());		
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

	public static WebElement tbl_All_Items(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/div/div/div/table"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | tbl_All_Items not found | Exception desc : "+e.getMessage());		
 		}
	    return element;
	}
	
	public static class New_Item{
		
		public static WebElement txt_Title(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[1]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Title not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}		

		public static WebElement wrn_Title_Cannot_Be_Blank(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[1]/td[2]/span/span/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Title_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement txt_URL(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[2]/td[2]/span/input[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_URL not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}	

		public static WebElement txt_URL_Description(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[2]/td[2]/span/input[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_URL_Description not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}	

		public static WebElement txt_Task_Description(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[3]/td[2]/span/div/div[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Task_Description not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement wrn_Task_Description_Cannot_Be_Blank(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[3]/td[2]/span/span[2]/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Task_Description_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement txt_Background_Colour(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[4]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Background_Colour not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement txt_Background_Image_URL(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[5]/td[2]/span/input[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Background_Image_URL not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement txt_Background_Image_Description(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[5]/td[2]/span/input[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Background_Image_Description not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}

		public static WebElement chk_Is_Active(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[6]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | chk_Is_Active not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement txt_Business(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[7]/td[2]/div/div[1]/div/div"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Business not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_Business_Cannot_Be_Blank(WebDriver driver){

			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[7]/td[2]/span/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Business_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
		
		public static WebElement wrn_Business_Not_Valid(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[7]/td[2]/div/div[1]/div/div/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Business_Not_Valid not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
			
		public static WebElement txt_Location(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[8]/td[2]/div/div[1]/div/div"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Location not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_Location_Cannot_Be_Blank(WebDriver driver){
				   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[8]/td[2]/span/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Location_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_Location_Not_Valid(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[8]/td[2]/div/div[1]/div/div/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Location_Not_Valid not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
	
		public static WebElement chk_Is_Highlight(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[9]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | chk_Is_Highlight not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}	
		
		public static WebElement txt_Highlight_Title(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[10]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Highlight_Title not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement txt_Task_Order(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[11]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Task_Order not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_Task_Order_Not_Valid(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[11]/td[2]/span/span/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Task_Order_Not_Valid not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement btn_Save(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[2]/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/input"));				
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_Save not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement btn_Cancel(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[2]/tbody/tr/td/table/tbody/tr/td[4]/table/tbody/tr/td/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_Cancel not found | Exception desc : "+e.getMessage());		
	 		}
			return element;
		}
		
	//END OF NEW ITEM METHODS			
	}
	
	public static class optionsRibbon{
		
		public static WebElement btn_Edit_Item(WebDriver driver){
		   	try{ 
				element = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/div/div/div/div/div[2]/ul/li[1]/span[1]/span[1]/span/span[1]/span/a/span[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_Edit_Item not found | Exception desc : "+e.getMessage());		
	 		}
			return element;
		}
		
		public static WebElement btn_Save_Item(WebDriver driver){
		
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/div/div/div/div/div[2]/ul/li[1]/span[1]/span[1]/span/span/span/a[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_Save_Item not found | Exception desc : "+e.getMessage());		
	 		}
			return element;
		}		
	}
	
	public static class menuOptions{
		
		public static WebElement lnk_Edit_Item(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/div/ul/li[2]/a/div[2]/span[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | btn_Save_Item not found | Exception desc : "+e.getMessage());		
	 		}
			return element;
		}
		
	//END OF MENU OPTIONS METHODS			
	}

	
//END OF METHODS    
}
