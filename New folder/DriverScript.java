package com.axa.nba.driver;

import java.util.ArrayList;
import java.util.Enumeration;
import com.axa.generic.common.DateFormats;
import com.axa.generic.common.OrderedHashtable;
import com.axa.generic.reporter.ReportGenerator;
import com.axa.nba.business.AppEntry;
import com.codoid.products.fillo.*;

/**
* <dl>
* <dt><em>Script Name:</dt></em><dd>DriverScript</dd>
* <dt><em>Description:</dt></em><dd>Driver to perform execution</dd>
* <dt><em>Author     :</dt></em><dd>Capgemini</dd>
* <dt><em>Generated on:</dt></em><dd>24-Jan-2017</dd>               
* <dt><em>History</dt></em>
* <pre>Modified By                      Modified Date                   Comments</pre>
*</dl>
*/

public class DriverScript {
	public static EnvData gobjEnvData;
	public static SummaryList gobjCurrentTest;
	
	private static String SCENARIO_LIST_FILE = "";
	
	/**
	 * Read the Scenario list file data.
	 *
	 * @param strScenarioFile   the session id.
	 */
	public void readScenarioList(String strScenarioFile) {
		OrderedHashtable objHashSummaryList = null;
		Connection objConn = null; 
		Recordset objRS = null;
		boolean blnFlag = false;
		int intCounter = 1;
		Fillo objFillo = null;
		
		try {
			
			SCENARIO_LIST_FILE = strScenarioFile;
			String strQuery = "SELECT * FROM " + GlobalData.SCENARIO_LIST + " WHERE " + GlobalData.EXECUTE_TEST + "='Y'";
			
			objFillo = new Fillo();
            objConn = objFillo.getConnection(SCENARIO_LIST_FILE);
            //Statement objStatement = objConn.createStatement();
            objRS = objConn.executeQuery(strQuery);
            if(objRS!=null) {
            	objHashSummaryList = new OrderedHashtable();
            	while(objRS.next()) {
            		SummaryList objSummaryList = new SummaryList();
            		
            		objSummaryList.setTestCaseId(objRS.getField(GlobalData.TEST_CASE_ID));
            		objSummaryList.setMasterScriptID(objRS.getField(GlobalData.PRIMARY_TEST_ID));
            		//objSummaryList.setTestDescription(objRS.getField(GlobalData.TEST_DESCRIPTION));
            		objSummaryList.setUserID(objRS.getField(GlobalData.DEFAULT_USER_ID));
            		objSummaryList.setUserPassword(objRS.getField(GlobalData.DEFAULT_USER_PASSWORD));
            		objSummaryList.setTestDataFile(objRS.getField(GlobalData.TEST_DATA_FILE));
            		objSummaryList.setLastName(objRS.getField(GlobalData.LAST_NAME));
            		objSummaryList.setFirstName(objRS.getField(GlobalData.FIRST_NAME));
            		objSummaryList.setPolicyNo(objRS.getField(GlobalData.POLICY_NO));
            		objSummaryList.setSSNNo(objRS.getField(GlobalData.SSN_NO));
            		objSummaryList.setIterativeTestID(objRS.getField(GlobalData.ITERATIVE_TEST_ID));
            		objSummaryList.setCount(objRS.getField(GlobalData.COUNT));
            		/*objSummaryList.setTestStartTime("");
            		objSummaryList.setTestEndTime("");
            		objSummaryList.setTestResult("");
            		objSummaryList.setTestResultFile("");*/
            		
            		
            		objHashSummaryList.put("TEST" + intCounter, objSummaryList);
            		objSummaryList = null;
            		intCounter++;
            		blnFlag = true;
            	}
            	objRS.close();
            	
            	if(blnFlag) {
            		blnFlag = false;
            		strQuery = "SELECT * FROM " + GlobalData.ENV_DATA;
                	objRS = objConn.executeQuery(strQuery);
                	if(objRS!=null) {
                		while(objRS.next()) {
                    		gobjEnvData = new EnvData();
                    		gobjEnvData.setSuiteType(objRS.getField(GlobalData.SUITE_TYPE));
                    		gobjEnvData.setApplicationRegion(objRS.getField(GlobalData.APPLICATION_REGION));
                    		gobjEnvData.setNamePrefix(objRS.getField(GlobalData.LASTNAME_PREFIX));
                    		gobjEnvData.setBrowserType(objRS.getField(GlobalData.BROWSER_TYPE));
                    		gobjEnvData.setTestsPassed(0);
                    		gobjEnvData.setTestsFailed(0);
                    		gobjEnvData.setSuiteStartTime(DateFormats.getCurrentTime());
                    		blnFlag = true;
                    		break;
                    	}
                    	objRS.close();
                	}
            	}
            	
            }
            objConn.close();
            
            //On successful fetching of data call read test data
            if(blnFlag) {
            	readTestData(objHashSummaryList);
            }
            else {
            	System.out.println("No Test is Flagged 'Y' or Environment data missing ");
            }
		}
		catch(Exception objExp) {
			
			System.out.println("Exception occured in readScenarioList method. Details: " + objExp.getMessage() + " exception is " + objExp.getClass().getName());
		}
		finally {
			objRS = null;
			objConn = null; 
			objFillo = null;
		}
	}
	
