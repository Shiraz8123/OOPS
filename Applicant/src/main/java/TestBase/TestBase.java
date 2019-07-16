package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.Util;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
public TestBase() {
	try{
		prop = new Properties();                    
		FileInputStream ip = new FileInputStream("C://Users//AE13127//workspace//Applicant//src//main//java//Properities//prop.properities");
		prop.load(ip);
	}catch (FileNotFoundException e){
		e.printStackTrace();
	}catch (IOException e){
		e.printStackTrace();
	}
}
	
public static void initilization(){
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		} else if(browserName.equals("ff")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\geckodriver_win32");
			 driver = new FirefoxDriver();
			}
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(Util.Page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.Implicit_Wait,TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}
}
