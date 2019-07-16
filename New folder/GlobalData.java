package com.axa.nba.driver;

/**
* <dl>
* <dt><em>Script Name:</dt></em>     <dd>GlobalData</dd>
* <dt><em>Description:</dt></em>     <dd>Holds common global values of the suite</dd>
* <dt><em>Author     :</dt></em>     <dd>Capgemini</dd>
* <dt><em>Generated on:</dt></em>     <dd>29-Jun-2016</dd>               
* <dt><em>History</dt></em>
* <pre>Modified By                      Modified Date                   Comments</pre>
*           </dl>
*/

public interface GlobalData {
	String DRIVER_NAME = "sun.jdbc.odbc.JdbcOdbcDriver";
    String CONN_STRING = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DBQ=@FILE_NAME;DriverID=22;READONLY=true";
    String UPDATE_CONN_STRING = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DBQ=@FILE_NAME;DriverID=22;READONLY=false";
    
    String DATE_FORMAT = "MM/dd/yyyy";
    String TIME_FORMAT = "MM/dd/yyyy HH:mm:ss";
    
    String AXA_LOGO = "axa-logo.png";
    String CAPG_LOGO = "capgemini-logo.png";
    
    //Folder Names
    String TEST_DATA_FOLDER = "/TestData/";
    String RESULT_FOLDER = "/Results/";
    String TEMPLATES_FOLDER = "/Templates/";
    String ICONS_FOLDER = "/Icons/";
    String SCREENSHOT_FOLDER = "Screenshots/";
    String SUMMARY_RESULT_FILE = "SummaryResult.csv"; 
    
    //Summary list file sheet names
    String SCENARIO_LIST = "SCENARIO_LIST";
    String ENV_DATA = "ENV_DATA";
    
    //Summary list file columns
    String TEST_CASE_ID = "TEST_CASE_ID";
    String PRIMARY_TEST_ID = "PRIMARY_TEST_ID";
    String TEST_DESCRIPTION = "TEST_DESCRIPTION";
    String DEFAULT_USER_ID = "DEFAULT_USER_ID";
    String DEFAULT_USER_PASSWORD = "DEFAULT_USER_PASSWORD";
    String EXECUTE_TEST = "EXECUTE_TEST";
    String TEST_DATA_FILE = "TEST_DATA_FILE";
    String LAST_NAME = "LAST_NAME";
    String FIRST_NAME = "FIRST_NAME";
    String POLICY_NO = "POLICY_NO";
    String SSN_NO = "SSN_NO";
    String ITERATIVE_TEST_ID = "ITERATIVE_TEST_ID";
    
    //Summary file - ENV_DATA sheet columns
    String SUITE_TYPE = "SUITE_TYPE";
    String APPLICATION_REGION = "APPLICATION_REGION";
    String LASTNAME_PREFIX = "LASTNAME_PREFIX";
    String BROWSER_TYPE = "BROWSER_TYPE";
    
    //Test data default sheet name
    String SCENARIO_FLOW = "SCENARIO_FLOW";
    
    //Test data file columns
    String TEST_SCREEN_NAME = "TEST_SCREEN_NAME";
    String TEST_DATA_ID = "TEST_DATA_ID";
    
    //Constant data
    String NA = "NA";
    String STRING_SEPARATOR = "#";
    String VALUE_SEPARATOR = "|";
    
    //Data Keywords
    String TODAY = "TODAY";
    String TODAY_ONLY = "TODAY_ONLY";
    String DOB = "DOB";
	String COUNT = "COUNT";
    
}
