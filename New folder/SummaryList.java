package com.axa.nba.driver;

/**
* <dl>
* <dt><em>Class Name:</dt></em><dd>SummaryList</dd>
* <dt><em>Description:</dt></em><dd>Holds Summary list file data</dd>
* <dt><em>Author     :</dt></em><dd>Capgemini</dd>
* <dt><em>Generated on:</dt></em><dd>30-June-2016</dd>               
* <dt><em>History</dt></em>
* <pre>Modified By                      Modified Date                   Comments</pre>
*</dl>
*/
public class SummaryList {
	
	private String testCaseID, masterScriptID, testDescription, userID, userPassword, testDataFile, lastName, firstName, ssnno, policyno, iterativeTestID, testStartTime, testEndTime, testResultFile , Count ;
	private boolean testResult = true;
	
	public void setTestCaseId(String strTestId) {
		this.testCaseID = strTestId;
	}
	
	public String getTestCaseId() {
		return testCaseID;
	}
	
	public void setPrimaryScriptID(String strMasterScriptID) {
		this.masterScriptID = strMasterScriptID;
	}
	public void setcontract(String setcontract) {
		this.ssnno = setcontract;
	}
	
	public String getPrimaryScriptID() {
		return masterScriptID;
	}
	
	public void setTestDescription(String strTestDescription) {
		this.testDescription = strTestDescription;
	}
	
	public String getTestDescription() {
		return testDescription;
	}
	
	
	public void setUserID(String strUserID) {
		this.userID = strUserID;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserPassword(String strUserPwd) {
		this.userPassword = strUserPwd;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setTestDataFile(String strTestDataFile) {
		this.testDataFile = strTestDataFile;
	}
	
	public String getTestDataFile() {
		return testDataFile;
	}
	
	
	public void setLastName(String strLastName) {
		this.lastName = strLastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String strFirstName) {
		this.firstName = strFirstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setSSNNo(String strSSNNo) {
		this.ssnno = strSSNNo;
	}
	
	public String getSSNNo() {
		return ssnno;
	}
	
	public void setPolicyNo(String strPolicyNo) {
		this.policyno = strPolicyNo;
	}
	
	public String getPolicyNo() {
		return policyno;
	}
	
	public void setIterativeTestID(String strIterativeTestID) {
		this.iterativeTestID = strIterativeTestID;
	}
	
	public String getIterativeTestID() {
		return iterativeTestID;
	}
	
	public void setTestStartTime(String strTestStartTime) {
		this.testStartTime = strTestStartTime;
	}
	
	public String getTestStartTime() {
		return testStartTime;
	}
	
	public void setTestEndTime(String strTestEndTime) {
		this.testEndTime = strTestEndTime;
	}
	
	public String getTestEndTime() {
		return testEndTime;
	}
	
	public void setTestResult(boolean strTestResult) {
		this.testResult = strTestResult;
	}
	
	public boolean getTestResult() {
		return testResult;
	}
	
	public void setTestResultFile(String strTestResultFile) {
		this.testResultFile = strTestResultFile;
	}
	
	public String getTestResultFile() {
		return testResultFile;
	}

	public void setCount(String Count) {
		// TODO Auto-generated method stub
		this.Count = Count;
	}
	public String getCount() {
		return Count;
	}

	public void setMasterScriptID(String field) {
		// TODO Auto-generated method stub
		
	}

	

}
