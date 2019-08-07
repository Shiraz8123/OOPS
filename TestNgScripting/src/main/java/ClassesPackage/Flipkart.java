package ClassesPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;

public class Flipkart extends TestBase{

	public Flipkart(){
	super();
	}
	
	
	@BeforeMethod 
	public void startup(){
		initilization();
	}
	
	@Test
	public void login(){
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8123705573");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("flipkart123");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@AfterTest
	public void Teardown(){
		driver.quit();
	}
	
}