	@SuppressWarnings("rawtypes")
	private void readTestData(OrderedHashtable objSummary) {
		String strKey = "";
		String strQuery = "";
		String strTestDataFile = "";
		String strCurrentScreen = "";
		String strTestDataId = "";
		String strTestName = "";
		boolean blnStartTest = false;
		OrderedHashtable objTestData;
		int intInc = 0;
		int Itteration;
						
		Fillo objFillo = null;
		Connection objConn = null; 
		Recordset objRS = null;
		
		try{
			if(objSummary!=null){
				if(objSummary.size()>0) {
					
					OrderedHashtable objSummaryReport = new OrderedHashtable();
					try{
						ReportGenerator.createResultFolder(gobjEnvData.getApplicationRegion());
						
	            		
						Enumeration objEnum = objSummary.enumerateKeys();
						
						while(objEnum.hasMoreElements()) {
							blnStartTest = false;
							strKey = objEnum.nextElement().toString();
							gobjCurrentTest = new SummaryList();
							gobjCurrentTest = (SummaryList)objSummary.get(strKey);
							String strIterativeTestId = gobjCurrentTest.getIterativeTestID();
							String[] arrIterative = strIterativeTestId.split("#");
							Itteration = Integer.valueOf(gobjCurrentTest.getCount());
							int Value =1;
							while(Value <= Itteration){
							for(int intCounter=0;intCounter<arrIterative.length;intCounter++) {
								blnStartTest = false;
								strTestName = "";
								
								strQuery = "SELECT " + GlobalData.TEST_SCREEN_NAME + ", " + arrIterative[intCounter] + " FROM " + GlobalData.SCENARIO_FLOW + " WHERE " + GlobalData.TEST_CASE_ID + "='" + gobjCurrentTest.getTestCaseId() + "'";
								
								strTestDataFile = System.getProperty("user.dir");
								strTestDataFile = strTestDataFile.replaceAll("\\\\", "/") + GlobalData.TEST_DATA_FOLDER + gobjCurrentTest.getTestDataFile() + ".xls";
								
								objFillo = new Fillo();
					            objConn = objFillo.getConnection(strTestDataFile);								
					            objRS = objConn.executeQuery(strQuery);
					            if(objRS!=null) {
					            	
					            	strTestName = gobjCurrentTest.getTestCaseId();
					            	gobjCurrentTest.setTestResultFile(ReportGenerator.generateTestHeader(gobjCurrentTest.getTestCaseId(), arrIterative[intCounter], gobjEnvData.getApplicationRegion()));
					            	
					            	while(objRS.next()) {
					            		strCurrentScreen = objRS.getField(GlobalData.TEST_SCREEN_NAME);
					            		strTestDataId = objRS.getField(arrIterative[intCounter]);
					            		System.out.println("Test case - " + gobjCurrentTest.getTestCaseId() + " Current screen - " + strCurrentScreen);
					            		switch(strCurrentScreen) {
						            		case "START_TEST":
						            			gobjCurrentTest.setTestStartTime(DateFormats.getCurrentTime());
						            			System.out.println("Test " + GlobalData.TEST_DATA_ID + " start time is " + gobjCurrentTest.getTestStartTime());
						            			blnStartTest = true;
						            			break;
						            		case "STOP_TEST":
						            			gobjCurrentTest.setTestEndTime(DateFormats.getCurrentTime());
						            			System.out.println("Test " + GlobalData.TEST_DATA_ID + " end time is " + gobjCurrentTest.getTestEndTime());
						            			break;
						            		default:
						            			objTestData = null;
						            			if(blnStartTest) {
						            				if(!isNull(strTestDataId).equals("")) {
						            					strQuery = "SELECT * FROM " + strCurrentScreen + " WHERE " + GlobalData.TEST_DATA_ID + "='" + strTestDataId + "'";
						            					
						            					Recordset objRSData = objConn.executeQuery(strQuery);
						            					if(objRSData!=null) {
						            						 						            						
		                                                    objTestData = new OrderedHashtable();
		                                                  //Fetch Test Data column
		                                                    ArrayList arrColumns = objRSData.getFieldNames();
						            						while(objRSData.next()) {
						            							
						            							for(int intColCounter=1;intColCounter<arrColumns.size();intColCounter++) {
		                                                            String strColName =(String) arrColumns.get(intColCounter);
		                                                            String strColValue = objRSData.getField(strColName);
		                                                            if(!isNull(strColName).equals("")) {
		                                                            	if(!strColName.trim().equals("")) {
		                                                            		if (strColValue==null) strColValue = "";
				                                                            if(!strColValue.trim().equalsIgnoreCase(GlobalData.NA)) objTestData.put(strColName.trim(), strColValue.trim());
		                                                            	}
		                                                            }
		                                                            
		                                                            //System.out.print(strColName + " - " + strColValue + ", ");
		                                                        } //End of For
						            							break;
						            						} // End of while
						            						
						            						objRSData.close();
						            					} //End of If
						            					objRSData = null;
						            				} //End of If
						            				gobjCurrentTest.setTestResult(AppEntry.navigateScreens(strCurrentScreen, objTestData, gobjEnvData.getBrowserType(), gobjEnvData.getApplicationRegion())); //Perform the screen operations
						            			} //End of If
						            			break;
					            		}//End of switch
					            		if(!gobjCurrentTest.getTestResult()) {
					            			gobjCurrentTest.setTestEndTime(DateFormats.getCurrentTime());
					            			break; //Exit the test execution on step failure
					            		}
					            	} //End of while
					            	objRS.close();
					            	ReportGenerator.generateTestFooter(gobjCurrentTest.getTestStartTime(), gobjCurrentTest.getTestEndTime(), gobjCurrentTest.getTestCaseId(), gobjCurrentTest.getLastName(), gobjCurrentTest.getFirstName(), gobjCurrentTest.getPolicyNo(), gobjCurrentTest.getTestResult());
					            	if(gobjCurrentTest.getTestResult()) {
					            		updateScenarioListFile();
				            		}
					            	intInc++;
					            	objSummaryReport.put("Test"+intInc, gobjCurrentTest);
					            }
					            else {
					            	System.out.println("Failed to get test flow from the file " + strTestDataFile);
					            }
					            objConn.close();
							}
							Value++;
							
				            }
						}
					}
					catch(Exception objExp) {
						System.out.println("Exception occured in readTestData method. Details: " + objExp.getMessage());
					}
					//Generate Summary
		            ReportGenerator.generateSummaryResult(gobjEnvData.getSuiteStartTime(), gobjEnvData.getSuiteType(), gobjEnvData.getBrowserType(), gobjEnvData.getApplicationRegion(), objSummaryReport);
				}
			}
		}
		catch(Exception objExp) {
			System.out.println("Exception occured in readTestData method. Details: " + objExp.getMessage());
		}
		finally {
			
			objRS = null;
			objConn = null;
		}
	}
	
