package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ExamLocation;
import Pages.LoginPage;
import Pages.PendingList;
import TestBase.TestBase;

public class PendingListTest extends TestBase {

	LoginPage loginPage;
	PendingList pendingList;
	ExamLocation examLocation;
	
	
	public PendingListTest(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage= new LoginPage();
		pendingList = new PendingList();
		pendingList= loginPage.LoginNew(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void pendingclick() throws InterruptedException{
		examLocation=pendingList.createNewApp();
	}
	
	
	@AfterMethod
    public void tearDown() {
		driver.quit();
	}
	
	
}
