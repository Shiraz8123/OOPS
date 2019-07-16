package com.axa.nba.driver;

/**
* <dl>
* <dt><em>Class Name:</dt></em><dd>EnvData</dd>
* <dt><em>Description:</dt></em><dd>Holds Environment data</dd>
* <dt><em>Author     :</dt></em><dd>Capgemini</dd>
* <dt><em>Generated on:</dt></em><dd>30-June-2016</dd>               
* <dt><em>History</dt></em>
* <pre>Modified By                      Modified Date                   Comments</pre>
*</dl>
*/

public class EnvData {
	private String startTime, suiteType, namePrefix, applicationRegion, browserType;
	private int testsPassed, testsFailed; 
	
	public void setSuiteType(String strSuiteType) {
		this.suiteType = strSuiteType;
	}
	
	public String getSuiteType() {
		return suiteType;
	}
		
	public void setBrowserType(String strBrowserType) {
		this.browserType = strBrowserType;
	}
	
	public String getBrowserType() {
		return browserType;
	}
	
	public void setNamePrefix(String strNamePrefix) {
		this.namePrefix = strNamePrefix;
	}
	
	public String getNamePrefix() {
		return namePrefix;
	}
	
	public void setApplicationRegion(String strApplicationRegion) {
		this.applicationRegion = strApplicationRegion;
	}
	
	public String getApplicationRegion() {
		return applicationRegion;
	}
	
	public void setTestsPassed(int intTestsPassed) {
		this.testsPassed = this.testsPassed + intTestsPassed;
	}
	
	public int getTestsPassed() {
		return testsPassed;
	}
	
	public void setTestsFailed(int intTestsFailed) {
		this.testsFailed = this.testsFailed + intTestsFailed;
	}
	
	public int getTestsFailed() {
		return testsFailed;
	}
	
	public void setSuiteStartTime(String strStartTime) {
		this.startTime = strStartTime;
	}
	
	public String getSuiteStartTime() {
		return startTime;
	}

}
