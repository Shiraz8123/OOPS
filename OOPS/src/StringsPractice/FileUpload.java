package StringsPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FileUpload {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("input_resumeParser")).sendKeys("Y:/FP PMO/ABS/UAT/Shariff/2017/2018/Requirement Routing/New Microsoft Word Document.docx");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\AE13127\\Desktop\\Selenium docs\\Jars\\Screenshots\\screen1.png"));
		 
		 
		 
		 
		 
		 
	}

}
