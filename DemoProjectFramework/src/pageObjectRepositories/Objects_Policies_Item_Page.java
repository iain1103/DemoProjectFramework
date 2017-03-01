package pageObjectRepositories;
 
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import utility.Log;
 
/* *******************************************************************
* Author: Rory Cruickshank
* Date: 10/06/2016
* Function: Objects_Policies_Item_Page
* Purpose: This class contains all of the elements on the Policies Item page
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
 public class Objects_Policies_Item_Page {
 
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Policies_Item_Page";
 
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
    
    public static class Policies_Item{
 
	    public static WebElement lbl_Header(WebDriver driver){	
    		
	    	try{
	    		element = driver.findElement(By.linkText("UK Maternity Policy"));
	    	}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Header not found | Exception desc : "+e.getMessage());		
			}
    		return element;
	    }
    	
    	public static WebElement lbl_Article_Information(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[3]/h2"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Article_Information not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement lbl_Owner(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.linkText("James Mackerness"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Owner not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}
    	
    	public static WebElement lbl_Created(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[3]/span[3]"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Created not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement lbl_Updated(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[3]/span[4]"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Updated not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement lbl_Tags_Header(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[3]/h3"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Tags_Header not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}
    	public static WebElement lbl_Date_Header(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/h2"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Date_Header not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement lbl_First_Paragraph(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[2]/p[1]"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_First_Paragraph not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement lbl_Page_Rating(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/div[1]/h2"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Page_Rating not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement lbl_Comments_Header(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]/h2"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_Comments_Header not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement txt_Comments_Input(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]/div/div[1]/div/span/div[1]/div[1]/table/tbody/tr[1]/td/div"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | txt_Comments_Input not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement btn_Comments_Post(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]/div/div[1]/div/span/div[1]/div[1]/table/tbody/tr[3]/td/div/input"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | btn_Comments_Post not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement img_User_Image(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.xpath("/html/body/form/div[4]/div/div/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]/div/div[1]/div/span/div[1]/div[5]/div[1]/div/table/tbody/tr[1]/td[1]/img"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | img_User_Image not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}
    	
    	public static WebElement lnk_User_Name(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_socomName_0"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lnk_User_Name not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement lbl_Comment_Date(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_socomTime_0"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | txt_Comment_Date not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement lbl_User_Comment(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_socomComment_0"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | lbl_User_Comment not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement btn_Edit_Comment(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_socomEditBtn0"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | btn_Edit_Comment not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}
    	
    	public static WebElement txt_Edit_Comment(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_editCommentField"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | txt_Edit_Comment not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}

    	public static WebElement btn_Post_Edited_Comment(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_EditBtn"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | btn_Post_Edited_Comment not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}
    	
    	public static WebElement btn_Delete_Comment(WebDriver driver){
	    	 
    		try{
    			element = driver.findElement(By.id("ctl00_PlaceHolderMain_ctl04_g_5a237f22_6ed2_472d_9c2f_af99ab2e2ae7_ctl00_socomDelBtn0"));
    		}catch(Exception e){
	    		Log.error(sRepositoryName + " | btn_Delete_Comment not found | Exception desc : "+e.getMessage());		
			}
    	    return element;
    	}
    	
    //END OF POLICIES ITEM METHODS    	
    }

//END OF METHODS    
}
