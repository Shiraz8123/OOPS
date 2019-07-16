package com.axa.nba.driver;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



//import com.axa.nba.driver.GlobalData;




//import com.axa.generic.reporter.ReportGenerator;
//public static RemoteWebDriver gobjWebDriver;

public class VerifyLogin {

	public static String LName;
	public static String FName;
	public static String uid = "";
	
	public static RemoteWebDriver gobjWebDriver;
	public static void main(String[] args) throws Exception {
		Connection objConn = null; 
		//String uid;
		
		try {
			
			
					   
					   
			terminateDriver();
			   Process Batch =Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			   Batch.waitFor();
					   
					   
					   
					   
					   
					   
					   
		
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Resources\\IEDriverServer.exe");
			
				
				
								
				 
				
				
				
				
				ResultSet objRS = null;
			
				
			String FileName="C:\\AXA-NBA-Automation\\TestData\\F.xls";
			String SheetName="happy-unhappy";
				
				//Thread.sleep(10000);
				 objConn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DBQ=" + FileName + ";DriverID=22;READONLY=false", "", "");
		            Statement objStatement = objConn.createStatement();
		            objRS = objStatement.executeQuery("SELECT * FROM ["+SheetName+"$]");
		            if(objRS!=null) {
		            	
		            	while(objRS.next()) {
		            		
		            	
		            		
		            		gobjWebDriver = new InternetExplorerDriver();
		    				
		    				gobjWebDriver.manage().deleteAllCookies();
		    				gobjWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    				gobjWebDriver.manage().window().maximize();
		    				
		    				gobjWebDriver.navigate().to("int.us.axa.com");
		    				
		    	
		    				WebElement element  = gobjWebDriver.findElement(By.cssSelector("a[class='loginBtn medium']"));
		    				
		    				element.click();
		    				 uid = objRS.getString("userid");
		    				gobjWebDriver.findElement(By.id("loginId")).sendKeys(uid);
		    				gobjWebDriver.findElement(By.id("loginPassword")).sendKeys("Life1234");
		    				gobjWebDriver.findElement(By.xpath("//*[@id='loginPanel']/div[2]/form/div/div/fieldset/div[2]/div[1]/button")).click();
		    				axaCommonNavigation();
		    				
		    				
		    			
		    				
		    				Thread.sleep(10000);
		    				
		    				
		    				/*gobjWebDriver.switchTo().frame("mainContentFrame").switchTo().frame("contentLeftFrame").switchTo().frame("file").switchTo().frame("file");
		    				
		    			
		    				
		    				try{
		    					gobjWebDriver.findElement(By.name("inboxForm:_id11"));
		    					System.out.println("User " + uid + " worked");
		    				}catch(Exception e){
		    					System.out.println("User " + uid + " failed");
		    				}*/
		    				
		    				
		    				
		    				gobjWebDriver.close();
		    	            
		    	            
		    	            gobjWebDriver.quit();
		    				
		            		
		            	}
		            	objRS.close();
				
				
				
		            }
				
		           
			}
			
		catch(Exception objExp){
			objExp.printStackTrace();
			
			
		}
		finally {
			 objConn.close();
				
	      
		}
		}
		protected static boolean axaCommonNavigation() throws IOException {
			boolean blnFlag = false;
			WebElement objElement;
			String strEnvLinkText = "LnbA PERFF";
			FileWriter objTestFile = new FileWriter("C:\\Test\\Test.csv", true);
			try{
				waitForPageLoad(60);
				objElement = (new WebDriverWait(gobjWebDriver, 60)).until(ExpectedConditions.elementToBeClickable(By.linkText("TOOLS")));
				objElement.sendKeys(Keys.ENTER);
				waitForPageLoad(60);
				
				
						objElement = (new WebDriverWait(gobjWebDriver, 60)).until(ExpectedConditions.elementToBeClickable(By.linkText("nbA - Life 2012")));
						objElement.click();
						waitForPageLoad(60);
				
				if(!strEnvLinkText.equals("")) {
					String cHandle = gobjWebDriver.getWindowHandle();
					objElement = (new WebDriverWait(gobjWebDriver, 60)).until(ExpectedConditions.elementToBeClickable(By.linkText(strEnvLinkText)));
					objElement.sendKeys(Keys.ENTER);
					waitForPageLoad(60);
					Thread.sleep(4000);
					if(waitForWindowAndSwitch(cHandle, "Certificate Error", true)){
						objElement = (new WebDriverWait(gobjWebDriver, 60)).until(ExpectedConditions.elementToBeClickable(By.name("overridelink")));
						objElement = gobjWebDriver.findElement(By.name("overridelink"));
						objElement.click();
						waitForPageClose(60);
						if(waitForWindowAndSwitch(cHandle, "Certificate Error", true)){
							objElement = (new WebDriverWait(gobjWebDriver, 60)).until(ExpectedConditions.elementToBeClickable(By.name("overridelink")));
							objElement.sendKeys(Keys.ENTER);
							waitForPageClose(60);
						}
					}
					
					waitForWindowAndSwitch(cHandle, "Accelerator Desktop", false);
					//System.out.println("Title - " + objDriver.getTitle());
					
					waitForPageLoad(60);
					
					try{
						
					gobjWebDriver.switchTo().frame("mainContentFrame").switchTo().frame("desktopMenu");
					objElement = (new WebDriverWait(gobjWebDriver, 10)).until(ExpectedConditions.elementToBeClickable(By.linkText("Processing Center")));
					//objElement.sendKeys(Keys.ENTER);
					
					
					
					objTestFile.append(System.lineSeparator());
					objTestFile.append(uid + ",worked");
					
					
					
					//System.out.println("User " + uid + " worked");
					}
					catch(Exception a){
						objTestFile.append(System.lineSeparator());
						objTestFile.append(uid + ",not worked");
					}
					
					//waitForPageLoad(MAX_MILSEC_TIMEOUT);
					//gobjWebDriver.switchTo().defaultContent();
					
					blnFlag = true;
				}
				else {
					
				}
				
			}catch(Exception objExp){
				objTestFile.append(System.lineSeparator());
				objTestFile.append(uid + ",Invalid credentials");
				//System.out.println("Invalid credentials");
			}
			finally{
				objTestFile.flush();
				objTestFile.close();
				objTestFile = null;
				
			}
			return blnFlag;
		}
		protected static boolean waitForWindowAndSwitch(String cHandle, String strTitle, boolean blnOptionalWindow) throws InterruptedException {
			boolean blnFlag = false;
			int intTimeOut = 20;
			
	      String newWindowHandle = null;
	      
	      if(blnOptionalWindow) intTimeOut= 5;
	      
	   
	      
	      //Wait for 20 seconds for the new window and throw exception if not found
	      for (int intCounter = 0; intCounter < intTimeOut; intCounter++) {
	      	Set<String> allWindowHandles = gobjWebDriver.getWindowHandles(); 
	      	
	          if (allWindowHandles.size() > 1) {
	              for (String allHandlers : allWindowHandles) {
	                  if (!allHandlers.equals(cHandle)) {
	                	  newWindowHandle = allHandlers;
	                	  gobjWebDriver.switchTo().window(newWindowHandle);
	                      if(gobjWebDriver.getTitle().startsWith(strTitle)) {
	                      	waitForPageLoad(60);
	                      	gobjWebDriver.manage().window().maximize();
	                      	blnFlag = true;
	                      	break;
	                      }
	                      else {
	                          Thread.sleep(1000);
	                      }
	                  }
	              }
	              if(blnFlag) break;
	              
	          } else {
	              Thread.sleep(1000);
	          }
	      }
	      return blnFlag;
	    }
		