	private void updateScenarioListFile() {
		Fillo objFillo = null;
		Connection objConn = null;
		
		try {
			
			String strQuery = "UPDATE " + GlobalData.SCENARIO_LIST + " SET " + GlobalData.FIRST_NAME + "='" + isNull(gobjCurrentTest.getFirstName()) 
								+ "', " + GlobalData.LAST_NAME + "='" + isNull(gobjCurrentTest.getLastName()) + "', " + GlobalData.POLICY_NO + "='" 
								+ isNull(gobjCurrentTest.getPolicyNo())  + "', " + GlobalData.SSN_NO + "='" + isNull(gobjCurrentTest.getSSNNo()) 
								+ "' WHERE ";
			String strWhere1 = GlobalData.TEST_CASE_ID + "='" + gobjCurrentTest.getTestCaseId() + "'"; 
			String strWhere2 = GlobalData.PRIMARY_TEST_ID + "='" + gobjCurrentTest.getTestCaseId() + "'";
			/*String  strQuery = "UPDATE SCENARIO_LIST SET FIRST_NAME='AUTFEBFXPF', LAST_NAME='REGFEBFXPF', POLICY_NO='', SSN_NO='913413825' WHERE TEST_CASE_ID='CP_PICM assignment_1__IA'";
			String  strQuery1 = "UPDATE SCENARIO_LIST SET FIRST_NAME='AUTFEBFXPF', LAST_NAME='REGFEBFXPF', POLICY_NO='', SSN_NO='913413825' WHERE PRIMARY_TEST_ID='CP_PICM assignment_1__IA'";*/
			//Class.forName(GlobalData.DRIVER_NAME);
			System.out.println("Update Query is " + strQuery);
			
			objFillo = new Fillo();
            objConn = objFillo.getConnection(SCENARIO_LIST_FILE);	
            objConn.executeUpdate(strQuery + strWhere1);
            objConn.executeUpdate(strQuery + strWhere2);
                        
            objConn.close();
		}catch(Exception objExp) {
			System.out.println("Exception occured in Insert Test Data method. Details: " + objExp.getMessage());
		}
		finally {
			objConn = null;
			objFillo = null;
		}
	}
	
	private String isNull(String strValue) {
		try{
			if(strValue==null) strValue = "";
		}
		catch(Exception objExp) {
			strValue = "";
		}
		return strValue;
	}
}
