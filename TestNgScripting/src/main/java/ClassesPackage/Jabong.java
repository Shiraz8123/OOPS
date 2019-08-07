package ClassesPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import junit.framework.Assert;

public class Jabong extends TestBase {
	
	public Jabong(){
		super();
	}

	@BeforeMethod 
	public void startup(){
		initilization();
	}
	
	@Test
	public void shop(){
	driver.get("https://www.jabong.com");
	Assert.assertEquals(driver.getTitle(), "Online Shopping: Buy Women, Men, Kids Fashion & Lifestyle in India - Jabong");
	}	
	
	@AfterTest
	public void Teardown(){
		driver.quit();
	}
	
	
}
