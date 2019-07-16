package com.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\chromedriver_win32\\chromedriver.exe");
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(getCredentials().get("uwcm").split(":")[0]);
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys(getCredentials().get("uwcm").split(":")[1]);*/
		
		System.out.println(getCredentials().get("Indexer"));
		System.out.println(getCredentials().get("uwcm"));
		System.out.println(getCredentials().entrySet());
	Set s	= getCredentials().keySet();

	System.out.println(s);
	}

	
	
	public static HashMap<String, String> getCredentials(){ 
	HashMap<String,String> hashmap=new HashMap<String,String>();
	hashmap.put("Indexer","nblife07:Life1234");
	hashmap.put("Appentry", "nblife17:Life1234");
	hashmap.put("underwriter", "nblife37:Life1234");
	hashmap.put("uwcm", "uwcm01:Life1234");
	return hashmap;
	}
	
	
	
	
	
	
	
	
	
	
}
