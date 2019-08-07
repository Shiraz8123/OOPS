package ClassesPackage;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;

public class Amazon extends TestBase{
	
	public Amazon(){
		super();
	}
	

@BeforeMethod
public void startup(){
	initilization();
}

	@Test
	public void title(){
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test
	public void search(){
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("PS4");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sony PS4 Pro 1TB Console (Black)')]")).click();
		Set<String> handles= driver.getWindowHandles();
		for(String w: handles){
			driver.switchTo().window(w);
		}
		driver.findElement(By.id("add-to-cart-button")).click();
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
		driver.switchTo().defaultContent();
			driver.close();
	}
	
	@Test
	public void login(){
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-icon nav-arrow']"))).build().perform();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
