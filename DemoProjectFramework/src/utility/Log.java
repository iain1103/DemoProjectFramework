/*
 * LIST OF METHODS CONTAINED IN THIS CLASS
 * 
 * startTestCase
 * endTestCase
 * info
 * warn
 * error
 * fatal
 * debug
 * 
 */

//START OF METHODS 
package utility;

	import org.apache.log4j.Logger;
 
 public class Log {
 
	 // Initialize Log4j logs
 	 private static Logger Log = Logger.getLogger(Log.class.getName());
 
 	 /* *************************************************************************************************
 	 * Function: startTestCase
 	 * Author: Rory Cruickshank
 	 * Date: 18/03/2016
 	 * Purpose: This method is to print log for the beginning of the test case
 	 * Arguments: sTestCaseName
 	 * 			
 	 * Returns: 
 	 ****************************************************************************************************
 	 * Change Log:
 	 * 
 	 * Date:
 	 * Author: 
 	 * Details:
 	 *
 	 ***************************************************************************************************/
 	 public static void startTestCase(String sTestCaseName){
 
 		 Log.info("****************************************************************************************");
 		 Log.info("****************************************************************************************");
 		 Log.info("$$$$$$$$$$$       "+sTestCaseName+ "       $$$$$$$$$$$");
 		 Log.info("****************************************************************************************");
 		 Log.info("****************************************************************************************");
 	 }
 
 	 /* *************************************************************************************************
 	 * Function: endTestCase
 	 * Author: Rory Cruickshank
 	 * Date: 18/03/2016
 	 * Purpose: This method is to print log for the end of the test case
 	 * Arguments: sTestCaseName
 	 * 			
 	 * Returns: 
 	 ****************************************************************************************************
 	 * Change Log:
 	 * 
 	 * Date:
 	 * Author: 
 	 * Details:
 	 *
 	 ***************************************************************************************************/
 	 public static void endTestCase(String sTestCaseName){
 
 		 Log.info("XXXXXXXXXXXXXXXXXXXX                "+"-E---N---D-"+"                XXXXXXXXXXXXXXXXXXX");
 		 Log.info("XXXXXXXXXXXXXXXXXXXX    "+sTestCaseName+"    XXXXXXXXXXXXXXXXXXX");
 		 Log.info("X");
 		 Log.info("X");
 		 Log.info("X");
 	 }
 
 	 /* *************************************************************************************************
 	 * Function: info
 	 * Author: Rory Cruickshank
 	 * Date: 18/03/2016
 	 * Purpose: This method is to return information to the Log
 	 * Arguments: message
 	 * 			
 	 * Returns: 
 	 ****************************************************************************************************
 	 * Change Log:
 	 * 
 	 * Date:
 	 * Author: 
 	 * Details:
 	 *
 	 ***************************************************************************************************/ 
 	 public static void info(String message) {
 		 Log.info(message);
 	 }
 
 	 /* *************************************************************************************************
 	 * Author: Rory Cruickshank
 	 * Date: 18/03/2016
 	 * Function: warn
 	 * Purpose: This method is to return warning text to the Log
 	 * Arguments: message
 	 * 			
 	 * Returns: 
 	 ****************************************************************************************************
 	 * Change Log:
 	 * 
 	 * Date:
 	 * Author: 
 	 * Details:
 	 *
 	 ***************************************************************************************************/
 	 public static void warn(String message) {
 		 Log.warn(message);
 	 }
 
 	 /* *******************************************************************
 	 * Function: error
 	 * Author: Rory Cruickshank
 	 * Date: 18/03/2016
 	 * Purpose: This method is to return error text to the Log
 	 * Arguments: message
 	 * 			
 	 * Returns: 
 	 ****************************************************************************************************
 	 * Change Log:
 	 * 
 	 * Date:
 	 * Author: 
 	 * Details:
 	 *
 	 ***************************************************************************************************/
 	 public static void error(String message) {
 		 Log.error(message);
 	 }
 
 	 /* *************************************************************************************************
  	 * Function: fatal
 	 * Author: Rory Cruickshank
 	 * Date: 18/03/2016
 	 * Purpose: This method is to return fatal error text to the Log
 	 * Arguments: message
 	 * 			
 	 * Returns: 
 	 ****************************************************************************************************
 	 * Change Log:
 	 * 
 	 * Date:
 	 * Author: 
 	 * Details:
 	 *
 	 ***************************************************************************************************/
 	 public static void fatal(String message) {
 		 Log.fatal(message);
 	 }
 
 	 /* *************************************************************************************************
 	 * Function: debug
 	 * Author: Rory Cruickshank
 	 * Date: 18/03/2016
 	 * Purpose: This method is to return debug text to the Log
 	 * Arguments: message
 	 * 			
 	 * Returns: 
 	 ****************************************************************************************************
 	 * Change Log:
 	 * 
 	 * Date:
 	 * Author: 
 	 * Details:
 	 *
 	 ***************************************************************************************************/
 	 public static void debug(String message) {
 		 Log.debug(message);
 	 }

//END OF METHODS
}
