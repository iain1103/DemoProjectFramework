package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 06/04/2016
* Function: Contents_And_Structure_Reports_Page
* Purpose: This class contains all of the elements on the Contents And Structure Reports page
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
 public class Objects_Contents_And_Structure_Reports_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Contents_And_Structure_Reports_Page";
 
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
		
		public static WebElement txt_Resource_ID_1(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[2]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Resource_ID_1 not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}	

		public static WebElement txt_Resource_ID_2(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[3]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Resource_ID_2 not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}	

		public static WebElement txt_CAML_List_Type(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[4]/td[2]/span[1]/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_CAML_List_Type not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}
		
		public static WebElement txt_CAML_Query(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[5]/td[2]/span[1]/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_CAML_Query not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}

		public static WebElement wrn_CAML_Query_Cannot_Be_Blank(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[5]/td[2]/span/span/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_CAML_Query_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}  
		    return element;
		}
		
		public static WebElement txt_Target_Audience(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[6]/td[2]/span/span/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Target_Audience not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}

		public static WebElement txt_Report_Description(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[7]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Report_Description not found | Exception desc : "+e.getMessage());		
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
		
	//END OF METHODS	
	}

	
//END OF METHODS    
}
