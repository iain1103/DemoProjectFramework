package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 04/04/2016
* Function: Breaking_News_Page
* Purpose: This class contains all of the elements on the Breaking News page
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
 public class Objects_New_Subsite_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Breaking_News_Page";
 
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

		public static WebElement chk_Is_Active(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[3]/td[2]/span/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | chk_Is_Active not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement txt_End_Date(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[4]/td[2]/span/table/tbody/tr/td[1]/input"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_End_Date not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement wrn_End_Date_Not_Valid(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[4]/td[2]/span/span/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_End_Date_Not_Valid not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement cbx_End_Time_Hours(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[4]/td[2]/span/table/tbody/tr/td[4]/select[1]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | cbx_End_Time_Hours not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement cbx_End_Time_Minutes(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[4]/td[2]/span/table/tbody/tr/td[4]/select[2]"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | cbx_End_Time_Minutes not found | Exception desc : "+e.getMessage());		
	 		} 
		    return element;
		}

		public static WebElement txt_Audience_Area(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.id("AudienceArea_$containereditableRegion"));//.xpath("//html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[5]/td[2]/div/div[1]/div"/div"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Audience_Area not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement wrn_Audience_Area_Cannot_Be_Blank(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[5]/td[2]/span/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Audience_Area_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_Audience_Area_Not_Valid(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[5]/td[2]/div/div[1]/div/div/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Audience_Area_Not_Valid not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement txt_Location(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[6]/td[2]/div/div[1]/div/div"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | txt_Location not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement wrn_Location_Cannot_Be_Blank(WebDriver driver){
				   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[6]/td[2]/span/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Location_Cannot_Be_Blank not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}

		public static WebElement wrn_Location_Not_Valid(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[1]/tbody/tr[6]/td[2]/div/div[1]/div/div/span"));
	 		}catch(Exception e){
				Log.error(sRepositoryName + " | wrn_Location_Not_Valid not found | Exception desc : "+e.getMessage());		
	 		}
		    return element;
		}
		
		public static WebElement btn_Save(WebDriver driver){
		   	 
			try{
				element = driver.findElement(By.xpath("//input[@id='ctl00_ctl47_g_f566e5b4_3333_4722_95fa_c7dbe1bd6617_ctl00_toolBarTbl_RightRptControls_ctl00_ctl00_diidIOSaveItem']"));///html/body/form/div[4]/div/div[1]/div/div[2]/div[2]/div[2]/table/tbody/tr/td/div/div/div/div/table/tbody/tr/td[1]/span/table[2]/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/input"));
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