		protected static boolean waitForPageClose(long lngTimeout) {
			boolean blnFlag = false;
		    long lngEnd = System.currentTimeMillis() + (lngTimeout * 1000);
		    
		    try{
		    	while (System.currentTimeMillis() < lngEnd) {
		    		Thread.sleep(3000);
		    		gobjWebDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			    	gobjWebDriver.findElement(By.tagName("body"));
			    	
			    	//Thread.sleep(1000);
			    }
		    }catch(Exception objExp) {
		    	blnFlag = true;
		    }
		    gobjWebDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		    return blnFlag;
		}

		protected static boolean waitForPageLoad(long lngTimeout) {
			boolean blnFlag = false;
		    long lngEnd = System.currentTimeMillis() + (lngTimeout * 1000);
		    
		    while (System.currentTimeMillis() < lngEnd) {
		    	try{
		    		blnFlag = false;
		    		
		    		if (String.valueOf(((JavascriptExecutor) gobjWebDriver).executeScript("return document.readyState")).equals("complete")) {
			    		
			    		blnFlag = true;
			    		break;
			    	}
		    		
		    		Thread.sleep(2000);
		    	}
		    	catch(Exception objExp) {
		    		try {
						Thread.sleep(2000);
						
					} catch (InterruptedException e) {}
		    		blnFlag = true;
	    		}
		    }
		    return blnFlag;

	
	
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
			
			//Thread.sleep(2000);
			//Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
		}
		private static boolean isProcessRunning(String serviceName) throws Exception {
			Process objPro = Runtime.getRuntime().exec("tasklist");
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
		private static void killProcess(String serviceName) throws Exception {
			Runtime.getRuntime().exec("taskkill /F /IM " + serviceName);
		}
}
