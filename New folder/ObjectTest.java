package com.axa.nba.driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ObjectTest {
	private static final String TASKLIST = "tasklist";
	private static final String KILL = "taskkill /F /IM ";
	
	static RemoteWebDriver gobjWebDriver;
	
	public static void main(String[] args) throws InterruptedException {
		WebElement objEle = null;
		
		try {
			terminateDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Resources\\IEDriverServer.exe");
		// TODO Auto-generated method stub
		DesiredCapabilities objCap = DesiredCapabilities.internetExplorer();
		objCap.setJavascriptEnabled(true);
		objCap.setCapability("ie.ensureCleanSession", true);
		objCap.setCapability("ignoreProtectedModeSettings", true);
		objCap.setCapability("enableElementCacheCleanup", true);
		
						
		gobjWebDriver = new InternetExplorerDriver(objCap);
		
		gobjWebDriver.manage().deleteAllCookies();
		Thread.sleep(300);
		
		
		gobjWebDriver.manage().window().maximize();
		gobjWebDriver.navigate().to("http://int.us.axa.com");
		gobjWebDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		getObjectsList(objEle);
		
		
	}
	
	private static void getObjectsList(WebElement objEle) {
		String[] arrEle = {};
		
		if(objEle==null) {
			List<WebElement> objEle1 = gobjWebDriver.findElementsByTagName("input");
			for(int intCounter=0;intCounter<objEle1.size();intCounter++) {
				System.out.println("Current Element is  : " + objEle1.get(intCounter).getAttribute("name") + "  : Text is - " + objEle1.get(intCounter).getText());
				getObjectsList(objEle1.get(intCounter));
			}
		}
		else {
			List<WebElement> objEle1 = objEle.findElements(By.tagName("input"));
			for(int intCounter=0;intCounter<objEle1.size();intCounter++) {
				System.out.println("Current Element is  : " + objEle1.get(intCounter).getAttribute("name") + "  : Text is - " + objEle1.get(intCounter).getText());
				getObjectsList(objEle1.get(intCounter));
			}
		}
	}
	
	private static void killProcess(String serviceName) throws Exception {
		Runtime.getRuntime().exec(KILL + serviceName);
	}
	
	private static void terminateDriver() throws Exception {
		String[] strProcess = {"IEDriverServer.exe", "iexplore.exe"};
		if(gobjWebDriver!=null) {
			
			gobjWebDriver.close();
			gobjWebDriver.quit();
			
			gobjWebDriver = null;
		}
		for(int intCounter=0;intCounter<strProcess.length;intCounter++) {
			if (isProcessRunning(strProcess[intCounter])) {
				killProcess(strProcess[intCounter]);	
			}
		}
		
		Thread.sleep(2000);
		//Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
	}
	
	private static boolean isProcessRunning(String serviceName) throws Exception {
		Process objPro = Runtime.getRuntime().exec(TASKLIST);
		BufferedReader reader = new BufferedReader(new InputStreamReader(objPro.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			//System.out.println(line);
			if (line.contains(serviceName)) {
				return true;
			}
		}
		
		return false;
	}

}
