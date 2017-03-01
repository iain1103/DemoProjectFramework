/*
 * LIST OF METHODS CONTAINED IN THIS CLASS
 * 
 * setExcelFile
 * getCellData
 * setCellData
 * getRowContains
 * 
 */

//START OF METHODS 

package utility;
 
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelUtils {
 
	private static XSSFSheet ExcelWSheet;
 
    private static XSSFWorkbook ExcelWBook;
 
    private static XSSFCell Cell;
 
    private static XSSFRow Row;
 
    /* **************************************************************************************************
    * Function: setExcelFile
    * Author: Rory Cruickshank
    * Date: 17/03/2016
    * Purpose: This method is to set the File path and to open the Excel file
    * Arguments: Path
    * 			SheetName
    * Returns: 
    *****************************************************************************************************
    * Change Log:
    * 
    * Date:
    * Author: 
    * Details:
    *
    ****************************************************************************************************/
    public static void setExcelFile(String Path,String SheetName) throws Exception {
 
    	try {
    		// Open the Excel file
 			FileInputStream ExcelFile = new FileInputStream(Path);
 			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
 
 			ExcelWSheet = ExcelWBook.getSheet(SheetName);
 		} catch (Exception e){
			throw (e);
		}
	}
 
    /* **************************************************************************************************
    * Function: getCellData
    * Author: Rory Cruickshank
    * Date: 17/03/2016
    * Purpose: This method is to read the test data from the Excel cell
    * Arguments: RowNum
    * 			ColNum
    * Returns: 
    *****************************************************************************************************
    * Change Log:
    * 
    * Date:
    * Author: 
    * Details:
    *
    ****************************************************************************************************/
    public static String getCellData(int RowNum, int ColNum) throws Exception{
 
    	try{
   			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
   			String CellData = Cell.getStringCellValue();
   			return CellData;
    	}catch (Exception e){
    		return"";
    	}
    }

    /* **************************************************************************************************
    * Function: setCellData
    * Author: Rory Cruickshank
    * Date: 17/03/2016
    * Purpose: This method is to write in the Excel cell
    * Arguments: RowNum
    * 			ColNum
    * Returns: 
    *****************************************************************************************************
    * Change Log:
    * 
    * Date:
    * Author: 
    * Details:
    *
    ****************************************************************************************************/
    public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

    	try{
    		Row  = ExcelWSheet.getRow(RowNum);
    		Cell = Row.getCell(ColNum);//, org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);
    		//if (Cell == null) {
    			//Cell = Row.createCell(ColNum);
    			//Cell.setCellValue(Result);
    		//} else {
    			Cell.setCellValue(Result);
    		//}
    		// Constant variables Test Data path and Test Data file name
    		FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
    		ExcelWBook.write(fileOut);
    		fileOut.flush();
    		fileOut.close();
    	}catch(Exception e){
    		throw (e);
    	}
    }
    
    /* **************************************************************************************************
    * Function: getIntCellData
    * Author: Rory Cruickshank
    * Date: 04/04/2016
    * Purpose: This method is to read the test data from the Excel cell
    * Arguments: RowNum
    * 			ColNum
    * Returns: 
    *****************************************************************************************************
    * Change Log:
    * 
    * Date:
    * Author: 
    * Details:
    *
    ****************************************************************************************************/
    public static Integer getIntCellData(int RowNum, int ColNum) throws Exception{
   	
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		if (Cell == null){
			Log.warn("Cell value at row " + RowNum + ", column " + ColNum + " is null. Setting to 0");
			Integer CellData = 0;
			return CellData;
		}else{
	    	try{
	   			Integer CellData = (int) Cell.getNumericCellValue();
	   			return CellData;
	    	}catch (Exception e){
	    	    Log.error("Class ExcelUtil | Method getIntCellData | Exception desc : " + e.getMessage());
	            throw(e);
	    	}
		}
    }

	/* **************************************************************************************************
	* Function: getRowContains
	* Author: Rory Cruickshank
	* Date: 17/03/2016
	* Purpose: Selects the browser according to input
	* Arguments: iTestCaseRow
	* 
	* Returns: driver
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/
    public static int getRowContains(String sTestCaseName, int colNum) throws Exception{
    	
    	//Declare our variables
    	int iRow;
        Boolean bFound = false;
        
    	try {
    	    int rowCount = ExcelWSheet.getLastRowNum();
            for ( iRow=0; iRow<=rowCount; iRow++){
    	        if (getCellData(iRow,colNum).equalsIgnoreCase(sTestCaseName)){
    	        	//Found it, so set our Boolean and exit
    	        	bFound = true;
    	            break;
    	           }
    	        }
            //Return an error if we didn't find the test case name
            if (bFound == false){
            	Log.error("Class ExcelUtil | Method getRowContains | Test Case Name \"" + sTestCaseName + "\" not found in Excel sheet");
            }
            return iRow;
        }catch (Exception e){
        	//Catch any unforeseen errors
    	    Log.error("Class ExcelUtil | Method getRowContains | Exception desc : " + e.getMessage());
            throw(e);
        }
    }
    
	/* **************************************************************************************************
	* Function: getColContains
	* Author: Rory Cruickshank
	* Date: 15/06/2016
	* Purpose: Selects the column according to the column header value
	* Arguments: sColName
	* 			iRowNum
	* Returns: driver
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/
    public static int getColContains(String sColName, int iRowNum) throws Exception{
    	
    	//Declare our variables
    	int iCount;
    	boolean bColFound = false;
    	
        try {
    	    int iColCount = ExcelWSheet.getRow(iRowNum).getLastCellNum();
            for ( iCount=0 ; iCount < iColCount; iCount++){
    	        if (getCellData(iRowNum, iCount).equalsIgnoreCase(sColName)){
    	        	bColFound = true;
    	            break;
    	           }
    	        }
            //A little check to see if we've gone through the set without finding the column we're after
            if (bColFound == false){
            	Log.warn("Class ExcelUtil | Method getColContains | Column \"" + sColName + "\" not found in datasheet");
            }
            return iCount;
        }catch (Exception e){
    	    Log.error("Class ExcelUtil | Method getColContains | Exception desc : " + e.getMessage());
            throw(e);
        }
    }

//END OF METHODS 
}