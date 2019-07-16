package Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;



public class Util extends TestBase{
	public static long Page_Load_Timeout= 60;
	public static long Implicit_Wait = 30;

	//Alert Handle
	public static void alertPopUp(){
	Alert alert= driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	}

	//screenshot
	public static void screenShotMethod() throws Exception{
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\Screenshots\\screen1.png"));
	}

	
	//Dropdown
	public static void dropdown(){
		Select s = new Select(driver.findElement(By.id("SignState")));
		s.selectByIndex(4);
	}


	
	
	
	
}
