package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ExamLocation;
import Pages.LoginPage;
import Pages.PendingList;
import TestBase.TestBase;

public class LoginPageTest extends TestBase{

	
	LoginPage loginPage;
	PendingList pendingList;
	ExamLocation examLocation;
	
	
	public LoginPageTest(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage= new LoginPage();
		pendingList = new PendingList();
		examLocation =new ExamLocation();
	}
	
	@Test(priority=1)
	public void validateLoginPageTitleTest(){
		String title= loginPage.validateLoginPageTitle();   
	Assert.assertEquals(title, "Login Page");
		}
	
	@Test(priority=2)
	public void LoginTest(){
		pendingList= loginPage.LoginNew(prop.getProperty("username"),prop.getProperty("password"));
		}
		
	

	
@AfterMethod
    public void tearDown() {
		driver.quit();
	}
	
	
}
