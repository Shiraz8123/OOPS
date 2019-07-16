package com.axa.nba.driver;

public class RegressionSuite {

	public static void main(String[] args) {
		
		DriverScript objDriver = new DriverScript();
		objDriver.readScenarioList(System.getProperty("user.dir") + "/TestData/NBA_ScenarioList.xls");
		
		objDriver = null;
		
	}
}
