package Pages;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;


public class PendingList extends TestBase {

	static WebDriverWait wait=new WebDriverWait(driver, 20);
	
	@FindBy(id="createNewButton")
	WebElement createbtn;
	
	//@FindBy(xpath="id=YesBtn")
	WebElement esignbtn;
	
	
	public  PendingList(){
		PageFactory.initElements(driver, this);
	}
	
	public ExamLocation createNewApp() throws InterruptedException{
		createbtn.click();
		//Thread.sleep(5000);
		
		for(String s: driver.getWindowHandles()){
			driver.switchTo().window(s);
		}
		
		esignbtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='YesBtn']")));
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", esignbtn);*/
		esignbtn.click();
	// Thread.sleep(5000);
		
		return new ExamLocation();
	}
	
	
	
}
